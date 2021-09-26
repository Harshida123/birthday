package com.company;

public class Tree {

    double heightft;
    double diameterInches;
    TreeType treetype;
    public String s;

    public Tree(double heightft, double diameterInches, TreeType treetype) {
        this.heightft = heightft;
        this.diameterInches = diameterInches;
        this.treetype = treetype;
    }
    public double grow(){
        this.heightft = this.heightft+10;
        this.diameterInches = this.diameterInches+1;
        return this.heightft;
    }
    String annoucetallTree(){
        if(this.heightft >100){
            System.out.println(this.treetype);
            s = treetype.name();

        }
        return s;
    }


}
