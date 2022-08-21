import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Gryffindor harry = ganerateGryffindor("Гарри Поттер");
        Gryffindor ron = ganerateGryffindor("Рон Уизли");
        Ravenclaw luna = ganerateRavenclaw("Полумна Лавгуд");
        Slytherin draco = ganerateSlytherin("Драко Малфой");
        Hufflepuff cedric = ganerateHufflepuff("Седрик Диггори");

        harry.print();
        ron.print();
        luna.print();
        draco.print();
        cedric.print();

        harry.compereHogvarts(draco);
        harry.compereGryffindor(ron);

    }

    public static Gryffindor ganerateGryffindor(String name) {
        return new Gryffindor(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));


    }

    public static Ravenclaw ganerateRavenclaw(String name) {
        return new Ravenclaw(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));


    }

    public static Slytherin ganerateSlytherin(String name) {
        return new Slytherin(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));


    }

    public static Hufflepuff ganerateHufflepuff(String name) {
        return new Hufflepuff(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));


    }
}