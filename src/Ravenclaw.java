public class Ravenclaw extends Hogwarts{

    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String name, int magic, int theDistanceOfTheTransgression, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, magic, theDistanceOfTheTransgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }
    public void compereRavenclaw(Ravenclaw ravenclaw) {
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", getName(), ravenclaw.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", ravenclaw.getName(),getName(), ability2, ability1);
        }else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n", ravenclaw.getName(),getName(), ability1, ability2);
        }
    }
    private int ability() {
        return smart + wise+witty+fullOfCreativity;
    }
    public String toString() {
        return String.format("%s; ум : %d; мудрость: %d; сообразительность : %d; творчество: %d ",super.toString(), smart, wise, witty,fullOfCreativity);
    }
}
