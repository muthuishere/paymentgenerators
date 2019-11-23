package graphql.tutorial.eshop.payments;

import java.time.LocalDate;

public class CardPayment implements Payment {

    private Long id;
    private Long vehicleId;
    private Long dealerId;
    private Double price;
    private LocalDate date;
    String cardNumber ;
    String cardType;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public CardPayment(Long id, Long vehicleId, Long dealerId, Double price, LocalDate date, String cardNumber, String cardType) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.dealerId = dealerId;
        this.price = price;
        this.date = date;
        this.cardNumber =cardNumber;
        this.cardType = cardType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Long getVehicleId() {
        return vehicleId;
    }

    @Override
    public Long getDealerId() {
        return dealerId;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }
}
