
// defines the function for the hamster to plant one row of seeds
import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_field1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void row(){
    //checks if hamster can walk forward and initiate walking
    while (vornFrei()){
        //checks whether the hamster has to plant a seed
        if (!kornDa()){
            gib();
        };

        vor();
    }
}
//defines the right turn
public void turnRight(){
    linksUm();
    linksUm();
    linksUm();
}
//defines the action of two rows including turning
public void oneSet(){
    row();
    //checks whether the hamster has to plant a seed
    if (!kornDa()){
        gib();
    }
    turnRight();
    //checks if the hamster can continue the operation
        if (vornFrei()){
            vor();
    	    turnRight();
    	    row();
                //checks whether the hamster has to plant a seed        
		        if (!kornDa()){
                    gib();
                }
   		    linksUm();
    	    vor();
    	    linksUm();
    }
}
public void main(){
    //executing the function to plant seed as long as there is no obstruction for the hamster
    while (vornFrei()){
        oneSet();
    }
}
}