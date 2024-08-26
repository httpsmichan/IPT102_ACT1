package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {

    private TextView[] textViews = new TextView[30];
    private ImageView[] imageViews = new ImageView[72];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_data);

        for (int i = 0; i < imageViews.length; i++) {
            int resId = getResources().getIdentifier("imageView" + (i + 1), "id", getPackageName());
            imageViews[i] = findViewById(resId);
            if (imageViews[i] == null) {
                Log.e("NewActivity", "ImageView with ID imageView" + (i + 1) + " not found.");
            }
        }

        // Initialize TextView components
        for (int i = 0; i < textViews.length; i++) {
            int resId = getResources().getIdentifier("textView" + (i + 9), "id", getPackageName());
            textViews[i] = findViewById(resId);
            if (textViews[i] == null) {
                Log.e("NewActivity", "TextView with ID textView" + (i + 9) + " not found.");
            }
        }

        Intent intent = getIntent();
        String buttonClicked = intent.getStringExtra("BUTTON_CLICKED");
        Log.d("NewActivity", "Button clicked: " + buttonClicked);


        hideDatas();

        switch (buttonClicked) {
            case "imageButton1":
                showRadiohead();
                break;
            case "imageButton2":
                showMcr();
                break;
            case "imageButton3":
                showNirvana();
                break;
            case "imageButton4":
                showArctic();
                break;
            case "imageButton5":
                showClairo();
                break;
            case "imageButton6":
                showTaylor();
                break;
            case "imageButton7":
                showMadison();
                break;
            case "imageButton8":
                showBillie();
                break;
            default:
                System.out.println("Unexpected button clicked: " + buttonClicked);
                break;
        }
    }

    private void hideDatas() {
        for (int i = 0; i < textViews.length; i++) {
            if (textViews[i] != null) {
                textViews[i].setVisibility(View.GONE);
            }
        }
        for (int i = 0; i < imageViews.length; i++) {
            if (imageViews[i] != null) {
                imageViews[i].setVisibility(View.GONE);
            }
        }
    }

    private void showRadiohead() {
        for (int i = 0; i < 2; i++) {
            textViews[i].setVisibility(View.VISIBLE);
        }
        for (int i = 0; i < 9; i++) {
            imageViews[i].setVisibility(View.VISIBLE);
        }
    }

    private void showNirvana() {
        for (int i = 2; i < 4; i++) {
            textViews[i].setVisibility(View.VISIBLE);
        }
        for (int i = 9; i < 18; i++) {
            imageViews[i].setVisibility(View.VISIBLE);
        }
    }

    private void showMcr() {
        for (int i = 4; i < 6; i++) {
            textViews[i].setVisibility(View.VISIBLE);
        }
        for (int i = 18; i < 27; i++) {
            imageViews[i].setVisibility(View.VISIBLE);
        }
    }

    private void showArctic() {
        for (int i = 6; i < 8; i++) {
            textViews[i].setVisibility(View.VISIBLE);
        }
        for (int i = 27; i < 36; i++) {
            imageViews[i].setVisibility(View.VISIBLE);
        }
    }

    private void showClairo() {
        for (int i = 8; i < 10; i++) {
            textViews[i].setVisibility(View.VISIBLE);
        }
        for (int i = 36; i < 45; i++) {
            imageViews[i].setVisibility(View.VISIBLE);
        }
    }

    private void showTaylor() {
        for (int i = 10; i < 12; i++) {
            textViews[i].setVisibility(View.VISIBLE);
        }
        for (int i = 45; i < 54; i++) {
            imageViews[i].setVisibility(View.VISIBLE);
        }
    }

    private void showMadison() {
        for (int i = 12; i < 14; i++) {
            textViews[i].setVisibility(View.VISIBLE);
        }
        for (int i = 54; i < 63; i++) {
            imageViews[i].setVisibility(View.VISIBLE);
        }
    }

    private void showBillie() {
        for (int i = 14; i < 16; i++) {
            textViews[i].setVisibility(View.VISIBLE);
        }
        for (int i = 63; i < 72; i++) {
            imageViews[i].setVisibility(View.VISIBLE);
        }
    }


}
