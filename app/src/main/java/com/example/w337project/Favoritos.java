package com.example.w337project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.w337project.adapter.MascotaAdapter;
import com.example.w337project.pojo.Mascota;

import java.util.ArrayList;
import java.util.Random;

public class Favoritos extends AppCompatActivity {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.favoritos_actionbar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        this.listaMascotas = (RecyclerView) findViewById(R.id.rv_favoritos_mascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        this.listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdapter();
    }

    private void inicializarAdapter() {
        MascotaAdapter adapter = new MascotaAdapter(this.mascotas, this);
        adapter.setEnableUI(false);
        listaMascotas.setAdapter(adapter);
    }

    private void inicializarListaMascotas() {
        this.mascotas = new ArrayList<Mascota>();

        Random rand = new Random();

        this.mascotas.add(new Mascota("Firulais", rand.nextInt(11), R.drawable.pet3));
        this.mascotas.add(new Mascota("Fido", rand.nextInt(11), R.drawable.pet4));
        this.mascotas.add(new Mascota("Pluto", rand.nextInt(11), R.drawable.pet5));
        this.mascotas.add(new Mascota("Ayudante de Santa", rand.nextInt(11), R.drawable.pet6));
        this.mascotas.add(new Mascota("Garfield", rand.nextInt(11), R.drawable.pet9));
    }
}