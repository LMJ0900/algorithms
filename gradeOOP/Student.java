package gradeOOP;

public class Student {
    private String name;
    private int kor;
    private int english;
    private int math;
    private int score;


    public void setName(String name){this.name=name;}



    public String getName(){return this.name;
    }
    public int getKor(){return this.kor;}
    public int getEnglish(){return this.english;}
    public int getMath(){return this.math;}
    public int getScore(){return this.score;}


    public void createKor(){
        this.kor = (int)(Math.random()*100);
    }
    public void createEnglish(){
        this.english = (int)(Math.random()*100);
    }
    public void createMath(){
        this.math = (int)(Math.random()*100);
    }
    public void createScore(){
        this.score = (kor+english+math)/3;

    }
    }
