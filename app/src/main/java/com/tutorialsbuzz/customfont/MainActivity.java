package com.tutorialsbuzz.customfont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView_01 = null;
    private TextView mTextView_02 = null;
    private TextView mTextView_03 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        Typeface face_01 = Typeface.createFromAsset(getAssets(), "customfont/libertylegion.ttf");
        mTextView_01.setTypeface(face_01);

        Typeface face_02 = Typeface.createFromAsset(getAssets(), "customfont/ChronicDelivery.ttf");
        mTextView_02.setTypeface(face_02);

        Typeface face_03 = Typeface.createFromAsset(getAssets(), "customfont/MilasianMediumPERSONAL.ttf");
        mTextView_03.setTypeface(face_03);

    }

    private void initViews() {
        mTextView_01 = (TextView) findViewById(R.id.textview_01);
        mTextView_02 = (TextView) findViewById(R.id.textview_02);
        mTextView_03 = (TextView) findViewById(R.id.textview_03);
    }


}
