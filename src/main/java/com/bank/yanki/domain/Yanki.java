package com.bank.yanki.domain;

import lombok.Data;

@Data
public class Yanki {

    private String id;
    private String documentType;
    private String number;
    private String cellphone;
    private String imei;
    private String email;
    private Double balance;

}
