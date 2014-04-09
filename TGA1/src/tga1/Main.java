/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tga1;

import java.io.*;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Tree btr = new Tree();

        File file = new File("/home/leonardo/NetBeansProjects/ti-tga/TGA1/src/test/opa.txt");

        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file),
                            Charset.forName("UTF-8")));
            
            int c = 0;
            while((c = reader.read()) != -1) {
                btr.insere(c, 1);
                //char character = (char) c;
                //System.out.println(Integer.toBinaryString(character));

                //System.out.println(Integer.toBinaryString(character));
            }
            btr.inorder();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
