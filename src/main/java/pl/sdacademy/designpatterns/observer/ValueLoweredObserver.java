package pl.sdacademy.designpatterns.observer;

public class ValueLoweredObserver extends Observer {
    private int previousState;

    public ValueLoweredObserver(Subject subject) {
        super(subject);
        previousState =subject.getState();
    }

    @Override
    public void update() {
        if (subject.getState() < previousState) {
            System.out.println("Value lowered and is now: " + subject.getState());
        }
        previousState = subject.getState();
    }
}
