public class Birds extends Animals {
    public String habitatArea;
    private int population;
    protected boolean isPredator;
    String birdType;

    public Birds() {
    }

    public Birds(String habitat, String food, String habitatArea, int population, boolean isPredator, String birdType) {
        super(habitat, food);
        this.habitatArea = habitatArea;
        this.population = population;
        this.isPredator = isPredator;
        this.birdType = birdType;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}
