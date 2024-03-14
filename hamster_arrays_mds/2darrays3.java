int mathrand(int min, int max) {
 return ((int)(Math.random()*(max-min)))+min;
}
public void plant(amount){
    for(z=0; z<amount; z++){
        gib();
    }
}
public void walkwholefield(int[][] plantmap){
    for (i=0; i<10; i+2){
        for (j=0; j<10; j++){
            if (vornFrei()){
            
                int planthowmuch = plantmap[i][j];
                plant(planthowmuch);
                vor();
            } else {
                int planthowmuch = plantmap[i][j];
                plant(planthowmuch);
            }

        }
        rechtsUm();    
        vor();
        rechtsUm();
        for (j=0; j<10; j++){
            if (vornFrei()){
            
                int planthowmuch = plantmap[i][j];
                plant(planthowmuch);
                vor();
            } else {
                int planthowmuch = plantmap[i][j];
                plant(planthowmuch);
            }

        }
        linksUm();
        vor();
        linksUm();
    }
}
void main(){
    int[][] plantmap = new int[8][10];
    for(i=0; i<8; i++){
        for(j=0; j<10;j++){
            plantmap[i][j] = 0;
        }
    }
    plantmap[mathrand(1, 8)][mathrand(1, 10)] = 1;
    plantmap[mathrand(1, 8)][mathrand(1, 10)] = 2;
    plantmap[mathrand(1, 8)][mathrand(1, 10)] = 5;
}