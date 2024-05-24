package com.example.carshop.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carshop.R;
import com.example.carshop.adapter.CarAdapter;
import com.example.carshop.model.Car;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Ford", "SUV", "Escape", 2022, "Gris", "Description de l'Escape", "https://images.pexels.com/photos/1007410/pexels-photo-1007410.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "https://images.pexels.com/photos/3599175/pexels-photo-3599175.jpeg?auto=compress&cs=tinysrgb&w=600", "https://images.pexels.com/photos/3354647/pexels-photo-3354647.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"));
        carList.add(new Car("Chevrolet", "Berline", "Malibu", 2021, "Blanc", "Description du Malibu", "https://images.pexels.com/photos/575386/pexels-photo-575386.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "https://images.pexels.com/photos/272449/pexels-photo-272449.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "https://images.pexels.com/photos/73809/classic-car-red-automobiles-chevrolet-73809.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"));
        carList.add(new Car("Mercedes-Benz", "SUV", "GLE", 2022, "Bleu", "Description du GLE", "https://www.mercedes-benz.com/content/dam/brandhub/assets/innovation/concept-cars/vision-one-eleven/stage/06-2023/images/mercedes-benz-vision-111-stage-3840x2160-06-2023.cbv20230606193723.jpg/_jcr_content/renditions/mq7-original-aspect.jpeg", "https://www.mercedes-benz.com/content/dam/brandhub/assets/innovation/concept-cars/vision-one-eleven/interior-gallery/06-2023/images/mercedes-benz-vision-111-interior-gallery-01-1700x1700-06-2023.cbv20230606193741.jpg/_jcr_content/renditions/mq7-original-aspect.jpeg", "https://www.mbusa.com/content/dam/mb-nafta/us/myco/my22/c/sedan/all-vehicles/2022-C300-SEDAN-AVP-DR.png"));
        carList.add(new Car("Audi", "Berline", "A4", 2022, "Gris", "Description de l'A4", "https://mediaservice.audi.com/media/fast/H4sIAAAAAAAAAFvzloG1tIiBOTrayfuvpGh6-m1zJgaGigIGBgZGoDhTtNOaz-I_2DhCHsCElzEwF-SlMwJZKUycmbmJ6an6QD4_I3taTmV-aUkxO0grz5mJuh73jOaun_2g5T7LHa4VjtmyLgysQF2MbkCCORVI8O0HEpyyDGASZN4kEFEA4jM5MDMwsFYAGZEMICCoYUAkEGZ3cQ1x9PQJBgA3PzPl2QAAAA?wid=850", "https://uploads.audi-mediacenter.com/system/production/media/55086/images/e2fa27c99a85fa321e3dd0703f0a66a53508b8c5/A1713445_web_2880.jpg?1698293522", "https://uploads.audi-mediacenter.com/system/production/media/81836/images/c30f28212599382f39355e294b5bb56b7b2bc9d8/A199719_web_2880.jpg?1698383739"));
        carList.add(new Car("BMW", "SUV", "X5", 2023, "Noir", "Description du X5", "https://hips.hearstapps.com/hmg-prod/images/2023-bmw-760i-xdrive-104-64c806a1395ab.jpg?crop=0.523xw:0.392xh;0.185xw,0.516xh&resize=1200:*", "https://www.bmw-m.com/content/dam/bmw/marketBMW_M/www_bmw-m_com/topics/magazine-article-pool/2022/bmw-xm-interieur/bmw-xm-innenraum-01-ai.jpg", "https://www.stratstone.com/-/media/stratstone/bmw/news/2022/april/new-7-series-plugs-in-for-bmw/bmw-7-series-exterior-front-720x405px.ashx?mh=1440&la=en&h=405&w=720&mw=2560&hash=0293409D60157E0F58750890345EE4ED"));

        CarAdapter adapter = new CarAdapter(carList, new CarAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Car car) {
                Intent intent = new Intent(MainActivity.this, CarDetailActivity.class);
                intent.putExtra("car", car);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(adapter);
    }
}
