public class Filme {
   public String nome;
   public double SomaDasAvaliacoes;
   public boolean incluidoNoPlano;
   public double avaliacao;
   public  int totalDeAvaliacoes;
   public    int duracaoEmMinutos;
   public int anoDeLancamento;




    void  exibeFichaTecnica() {
            
                System.out.println("nome do Filme " + nome);
        System.out.println(" Ano de lançamento:" + anoDeLancamento);
    }

    void avalia(double nota){
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    
    }


   double pegaMedia(){
     return SomaDasAvaliacoes / totalDeAvaliacoes;
}
}
