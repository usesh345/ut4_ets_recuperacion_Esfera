public class Esfera {
    private double radio;
    private double area;
    private double volume;

    public Esfera() {
    }

    public Esfera(double radio, double area, double volume) {
        this.radio = radio;
        this.area = area;
        this.volume = volume;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "cilindro{" +
                "radio=" + radio +
                ", area=" + area +
                ", volume=" + volume +
                '}';
    }
}
