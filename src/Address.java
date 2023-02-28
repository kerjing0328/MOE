public class Address {
    String num;
    String street;
    String poscode;
    String state;

    public Address(){

    }
    public Address(String num, String street, String poscode, String state){
        this.num = num;
        this.street = street;
        this.poscode = poscode;
        this.state = state;
    }

    public String getNum(){
        return num;
    }

    public String getStreet(){
        return street;
    }

    public String getPoscode(){
        return poscode;
    }

    public String getState(){
        return state;
    }

    public String getFullAddress(){
        return num + ", " + street + ", " + poscode + ", " + state;
    }

    void displayAddress(){
        System.out.print(num + street + poscode + state);
    }

    public static void main(String args[]){
        Address address = new Address();
        address.displayAddress();

    }
}
