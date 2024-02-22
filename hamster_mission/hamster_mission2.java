 * Vordefinierte Funktionen
 */ 
void rechtsUm() {
	linksUm();
	linksUm();
	linksUm();
}

/*
 * Neue Funktionen
 */
 
/*
 * A1b) Schreibe hier eine Funktion "mehrmalsVor(int anzahlFelder)" welche den Hamster mehrere Schritte vorgehen lässt
 */


void mehrmalsVor (){
}

/*
 * A2) Schreibe hier eine Funktion "zaehleKoerner()", welche die Anzahl der Koerner auf dem aktuellen Feld zurück gibt
 *		Am Ende sollten auf dem Feld genauso viele Koerner liegen, wie am Anfang.
 */



/*
 * A1a) Schreibe ein Programm, dass den Hamster genau 7 Felder weit gehen lässt.
 */

void main() {
	int anzahlFelder = 0;
 	while(anzahlFelder < 7){
 		vor();
 		anzahlFelder = anzahlFelder +1;
 	}
}