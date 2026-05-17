package com.youcef.banking_app.dto;

public record TransferFundDto(Long fromAccountId, Long toAccountId, Double amount) {
}
