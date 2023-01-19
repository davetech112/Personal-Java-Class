public class Main {
    public static void main(String[] args) {

        Person david = new Person();
        david.setAge(18);
        david.setFirstName("David");
        david.setLastName("Onyeka");
        System.out.println(david.isTeen());
        System.out.println(david.fullName());
    }
}