package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
        EditText input;
        EditText output;
        Button button2;
        Spinner spinner;
        Spinner spinner2;
        String[] arr1={"Gram","Kg","Microgram","Milligram","Tonne","Pound","Quintal"};
        String[] arr2={"Gram","Milligram","Microgram","Kg","Tonne","Pound","Quintal"};
        public static double converter(double a, double b){
            return a*b;
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        input=findViewById(R.id.input);
        output=findViewById(R.id.output);
        button2=findViewById(R.id.button2);
        spinner=findViewById(R.id.spinner);
        spinner2=findViewById(R.id.spinner2);
        ArrayAdapter ad1=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr1);
        spinner.setAdapter(ad1);
        ArrayAdapter ad2=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr2);
        spinner2.setAdapter(ad2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double M=Double.parseDouble(input.getText().toString());
                int n1=spinner.getSelectedItemPosition();
                int n2=spinner2.getSelectedItemPosition();

                if(n1==0&&n2==0){
                    output.setText(String.valueOf(converter(M,1)));
                    Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                }else{
                    if(n1==0&&n2==1){
                        output.setText(String.valueOf(converter(M,1000)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==0&&n2==2){
                        output.setText(String.valueOf(converter(M,1000000)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==0&&n2==3){
                        output.setText(String.valueOf(converter(M,0.001)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==0&&n2==4){
                        output.setText(String.valueOf(converter(M,0.000001)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==0&&n2==5) {
                        output.setText(String.valueOf(converter(M, 0.0022)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==0&&n2==6) {
                        output.setText(String.valueOf(converter(M, 0.00001)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }
                }
                if(n1==1&&n2==0){
                    output.setText(String.valueOf(converter(M,1000)));
                    Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                }else{
                    if(n1==1&&n2==1){
                        output.setText(String.valueOf(converter(M,1000000)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==1&&n2==2){
                        output.setText(String.valueOf(converter(M,1000000000)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==1&&n2==3){
                        output.setText(String.valueOf(converter(M,1)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==1&&n2==4){
                        output.setText(String.valueOf(converter(M,0.001)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==1&&n2==5) {
                        output.setText(String.valueOf(converter(M, 2.2046)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==1&&n2==6) {
                        output.setText(String.valueOf(converter(M, 0.01)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }
                }
                if(n1==2&&n2==0){
                    output.setText(String.valueOf(converter(M,0.000001)));
                    Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                }else{
                    if(n1==2&&n2==1){
                        output.setText(String.valueOf(converter(M,0.001)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==2&&n2==2){
                        output.setText(String.valueOf(converter(M,1)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==2&&n2==3){
                        output.setText(String.valueOf(converter(M,0.000000001)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==2&&n2==4){
                        output.setText(String.valueOf(converter(M,0.000000000001)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==2&&n2==5) {
                        output.setText(String.valueOf(converter(M, 0.0000000022)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==2&&n2==6) {
                        output.setText(String.valueOf(converter(M, 0.00000000001)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }
                }
                if(n1==3&&n2==0){
                    output.setText(String.valueOf(converter(M,0.001)));
                    Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                }else{
                    if(n1==3&&n2==1){
                        output.setText(String.valueOf(converter(M,1)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==3&&n2==2){
                        output.setText(String.valueOf(converter(M,1000)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==3&&n2==3){
                        output.setText(String.valueOf(converter(M,0.000001)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==3&&n2==4){
                        output.setText(String.valueOf(converter(M,0.000000001)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==3&&n2==5) {
                        output.setText(String.valueOf(converter(M, 0.0000022)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==3&&n2==6) {
                        output.setText(String.valueOf(converter(M, 0.00000001)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }
                }
                if(n1==4&&n2==0){
                    output.setText(String.valueOf(converter(M,1000000)));
                    Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                }else{
                    if(n1==4&&n2==1){
                        output.setText(String.valueOf(converter(M,1000000000)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==4&&n2==2){
                        output.setText("Error: Can't Convert this Value");
                        Toast.makeText(MainActivity2.this, "Error:Can't Convert this value", Toast.LENGTH_SHORT).show();
                    }if(n1==4&&n2==3){
                        output.setText(String.valueOf(converter(M,1000)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==4&&n2==4){
                        output.setText(String.valueOf(converter(M,1)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==4&&n2==5) {
                        output.setText(String.valueOf(converter(M, 2204.62)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==4&&n2==6) {
                        output.setText(String.valueOf(converter(M, 10)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }
                }
                if(n1==5&&n2==0){
                    output.setText(String.valueOf(converter(M,453.59)));
                    Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                }else{
                    if(n1==5&&n2==1){
                        output.setText(String.valueOf(converter(M,453592.37)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==5&&n2==2){
                        output.setText(String.valueOf(converter(M,453592370)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==5&&n2==3){
                        output.setText(String.valueOf(converter(M,0.453)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==5&&n2==4){
                        output.setText(String.valueOf(converter(M,0.000453)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==5&&n2==5) {
                        output.setText(String.valueOf(converter(M, 1)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==5&&n2==6) {
                        output.setText(String.valueOf(converter(M, 0.00453)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }
                }
                if(n1==6&&n2==0){
                    output.setText(String.valueOf(converter(M,100000)));
                    Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                }else{
                    if(n1==6&&n2==1){
                        output.setText(String.valueOf(converter(M,100000000)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==6&&n2==2){
                        output.setText("Error: Can't Convert this Value");
                        Toast.makeText(MainActivity2.this, "Error:Can't Convert this value", Toast.LENGTH_SHORT).show();
                    }if(n1==6&&n2==3){
                        output.setText(String.valueOf(converter(M,100)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==6&&n2==4){
                        output.setText(String.valueOf(converter(M,0.1)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==6&&n2==5) {
                        output.setText(String.valueOf(converter(M, 220.46)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }if(n1==6&&n2==6) {
                        output.setText(String.valueOf(converter(M, 1)));
                        Toast.makeText(MainActivity2.this, "Successful!!!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}