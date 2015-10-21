package com.itbenevides.adapterlist;

import android.app.Activity;
import android.graphics.Color;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Onnet on 21/10/2015.
 */
public class Tabela {

    private Activity activity;
    private TableRow rowHeader;
    private TableLayout tabela;
    private List<TableRow> rows;
    private List<String> titulos;

    public Tabela(Activity activity,TableLayout tabela) {
        this.activity = activity;
        this.tabela = tabela;
        titulos=new ArrayList<String>();
    }




    public Tabela adicionaTitulo(String titulo){
        titulos.add(titulo);

        return this;

    }
    public Tabela limpaTitulos(){
        titulos.clear();
        return this;
    }



    private void criaTitulo() {
        rowHeader = new TableRow(activity.getApplicationContext());
        rowHeader.setBackgroundColor(Color.TRANSPARENT);

        for(String titulo:titulos){
            TextView2 txtSt = new TextView2(activity.getApplicationContext(), true);
            txtSt.setText(titulo);
            rowHeader.addView(txtSt);
        }
    }





}
