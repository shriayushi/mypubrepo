package representation;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement
public class TeamRepresentation {

    @XmlElement
    private int id;

    @XmlElement
    private String name;

    @XmlElement
    private List<DeveloperRepresentation> developerRepresentationList;

    public TeamRepresentation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DeveloperRepresentation> getDeveloperRepresentationList() {
        return developerRepresentationList;
    }

    public void setDeveloperRepresentationList(List<DeveloperRepresentation> developerRepresentationList) {
        this.developerRepresentationList = developerRepresentationList;
    }


    @Override
    public String toString() {
        return "TeamRepresentation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", developerRepresentationList=" + developerRepresentationList +
                '}';
    }
}
