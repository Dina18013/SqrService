package ru.netology.sqr;

public class SQRService {
    public int calculateSqrService(int underRange, int upperRange) {
        int counter = 0; // считает количество квадратов, попадающих в промежуток[underRange, upperRange]
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (underRange <= sqr && sqr <= upperRange) {
                counter++;
            }
        }
        return counter;

    }

}