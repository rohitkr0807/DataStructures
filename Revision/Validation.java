package Revision;

public class Validation {
    public static void main(String[] args) {

    }
    public static boolean dateValidation(int date, int month, int year)
    {
        if(month>12 || month<1)
        {
            return false;
        }

        return true;
    }
}
