package pack_1;

public class Floor_1 {

    public String Bank_Interst(String BankName){
        String rate = null;
        if (BankName.equals("HDFC")) {rate="10.5";}
        if (BankName.equals("HSBC")) {rate="11.5";}
        if (BankName.equals("IDFC")) {rate="12.5";}
        if (BankName.equals("SBI")) {rate="13.5";}
        return rate;
    }
}
