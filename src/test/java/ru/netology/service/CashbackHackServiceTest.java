package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldRemainBelowBoundaryJunit() {
        int purchase = 900;
        assertEquals(100, service.remain(purchase));
    }

    @org.junit.Test
    public void shouldRemainAsBoundaryIfZeroJunit() {
        int purchase = 0;
        assertEquals(1000, service.remain(purchase));
    }

    @org.junit.Test
    public void shouldBeRemainderIfAboveBoundaryJunit() {
        int purchase = 1300;
        assertEquals(700, service.remain(purchase));
    }

    @org.junit.Test
    public void shouldBeNoRemainderIfBoundaryJunit() {
        int purchase = 1000;
        assertEquals(0, service.remain(purchase));
    }
}
