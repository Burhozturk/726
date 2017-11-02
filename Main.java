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
        //Java input 
        java.util.Scanner input=new java.util.Scanner(System.in);
        //Udskriver på skærmen
        System.out.println("Enter"+myList.length+" values: ");
        //For løkke, som kører så længe i er mindre end mylist(arrayet)
        for(int i=0;i<myList.length;i++)
        {
            //Indtastningen gemmes på arrayet
            myList[i]=input.nextDouble();
        }
        //For løkke, som kører så længe arrayets længde
        for(int i=0;i<myList.length;i++)
        {
            //Gemmer et random nummer på arrayet
            myList[i]=Math.random()*100;
        }
        for(int i=0;i<myList.length;i++) //For løkke, som kører så længe den er mindre end arrayets længde
        {
            //UDskriver arrayets indhold
            System.out.println(myList[i]+ "");
            
            
        }
        //Komma variabel
        double total=0;
        //For løkke,
        for(int i=0;i<myList.length;i++)
        {
            //Gemmer arrayets værdi, som et double variabel med plus 
            total +=myList[i];
        }
        //Double variabelen bliver gemt som arrayets første værdi
        double max=myList[0];
        //For løkke, som kører fra 1 til mindre end arrayets længde.
        for(int i=1;i<myList.length;i++)
        {
            //If løkke,som kører så længe mylist er større end max, så sættes arrayet ligemed arrayet.
            if(myList[i]>max)max=myList[i];
        }
    }
}

