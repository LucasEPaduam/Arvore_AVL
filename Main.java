/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore_avl;

/**
 *
 * @author Lucas Eduardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvAVL arv = new ArvAVL();
        int valores[] = {15, 4, 16, 3, 18, 6, 5, 16, 4, 7};
        for (int v : valores) {
            arv.inserir(v);            
        }
        
        System.out.println("\nTODOS OS NÓS DO VETOR\n");
        
        System.out.println(arv.inorder());
        arv.remover(18);
        
        System.out.println("\nAPÓS A RETIRADA DE UM NÓ\n");
        
        System.out.println(arv.inorder());
    }
    
}
