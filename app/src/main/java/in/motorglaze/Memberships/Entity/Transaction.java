package in.motorglaze.Memberships.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "varchar(50)")
    private String id;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name= "status")
    private String status;

    @Column(name = "amount")
    private float amount;

    @Column(name = "user_id")
    private String userId;

    @Column(name="transaction_date")
    private LocalDateTime dateTime;

    public Transaction(){}
    public Transaction(String transactionType, String status, float amount, String userId) {
        this.transactionType = transactionType;
        this.status = status;
        this.amount = amount;
        this.userId = userId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", userId='" + userId + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
