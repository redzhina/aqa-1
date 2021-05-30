package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldRemainBelowBoundaryJunit() {
        int purchase = 900;
        assertEquals(service.remain(purchase), 100);
    }

    @org.junit.Test
    public void shouldRemainAsBoundaryIfZeroJunit() {
        int purchase = 0;
        assertEquals(service.remain(purchase), 1000);
    }

    @org.junit.Test
    public void shouldBeRemainderIfAboveBoundaryJunit() {
        int purchase = 1300;
        assertEquals(service.remain(purchase), 700);
    }

    @org.junit.Test
    public void shouldBeNoRemainderIfBoundaryJunit() {
        int purchase = 1000;
        assertEquals(service.remain(purchase), 0);
    }
}
