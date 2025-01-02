public class Fish extends Animals {
    public String typeOfWater;
    private long population;
    protected boolean isPredator;
    String fishType;

    public Fish() {
    }

    public Fish(String typeOfWater, long population, boolean isPredator, String fishType) {
        this.typeOfWater = typeOfWater;
        this.population = population;
        this.isPredator = isPredator;
        this.fishType = fishType;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming");
    }
}

