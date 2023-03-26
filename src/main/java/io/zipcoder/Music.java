package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        //need var for how many presses
        //need up and down vars
        int numPresses;
        int upButton = 0;
        int downButton = 0;

        //need loop to check for how many upButton clicks
        for (int i = startIndex; i < playList.length; i++) {
            if (selection.equals(playList[i])) {
                upButton = i;
            }
        }
        //loop for downButton clicks
        for (int i = startIndex; i < playList.length; i++) {
            if (selection.equals(playList[i])) {
                downButton = i;
            }
        }
        

        //need if/else statements to determine which is fewer
        if (upButton < downButton) {
            numPresses = upButton;
        }
        else{
            numPresses = downButton;
        }





        return numPresses;
}
}



