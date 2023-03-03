package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Stock {
    @Id
    @Column
    private String stockID;
    @Column
    private String stockType;
    @Column
    private String stockDetail;

}
