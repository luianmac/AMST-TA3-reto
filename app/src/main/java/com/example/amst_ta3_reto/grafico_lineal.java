package com.example.amst_ta3_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.security.KeyStore;
import java.util.ArrayList;

public class grafico_lineal extends AppCompatActivity {

    LineChart lineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafico_lineal);

        lineChart = (LineChart) findViewById(R.id.lineChart);

        LineDataSet lineDataSet = new LineDataSet(dataValues1(),"Datos Establecidos");
        LineDataSet lineDataSet1 = new LineDataSet(dataValues2(),"Datos Establecidos 2");
        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet);
        dataSets.add(lineDataSet1);

        LineData data = new LineData(dataSets);
        lineChart.setData(data);
        lineChart.invalidate();
    }

    private ArrayList<Entry> dataValues1(){
        ArrayList<Entry> dataValue = new ArrayList<Entry>();
        dataValue.add(new Entry(0,20));
        dataValue.add(new Entry(1,24));
        dataValue.add(new Entry(2,2));
        dataValue.add(new Entry(3,10));
        dataValue.add(new Entry(4,28));

        return  dataValue;
    }

    private ArrayList<Entry> dataValues2(){
        ArrayList<Entry> dataValue = new ArrayList<Entry>();
        dataValue.add(new Entry(0,13));
        dataValue.add(new Entry(3,6));
        dataValue.add(new Entry(4,28));
        dataValue.add(new Entry(6,13));
        dataValue.add(new Entry(7,10));

        return  dataValue;
    }

}
