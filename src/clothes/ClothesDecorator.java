package clothes;

public abstract class ClothesDecorator implements Clothes{

    private Clothes decorateClothes;

    public ClothesDecorator(Clothes clothes){
        this.decorateClothes = clothes;
    }

    @Override
    public void create(){
        decorateClothes.create();
    }

    @Override
    public void finish() {
        decorateClothes.finish();
    }

}
