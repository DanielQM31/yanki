package com.bank.yanki.domain;

import lombok.Data;

@Data
public class Yanki {

    private String id;
    private String idDocument;
    private String idNumber;
    private String cellphone;
    private String imei;
    private String email;
    private Double balance;

}
