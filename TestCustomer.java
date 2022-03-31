package all;

public class TestCustomer {
    public static void main(String[] args){
        Customer objCustomer = new Customer();
        objCustomer.customerID=100;
        objCustomer.customerName="jack";
        objCustomer.CustomerAddress="123 street";
        objCustomer.CustomerAge=30;
        objCustomer.displayCustomerInformation();
        objCustomer.changeCustomerAddress("123Fort,MainStreet");
        objCustomer.displayCustomerInformation();
    }
}
