import java.util.Scanner;

public class Person2 {
    String name;
    int age;
    String gender;


    public Person2(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person2(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }


    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
    public void introduce(){
        System.out.println("Hi, I'm " + name + " a " + age + " year old" + gender + ".");
    }
    
}