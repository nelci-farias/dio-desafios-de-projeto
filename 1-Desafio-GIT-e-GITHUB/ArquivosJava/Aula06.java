package aula06;


/**
 *
 * @author nelci.5900
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=35, y=80, z=73, j=35;
        
        if (x > y){
            System.out.println("X eh maior do que Y!");
            }else if(z >= x) {
                System.out.println("Z eh maior ou igual a X!");
                }else if(z < y){
                    System.out.println("Z eh menor do que Y!");
                    }else if(z <= x){
                        System.out.println("Z eh menor ou igual a X!");
                        }else if(j == x){
                            System.out.println("J eh igual a X!");
                            }else if(x != y){
                                System.out.println("X eh diferente de Y!");
                            }else{
                                System.out.println("Nenhuma expressao eh verdadeira");
                            }
        
        System.out.println("----------*-*-*----------");
        
        if ((x > y)&&(z >= x)){
            System.out.println("Ambas as condicoes sao verdadeiras!");
            }else if((z < y )||(z <= x)){
                System.out.println("Uma ou outra condicao eh verdadeira!");
                }else if (!(j == x)&&(x != y)){
                    System.out.println("Condicao negada se torna verdadeira!");
                    }else{
                        System.out.println("Nenhuma operacao eh verdadeira");
                        }
        System.out.println("----------*-*-*----------");
        int i=0;
        
        while (i < 5){
            System.out.println(i);
            i++;
        }
        
        System.out.println("----------*-*-*----------");
        int linha =0;
        int coluna = 0;
        
        while (linha <=5){
            coluna=0;
            while (coluna <=5){
                System.out.print(coluna);
                coluna++;
            }
            System.out.println("");
            linha++;
        }
    }   
}


