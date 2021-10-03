package com.company;

public class Person
{
    private String name;

    public Person ()
    {
        this.name = "";
    }

    public Person (String thisName)
    {
        this.name = thisName;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
