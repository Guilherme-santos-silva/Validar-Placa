package Modelo;

public class Placa
{
    //definindo inicialmente nosso atributo menssagem como "Placa Valida !!"
    private String mensagem = "Placa Valida !!";
    
    //iniciando nosso metodo que recebera uma String
    public void Placa(String Placa)
    {
       boolean validacao = true;
       //definimos que tudo que não for letras maiusculas de A-Z, minusculas de a-z ou numeros de 0-9 seja substituido por ""vazio
       Placa = Placa.replaceAll("[^a-z A-Z 0-9]", "");
       
       //se a string for diferente de 7 entao mudamos o valor da variavel mensagem
       if(Placa.length() != 7)
       {
           mensagem = "Digite 7 caracteres para a placa do veiculo 3 letras e 4 numeros";
       }
       else 
       {
            //se os primeiros 3 caracateres da string for diferente de A-Z ou a-z entao mudamos o valor da variavel mensagem
            if(!(Placa.substring(0,3).matches("[A-Z]*[a-z]*")))
            {
                mensagem = "Os 3 primeiros caracteres da placa devem ser letras";
            }

            //se os primeiros os caracateres apartir da terceira posição da string for diferente de 0-9 entao mudamos o valor da variavel mensagem
            if(!(Placa.substring(3).matches("[0-9]*")))
            {
                mensagem = "Apartir do terceiro carateres deve haver sómente numeros";
            }
       }
        
    }

    //usando metodo get para termos acesso ao atributo 
    public String getMensagem()
    {
        return mensagem;
    }

    
   
   
}
