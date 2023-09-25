public class CatRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Penelope", 12, 15.75);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Milo", 5, 6.3);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
