import lessonsopp.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Random random = new Random();
        Hogwarts h1 = new Hogwarts("Дамблдор", "Хогвардтс", random.nextInt(101), random.nextInt(101));
        Grifindor harry = new Grifindor("Гари", "Грифиндор", random.nextInt(101), random.nextInt(101));
        Grifindor germiona = new Grifindor("Гермиона", "Грифиндор", random.nextInt(101), random.nextInt(101));
        Grifindor ron = new Grifindor("Рон", "Грифиндор", random.nextInt(101), random.nextInt(101));

        Slytherin drako = new Slytherin("Драко", "Слизерин", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Slytherin grehem = new Slytherin("Грехем", "Слизерин", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Slytherin gregory = new Slytherin("Грегори", "Слизерин", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Hufflepuff zahariy = new Hufflepuff("Захария", "Пуффендуй", random.nextInt(101), random.nextInt(101));
        Hufflepuff sedric = new Hufflepuff("Седрик", "Пуффендуй", random.nextInt(101), random.nextInt(101));
        Hufflepuff dzastin = new Hufflepuff("Джастин", "Пуффендуй", random.nextInt(101), random.nextInt(101));
        Ravenclaw dzo = new Ravenclaw("Джо", "Пуффендуй", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Ravenclaw padma = new Ravenclaw("Падма", "Пуффендуй", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Ravenclaw marcus = new Ravenclaw("Маркус", "Пуффендуй", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));

        drako.compare(gregory);
        System.out.println(padma);
        zahariy.compare(sedric);
        marcus.compare(harry);
    }
}