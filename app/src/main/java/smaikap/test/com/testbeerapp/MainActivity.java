package smaikap.test.com.testbeerapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFindBeerClick(View view) {
        Spinner color = (Spinner)findViewById(R.id.color);
        String beerColor = String.valueOf(color.getSelectedItem());
        List<String> brands = BeerExpert.getBeerBrand(beerColor);

        StringBuilder stringBuilder = new StringBuilder();
        for(String brand: brands) {
            stringBuilder.append(brand).append("\n");
        }
        TextView beerText = (TextView)findViewById(R.id.beerText);
        beerText.setText(stringBuilder);
    }
}
