class Account{
    public String name;
    protected String adharid;
    private String password;

    //getter
    public String getPass(){
//        setp("fjowe832ehj8");
        return this.password;
    }

    //setter
    public void setPass(String pass){
        this.password=pass;
    }

    private void setp(String pass){
        this.password=pass;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Account a = new Account();
        a.setPass("nishi");
        System.out.println(a.getPass());
    }
}
