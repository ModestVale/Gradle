package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateBonus()
    {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);

        expected = 200;
        actual = service.remain(800);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateBonusOnRangeBorder()
    {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);

        expected = 0;
        actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}
