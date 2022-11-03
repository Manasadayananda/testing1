package pack;

public class Typecasting {

    public static int num=10;
   // public static float sal = 100.50;

    public static void main(String args[]){

        System.out.println("The integer value is "+num);

        double numdb = num;
        System.out.println("The integer value is "+numdb);

        //int sal1 = (int) sal;

        //System.out.println("The salary is "+ int sal1) ;

        Doubletoint();

        inttostring();

        stringtoint();

    }
    public static void Doubletoint(){

        double abc = 15.5;
        int i = (int) abc;
        System.out.println(i);

    }

    public static void inttostring(){

       int abc = 50;
       String i = String.valueOf(abc);
        System.out.println(i);

    }
    public static void stringtoint(){

        String abc = "50";
        int i = Integer.parseInt(abc);
        System.out.println(i);
    }
}
