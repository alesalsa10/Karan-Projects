package Patient_Doctor_Scheduler;

public class Patient {
    private String name;
    private int age;
    private String problem;

    public Patient(String name, int age, String problem){
        this.name = name;
        this.age = age;
        this.problem = problem;
    }

    public String toString(){
        return this.name + " is " + this.age + " and his problem is " + this.problem;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
