package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;



        public int remain(int amount) {
            int difference = boundary - amount % boundary;

            if (amount % 1000 != 0) {
                System.out.println("Purchase " + difference + " rub");
                return difference;
            }
            return difference;
        }

    }

