int stepAmount = 0;
    //A2//
int order = 69;
int pickupAmount = 0;
public void goToWall() {
    while (vornFrei()){
        vor();
        stepAmount = stepAmount + 1;
    }
    //A1//
}
public void pickup(){
    
    while(pickupAmount < order){
        nimm();
        pickupAmount = pickupAmount + 1;
    }
}
public void dropoff(){
    stepAmount = stepAmount * 2;
    pickupAmount = pickupAmount - stepAmount;
    while(pickupAmount > 1) {
        gib();
        pickupAmount = pickupAmount - 1
    }
}
public void main(){
    goToWall();
    pickup();
    linksUm();
    linksUm();
    goToWall();
    dropoff();
}  