public class Calculator {
    private String level;
    // домашняя работа
    public int sum(int a, int b) {
        return a + b;
    }
    public int div(int a, int b) {
        return a / b;
    }
    public double div(double a, double b) {
        return a / b;
    }
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
