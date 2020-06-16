package lazyload;

public class Animal {
    private String name;
    private String species;
    private String colour;
    private String age;
    private String animalClass;
    private String numLegs;
    int key;

    public Animal(int key) {
        //would help if this was all one access
        this.key = key;
    }

    //lazy initialisation
    public String getName() {
        if (name == null) {
            this.name = AnimalDataSource.getData(key, AnimalDataSource.Field.NAME);
        }
        return name;
    }

    public String getSpecies() {
        if (species == null) {
            this.species = AnimalDataSource.getData(key, AnimalDataSource.Field.SPECIES);
        }
        return species;
    }

    public String getColour() {
        if (this.colour == null) {
            this.colour = AnimalDataSource.getData(key, AnimalDataSource.Field.COLOUR);
        }

        return colour;
    }

    public String getAge() {
        if (this.age == null) {
            this.age = AnimalDataSource.getData(key, AnimalDataSource.Field.AGE);
        }

        return age;
    }

    public String getAnimalClass() {
        if (animalClass == null) {
            this.animalClass = AnimalDataSource.getData(key, AnimalDataSource.Field.ANIMAL_CLASS);
        }
        return animalClass;
    }

    public String getNumLegs() {
        if (numLegs == null) {
            this.numLegs = AnimalDataSource.getData(key, AnimalDataSource.Field.NUM_LEGS);
        }

        return numLegs;
    }
}