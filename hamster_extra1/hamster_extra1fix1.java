import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_extra1fix1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void turn_right(){
	linksUm();
	linksUm();
	linksUm();
// used to turn the hamster to the right
	}
public void onepeek(){
	linksUm();
	vor();
	turn_right();
	vor();
	vor();
	turn_right();
	vor();
	
// used to clear one peak of the level
	}
public void oneside(){
	nimm();
	onepeek();
	nimm();
	linksUm();
	onepeek();
// used to clear one side of the level
	}
	
public void init(){
	vor();
	turn_right();
	vor();
	linksUm();
// used to prepare the hamster to use oneside
	}

public void main() {
    init();
    oneside();
    oneside();
    oneside();
    oneside();
}
}