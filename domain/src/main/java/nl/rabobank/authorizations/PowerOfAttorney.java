package nl.rabobank.authorizations;

import lombok.Builder;
import lombok.Value;
import nl.rabobank.account.Account;

@Value
@Builder(toBuilder = true)
public class PowerOfAttorney
{
    String granteeName;
    String grantorName;
    Account account;
    Authorization authorization;
}
