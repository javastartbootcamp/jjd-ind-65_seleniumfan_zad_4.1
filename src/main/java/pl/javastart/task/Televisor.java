package pl.javastart.task;

public class Televisor {
    private boolean switcher = false;

    public void turnOn() {
        switcher = true;
    }

    public void turnOff() {
        switcher = false;
    }

    public void showStatus() {
        System.out.println("Telewizor jest: " + (switcher ? "włączony" : "wyłączony"));
    }
}
