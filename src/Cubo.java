class Cubo extends Figura {
    private double lado;
    private double area;
    private double volumen;

    public Cubo(double lado, Punto punto) {
        super(punto);
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        area = 6 * lado * lado;
    }

    @Override
    public void calcularPerimetro() {
        // No se aplica para un cubo en el espacio tridimensional
    }

    @Override
    public void calcularVolumen() {
        volumen = lado * lado * lado;
    }

    @Override
    public String toString() {
        return "Cubo:\n" +
                "Lado = " + lado + "\n" +
                "Área = " + area + "\n" +
                "Volumen = " + volumen + "\n";
    }
}