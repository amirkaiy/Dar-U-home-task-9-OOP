public class Main4 {
    public static void main(String[] args) {

        Temperature temp1 = new Temperature(10, 'C');
        System.out.println("Температура в C: " + temp1.getCelsius() + " °C");
        System.out.println("Температура в F: " + temp1.getFahrenheit() + " °F");

        temp1.setTemperature(77, 'F');
        System.out.println("Температура в C: " + temp1.getCelsius() + " °C");
        System.out.println("Температура в F: " + temp1.getFahrenheit() + " °F");

        Temperature temp2 = new Temperature();
        System.out.println("Дефолтная температура: " + temp2.getCelsius() + " °C");

        temp2.setTemperature(4924, 'C');
        System.out.println("Температура после корректировки: " + temp2.getCelsius() + " °C");
    }
}


class Temperature {
    private double value;
    private char scale;

    public double getValue() {
        return value;
    }

    public char getScale() {
        return scale;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public Temperature() {
        this.value = 0;
        this.scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.value = 0;
        this.scale = scale;
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getCelsius() {
        if(scale == 'C') {
            return value;
        } else {
            return 5.0 * (value - 32) / 9.0;
        }
    }

    public double getFahrenheit() {
        if(scale == 'F') {
            return value;
        } else {
            return (9.0 * value / 5.0) + 32;
        }
    }
}


