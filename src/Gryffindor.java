import org.w3c.dom.ls.LSOutput;

public class Gryffindor extends Hogwarts{

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magic, int theDistanceOfTheTransgression, int nobility, int honor, int bravery) {
        super(name, magic, theDistanceOfTheTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
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

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void compereGryffindor(Gryffindor gryffindor) {
        int ability1 = getAbility();
        int ability2 = gryffindor.getAbility();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", getName(), gryffindor.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", gryffindor.getName(),getName(), ability2, ability1);
        }else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n", gryffindor.getName(),getName(), ability1, ability2);
        }
    }
    private int getAbility() {
        return nobility + honor+bravery;
    }
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d ",super.toString(), nobility, honor, bravery);
    }

}

