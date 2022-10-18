package decorator;

import decorator.*;

public class DecoratorApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's decorate Display class with some classes!");
        System.out.println();

        RoadDisplay roadDisplay = new RoadDisplay();
        roadDisplay.draw();

        LaneDecorator laneDecorator = new LaneDecorator(roadDisplay);
        laneDecorator.draw();

        TrafficDecorator trafficDecorator = new TrafficDecorator(laneDecorator);
        trafficDecorator.draw();

        // new TrafficDecorator(new LaneDecorator(new RoadDisplay()));

    }

}
