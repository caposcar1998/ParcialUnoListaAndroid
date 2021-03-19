 package edu.itesm.parcialuno

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class FightersAdapter (private val fighters : List<Fighter>)
    : RecyclerView.Adapter<FightersAdapter.FighterViewHolder>(){

    inner class FighterViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre)
        var poder = renglon.findViewById<TextView>(R.id.poder)
        var superAtaques = renglon.findViewById<TextView>(R.id.superAtaque)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FighterViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.fighters_renglon,parent, false)
        return FighterViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: FighterViewHolder, position: Int) {
        val fighter= fighters[position]
        holder.foto.setImageResource(fighter.foto)
        holder.nombre.text = fighter.nombre
        holder.poder.text ="Poder: "+ fighter.poder
        holder.superAtaques.text ="Ataques:" + fighter.noAtaques
        holder.itemView.setOnClickListener {

            val action = FightersFragmentDirections.actionFightersFragmentToFighterFragment(fighter)
            holder.itemView?.findNavController()?.navigate(action)


        }
    }

    override fun getItemCount(): Int {
        return fighters.size
    }




}