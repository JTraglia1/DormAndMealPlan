package com.hfad.dormandmealplan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 *  MainActivity.java - Dorm and Meal Plan Calculator
 *  This program represents a calculator that determines the cost of a
 *  specific dormitory and meal plan by adding the cost of the two.
 *  The total price of both selections is displayed to the end user.
 *  This application possesses the ability to run on Android devices
 *  with an application programming interface (API) of at least 21.
 *
 *  @author Joseph Traglia
 *
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Main program that builds and displays the application on the device's screen.
     * @param savedInstanceState default parameter
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Setting the content view to be displayed on the device.
        setContentView(R.layout.activity_main);

        //Instantiate Java View objects
        Spinner spnDorms = findViewById(R.id.dormsSpinner);
        Spinner spnMeals = findViewById(R.id.mealsSpinner);
        TextView tvCost = findViewById(R.id.costAmountTextView);
        Button btnCalculateCost = findViewById(R.id.calculateCostButton);

        //Instantiating action for the button to caluclate the cost of the dorm
        //and meal plan when pushed by the end-user.
        btnCalculateCost.setOnClickListener(new View.OnClickListener() {
            /**
             * Method utilized to provide functionality to the button that calculates
             * the cost of a specific dorm and meal plan.
             * @param view
             */
            @Override
            public void onClick(View view) {

                //Fields
                double totalPrice = 0;

                //Adding the price of the dorm to the total cost based on the user's selection.
                if (spnDorms.getSelectedItem().equals("Allen Hall"))
                {
                    totalPrice += 1800;
                }
                else if (spnDorms.getSelectedItem().equals("Pike Hall"))
                {
                    totalPrice += 2200;
                }
                else if (spnDorms.getSelectedItem().equals("Farthing Hall"))
                {
                    totalPrice += 2800;
                }
                else if (spnDorms.getSelectedItem().equals("University Suites"))
                {
                    totalPrice += 3000;
                }

                //Adding the price of the meal plan to the total cost based on the user's selection.
                if (spnMeals.getSelectedItem().equals("7 meals per week"))
                {
                    totalPrice += 600;
                }
                else if (spnMeals.getSelectedItem().equals("14 meals per week"))
                {
                    totalPrice += 1100;
                }
                else if (spnMeals.getSelectedItem().equals("Unlimited meals per week"))
                {
                    totalPrice += 1800;
                }

                //Formatting the total cost output on the application.
                tvCost.setText(String.format("Cost: $%,.2f", totalPrice));
            }
        });


    }
}