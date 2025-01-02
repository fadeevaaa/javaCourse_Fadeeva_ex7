public class Bird extends Animals {
    public String habitatArea;
    private long population;
    protected boolean isPredator;
    String birdType;

    public Bird() {
    }

    public Bird(String habitat, String food, String habitatArea, long population,
                 boolean isPredator, String birdType) {
        super(habitat, food);
        this.habitatArea = habitatArea;
        this.population = population;
        this.isPredator = isPredator;
        this.birdType = birdType;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}
