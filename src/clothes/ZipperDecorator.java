package clothes;

public class ZipperDecorator extends ClothesDecorator{

    public ZipperDecorator(Clothes clothes){
        super(clothes);
    }

    @Override
    public void create(){
        super.create();
        add();
    }

    @Override
    public void finish() {
        super.finish();
    }

    public void add(){
        System.out.println("\t 지퍼를 덧댄다.");
    }

}
