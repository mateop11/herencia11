abstract class Figura {
    protected Punto punto;

    public Figura(Punto punto) {
        this.punto = punto;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public abstract void calcularVolumen();

    @Override
    public abstract String toString();
}