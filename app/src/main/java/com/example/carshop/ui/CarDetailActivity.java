package com.example.carshop.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.carshop.R;
import com.example.carshop.model.Car;

public class CarDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_detail);

        ImageView carImageExterior = findViewById(R.id.carImageExterior);
        ImageView carImageInterior = findViewById(R.id.carImageInterior);
        TextView tvMarque = findViewById(R.id.tvDetailMarque);
        TextView tvModele = findViewById(R.id.tvDetailModele);
        TextView tvAnnee = findViewById(R.id.tvDetailAnnee);
        TextView tvCouleur = findViewById(R.id.tvDetailCouleur);
        TextView tvDescription = findViewById(R.id.tvDetailDescription);
        Button btnBuy = findViewById(R.id.btnBuy);

        Car car = (Car) getIntent().getSerializableExtra("car");

        if (car != null) {
            Glide.with(this).load(car.getImageExteriorUrl()).into(carImageExterior);
            Glide.with(this).load(car.getImageInteriorUrl()).into(carImageInterior);
            tvMarque.setText(car.getMarque());
            tvModele.setText(car.getModele());
            tvAnnee.setText(String.valueOf(car.getAnnee()));
            tvCouleur.setText(car.getCouleur());
            tvDescription.setText(car.getDescription());
        }

        btnBuy.setOnClickListener(v -> {
            Intent intent = new Intent(CarDetailActivity.this, PurchaseFormActivity.class);
            intent.putExtra("car", car);
            startActivity(intent);
        });
    }
}
