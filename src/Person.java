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
//        Person person1 = new Person("Juan");
//
//        person1.setName("Jose");
//
//        System.out.println(person1.getName());
//        person1.sayHello();

        // this will be creating 2 persons with the name john and for the first will comeback true
        // the second will come out false
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        // i believe that the first person will be named juan but i dont believe the second one will be created
        // and it will be come out false
        //i was wrong
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);
    }

}

