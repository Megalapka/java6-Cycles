package ru.netology.sqr.SQRService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    void TestingSQRService(int expected, int firstNumber, int lastNumber) {
        SQRService service = new SQRService();

        int actual = service.SearchingSQR(firstNumber, lastNumber);
        Assertions.assertEquals(expected, actual);
    }
}
