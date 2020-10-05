import model.Tiger;

public class Main {

    public static void main(String[] args){
        Tiger tiger = new Tiger(5,100,"running","eating");

        System.out.println(tiger.getBehavior());
    }
}
