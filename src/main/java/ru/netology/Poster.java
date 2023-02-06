package ru.netology;
public class Poster {
    private String Id;
    private String Title;
    private int ReleaseYear;
    private String ImageUrl;
    public Poster(String Id,String Title, int ReleaseYear, String ImageUrl){
        this.Id = Id;
        this.Title = Title;
        this.ReleaseYear = ReleaseYear;
        this.ImageUrl = ImageUrl;
    }
}
