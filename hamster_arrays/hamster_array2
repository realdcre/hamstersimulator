
public void print(int name){
    System.out.println(name);
}
int random(int min, int max) {
 return ((int)(Math.random()*(max-min)))+min;
}

public int mathargmax(int arraysize, int[] playerscores){
    int currenthiscore = 0;
    int currentscore = 0;
    for (int i = 0; i < arraysize; i++){
        currentscore = playerscores[i];
        if(currenthiscore < currentscore){
            currenthiscore = currentscore;
        }
    }
    return currenthiscore;

}

public int mathaverage(int arraysize, int[] playerscores){
    int currentsum = 0;
    for (int i = 0; i < arraysize; i++){
        currentsum = currentsum + playerscores[i];
    }
    int average = currentsum / arraysize;
    return average;
}
void main(){
   
    int[] playerscores = new int[10];
    for (int i = 0; i < 10; i++){
        playerscores[i] = random(1,100);
    }
    print(mathargmax(10, playerscores));
    print(mathaverage(10, playerscores));
}