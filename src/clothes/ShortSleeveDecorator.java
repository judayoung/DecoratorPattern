package clothes;

public class ShortSleeveDecorator extends ClothesDecorator{

    public ShortSleeveDecorator(Clothes clothes){
        super(clothes);
    }

    @Override
    public void create(){
        super.create();
        addSleeve();
        setSleeveShort();
    }

    @Override
    public void finish() {
        super.finish();
    }

    public void addSleeve(){
        System.out.println("\t 소매를 덧댄다.");
    }

    public void setSleeveShort(){
        System.out.println("\t 소매를 반으로 자른다.");
    }
}
