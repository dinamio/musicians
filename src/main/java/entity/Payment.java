package entity;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String payer;

    @Column(name = "payment_receiver")
    private String paymentReceiver;

    @Column(name = "payment_amount")
    private Double paymentAmount;

    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPaymentReceiver() {
        return paymentReceiver;
    }

    public void setPaymentReceiver(String paymentReceiver) {
        this.paymentReceiver = paymentReceiver;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", payer='" + payer + '\'' +
                ", paymentReceiver='" + paymentReceiver + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", comment='" + comment + '\'' +
                '}';
    }
}
//sql query
//create table payment
//        (
//                id int primary key not null auto_increment,
//                payer varchar(100),
//                payment_receiver varchar(100),
//                payment_amount decimal,
//                comment varchar(500)
//        );