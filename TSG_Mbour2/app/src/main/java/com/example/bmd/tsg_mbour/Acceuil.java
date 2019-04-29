package com.example.bmd.tsg_mbour;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class Acceuil extends Activity implements View.OnClickListener {

    ImageSwitcher imageSwitcher;
    Button btnprevios, btnnext;
    int[] LOGO = {
            R.drawable.imswit1,
            R.drawable.imswit2,
            R.drawable.imswit3,
            R.drawable.imswit4,
            R.drawable.imswit5,
    };
    int currentIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        btnprevios = (Button) findViewById(R.id.btn_previous);
        btnnext = (Button) findViewById(R.id.btn_next);
        btnprevios.setOnClickListener(this);
        btnnext.setOnClickListener(this);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.tv_imageSwitcher);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView image = new ImageView(getApplicationContext());
                image.setScaleType(ImageView.ScaleType.FIT_CENTER);
                image.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));
                return image;
            }
        });

    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_next:
            if(currentIndex<LOGO.length-1)
            {
                currentIndex = currentIndex + 1;
                imageSwitcher.setBackgroundResource(LOGO[currentIndex]);
            }
            break;

            case R.id.btn_previous:
            if (currentIndex > 0)
            {
                currentIndex = currentIndex - 1;
                imageSwitcher.setBackgroundResource(LOGO[currentIndex]);
            }
            break;
        }
    }
}
