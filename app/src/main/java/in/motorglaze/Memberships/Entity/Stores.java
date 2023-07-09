package in.motorglaze.Memberships.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Table(name = "stores")
public class Stores {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "varchar(50)")
    private String id;

    @Column(name = "location")
    private String location;

    @Column(name = "type")
    private String type;

    @Column(name = "store_owner")
    private String storeOwner;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    public Stores(){}

    public Stores(String location, String type, String storeOwner, LocalDateTime creationDate) {
        this.location = location;
        this.type = type;
        this.storeOwner = storeOwner;
        this.creationDate = creationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(String storeOwner) {
        this.storeOwner = storeOwner;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Stores{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", storeOwner='" + storeOwner + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
