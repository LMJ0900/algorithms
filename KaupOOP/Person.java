package KaupOOP;

public class Person {
    private String name;
    private double height;
    double weight;
    double bmi;
    String bodyMass;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public  double getHeight(){
        return this.height;
    }

    public  double getWeight(){
        return  this.weight;
    }


    public  double getBmi(){
        return this.bmi;
    }


    public String getBodyMass(){
        return this.bodyMass;
    }
    public void createHeight(){
        this.height = (Math.random()*0.5)+1.5;
    }

    public void createWeight(){
        this.weight = (Math.random()*69)+30;
    }

    public void createBmi(){
        this.bmi = weight/(height*height);
    }

    public void createBodyMass(){

        String bodyMass = "";
        if(bmi<18.5){
            bodyMass = "저체중";
        }else if(bmi<23){
            bodyMass = "정상";
        }else if(bmi<25){
            bodyMass = "과체중";
        }else {
            bodyMass = "비만";
        }
        this.bodyMass = bodyMass;
    }

}
