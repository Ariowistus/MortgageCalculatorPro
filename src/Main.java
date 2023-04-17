import com.company.model.InputData;
import com.company.model.service.PrintingServiceImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        InputData inputData = new InputData()
                .withAmount(new BigDecimal("2980000"))
                .withMonnthsDuration(new BigDecimal("160"));

        PrintingServiceImpl printingService = new PrintingServiceImpl();
        printingService.printInputData(inputData);




    }
}