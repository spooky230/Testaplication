package pizza;
public class Client {
        private String name;
        private String address;
        private String phoneNumber;
    public Client(){

    }
    public Client(String name,String address,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String adress){
        this.address = adress;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }

}
