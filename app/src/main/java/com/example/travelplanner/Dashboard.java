package com.example.travelplanner;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        MaterialCardView cardTrips = findViewById(R.id.cardTrips);
        MaterialCardView cardAddTrip = findViewById(R.id.cardAddTrip);
        MaterialCardView cardChecklist = findViewById(R.id.cardChecklist);
        MaterialCardView cardReminders = findViewById(R.id.cardReminders);
        MaterialCardView cardLogout = findViewById(R.id.cardLogout);

        cardTrips.setOnClickListener(v -> showToast("My Trips"));
        cardAddTrip.setOnClickListener(v -> showToast("Add Trip"));
        cardChecklist.setOnClickListener(v -> showToast("Checklist"));
        cardReminders.setOnClickListener(v -> showToast("Reminders"));

        cardLogout.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        });
    }

    private void showToast(String msg) {
        Toast.makeText(this, msg + " (coming soon)", Toast.LENGTH_SHORT).show();
    }
}