package memberOOP;

public class User {
    private String id;
    private String pass;
    private String password;
    private String name;
    private String idNum;
    private String phoneNum;
    private String address;
    private String job;


    public void setId(String id){
    this.id = id;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setIdNum(String idNum){
        this.idNum = idNum;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setJob(String job){
        this.job = job;
    }



    public String getId(){
        return this.id;
    }
    public String getPass(){
        return this.pass;
    }
    public String getPassword(){
        return this.password;
    }
    public String getName(){
        return this.name;
    }
    public String getIdNum(){
        return this.idNum;
    }
    public String getPhoneNum(){
        return this.phoneNum;
    }
    public String getAddress(){
        return this.address;
    }
    public String getJob(){
        return this.job;



    }
    }

