public class address {
    public String firstName;
    public String lastName;
    public String adress;
    public String city;
    public String code;
    public String phoneNumber;
    public String email;

    public address(String firstName, String lastName, String adress, String city, String code, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.city = city;
        this.code = code;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void toPrint(){
        System.out.println("name"+this.firstName+this.lastName+"address"+this.adress+"city"+this.city+"code"+this.code);
        System.out.println("PhoneNumbe"+this.phoneNumber+"EmailID"+this.email);
    }
}
