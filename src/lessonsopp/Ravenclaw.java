package lessonsopp;

import java.util.Objects;

public class Ravenclaw extends Hogwarts{

    private  int mind;
    private  int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String faculty, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creativity) {
        super(name, faculty, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return mind == ravenclaw.mind && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creativity == ravenclaw.creativity;
    }
    public int sum(){
        return  mind + wisdom + wit + creativity;
    }
    public void compare(Ravenclaw other) {
        if (sum() > other.sum()) {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(mind, wisdom, wit, creativity);
    }

    @Override
    public String toString() {
        return super.toString() +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ' ';
    }
}

