package com.example.dell.actividad5_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.MyViewHolder>
{
    public ArrayList<Usuario> usuarioList; //Array de Usuario, con un nombre establecido - usuarioList

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nombre, apellidos, edad; //Declaracion de los TextView del item.xml

        private MyViewHolder(View view) {
            super(view);
            //Se establecen buscando el Id que se les asigno en el item.xml
            nombre = (TextView) view.findViewById(R.id.nombre);
            apellidos = (TextView) view.findViewById(R.id.apellidos);
            edad = (TextView) view.findViewById(R.id.edad);
        }
    }


    public UsuarioAdapter(ArrayList<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
                //R.layout.item - Es el layout creado item.xml
        return new MyViewHolder(itemView);
    }

    @Override
    /*
    Se establecen cada uno de los datos almacenados en cada uno de los textviews
    Se agrega el  Nombre:, Apellido: y la Edad: aqui para evitar utiliza recursos y en base a ello
    poder hacer el sistema más rapido segun se requiera.
    */
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Usuario usuario = usuarioList.get(position);
        holder.nombre.setText("Nombre: " + usuario.getNombre());
        holder.apellidos.setText("Apellido: "+usuario.getApellidos());
        holder.edad.setText("Edad: "+String.valueOf(usuario.getEdad())+" años");
    }


    @Override
    public int getItemCount() {
        return usuarioList.size();
    }
}
