import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class sÄHENtEXT extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void rechtsUm(){
	linksUm();
	linksUm();
	linksUm();
}
void prüfen(){
	if (!kornDa()) {
		 gib();
		 gib();
		 gib();
		 gib();
		 gib();
		 gib();
		 gib();
		 gib();
		 gib();
		 gib();
		 gib();
		 gib();
		}
	else {
	nimm();	
	}
}
void reihe(){
	while (vornFrei()) {
		vor();
		prüfen();
	}
}
void nachOben() {
	while (vornFrei()) {
		vor();
		prüfen();
		linksUm();
		reihe();
		rechtsUm();
		if (vornFrei()) {
			vor();
			prüfen();
			rechtsUm();
			reihe();
			linksUm();
		}
	}
}
public void main(){
	prüfen();
	reihe();
	linksUm();
	nachOben();
}
}