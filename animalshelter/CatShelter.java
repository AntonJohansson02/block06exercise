package animalshelter;

/**
 * Created by Niklas on 2016-02-07.
 * Redundant!!!!
 */
public class CatShelter extends AnimalShelter {

    @Override
    Cat adoptAnimal(){
        return (Cat) super.adoptAnimal();
    }

    void putAnimal(Cat cat){
        super.putAnimal(cat);
    }
}
