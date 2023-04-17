package com.company.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InputData {

    private LocalDate repaymentStartDate = LocalDate.of(2020, 1, 6);
    private BigDecimal wiborPercent = new BigDecimal("1.73");

    private BigDecimal amount = new BigDecimal("300000");

    private BigDecimal monnthsDuration = new BigDecimal("180");

    private RateType rateType = RateType.CONSTANT;
    private BigDecimal bankMargin = new BigDecimal("1.9");

    //wither
    public InputData withRepaymentStartDate(LocalDate repaymentStartDate) {
        this.repaymentStartDate = repaymentStartDate;
        return this;
    }

    public InputData withWiborPercent(BigDecimal wiborPercent) {
        this.wiborPercent = wiborPercent;
        return this;
    }

    public InputData withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public InputData withMonnthsDuration(BigDecimal monnthsDuration) {
        this.monnthsDuration = monnthsDuration;
        return this;
    }

    public InputData withRateType(RateType rateType) {
        this.rateType = rateType;
        return this;
    }

    public InputData withBankMargin(BigDecimal bankMargin) {
        this.bankMargin = bankMargin;
        return this;
    }


    public LocalDate getRepaymentStartDate() {
        return repaymentStartDate;
    }

    public BigDecimal getWiborPercent() {
        return wiborPercent;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getMonnthsDuration() {
        return monnthsDuration;
    }

    public RateType getRateType() {
        return rateType;
    }

    public BigDecimal getBankMargin() {
        return bankMargin;
    }
}
