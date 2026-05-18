/**
 * The type Esfera.
 */
public class Esfera {
    private double radio;
    private double area;
    private double volume;

    /**
     * Instantiates a new Esfera.
     */
    public Esfera() {
    }

    /**
     * Instantiates a new Esfera.
     *
     * @param radio  the radio
     * @param area   the area
     * @param volume the volume
     */
    public Esfera(double radio, double area, double volume) {
        this.radio = radio;
        this.area = area;
        this.volume = volume;
    }

    /**
     * Gets radio.
     *
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Sets radio.
     *
     * @param radio the radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Gets area.
     *
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * Sets area.
     *
     * @param area the area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Gets volume.
     *
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets volume.
     *
     * @param volume the volume
     */
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
