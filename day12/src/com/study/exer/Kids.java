package com.study.exer;

public class Kids extends ManKind{
    private int yearsOld;

    public Kids(){

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }


    public void printAge(){
        System.out.println("I am " + yearsOld + "years old.");
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public void employeed() {
        System.out.println("Kids should study and no job");
    }
}
