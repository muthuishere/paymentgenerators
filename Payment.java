package graphql.tutorial.eshop.payments;

import java.time.LocalDate;

public interface Payment {
    Long getId();

    Long getVehicleId();

    Long getDealerId();

    Double getPrice();

    LocalDate getDate();
}
