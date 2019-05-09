package Revision;

public class PersonClient {
    public static void main(String[] args) {
        Person p= new Person(23,"Rohit","Anil",163);
        System.out.println(p.getAge());
        System.out.println(p.getFatherName());
        System.out.println(p.getHeight());
        System.out.println(p.getName());

    }
}
