
package matriz.simples;

/**
 *
 * @author Nelci Farias
 */
public class MatrizSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [][] V={{1,2,3},{4,5,6},{7,8,9}};
        
        for(int k = 0; k < V.length; k++) { 
            for(int j = 0; j < V[k].length; j++) { 
                System.out.print(V[k][j]); 
            }
            System.out.println("");
        } 
    }
    
}
