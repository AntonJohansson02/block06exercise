package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
// TODO task 1: Implement this class. It should act like a tuple in e.g.
//  Haskell or Python. An object of this type should hold two values of
//  (possibly) different (arbitrary) types, and have the methods fst()
//  and snd() to return the respective components.
//  NOTE: The class should be read-only after initial construction.

public class Tuple <T,L>{
    private T obj1;
    private L obj2;

    Tuple(T obj1,L obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }


    public T fst(){return obj1;}
    public L snd(){return obj2;}
}


