public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello there, " + name + "!");
    }

    public static void main(String[] args) {
        // i initialized the name juan
//        Person person1 = new Person("Juan");
//
        // i ended up setting the same person with a different name
//        person1.setName("Jose");
//
//        System.out.println(person1.getName());
//        person1.sayHello();

        // for the first one will comeback true
        // the second will come out false because each object is different, they just have the same name.
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        // this will come out true since we are saying person 2 and person 1 are exactly the same.
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        // person1 is created and person2 is exactly the same as person1 so both person1 and person2 will come out John
        //since person1 and person2 are identical when we set a new name on person2, this will also change person1 name.
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }

}

