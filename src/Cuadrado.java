class Cuadrado extends Figura {
    private double lado;
    private double area;
    private double perimetro;

    public Cuadrado(double lado, Punto punto) {
        super(punto);
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        area = lado * lado;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 4 * lado;
    }

    @Override
    public void calcularVolumen() {
        // No se aplica para un cuadrado en el espacio tridimensional
    }

    @Override
    public String toString() {
        return "Cuadrado:\n" +
                "Lado = " + lado + "\n" +
                "Área = " + area + "\n" +
                "Perímetro = " + perimetro + "\n";
    }
}
