package sn.dev.dto;


import sn.dev.entity.SectorEntity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ClasseDto {
    @XmlElement(name = "id", required = true)
    private int id;
    @XmlElement(name = "className", required = true)
    private String className;
    @XmlElement(name = "description", required = true)
    private String description;
    @XmlElement(name = "sector", required = true)
    private SectorDto sector;

    public ClasseDto() {
    }
    public ClasseDto(int id, String className, String description, SectorDto sector) {
        this.id = id;
        this.className = className;
        this.description = description;
        this.sector = sector;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SectorDto getSector() {
        return sector;
    }

    public void setSector(SectorDto sector) {
        this.sector = sector;
    }
}
