package cs.lab;

public class Person {
    private int age;
    private int appliedDosis = 0;
    private int ID;

    public Person(int ID,int age) {
        this.age = age;
        this.appliedDosis = 1;
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAppliedDosis() {
        return appliedDosis;
    }

    public void setAppliedDosis() {
        if (appliedDosis <2){
            appliedDosis++;
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
