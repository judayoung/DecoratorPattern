package decorator;

public class LaneDecorator extends DisplayDecorator{

    public LaneDecorator(Display decorateDisplay) {
        super(decorateDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawLine();
    }

    private void drawLine(){
        System.out.println("\t 차선 표시");
    }

}
