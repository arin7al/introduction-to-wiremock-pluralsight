package com.booking.gateway;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PayBuddyPaymentResponse {
    private final String paymentId;
    private final PaymentResponseStatus paymentResponseStatus;

    @JsonCreator
    public PayBuddyPaymentResponse(@JsonProperty("paymentId") String paymentId,
                                   @JsonProperty("paymentResponseStatus") PaymentResponseStatus paymentResponseStatus) {

        this.paymentId = paymentId;
        this.paymentResponseStatus = paymentResponseStatus;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public PaymentResponseStatus getPaymentResponseStatus() {
        return paymentResponseStatus;
    }

    public enum PaymentResponseStatus {
        SUCCESS, FAILED
    }
}
