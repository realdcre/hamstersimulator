public void print(int name){
    System.out.println(name);
}
int rand(int min, int max) {
 return ((int)(Math.random()*(max-min)))+min;
}
void main(){
    int[][] image = new int [8][10];

    for(int i=0; i<8){
        for(int j=0; j<10){
            image[i][j] = 0;
        }
    }

    image[rand(1, 8)][rand(1, 10)] = 1;
    
    image[rand(1, 8)][rand(1, 10)] = 2;
    
    image[rand(1, 8)][rand(1, 10)] = 5;

    printTypeHamster();
}

void printTypeHamster(int[][] image){
     for(int i=0; i<8){
        for(int j=0; j<10){
            if (image[i][j] == 1){
                gib();
            }
            if (vornFrei()){
                vor();
            } else {
                rechtsUm();
                vor();
                rechtsUm();
            }
        }
    }
}