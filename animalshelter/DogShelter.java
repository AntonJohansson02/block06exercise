package animalshelter;

/**
 * Created by Niklas on 2016-02-07.
 * Redundant!!!!
 */
public class DogShelter extends AnimalShelter {

    @Override
    Dog adoptAnimal(){
        return (Dog) super.adoptAnimal();
    }

    void putAnimal(Dog dog){
        super.putAnimal(dog);
    }
}
