package Revision;

public class Person {
    int Age;
    String name;
    String FatherName;
    int height;
    Person(int Age,String name,String FatherName,int height)
    {
        this.Age=Age;
        this.name=name;
        this.FatherName=FatherName;
        this.height=height;
    }
    public int getAge()
    {
        return this.Age;
    }
    public int getHeight()
    {
        return this.height;
    }
    public String getFatherName()
    {
        return this.FatherName;
    }
    public String getName()
    {
        return this.name;
    }
}
