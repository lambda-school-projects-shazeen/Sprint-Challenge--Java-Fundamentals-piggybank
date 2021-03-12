package com.lambdaschool.piggybank.models;

//The number of coins in this group
//The face value of the coins in the group
//The name of a single coin
//The name of more than one coin

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin
{
    //coinid, name, nameplural, value, quantity
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinid;
    private String name;
    private String nameplural;
    private double value;
    private long quantity;

    public Coin()
    {
        //default
    }

    public Coin(
        String name,
        String nameplural,
        double value,
        long quantity)
    {
        this.name = name;
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public long getCoinid()
    {
        return coinid;
    }

    public void setCoinid(long coinid)
    {
        this.coinid = coinid;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNameplural()
    {
        return nameplural;
    }

    public void setNameplural(String nameplural)
    {
        this.nameplural = nameplural;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public long getQuantity()
    {
        return quantity;
    }

    public void setQuantity(long quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return "Coin{" +
            "coinid=" + coinid +
            ", name='" + name + '\'' +
            ", nameplural='" + nameplural + '\'' +
            ", value=" + value +
            ", quantity=" + quantity +
            '}';
    }
}
