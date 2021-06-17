package api;

import representation.TeamRepresentation;
import util.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PagerDutyResource {

    public void createTeam (TeamRepresentation teamRepresentation) throws IOException {

        URL obj = new URL("https://localhost:8080/api/createTeam");
        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod("POST");

        postConnection.setRequestProperty("id", Util.makeId());
        postConnection.setRequestProperty("team", teamRepresentation.getName());
        postConnection.setRequestProperty("developerRepresentationList", teamRepresentation.getDeveloperRepresentationList().toString());

        postConnection.setRequestProperty("Content-Type", "application/json");

        postConnection.setDoOutput(true);

        int responseCode = postConnection.getResponseCode();
        System.out.println("POST Response Code :  " + responseCode);
        System.out.println("POST Response Message : " + postConnection.getResponseMessage());

        if (responseCode == HttpURLConnection.HTTP_CREATED) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    postConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("POST NOT WORKED");
        }
    }

    public void receiveAlert (String teamId) throws IOException {

        URL obj = new URL("https://localhost:8080/api/receiveAlert");
        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod("POST");

        postConnection.setRequestProperty("teamId", teamId);

        postConnection.setRequestProperty("Content-Type", "application/json");

        postConnection.setDoOutput(true);

        int responseCode = postConnection.getResponseCode();
        System.out.println("POST Response Code :  " + responseCode);
        System.out.println("POST Response Message : " + postConnection.getResponseMessage());

        if (responseCode == HttpURLConnection.HTTP_OK) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    postConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("POST NOT WORKED");
        }
    }
}
