package edu.jon.graphql.customer.fetcher;

import com.netflix.graphql.dgs.*;
import edu.jon.graphql.customer.model.Customer;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.UUID;

@Slf4j
@DgsComponent
public class CustomerDataFetcher {
    @DgsQuery
    public Customer customer(String id) {
        return Customer.builder()
                .id(UUID.fromString(id))
                .firstName("John")
                .lastName("Smith")
                .build();
    }
}
