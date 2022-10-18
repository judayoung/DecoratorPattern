package clothes;

public class Shirt implements Clothes{

    @Override
    public void create(){
        System.out.println("셔츠를 만든다.");
    }

    @Override
    public void finish() {
        System.out.println("서츠 완성!");
    }

}
