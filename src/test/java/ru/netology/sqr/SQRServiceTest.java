package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateSqrService() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculateSqrService(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSqrServiceAllSquares() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.calculateSqrService(100, 9801);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSqrServiceWithoutSquares() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculateSqrService(0, 99);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSqrServiceWithMultipleSquares() {
        SQRService service = new SQRService();
        int expected = 22;
        int actual = service.calculateSqrService(100, 1000);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSqrServiceWithOneSquares() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculateSqrService(200, 240);

        assertEquals(expected, actual);
    }
}