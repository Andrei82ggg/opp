package lessonsopp;

import java.util.Objects;

public class Grifindor extends Hogwarts{

    private int nobility;
    private int honor;
    private int courage;

    public Grifindor(String name, String faculty, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, faculty, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public Grifindor(String name, String faculty, int magicPower, int transgressionDistance) {
        super(name, faculty, magicPower, transgressionDistance);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
    public int sum(){
        return super.sum() + nobility + honor + courage;
    }
    public void compare(Grifindor other){
        if (sum() > other.sum()){
            System.out.println(getName() + " лучший Грифиндорец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Грифиндорец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Grifindor grifindor = (Grifindor) o;
        return nobility == grifindor.nobility && honor == grifindor.honor && courage == grifindor.courage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, courage);
    }

    @Override
    public String toString() {
        return "Grifindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }
}
