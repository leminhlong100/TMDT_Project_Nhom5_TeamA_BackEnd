package site.sugarnest.backend.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class OrderRequest {

    private String address;

    private Date deliveryAt;

    private String note;

    private String sale;

    private String statusPay;
    private double totalPrice;



    private double totalPrice;

}
