package pack;

public class Variable_learning {
   static int i = 10;


    public static void main(String args[]){


        System.out.println(addition_number(1, 2, 3));
        Addition();
    }

    public  static void Addition(){
        int j = 20;
        System.out.println(i);
        System.out.println(j);
    }

    public void Substraction(){
        System.out.println(i);
       // System.out.println(j);
// error shows in the above line  bcz a variable of other method can't be used here
    }

    public static int addition_number(int a, int b, int c){

        return a+b+c;

    }

}
