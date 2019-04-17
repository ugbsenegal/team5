package com.example.bmd.tsg_mbour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Inscription extends AppCompatActivity {

    EditText txt_prenom, txt_nom, txt_telephone, txt_fonction, txt_email, txt_password;
    DatabaseReference databaseReference;
    //FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        databaseReference = FirebaseDatabase.getInstance().getReference("Membre");

        txt_prenom = (EditText) findViewById(R.id.txt_Prenom);
        txt_nom = (EditText) findViewById(R.id.txt_Nom);
        txt_telephone = (EditText) findViewById(R.id.txt_Telephone);
        txt_fonction = (EditText) findViewById(R.id.txt_Fonction);
        txt_prenom = (EditText) findViewById(R.id.txt_Prenom);
        txt_email = (EditText) findViewById(R.id.txt_Email);
        txt_password = (EditText) findViewById(R.id.txt_Password);
        Button btn_validerins = (Button) findViewById(R.id.btn_Validerinscription);

        btn_validerins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ajouterList_tableau();
            }
        });}


    private void ajouterList_tableau() {
        String prenom = txt_prenom.getText().toString().trim();
        String nom = txt_nom.getText().toString().trim();
        String telephone = txt_telephone.getText().toString().trim();
        String fonction = txt_fonction.getText().toString().trim();
        String email = txt_email.getText().toString().trim();
        String password = txt_password.getText().toString().trim();

        if (TextUtils.isEmpty(prenom)) {
            Toast.makeText(this, "Enter your prenom", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(nom)) {
            Toast.makeText(this, "Enter your nom", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(telephone)) {
            Toast.makeText(this, "Enter your telephone", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(fonction)) {
            Toast.makeText(this, "Enter your fonction", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Enter your email", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Enter your password", Toast.LENGTH_LONG).show();
        } else {
            String id = databaseReference.push().getKey();
            Membre membre = new Membre(prenom,nom,telephone,fonction,email,password);
            databaseReference.child(id).child("Prenom").setValue(prenom.toString());
            databaseReference.child(id).child("Nom").setValue(nom.toString());
            databaseReference.child(id).child("Telephone").setValue(telephone.toString());
            databaseReference.child(id).child("Fonction").setValue(fonction.toString());
            databaseReference.child(id).child("Email").setValue(email.toString());
            databaseReference.child(id).child("Password").setValue(password.toString());
            Toast.makeText(this, "Membre ajoute", Toast.LENGTH_LONG).show();
            Cleartxt();
        }


    }

    private void Cleartxt() {
        txt_prenom.setText("");
        txt_nom.setText("");
        txt_telephone.setText("");
        txt_fonction.setText("");
        txt_email.setText("");
        txt_password.setText("");
    }
}

