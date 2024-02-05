package no.hvl.dat153.quizapp;

import android.net.Uri;

public class GalleryItem {
    private String name;
    private Uri imageUri;

    public GalleryItem(String name, Uri imageUri) {
        this.name = name;
        this.imageUri = imageUri;
    }

    public String getName(){
        return name;
    }

    public Uri getImageUri(){
        return imageUri;
    }

}
