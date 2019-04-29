package com.example.bmd.tsg_mbour;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class But_du_mvt extends Activity implements View.OnClickListener {


    TextSwitcher textSwitcher;
    Button btnpreviostext, btnnexttext;
    String[] QUOTES = {
            "BUT DU MOUVEMENT NUMERO 1: PROMOUVOIR LA CITOYENNETE ET LE DEVELOPPEMENT DE NOTRE QUARTIER",
            "BUT DU MOUVEMENT NUMERO 2: PRENDRE EN MAIN LE QUARTIER DANS LE VRAI SENS DU TERME",
            "BUT DU MOUVEMENT NUMERO 3: FAIRE EVOLUER LE NIVEAU DES JEUNES DANS TOUS LES DOMAINES POSSIBLES",
            "BUT DU MOUVEMENT NUMERO 4: PROMOUVOIR LE LEADERSHISME DANS LES QUARTIER PERIPHERIQUE DE MBOUR",
            "BUT DU MOUVEMENT NUMERO 5: PERMETTRE LA COHESION SOCIAL TOUT EN TRAVAILLANT LE TRAVAIL ",
            "BUT DU MOUVEMENT NUMERO 6: PROMOUVOIR LE VOLONTARIAT POUR SA COMMUNAUTE",
    };
    int currentIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_but_du_mvt);


        btnpreviostext = (Button) findViewById(R.id.btn_previoustext);
        btnnexttext = (Button) findViewById(R.id.btn_nexttext);
        btnpreviostext.setOnClickListener(this);
        btnnexttext.setOnClickListener(this);

        textSwitcher = (TextSwitcher) findViewById(R.id.tv_textSwitcher);

        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView text = new TextView(getApplicationContext());
                text.setTextSize(26);
                text.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                text.setTextColor(getResources().getColor(R.color.colorAccent));
                return text;
            }
        });

    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_nexttext:
                if(currentIndex<QUOTES.length-1)
                {
                    currentIndex = currentIndex + 1;
                    textSwitcher.setText(QUOTES[currentIndex]);
                }
                break;

            case R.id.btn_previoustext:
                if (currentIndex > 0)
                {
                    currentIndex = currentIndex - 1;
                    textSwitcher.setText(QUOTES[currentIndex]);
                }
                break;
        }
    }
}
