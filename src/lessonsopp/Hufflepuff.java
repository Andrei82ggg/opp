package lessonsopp;

import java.util.Objects;

public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name, String faculty, int magicPower, int transgressionDistance) {
        super(name, faculty, magicPower, transgressionDistance);
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industriousness == that.industriousness && loyalty == that.loyalty && honesty == that.honesty;
    }
    public int sum(){
        return super.sum() + industriousness + loyalty + honesty;
    }
    public void compare(Hufflepuff other) {
        if (sum() > other.sum()) {
            System.out.println(getName() + " лучший Пуффендунец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Пуффендунец, чем " + getName());
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industriousness, loyalty, honesty);
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}