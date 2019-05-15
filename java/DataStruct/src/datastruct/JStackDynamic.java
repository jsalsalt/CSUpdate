/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastruct;

import java.util.ArrayList;

/**
 *
 * @author JOSALAZA
 */
public class JStackDynamic extends JStackGeneric {

    private ArrayList<Object> structure = null;

    public JStackDynamic() {
        structure = new ArrayList<Object>();
        top = 0;
        size = 0;
    }

}
