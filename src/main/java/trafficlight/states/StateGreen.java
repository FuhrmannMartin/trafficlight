package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class StateGreen implements State {

    private TrafficLightCtrl context;

    public StateGreen(TrafficLightCtrl context) {
        super();
        this.context = context;
    }

    @Override
    public void nextState() {
        context.setPreviousState(this);
        context.setCurrentState(context.getYellowState());
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.GREEN;
    }
}
