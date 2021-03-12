package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Coin;

import java.util.ArrayList;
import java.util.List;

public class HelperFunctions
{
    public static List<Coin> findCoins(List<Coin> fullList, CheckCoin tester)
    {
        List<Coin> tempCoin = new ArrayList<>();

        for (Coin c : fullList)
        {
            if(tester.test(c))
            {
                tempCoin.add(c);
            }
        }
        return tempCoin;
    }
}
