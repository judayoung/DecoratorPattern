package decorator;

public class TrafficDecorator extends DisplayDecorator {

    public TrafficDecorator(Display decorateDisplay) {
        super(decorateDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("\t 교통량 표시");
    }

}
