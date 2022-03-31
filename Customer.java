package all;

public class Customer {
    int customerID;
    String customerName;
    String CustomerAddress;
    int CustomerAge;
    public static void main(String[]  args) {
        Customer objCustomerl = new Customer();

        objCustomerl.customerID=100;
        objCustomerl.customerName="hoang";
        objCustomerl.CustomerAddress="123 street";
        objCustomerl.CustomerAge=30;
        System.out.println("Customer IdNumber:" + objCustomerl.customerID);
        System.out.println("CustomerName: " + objCustomerl.customerName);
        System.out.println("CustomerAddress:" + objCustomerl.CustomerAddress);
        System.out.println("CustomerAge: " + objCustomerl.CustomerAge);
    }

    public void displayCustomerInformation() {
    }
    public void changeCustomerAddress(String s){

    }
}
