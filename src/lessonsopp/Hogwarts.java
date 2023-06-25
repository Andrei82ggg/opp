package lessonsopp;

import java.util.Objects;

public class Hogwarts{
    private String name;
    private String faculty;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, String faculty, int magicPower, int transgressionDistance) {
        this.name = name;
        this.faculty = faculty;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magicPower == hogwarts.magicPower && transgressionDistance == hogwarts.transgressionDistance && Objects.equals(name, hogwarts.name) && Objects.equals(faculty, hogwarts.faculty);
    }
    public void compare(Hogwarts other){
        if (this.getMagicPower() > other.magicPower){
            System.out.println(this.name + " обладает большей мощностью магии, чем " +other.name);
        }else {
            System.out.println(other.name + " обладает большей мощностью магии, чем " +this.name);
        }
        if (this.getTransgressionDistance() > other.transgressionDistance){
            System.out.println(this.name + " обладает большей дистанцией, чем " +other.name);
        } else {
            System.out.println(other.name + " обладает большей дистанцией, чем " +this.name);
        }
    }
    public int sum(){
        return magicPower + transgressionDistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculty, magicPower, transgressionDistance);
    }

    @Override
    public String toString() {
        return                 "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance + " ,";
    }
}
