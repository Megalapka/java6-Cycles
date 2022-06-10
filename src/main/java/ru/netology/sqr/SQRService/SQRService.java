package ru.netology.sqr.SQRService;

public class SQRService {
    public int SearchingSQR(int firstNumber, int lastNumber) {

        int countSQR = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            for (int sqrNumber = 10; sqrNumber <= 99; sqrNumber++) {
                if ((i == sqrNumber * sqrNumber))  {
                    countSQR++;
                    break;
                }
            }
        }
        return countSQR;

    }
}
