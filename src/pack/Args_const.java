package pack;

public class Args_const {

    String EName;
    int eid;

    public Args_const(int Employee_ID, String  Employee_Name ) {
       this.eid = Employee_ID;
        this.EName = Employee_Name;

    }
    public void EmpTableInfo(){


        System.out.println("ID="+eid + "Name="+EName);
    }

    public static void main(String args[]){

        Args_const obj1 = new Args_const(10,"manasa");
        obj1.EmpTableInfo();
    }
}

