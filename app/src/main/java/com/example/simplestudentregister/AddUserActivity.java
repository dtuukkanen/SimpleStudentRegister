package com.example.simplestudentregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }

    public void addUser(View view) {
        String firstName = ((EditText)findViewById(R.id.textFirstName)).getText().toString();
        String lastName = ((EditText)findViewById(R.id.textLastName)).getText().toString();
        String email = ((EditText)findViewById(R.id.textEmail)).getText().toString();
        RadioGroup rgDegreeProgram = findViewById(R.id.rgDegreeProgram);

        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Tietotekniikka"));
                break;
            case R.id.rbTuotantotalous:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Tuotantotalous"));
                break;
            case R.id.rbLaskennallinenTekniikka:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Laskennallinen tekniikka"));
                break;
            case R.id.rbSahkotekniikka:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Sähkötekniikka"));
                break;
        }
    }
}