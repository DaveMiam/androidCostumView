package com.example.a533.androidcostumview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setObjectToDisplay();
    }

    private void setObjectToDisplay() {
        Bitmap planBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dessin1);
        PlanView planView = findViewById(R.id.planView);
        planView.addElementToDisplay(new Plan(planBitmap));
    }

  //  private void setPinToDisplay() {
   ////     Bitmap planBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.pin);
   //     PlanView planView = findViewById(R.id.planView);
   //     planView.addElementToDisplay(new Plan(planBitmap));
  //  }

 //   @Override
 //   public boolean onTouchEvent(MotionEvent event) {
  //      float mouseX;
   ///     float mouseY;
   //     if (event.getAction() == MotionEvent.ACTION_DOWN) {
      //      mouseX = event.getX();
    ///        mouseY = event.getY();
     //       Toast.makeText(this, mouseX +" " + mouseY, Toast.LENGTH_LONG).show();
     //   }
     //   return  super.onTouchEvent(event);
   // }
}
