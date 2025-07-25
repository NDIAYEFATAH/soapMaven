package sn.dev.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "classes")
public class ClassEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String className;
    private String description;

    @ManyToOne
    @JoinColumn(name = "sector_id")
    private SectorEntity sector;

    public ClassEntity() {
    }

    public ClassEntity(int id, String className, String description, SectorEntity sector) {
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

    public SectorEntity getSector() {
        return sector;
    }

    public void setSector(SectorEntity sector) {
        this.sector = sector;
    }
}
