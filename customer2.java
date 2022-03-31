package all;

public class customer2 {
    int CustomerID;
    String CustomerName;
    String CustomerAddress;
    int getCustomerAge;

    public static void main(String[] args) {
        customer2 objCustomer = new customer2();

        objCustomer.CustomerID=100;
    }

    void changeCustomerAddress(String address){
        CustomerAddress = address;
    }
    void displayCustomerAddress(String address){
        CustomerAddress = address;
    }
    void displayCustomerInformation(){
        System.out.println("Customer IDnumber :" + CustomerID);
        System.out.println("CustomerName:" + CustomerName);
        System.out.println("CustomerAddress: "+ CustomerAddress);
        System.out.println("Customer");

    }
}
