package pack;

public class Looping {

    static int  Student_Marks =200;
   static int  First_class = 800;

   static int Second_class = 300;

   public static void main( String args[]){
       For_loop(500);
       score();
   }

      public static void  score () {


          if (Student_Marks > First_class) {
              System.out.println(" Congrats you got First_class");
          } else if (Student_Marks < First_class && Student_Marks > Second_class) {
              System.out.println("Congrats you got second class");
          } else {
              System.out.println("Failed");
          }
      }
        public static void For_loop(int Themaxnum){
            for(int i=1; i<=Themaxnum; i++){
                System.out.println("The number is " +i);
            }

          }

}
