/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitalization;

import javax.swing.JOptionPane;

/**
 *
 * @author linde
 */
public class Capitalization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name, saveOriginalName;
       int stringLength;
       int x;
       char c;
       name = JOptionPane.showInputDialog(null, "Plase enter your first and second name");
       
       saveOriginalName = name;
       stringLength = name.length();
       for(x = 0;x< stringLength; x++){
           c= name.charAt(x);
           if(x==0){
               c = Character.toUpperCase(c);
               name = c + name.substring(1, stringLength);
           }
       }
     
         if(name.charAt(x)== ' '){
              ++x;
              c = name.charAt(x);
              c = Character.toUpperCase(c);
              name = name.substring(0,x)+ c + name.substring(x + 1, stringLength);
              }
         JOptionPane.showMessageDialog(null, "original name was " +
                 saveOriginalName +"\nRepaird name is" +  name);
    }
    
}
