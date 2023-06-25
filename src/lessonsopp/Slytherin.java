package lessonsopp;

import java.util.Random;

import java.util.Objects;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resqurcefulness;
    private int lustForpower;
    public Slytherin(String name, String faculty, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resqurcefulness, int lustForpower) {
        super(name, faculty, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resqurcefulness = resqurcefulness;
        this.lustForpower = lustForpower;

    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResqurcefulness() {
        return resqurcefulness;
    }

    public void setResqurcefulness(int resqurcefulness) {
        this.resqurcefulness = resqurcefulness;
    }

    public int getLustForpower() {
        return lustForpower;
    }

    public void setLustForpower(int lustForpower) {
        this.lustForpower = lustForpower;
    }
    public int sum(){
        return  cunning + determination + ambition + resqurcefulness + lustForpower;
    }
    public void compare(Slytherin other) {
        if (sum() > other.sum()) {
            System.out.println(getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + getName());
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resqurcefulness == slytherin.resqurcefulness && lustForpower == slytherin.lustForpower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resqurcefulness, lustForpower);
    }

    @Override
    public String toString() {
        return super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resqurcefulness=" + resqurcefulness +
                ", lustForpower=" + lustForpower +
                '}';
    }
}