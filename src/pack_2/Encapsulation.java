package pack_2;

public class Encapsulation {

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int empAge) {
        EmpAge = empAge;
    }

    public  int  get_bonus(){
        int bonus =0;
        if(SSN == 1234) {bonus = 100;}

        if(SSN == 1243){bonus = 80;}
        return bonus;

    }

    private  int SSN;
    private  String EmpName;
    private int EmpAge;


    public static void main (String args[]){
        Encapsulation obj = new Encapsulation();

        obj.setSSN(1234);
        obj.setEmpName("Manasa");
        obj.setEmpAge(25);


        System.out.println(obj.getSSN());
        System.out.println(obj.getEmpName());
        System.out.println(obj.EmpAge);
        System.out.println(obj.get_bonus());

    }
}
