package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test

    public void shouldReturn200IfAmountIs800() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}