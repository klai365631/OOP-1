public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magic, int theDistanceOfTheTransgression, int hardworking, int loyal, int honest) {
        super(name, magic, theDistanceOfTheTransgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    public void compereHufflepuff(Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", getName(), hufflepuff.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", hufflepuff.getName(),getName(), ability2, ability1);
        }else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n", hufflepuff.getName(),getName(), ability1, ability2);
        }
    }
    private int ability() {
        return hardworking + loyal+honest;
    }
    public String toString() {
        return String.format("%s; трудолюбибие : %d; верность: %d; честность: %d ",super.toString(), hardworking, loyal, honest);
    }
}
