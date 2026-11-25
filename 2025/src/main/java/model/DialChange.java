package model;

public record DialChange(char direction, int amount) {
    public DialChange(String line) {
        this(line.charAt(0), Integer.parseInt(line.substring(1)));
    }
}
