class Esfera extends Figura {
    private double radio;
    private double area;
    private double volumen;

    public Esfera(double radio, Punto punto) {
        super(punto);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        area = 4 * Math.PI * radio * radio;
    }

    @Override
    public void calcularPerimetro() {
        // No se aplica para una esfera en el espacio tridimensional
    }

    @Override
    public void calcularVolumen() {
        volumen = (4 * Math.PI * radio * radio * radio) / 3;
    }

    @Override
    public String toString() {
        return "Esfera:\n" +
                "Radio = " + radio + "\n" +
                "Área = " + area + "\n" +
                "Volumen = " + volumen + "\n";
    }
}