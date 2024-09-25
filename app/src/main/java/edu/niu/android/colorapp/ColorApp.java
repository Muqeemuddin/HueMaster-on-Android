package edu.niu.android.colorapp;

public class ColorApp {


    public ColorApp() {
        super();
    }

    public Integer validateInput(Integer number){
        if(number > 255){
            return 255;
        } else if (number < 0) {
            return 0;
        }
        return number;
    }
//    public void setColorOne(Integer colorOne) {
//        if(colorOne > 255){
//            this.colorOne = 255;
//        } else if (colorOne < 0) {
//            this.colorOne = 0;
//        }
//        else{
//            this.colorOne = colorOne;
//        }
//    }
//
//    public void setColorTwo(Integer colorTwo) {
//        if(colorTwo > 255){
//            this.colorTwo = 255;
//        } else if (colorTwo < 0) {
//            this.colorTwo = 0;
//        }
//        else{
//            this.colorTwo = colorTwo;
//        }
//    }
//
//    public void setColorThree(Integer colorThree) {
//        if(colorThree > 255){
//            this.colorThree = 255;
//        } else if (colorThree < 0) {
//            this.colorThree = 0;
//        }
//        else{
//            this.colorThree = colorThree;
//        }
//    }

    public String findHex(Integer colorOne, Integer colorTwo, Integer colorThree){

        colorOne = validateInput(colorOne);
        colorTwo = validateInput(colorTwo);
        colorThree = validateInput(colorThree);
//        String redSample = Integer.toHexString(validateInput(colorOne)).toUpperCase();
//        String greenSample = Integer.toHexString(validateInput(colorTwo)).toUpperCase();
//        String blueSample = Integer.toHexString(validateInput(colorThree)).toUpperCase();

        String redSample = String.format("%02X", colorOne);
        String greenSample = String.format("%02X", colorTwo);
        String blueSample = String.format("%02X", colorThree);

        return "#FF" + redSample + greenSample + blueSample;
    }


}
