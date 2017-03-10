package com.example.administrator.travelguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hotel = (TextView) findViewById(R.id.hotel_button);
        hotel.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,HotelActivity.class);
                startActivity(intent);
            }
        });

        TextView attraction = (TextView) findViewById(R.id.attraction_button);
        attraction.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,AttractionActivity.class);
                startActivity(intent);
            }
        });

        TextView shopping = (TextView) findViewById(R.id.shopping_button);
        shopping.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,ShoppingActivity.class);
                startActivity(intent);
            }
        });

        TextView food = (TextView) findViewById(R.id.food_button);
        food.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,FoodActivity.class);
                startActivity(intent);
            }
        });

    }
}
