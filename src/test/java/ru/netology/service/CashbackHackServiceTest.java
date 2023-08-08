package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnAmountToNextBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 750;
        int expected = 250;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroForBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnErrorForExactAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        String expected = "Error";

        String actual = service.getMessage(amount);

        Assert.assertEquals(expected, actual);
    }
}