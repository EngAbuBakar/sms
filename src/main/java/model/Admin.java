package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Admin {
    @Id
    @Column
    private String adminId;
    @Column
    private String adminName;
    @Column
    private String adminEmail;
    @Column
    private String adminAdress;
}
