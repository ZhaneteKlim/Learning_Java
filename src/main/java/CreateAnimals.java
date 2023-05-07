public class CreateAnimals {
    public static void main(String[] args) {
        Cow Burjonka = new Cow("muuu", 28);
        System.out.println(Burjonka.getSay());
        Burjonka.muuu();
        Cat Vasja = new Cat("mjau", 32);
        System.out.println(Vasja.getSay());
        Vasja.mjau();
    }

}
