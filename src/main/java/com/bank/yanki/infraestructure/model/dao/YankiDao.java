package com.bank.yanki.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("yanki")
public class YankiDao {

    @Id
    private String id;
    private String documentType;
    private String number;
    private String cellphone;
    private String imei;
    private String email;
    private Double balance;

}
