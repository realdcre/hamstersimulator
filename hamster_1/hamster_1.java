import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void r(){
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
	public void df(){
		f();
		f();
	}

public void main() {


	r();
	f();
	l();
	df();
	l();
	df();
	r();
	df();
	r();
	df();
	l();
	df();
	l();
	df();
	r();
	df();
	r();
	f();
	for (int i = 0; i < 1024; i++) {
     nimm();
    }  
  
	}
	
	
	}