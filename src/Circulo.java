class Circulo extends Figura {
    private double radio;
    private double area;
    private double perimetro;

    public Circulo(double radio, Punto punto) {
        super(punto);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * radio * radio;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }

    @Override
    public void calcularVolumen() {
        // No se aplica para un círculo en el espacio tridimensional
    }

    @Override
    public String toString() {
        return "Círculo:\n" +
                "Radio = " + radio + "\n" +
                "Área = " + area + "\n" +
                "Perímetro = " + perimetro + "\n";
    }
}