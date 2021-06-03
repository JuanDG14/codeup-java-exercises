public class ServerNameGenerator {
    private static String[] adj ={"Cruel", "Huge", "Perfect", "Rough", "Clean", "Lazy", "Clumsy", "Proud", "Scary", "Repulsive"};
    private static String[] noun ={"Man", "Lion", "Wolf", "Space", "Bull", "Disease", "Dog", "Bear", "Friend", "Land"};

    private static String randomElement (String[] strings) {
        int randomNumber = (int) (Math.random() * strings.length);
        return strings[randomNumber];
    }

    public static String makeServerName (String[] array1, String[] array2) {
        String adj = randomElement(array1);
        String noun = randomElement(array2);
        return adj + "-" + noun;
    }

    public static void main(String[] args) {
        System.out.println("Your new server name is:");
        System.out.println(makeServerName(adj, noun));
    }
}
