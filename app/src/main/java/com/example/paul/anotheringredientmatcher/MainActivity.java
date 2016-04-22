package com.example.paul.anotheringredientmatcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private EditText ingredient;
    public void buttonOnClick(View v) throws Exception {
        Connector connector = new Connector();
        Button button = (Button) v;
        button.setText("clicked1");

        ingredient = (EditText) findViewById(R.id.inputText);

        String ingredientStr;
        ingredientStr = ingredient.getText().toString();
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP| Gravity.LEFT,0,0);
        toast.makeText(MainActivity.this, ingredient.getText(), toast.LENGTH_SHORT).show();

        button.setText(ingredientStr);
        connector.connect(ingredientStr);

    }
}
