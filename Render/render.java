import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class s�HENtEXT extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void rechtsUm(){
	linksUm();
	linksUm();
	linksUm();
}
void pr�fen(){
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
		pr�fen();
	}
}
void nachOben() {
	while (vornFrei()) {
		vor();
		pr�fen();
		linksUm();
		reihe();
		rechtsUm();
		if (vornFrei()) {
			vor();
			pr�fen();
			rechtsUm();
			reihe();
			linksUm();
		}
	}
}
public void main(){
	pr�fen();
	reihe();
	linksUm();
	nachOben();
}
}