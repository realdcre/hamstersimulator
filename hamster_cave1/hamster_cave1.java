

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_cave1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void go(){
	while (vornFrei()){
		vor();
	}
	linksUm();
	linksUm();
}

public void oneRun(){
	
	nimm();
	go();
	gib();
	go();
}

public void main() {
   go();
   while (kornDa()){
   	oneRun();
	}
	go();
}
}