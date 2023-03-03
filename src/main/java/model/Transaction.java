package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Transaction {
    @Id
    @Column
    private String transactionId;
    @Column
    private String transactionType;
    @Column
    private String transactionDetail;

}
