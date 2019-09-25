public class SimpleDotCom {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper= new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random()*5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};

        theDotCom.setLocationCell(locations);

        boolean isAlive = true;
        while (isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;

            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took"+numOfGuess+" guesses");
            }
        }
    }

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCell(int[] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int cell : locationCells){
            if(guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
