package com.example.a533.androidcostumview;

import android.graphics.Bitmap;

public class marqueur implements  PlanViewDisplayable {
    private float positionX=0;
    private float positionY=0;
    private Bitmap plan;


    public marqueur(Bitmap plan) {
        this.plan = plan;
      //  positionX=;
      //  positionY=;
    }
    @Override
    public float getPositionX() {
        return positionX;
    }

    @Override
    public float getPositionY() {
        return positionY;
    }

    @Override
    public float getWidth() {
        return plan.getWidth();
    }

    @Override
    public float getHeight() {
        return plan.getHeight();
    }

    @Override
    public Bitmap getBitmap() {
        return plan;
    }
}
