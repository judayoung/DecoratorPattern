package decorator;

public abstract class DisplayDecorator extends Display{

    private Display decorateDisplay;

    public DisplayDecorator(Display decorateDisplay) {
        this.decorateDisplay = decorateDisplay;
    }

    @Override
    public void draw() {
        decorateDisplay.draw();
    }
}
