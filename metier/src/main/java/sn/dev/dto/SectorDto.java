package sn.dev.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SectorDto {

    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "classIds")
    private List<Integer> classIds;

    public SectorDto() {}

    public SectorDto(int id, String name) {
        this.id = id;
        this.name = name;
    }



    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Integer> getClassIds() { return classIds; }
    public void setClassIds(List<Integer> classIds) { this.classIds = classIds; }
}
