package in.motorglaze.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Table(name = "memberships")
public class Memberships {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "varchar(50)")
    private String id;

    @Column(name = "membership_type")
    private String membershipType;

    @Column(name = "washes_included")
    private int washesIncluded;

    @Column(name = "cleaning_included")
    private int cleaningIncluded;

    @Column(name = "polishes_included")
    private int polishesIncluded;

    @Column(name = "duration")
    private int duration;

    @Column(name = "amount")
    private float amount;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public int getWashesIncluded() {
        return washesIncluded;
    }

    public void setWashesIncluded(int washesIncluded) {
        this.washesIncluded = washesIncluded;
    }

    public int getCleaningIncluded() {
        return cleaningIncluded;
    }

    public void setCleaningIncluded(int cleaningIncluded) {
        this.cleaningIncluded = cleaningIncluded;
    }

    public int getPolishesIncluded() {
        return polishesIncluded;
    }

    public void setPolishesIncluded(int polishesIncluded) {
        this.polishesIncluded = polishesIncluded;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Memberships(){}

    public Memberships(String membershipType, int washesIncluded, int cleaningIncluded, int polishesIncluded, int duration, float amount, LocalDateTime createdDate) {
        this.membershipType = membershipType;
        this.washesIncluded = washesIncluded;
        this.cleaningIncluded = cleaningIncluded;
        this.polishesIncluded = polishesIncluded;
        this.duration = duration;
        this.amount = amount;
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Memberships{" +
                "id='" + id + '\'' +
                ", membershipType='" + membershipType + '\'' +
                ", washesIncluded=" + washesIncluded +
                ", cleaningIncluded=" + cleaningIncluded +
                ", polishesIncluded=" + polishesIncluded +
                ", duration=" + duration +
                ", amount=" + amount +
                ", createdDate=" + createdDate +
                '}';
    }
}
