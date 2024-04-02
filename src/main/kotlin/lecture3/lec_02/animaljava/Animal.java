package lecture3.lec_02.animaljava;

public abstract class Animal {
    protected final String species;
    protected final int legCnt;

    public Animal(String species, int legCnt) {
        this.species = species;
        this.legCnt = legCnt;
    }


    abstract public void move();

    public String getSpecies() {
        return species;
    }

    public int getLegCnt() {
        return legCnt;
    }
}
