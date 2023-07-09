package in.motorglaze.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users_membership_registrations")
public class UserMembershipRegistrations {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="registration_id")
    private int registrationId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "membership_id")
    private String membershipId;

    @Column(name = "store_id")
    private String storeId;

    @Column(name = "washes_completed")
    private int washesCompleted;

    @Column(name = "cleaning_completed")
    private int cleaningCompleted;

    @Column(name = "polishing_completed")
    private int polishingCompleted;

    @Column(name ="created_date")
    private LocalDateTime createdDate;

    public UserMembershipRegistrations(){}
    public UserMembershipRegistrations(String userId, String membershipId, String storeId, int washesCompleted, int cleaningCompleted, int polishingCompleted, LocalDateTime createdDate) {
        this.userId = userId;
        this.membershipId = membershipId;
        this.storeId = storeId;
        this.washesCompleted = washesCompleted;
        this.cleaningCompleted = cleaningCompleted;
        this.polishingCompleted = polishingCompleted;
        this.createdDate = createdDate;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public int getWashesCompleted() {
        return washesCompleted;
    }

    public void setWashesCompleted(int washesCompleted) {
        this.washesCompleted = washesCompleted;
    }

    public int getCleaningCompleted() {
        return cleaningCompleted;
    }

    public void setCleaningCompleted(int cleaningCompleted) {
        this.cleaningCompleted = cleaningCompleted;
    }

    public int getPolishingCompleted() {
        return polishingCompleted;
    }

    public void setPolishingCompleted(int polishingCompleted) {
        this.polishingCompleted = polishingCompleted;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "UserMembershipRegistrations{" +
                "registrationId=" + registrationId +
                ", userId='" + userId + '\'' +
                ", membershipId='" + membershipId + '\'' +
                ", storeId='" + storeId + '\'' +
                ", washesCompleted=" + washesCompleted +
                ", cleaningCompleted=" + cleaningCompleted +
                ", polishingCompleted=" + polishingCompleted +
                ", createdDate=" + createdDate +
                '}';
    }
}
