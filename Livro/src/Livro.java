public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void emprestar(){

        emprestado = true;
    }

    public void devolver(){
        emprestado = false;
    }

        public String exibirInformacao(){
        if (emprestado)
            return String.format("titulo:" + " " + getTitulo() + " " + "\r\nautor:" + " " + getAutor() + " " + "\r\nano de publicacao" + " " + getAnoPublicacao() + " " + "\r\nFalso");
        else {
            return String.format("titulo:" + " " + getTitulo() + " " + "\r\nautor:" + " " + getAutor() + " " + "\r\nano de publicacao" + " " + getAnoPublicacao() + " " + "\r\rVerdadeiro");

        }
    }
    }

