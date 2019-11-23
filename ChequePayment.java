package graphql.tutorial.eshop.payments;

import java.time.LocalDate;

public class ChequePayment implements Payment {

    private Long id;
    private Long vehicleId;
    private Long dealerId;
    private Double price;
    private LocalDate date;
    Long chequeNumber ;
    String bankIFSCCode;

    public Long getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(Long chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public String getBankIFSCCode() {
        return bankIFSCCode;
    }

    public void setBankIFSCCode(String bankIFSCCode) {
        this.bankIFSCCode = bankIFSCCode;
    }

    public ChequePayment(Long id, Long vehicleId, Long dealerId, Double price, LocalDate date, Long chequeNumber , String bankIFSCCode) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.dealerId = dealerId;
        this.price = price;
        this.date = date;
        this.chequeNumber =chequeNumber;
        this.bankIFSCCode = bankIFSCCode;
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
