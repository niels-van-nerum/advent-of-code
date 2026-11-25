package model;

public class Dial {
    private int dialPosition = 50;
    private int amountOfTimesDialOnZero = 0;
    private final boolean detectAnyChange;

    public Dial(boolean detectAnyChange) {
        this.detectAnyChange = detectAnyChange;
    }

    public void turnDialBack(int amountOfClicksBack) {
        for (int clicksBack = amountOfClicksBack; clicksBack > 0; clicksBack--) {
            dialPosition--;
            if (dialPosition < 0) dialPosition = 99;
            if (detectAnyChange && dialPosition == 0) amountOfTimesDialOnZero++;
        }
        if (!detectAnyChange && dialPosition == 0) amountOfTimesDialOnZero++;
    }

    public void turnDialForward(int amountOfClicksForward) {
        for (int clicksForward = amountOfClicksForward; clicksForward > 0; clicksForward--) {
            dialPosition++;
            if (dialPosition > 99) dialPosition = 0;
            if (detectAnyChange && dialPosition == 0) amountOfTimesDialOnZero++;
        }
        if (!detectAnyChange && dialPosition == 0) amountOfTimesDialOnZero++;
    }

    public int getAmountOfTimesDialOnZero() {
        return amountOfTimesDialOnZero;
    }
}
