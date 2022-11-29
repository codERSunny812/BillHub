package com.example.billhub;

public class UploadModel {
    String imageUrl;

    public UploadModel(String imageUrl) {
    }


    public void Model(String imageUrl){
        this.imageUrl =imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
