package ru.netology.sqr.SQRService;

public class SQRService {
    public int SearchingSQR(int firstNumber, int lastNumber) {

        int countSQR=0;
        for (int i = firstNumber; i <= lastNumber; i++) {
            for (int sqrNumber = 0; sqrNumber <= i; sqrNumber++) {
                if (i==sqrNumber*sqrNumber) {
                    countSQR++;
                }
            }
        }
        return countSQR;

    }
}
