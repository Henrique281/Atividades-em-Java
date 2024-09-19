public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double velocidadeatual;

    public Carro(String marca, String modelo, int ano, String cor, double velocidadeatual){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeatual = 0;


    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidadeatual() {
        return velocidadeatual;
    }

    public void setVelocidadeatual(double velocidadeatual) {
        this.velocidadeatual = velocidadeatual;
    }
}
