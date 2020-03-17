package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class StateYellow implements State {

    private TrafficLightCtrl context;

    public StateYellow(TrafficLightCtrl context) {
        super();
        this.context = context;
    }

    @Override
    public void nextState() {
        if (context.getPreviousState() instanceof StateGreen) {
            context.setCurrentState(context.getRedState());
        } else {
            context.setCurrentState(context.getGreenState());
        }
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.YELLOW;
    }
}