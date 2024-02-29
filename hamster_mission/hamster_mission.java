int stepAmount;

public void move7(){
    for (int i = 0; i < 7; i++) {
    vor();
}
}


public void multipleStep(int stepAmount){
    for (int i = 0; i < stepAmount; i++){
        vor();
    }
}

public int cornAmount(){
    int lcornAmount = 0;
    while(kornDa()){
        nimm();
        lcornAmount++;
    }
    while(!maulLeer()){
        gib();
    }
    return lcornAmount;
}
boolean cornAmount0(int cornAmount){
	if (cornAmount == 0){
		return true;
	} else {
		return false;
	}
}
int walkToNextCorn(){
    int cornAmount = cornAmount();
    linksUm();
    linksUm();
    linksUm();
    multipleStep(cornAmount);
    return cornAmount; 
   
}

	
void main(){
	move7();
	int cornAmount = walkToNextCorn();
    while(cornAmount0(cornAmount())){
    	walkToNextCorn();

    }
}