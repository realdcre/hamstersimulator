import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_mountains1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void r(){
		linksUm(); 
		linksUm(); 
		linksUm();
	}
public void l(){
	linksUm();
	}
public void f(){
	vor();
	}

public void half_up(){
	l();
	f();
	r();
	f();
	}
public void half_down() {
	r();
	f();
	l();
	f();
	}
public void up(){
	half_up();
	half_up();
	half_up();
}
public void down(){
	half_down();
	half_down();
	half_down();
	}
public void hill(){
	up();
	f();
	down();
	vor();
	}
public void main(){
	hill();
	hill();
	hill();
	hill();
	hill();
}
}