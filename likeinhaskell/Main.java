package likeinhaskell;
public class Main {
    public static void main(String[] args) {
        Tuple<String, String> t = new Tuple<>("1", "hello");
        System.out.println(t.fst());
        System.out.println(t.snd());
    }   
}
