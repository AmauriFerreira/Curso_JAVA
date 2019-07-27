

public class Aluno
   private String nome;
   private int idade;
   private double peso;
   private boolean formando;
   private char sexo;

   public Aluno(String n, int i, double p, char s, boolean f){
       nome = n;
       idade = i;
       peso = p;
       sexo = s;
       formando = f;
   }

   //metodos de acesso
   public String getNome(){
       return nome;
   }
   public int getIdade(){
        return idade;
   }
   public double getPeso(){
        return peso;
   }
   public boolean getFormando(){
         return formando;
   }
   public char getSexo(){
        return sexo;
   }
