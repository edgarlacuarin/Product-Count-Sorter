/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacuarinefruitpricesorter;

/**
 *
 * @author User
 */
public class SortingAlgorithm {
    Friut[] friuts;

    public SortingAlgorithm(Friut[] friuts;) {
        this.friuts = friuts;
    }
    
    public void swapped(Friut index){
    int n = friuts[index];
    friuts[index] = friuts[index+1];
    friuts[index+1] = n;    
    
    }
    public void print (){
        for (Friut friut : friuts) {
            System.out.println(friut + " ");
        }
    
    }
    public void sort(){
    
        for (int i = 0; i < friuts.length-1; i++) {
            System.out.printf("Iteration: %d\n", i+1);
            for (int j = 0; j < friuts.length-1; j++) {
                //COmpare snd swap if left is greater than right
                System.out.printf("Index %d=>",j,friuts[j]);
                if (friuts[j] > friuts[j+1]) {
                    swapped(j);
                    
                }
                print();
                System.out.println();
                
            }
        }
    
    }
    
}
