public abstract class Animals {
    public String habitat;
    private int numberOfSpecies;
    protected String food;
    String type;

    public Animals() {
    }

    public Animals(String habitat, String food) {
        this.habitat = habitat;
        this.food = food;
    }

    public int getNumberOfSpecies() {
        return numberOfSpecies;
    }

    public void setNumberOfSpecies(int numberOfSpecies) {
        this.numberOfSpecies = numberOfSpecies;
    }

    public void breathe() {
        System.out.println("Animal is breathing");
    }

    public abstract void move();
}
