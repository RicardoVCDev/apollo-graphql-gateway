package edu.jon.graphql.account.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import edu.jon.graphql.account.enums.Currency;
import edu.jon.graphql.account.model.Account;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
@DgsComponent
public class AccountDataFetcher {
    @DgsQuery
    public Account account(@InputArgument String id) {
        log.info("Fetch Account: "+id);
        return new Account(
                UUID.fromString(id),
                UUID.randomUUID(),
                Currency.USD);
    }
}
