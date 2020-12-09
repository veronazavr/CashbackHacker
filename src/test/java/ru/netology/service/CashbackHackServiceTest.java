package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }



    @Test
    public void shouldReturn0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 10;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}