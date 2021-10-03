package com.company;

public class Person
{
    private String name;

    private int age;

    public Person ()
    {
        this.name = "";
        this.age = 0;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Person (String thisName, int thisAge)
    {
        this.name = thisName;
        this.age = thisAge;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "This person is named " + name + " and they are " + age + " years old.";
    }
}
