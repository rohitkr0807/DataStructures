package Revision;

public class Assignment11 {
    public static void main(String[] args) {
        System.out.println(countAAA("bbbbAAAAAAfgdgAAAC"));
    }
    public static int countAAA(String str)
    {
        if(str.length()<3)
        {
            return 0;
        }
        String chk = str.substring(0,3);
//        String ros= str.substring(1);
        if(chk.equals("AAA"))
        {
            return 1+countAAA(str.substring(3));
        }else return countAAA(str.substring(1));
    }
}
