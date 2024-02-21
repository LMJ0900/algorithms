package memberOOP;

import java.lang.reflect.Member;

public class User {
    private String id;
    private String pass;
    private String password;
    private String name;
    private String idNum;
    private String phoneNum;
    private String address;
    private String job;
    private double height;
    private double weight;
    //카우프 지수에서 사용하는 생성자
    public Member(double height,double weight){
        this.height = height;
        this.weight = weight;
    }
      //회원가입에서 사용하는 생성자

    public User(String id, String pass, String password, String name,String idNum, String phoneNum, String address, String job ){
        this.id = id; this.pass = pass; this.password = password; this.name = name; this.idNum = idNum; this.phoneNum = phoneNum; this.address = address; this.job = job;
    }


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
    public void setWeight(){
        this.weight = weight;
    }
    public void setHeight(){
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pass='" + pass + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", idNum='" + idNum + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

