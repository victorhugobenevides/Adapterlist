package com.itbenevides.adapterlist;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TableRow rowHeader;
    public TableLayout tabela;
    List<TableRow> rows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabela=(TableLayout) findViewById(R.id.tabela);
        montarTabela();
    }


    public void criaTitulo() {
        rowHeader = new TableRow(getApplicationContext());
        rowHeader.setBackgroundColor(Color.TRANSPARENT);

        for(int i=0;i<5;i++){
            TextView2 txtSt = new TextView2(getApplicationContext(), true);
            txtSt.setText(" Teste ");
            rowHeader.addView(txtSt);
        }
    }


    public void montarTabela() {
        criaTitulo();
        try {
            rows = new ArrayList<>();

            for(int i=0;i<5;i++){
                TableRow row = new TableRow(getApplicationContext());
                row.setBackgroundColor(Color.TRANSPARENT);
                TextView2 txt1 = new TextView2(getApplicationContext(), false);
                TextView2 txt2 = new TextView2(getApplicationContext(), false);
                TextView2 txt3 = new TextView2(getApplicationContext(), false);
                TextView2 txt4 = new TextView2(getApplicationContext(), false);
                TextView2 txt5 = new TextView2(getApplicationContext(), false);

                String st = "";

                txt1.setText(st);
                txt2.setText(st);
                txt3.setText(st);
                txt4.setText(st);
                txt5.setText(st);

                row.addView(txt1);
                row.addView(txt2);
                row.addView(txt3);
                row.addView(txt4);
                row.addView(txt5);

                rows.add(row);
            }



        } finally {
       
        }

        if(tabela!=null)
            tabela.removeAllViews();

        if(tabela!=null)
            tabela.addView(rowHeader);


        if(tabela!=null){
            if(!rows.isEmpty()){
                for(TableRow row:rows){
                    tabela.addView(row);
                }
            }
        }



    }
    
    
    
    


}





