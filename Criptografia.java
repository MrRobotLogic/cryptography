import java.util.Scanner;
public class Criptografia {

    public static String codigoCesar(String str, int chave){
        char[] chars = str.toCharArray();
    
        for(int i=0; i<chars.length;i++){
            if(chars[i]!= ' '){
                chars[i] = (char)(chars[i]+chave);
            }
        }
        String frase = String.valueOf(chars);
        return frase;
    }

    public static String codigoCesarConvertido(String str, int chave){
        char[] chars = str.toCharArray();
    
        for(int i=0; i<chars.length;i++){
            if(chars[i]!= ' '){
                chars[i] = (char)(chars[i]-chave);
            }
        }
        String frase = String.valueOf(chars);
        return frase;
    }

    public static String linguaDoP(String frase){
        
        String fraseCerta = "";
     
            for(int i = 0; i<frase.length();i++){

                if(!(frase.substring(i,i+1).equals("  "))){
                    fraseCerta = fraseCerta + "p"+ frase.substring(i, i+1) ;
                }

            }

        return fraseCerta.replace("p ", " ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        for(int i=0; i < 1; i++){

            System.out.println("Selecione a operação desejada: ");
            System.out.println("     1.Cifrar");
            System.out.println("     2.Decifrar");
            System.out.println("     3.Sair");
            System.out.println(" ");
            System.out.println("Digite uma opção:");
            int menuPrincipal = in.nextInt();

            if(menuPrincipal == 1){
                    System.out.println("Selecione uma técnica de cifragem: ");
                    System.out.println("     1.Código de César");
                    System.out.println("     2.Língua do P");
                    System.out.println("     3.Voltar");
                    System.out.println(" ");
                    System.out.println("Digite uma opção:");
                    int primeiroMenu = in.nextInt();

                    if(primeiroMenu==1){

                            System.out.println("Digite uma frase qualquer");
                            in.nextLine();
                            String fraseC = in.nextLine();
                            System.out.println("Digite um autenticador qualquer");
                            int autenticador = in.nextInt();
                
                            String fraseCriptografada = codigoCesar(fraseC,autenticador);
                            System.out.println("A frase descriptografada é: " + fraseCriptografada);
                            System.out.println();
                            i--;
                            continue;
                    }
                    else if(primeiroMenu==2){
                            System.out.println("Digite uma frase qualquer");
                            in.nextLine();
                            String fraseP = in.nextLine();
                            String fraseDoP = linguaDoP(fraseP);
                            System.out.println("A frase na lingua do p é: " + fraseDoP);
                            System.out.println();
                            i--;
                            continue;
                    }
                    else if(primeiroMenu==3){
                            i--;
                            continue;
                    } else {
                        System.out.println("Número inválido");
                        i--;
                        continue;
                    }

            }

            if(menuPrincipal == 2){
                    System.out.println("Selecione uma técnica de decifragem: ");
                    System.out.println("     1.Decifrar Código de César");
                    System.out.println("     2.Decifrar Língua do P");
                    System.out.println("     3.Voltar");
                    System.out.println(" ");
                    System.out.println("Digite uma opção:");
                    int segundoMenu = in.nextInt();
                    
                    if(segundoMenu == 1){
                            System.out.println("Digite a frase que deseja decifrar");
                            in.nextLine();
                            String fraseD = in.nextLine();
                            System.out.println("Digite um autenticador qualquer");
                            int autenticadorD = in.nextInt();
                
                            String fraseDecifrada = codigoCesarConvertido(fraseD,autenticadorD);
                            System.out.println("A frase criptografada é: " + fraseDecifrada);
                            System.out.println();
                            i--;
                            continue;

                    } else if(segundoMenu == 2){
                        
                    } else if(segundoMenu == 3){
                        
                    } else {
                        i--;
                        continue;
                    }

            }

            if(menuPrincipal == 3){
                return;
            }

        }
    }
}