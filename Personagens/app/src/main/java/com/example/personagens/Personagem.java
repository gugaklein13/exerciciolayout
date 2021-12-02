package br.com.local.booksrecyclerviewapp;

class Personagens {
    //Atributos globais
    private String nome;
    private String idade;
    private String luta;
    private int miniatura;

    //Criar o construtor
    public Personagens(String nome, String idade, String luta, int miniatura) {
        this.nome = nome;
        this.idade = idade;
        this.luta = luta;
        this.miniatura = miniatura;
    }
    //Métodos de acesso - getters e setters

    public String getnome() {
        return nome;
    }

    public void setnome(String imagem) {
        this.nome = nome;
    }

    public String getidade() {
        return idade;
    }

    public void setidade(String idade) {
        this.idade = idade;
    }

    public String getluta() {
        return luta;
    }

    public void setluta(String luta) {
        this.luta = luta;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }
}
