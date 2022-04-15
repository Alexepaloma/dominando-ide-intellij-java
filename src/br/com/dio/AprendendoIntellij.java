package br.com.dio;

public class AprendendoIntellij {
    private static String nome;
    private static String numPaginas;

    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        System.out.println("Tudo bem galera? " + (a+b));

        int i = 300;
        livro livro = new livro ("O conde de Monte Cristo ",300);
        System.out.println(livro);

}
 static class livro{
    private String nome;
    private Integer numPaginas;

     public livro(String nome, Integer numPaginas) {
         this.nome = nome;
         this.numPaginas = numPaginas;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public Integer getNumPaginas() {
         return numPaginas;
     }

     public void setNumPaginas(Integer numPaginas) {
         this.numPaginas = numPaginas;
     }

     @Override
     public String toString() {
         return "livro{" +
                 "Nome='" + nome + '\'' +
                 ", numPaginas=" + numPaginas +
                 '}';
     }
 }
}