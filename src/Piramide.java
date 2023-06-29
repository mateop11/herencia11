class Piramide extends Figura {
    private double base;
    private double altura;
    private double area;
    private double volumen;

    public Piramide(double base, double altura, Punto punto) {
        super(punto);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double areaBase = base * base;
        double areaLateral = base * altura;
        area = areaBase + areaLateral;
    }

    @Override
    public void calcularPerimetro() {
        // No se aplica para una pirámide en el espacio tridimensional
    }

    @Override
    public void calcularVolumen() {
        volumen = (base * base * altura) / 3;
    }

    @Override
    public String toString() {
        return "Pirámide:\n" +
                "Base = " + base + "\n" +
                "Altura = " + altura + "\n" +
                "Área = " + area + "\n" +
                "Volumen = " + volumen + "\n";
    }
}