package com.example.bttuan6;

public class ItemModel {
    String label;
    int thumbnailRes;
    int imageRes;

    public ItemModel(String label, int thumbnailRes, int imageRes) {
        this.label = label;
        this.thumbnailRes = thumbnailRes;
        this.imageRes = imageRes;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getThumbnailRes() {
        return thumbnailRes;
    }

    public void setThumbnailRes(int thumbnailRes) {
        this.thumbnailRes = thumbnailRes;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }
}
