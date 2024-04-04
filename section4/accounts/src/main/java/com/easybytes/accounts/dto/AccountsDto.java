package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold Account ìnormation"
)
public class AccountsDto {


    @NotEmpty(message = "Account number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account number of Easy bank account", example = "0967899325"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account type can not be a null or empty")
    @Schema(
            description = "Account type of Easy bank account", example = "Savings"
    )
    private String accountType;


    @NotEmpty(message = "Branch address can not be a null or empty")
    @Schema(
            description = "Branch address of Easy bank account", example = "123 NewYork"
    )
    private String branchAddress;
}
