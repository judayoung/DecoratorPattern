package clothes;

public class DecoratorApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's make clothes by hand!");
        System.out.println();

        Shirt shirt = new Shirt();
        shirt.create();
        shirt.finish();
        System.out.println();

        ZipperDecorator shirtWithZipper = new ZipperDecorator(shirt);
        shirtWithZipper.create();
        shirtWithZipper.finish();
        System.out.println();

        ShortSleeveDecorator shirtZipperAndShortSleeve = new ShortSleeveDecorator(shirtWithZipper);
        shirtZipperAndShortSleeve.create();
        shirtZipperAndShortSleeve.finish();
        System.out.println();
    }

}
