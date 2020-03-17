import trafficlight.ctrl.TrafficLightCtrl;


public class MCP {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightCtrl ctrl = new TrafficLightCtrl();
        ctrl.run();
    }
}