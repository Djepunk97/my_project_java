/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.materi;

/**
 *
 * @author Naufal
 */
public class main extends guiku{
    public static void main(String[] args) {
    try {
            login l = new login();
            l.setVisible(true);
        }catch(Exception ex){
           System.out.println(ex); 
        }    
    }
    
}
