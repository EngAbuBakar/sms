package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @Column
    private String productID;
    @Column
    private String productTitle;
    @Column
    private String productDesc;
    @Column
    private String producType;
}
