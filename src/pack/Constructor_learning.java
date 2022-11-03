package pack;

import javax.xml.bind.SchemaOutputResolver;

public class Constructor_learning {
         String bookName;

      public Constructor_learning(){
        System.out.println("this is constructor");
          this.bookName = "Let us c";
    }

    public static void main(String args[]){

        Constructor_learning obj1 = new Constructor_learning();
        Addition();
        System.out.println("The Engineering c book is " +obj1.bookName);

    }

    public static void Addition(){

        System.out.println(" I am something");

    }



}
