package Assignment6;

import java.util.ArrayList;

public class Mreview {
    // instance variables
    private String title;   // title of the movie
    private ArrayList<Integer> ratings; // list of ratings stored in a Store object

    public static void main (String[] args){
        Mreview mr=new Mreview("The Avengers");
        mr.addRating(9);
        mr.addRating(8);
        mr.addRating(10);
        System.out.println(mr.toString()+"\nThe average ratings is "+mr.aveRating());
    }
    // constructors
    public Mreview(){
        this.title="";
        this.ratings=new ArrayList<Integer>();
    }

    public Mreview(String ttl){
        this.title=ttl;
        this.ratings=new ArrayList<Integer>();
    }

    public Mreview(String ttl, int firstRating){
        this.title=ttl;
        this.ratings=new ArrayList<Integer>();
        this.ratings.add(firstRating);
    }

    // methods
    public void addRating(int r){
        this.ratings.add(r);
    }

    public double aveRating(){
        int sum=0;
        double ave;
        for(int r : this.ratings) sum += r;
        ave=(double)(sum/this.ratings.size());
        return ave;
    }


    public int compareTo(Mreview obj){
        if(this.title.equals(obj.title))
            return 0;
        else
            return this.title.compareTo(obj.title);
    }

    @Override
    public boolean equals(Object obj){
        return this.title.equals(((Mreview)obj).title);
    }

    public String getTitle(){
        return this.title;
    }

    public int numRatings(){
        return this.ratings.size();
    }

    @Override
    public String toString(){
        return this.title+", average "+ this.aveRating()+" out of " +this.numRatings()+" ratings";
    }
}
