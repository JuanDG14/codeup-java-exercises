package Birds;
public class Finch extends Bird {
    // inherits makeNoise() from Bird
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Tweet Tweet!");
    }

    public Finch(){
        super();
        System.out.println("A Finch just got created");
    }
}