package edu.jon.graphql.account.model;

import edu.jon.graphql.account.enums.Currency;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class Account {
    private UUID id;
    private UUID customerId;
    private Currency currency;

    public Account(UUID id, UUID customerId, Currency currency) {
        this.id = id;
        this.customerId = customerId;
        this.currency = currency;
    }
}
