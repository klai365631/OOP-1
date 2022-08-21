import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Gryffindor harry = ganerateGryffindor("Гарри Поттер");
        Gryffindor germiona = ganerateGryffindor("Гермиона Грейнджер");
        Gryffindor ron = ganerateGryffindor("Рон Уизли");

        Ravenclaw jou = ganerateRavenclaw("Чжоу Чанг");
        Ravenclaw padma = ganerateRavenclaw("Падма Патил");
        Ravenclaw marcus = ganerateRavenclaw("Маркус Белби");

        Slytherin draco = ganerateSlytherin("Драко Малфой");
        Slytherin grehem = ganerateSlytherin("Грэхэм Монтегю");
        Slytherin gregory = ganerateSlytherin("Грегори Гойл");

        Hufflepuff cedric = ganerateHufflepuff("Седрик Диггори");
        Hufflepuff zaharia = ganerateHufflepuff("Захария Смит");
        Hufflepuff jastin = ganerateHufflepuff("Джастин Финч-Флетчли");

        harry.print();
        germiona.print();
        ron.print();

        jou.print();
        padma.print();
        marcus.print();

        draco.print();
        grehem.print();
        gregory.print();

        cedric.print();
        zaharia.print();
        jastin.print();

        harry.compereHogwarts(draco);
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