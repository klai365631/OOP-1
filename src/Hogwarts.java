public class Hogwarts {
    private String name;

    private int magic;

    private int theDistanceOfTheTransgression;


    public Hogwarts(String name, int magic, int theDistanceOfTheTransgression) {
        this.name = name;
        this.magic = magic;
        this.theDistanceOfTheTransgression = theDistanceOfTheTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTheDistanceOfTheTransgression() {
        return theDistanceOfTheTransgression;
    }

    public void setTheDistanceOfTheTransgression(int theDistanceOfTheTransgression) {
        this.theDistanceOfTheTransgression = theDistanceOfTheTransgression;
    }

    private int ability() {
        return magic + theDistanceOfTheTransgression;
    }

    public void print() {
        System.out.println(this);
    }

    public void compereHogvarts(Hogwarts hogwarts) {
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", getName(), hogwarts.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", hogwarts.getName(),getName(), ability2, ability1);
        }else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n", hogwarts.getName(),getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии %d; сила трансгрессии :%d ", name, magic, theDistanceOfTheTransgression);
    }
}
