package Birds;

public class BirdTest {
        public static void main(String[] args) {
//            Birds.Bird cardinal = new Birds.Bird();
//            cardinal.setName("Cardinal");
//            cardinal.setCanFly(true);
//            cardinal.makeNoise();
//            cardinal.move();

//            Duck mallard                            =                                               new Duck();
            // declare a reference variable           assigned                              call the default constructor
//            mallard.setName("Mallard");
//            mallard.makeNoise();

//            Finch lesserGoldFinch = new Finch();
//            lesserGoldFinch.setName("Lesser Godlfinch");
//            lesserGoldFinch.makeNoise();
//
//
//            Penguin penguin = new Penguin();
//            penguin.setName("Emperor Penguin");
//            penguin.setCanFly(false);
//            penguin.move();
//            penguin.makeNoise();

            // Polymorphism allows us to have different refrences and object

            //        Finch houseFinch = new Finch();
            Bird piratesBestFriend = new Bird();
            System.out.println(piratesBestFriend.getName());

            Finch cassinsFinch = new Finch("Cassin's Finch", true);
            System.out.println(cassinsFinch.getName());
        }
}
