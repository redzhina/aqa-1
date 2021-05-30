package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldRemainBelowBoundary() {
        int purchase = 900;
        assertEquals(service.remain(purchase), 100);
    }

    @org.testng.annotations.Test
    public void shouldRemainAsBoundaryIfZero() {
        int purchase = 0;
        assertEquals(service.remain(purchase), 1000);
    }

    @org.testng.annotations.Test
    public void shouldBeRemainderIfAboveBoundary() {
        int purchase = 1300;
        assertEquals(service.remain(purchase), 700);
    }

    @org.testng.annotations.Test
    public void shouldBeNoRemainderIfBoundary() {
        int purchase = 1000;
        assertEquals(service.remain(purchase), 0);
    }
}
