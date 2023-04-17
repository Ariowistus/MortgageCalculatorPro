package com.company.model.service;

import com.company.model.InputData;

public interface PrintingService {

        String INTEREST_SUM = "SUMA ODSETEK: ";
        String RATE_NUMBER = "NR: ";
        String YEAR = "ROK: ";
        String MONTH = "MIESIĄC: ";
        String DATA = "DATA: ";
        String MONTHS = " MIESIECY ";
        String RATE = "RATA: ";
        String INTEREST = "ODSETKI: ";
        String CAPITAL = "KAPITAL: ";
        String LEFT = "POZOSTAŁO: ";
        String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
        String MORTGAGE_PERIOD = "OKRES KREDYTOWANIA: ";

        String CURRENCY = " PLN ";
        String NEW_LINE = "\n";
        String PERCENT = "% ";
        void printInputData(final InputData inputData);
}
