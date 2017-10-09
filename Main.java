/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg726;

/**
 *
 * @author burhan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] myList= new double[10];
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("Enter"+myList.length+" values: ");
        for(int i=0;i<myList.length;i++)
        {
            myList[i]=input.nextDouble();
        }
        
        for(int i=0;i<myList.length;i++)
        {
            myList[i]=Math.random()*100;
        }
        for(int i=0;i<myList.length;i++)
        {
            System.out.println(myList[i]+ "");
            
            
        }
        double total=0;
        for(int i=0;i<myList.length;i++)
        {
            total +=myList[i];
        }
        
        double max=myList[0];
        for(int i=1;i<myList.length;i++)
        {
            if(myList[i]>max)max=myList[i];
        }
    }
}

