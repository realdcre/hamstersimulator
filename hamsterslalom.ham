/*imperative program*/
public void rechtsUm(){
    linksUm();
    linksUm();
    linksUm();
}

public void rechteEcke(){
	vor();
	rechtsUm();
	vor();
}

public void linkeEcke(){
	vor();
	linksUm();
	vor();
}

void obenHerum() {
	rechteEcke();
	rechteEcke();
}

void untenHerum() {
	linkeEcke();
	linkeEcke();
}

public void slalom(){
	obenHerum();
	untenHerum();
}
void main() {
	linksUm();
	while (!kornDa()){
		slalom();
	}
	while (kornDa()){
		nimm();
	}
}


