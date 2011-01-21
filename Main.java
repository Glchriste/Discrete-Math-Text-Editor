/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package researcherswriter;

import javax.swing.UIManager;

/**
 *
 * @author glchriste
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            try {

            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

        }
       catch(Exception e)
       {
           //Handle exception.
       }
       new GUI().setVisible(true);
    }

}
