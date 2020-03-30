/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSP;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
Validate tour by
adding cities to hashset
which ignores duplicates
if set size is equal to cities size
tour is valid.
 */
public class Validator {
    public static void validate(ArrayList<Point2D> cities) {
        Set<Point2D> set = new HashSet<>(cities); //pass tour into a hashset

        //verify hashset and arraylist sizes match, if they do the tour is valid.
        if (set.size() == cities.size()) {
            //System.out.println("This tour is valid");
        } else {
            //System.out.println("This tour is invalid");
        }
    }
}
