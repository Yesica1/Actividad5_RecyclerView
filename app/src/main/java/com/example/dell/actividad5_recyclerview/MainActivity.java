package com.example.dell.actividad5_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


   private ArrayList<Usuario> usuarioList = new ArrayList<>();
   private RecyclerView recyclerView_datos;
   private UsuarioAdapter userAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView_datos = (RecyclerView) findViewById(R.id.recycler_view);

        userAdapter = new UsuarioAdapter(usuarioList);
        RecyclerView.LayoutManager uLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView_datos.setLayoutManager(uLayoutManager);
        recyclerView_datos.setItemAnimator(new DefaultItemAnimator());
        recyclerView_datos.setAdapter(userAdapter);

        datosUsuario();

    }

    private void datosUsuario()
    {

        Usuario usuario = new Usuario("Yesica Lizbeth", "Aldape García", 19);
        usuarioList.add(usuario);
        usuario = new Usuario("Emily Elizabeth", "Ann Cox", 20);
        usuarioList.add(usuario);
        usuario = new Usuario("Evelyn", "Treviño Piña", 19);
        usuarioList.add(usuario);
        usuario = new Usuario("Kimberly", "Arevalo Oroso", 22);
        usuarioList.add(usuario);
        usuario = new Usuario("Marco André", "Benavides", 19);
        usuarioList.add(usuario);
        usuario = new Usuario("Ana Karen", "Aldape García", 14);
        usuarioList.add(usuario);
        usuario = new Usuario("Allie Michell", "Flores Sánchez", 19);
        usuarioList.add(usuario);

        userAdapter.notifyDataSetChanged();
    }
}
