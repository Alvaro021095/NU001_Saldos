package co.com.colombia.api.model.balance.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Balance {
    private float available;
    private float availableOverdraftBalance;
    private float overdraftValue;
    private float availableOverdraftQuota;
    private float cash;
    private float unavailableclearing;
    private float receivable;
    private float blocked;
    private float unavailableStartDay;
    private float cashStartDay;
    private float pockets;
    private float remittanceQuota;
    private float agreedRemittanceQuota;
    private float remittanceQuotaUsage;
    private float normalInterest;
    private float suspensionInterest;
}
