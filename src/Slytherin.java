public class Slytherin extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magic, int theDistanceOfTheTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magic, theDistanceOfTheTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
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

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public void compereSlytherin(Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", getName(), slytherin.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", slytherin.getName(),getName(), ability2, ability1);
        }else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n", slytherin.getName(),getName(), ability1, ability2);
        }
    }
    private int ability() {
        return cunning + determination+ambition+resourcefulness+thirstForPower;
    }
    public String toString() {
        return String.format("%s; хитрость : %d; решитильность: %d; амбициозность : %d; находчивость: %d ; жажда власти: %d",super.toString(), cunning, determination, ambition,resourcefulness,thirstForPower);
    }
}
