package representation;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DeveloperRepresentation {

    @XmlElement
    private int devId;

    @XmlElement
    private String teamId;

    @XmlElement
    private String name;

    @XmlElement
    private int phone;

    public DeveloperRepresentation() {
    }

    public int getDevId() {
        return devId;
    }

    public void setDevId(int devId) {
        this.devId = devId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "representation.DeveloperRepresentation{" +
                "devId=" + devId +
                ", teamId='" + teamId + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
