public class Main {
    public static void main(String[] args) {
        Fish whiteShark = new Fish();
        whiteShark.food = "marine animals";
        whiteShark.typeOfWater = "ocean";
        whiteShark.isPredator = true;
        whiteShark.setPopulation(3_500);
        whiteShark.getPopulation();
        whiteShark.move();

        Bird sparrow = new Bird("forests", "plant-based food", "Europe",
                1_000_000_000L, false, "sparrow");
        sparrow.breathe();
        sparrow.move();
        sparrow.setPopulation(1_600_000_000L);
        sparrow.getPopulation();
    }
}