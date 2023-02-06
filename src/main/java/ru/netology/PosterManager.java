package ru.netology;
public class PosterManager {
    private Poster[] posters = new  Poster[0];
    private int MaxPosters = 10;
    public PosterManager(int MaxPosters){
        this.MaxPosters = MaxPosters;
    }
    public PosterManager(){

    }
    public void Save (Poster poster){
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++){
            tmp[i]= posters[i];
        }
        tmp[tmp.length- 1]=poster;
        posters= tmp;
    }
    public Poster[]findAll(){
        return posters;
    }
    public Poster[]findLast(){
        int ResultLenght;
        if (MaxPosters>=10){
            ResultLenght = 10;
        } else {
            ResultLenght= MaxPosters;
        }
        Poster[]reversed = new Poster[ResultLenght];
        for ( int i = 0; i < reversed.length; i ++){
            reversed[i]=posters[posters.length - 1 - i];
        }
        return reversed;
    }
}
