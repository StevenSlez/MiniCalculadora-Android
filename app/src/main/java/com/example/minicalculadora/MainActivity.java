package com.example.minicalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText txtNumero1;
    private EditText txtNumero2;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        lblResultado = findViewById(R.id.lblResultado);

        lblResultado.setText("0.0");
    }

    public void accionSumar (View v)
    {
        String numero1;
        String numero2;

        numero1 = txtNumero1.getText().toString();
        numero2 = txtNumero2.getText().toString();

        if(numero1.isEmpty() || numero2.isEmpty())
        {
            lblResultado.setText("ERROR");

            Toast.makeText(this, "Rellena los 2 campos", Toast.LENGTH_SHORT).show();
        }
        else
        {
            double num1 = Double.parseDouble(numero1);
            double num2 = Double.parseDouble(numero2);
            double res = num1 + num2;

            lblResultado.setText("" + res);
        }

        Log.d("MiniCalculadora", "Ejecutando el Sumando");
    }

    public void accionRestar (View v)
    {
        String numero1;
        String numero2;

        numero1 = txtNumero1.getText().toString();
        numero2 = txtNumero2.getText().toString();

        if(numero1.isEmpty() || numero2.isEmpty())
        {
            lblResultado.setText("ERROR");

            Toast.makeText(this, "Rellena los 2 campos", Toast.LENGTH_SHORT).show();
        }
        else
        {
            double num1 = Double.parseDouble(numero1);
            double num2 = Double.parseDouble(numero2);
            double res = num1 - num2;

            lblResultado.setText("" + res);
        }

        Log.d("MiniCalculadora", "Ejecutando el Restando");
    }

    public void accionMultiplicar (View v)
    {
        String numero1;
        String numero2;

        numero1 = txtNumero1.getText().toString();
        numero2 = txtNumero2.getText().toString();

        if(numero1.isEmpty() || numero2.isEmpty())
        {
            lblResultado.setText("ERROR");

            Toast.makeText(this, "Rellena los 2 campos", Toast.LENGTH_SHORT).show();
        }
        else
        {
            double num1 = Double.parseDouble(numero1);
            double num2 = Double.parseDouble(numero2);
            double res = num1 * num2;

            lblResultado.setText("" + res);
        }

        Log.d("MiniCalculadora", "Ejecutando el Multiplicando");
    }

    public void accionDividir (View v)
    {
        String numero1;
        String numero2;

        numero1 = txtNumero1.getText().toString();
        numero2 = txtNumero2.getText().toString();

        if(numero1.isEmpty() || numero2.isEmpty())
        {
            lblResultado.setText("ERROR");

            Toast.makeText(this, "Rellena los 2 campos", Toast.LENGTH_SHORT).show();
        }
        else
        {
            double num1 = Double.parseDouble(numero1);
            double num2 = Double.parseDouble(numero2);

            if (num2 == 0)
                lblResultado.setText("No dividas entre 0");
            else
            {
                double res = num1 / num2;

                lblResultado.setText("" + String.format("%.2f", res));
            }
        }

        Log.d("MiniCalculadora", "Ejecutando el Dividiendo");
    }

    public void accionClear (View v)
    {
        txtNumero1.setText("");
        txtNumero2.setText("");

        lblResultado.setText("0.0");

        Toast.makeText(this,"Limpieza realizada", Toast.LENGTH_LONG).show();

        Log.d("MiniCalculadora", "Ejecutando el Clear");
    }
}