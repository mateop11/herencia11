class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;
    private double area;
    private double perimetro;

    public Triangulo(double lado1, double lado2, double lado3, Punto punto) {
        super(punto);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
    }

    @Override
    public void calcularVolumen() {
        // No se aplica para un triángulo en el espacio tridimensional
    }

    @Override
    public String toString() {
        return "Triángulo:\n" +
                "Lado 1 = " + lado1 + "\n" +
                "Lado 2 = " + lado2 + "\n" +
                "Lado 3 = " + lado3 + "\n" +
                "Área = " + area + "\n" +
                "Perímetro = " + perimetro + "\n";
    }
}
