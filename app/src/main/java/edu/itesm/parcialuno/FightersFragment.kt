package edu.itesm.parcialuno

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_fighters.*



class FightersFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fighters, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        fighters_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = FightersAdapter(createData())
        }
    }

    fun createData(): ArrayList<Fighter>{
        val fighters = ArrayList<Fighter>()
        fighters.add(Fighter(R.drawable.goku,"Goku", "6.100","Kaioken\n20x Kaioken Kamehameha\nSuper Spirit Bomb","3"))
        fighters.add(Fighter(R.drawable.vegeta, "Vegetta", " 240.000.000", "Big Bang Attack\nFinal Flash","2"))
        fighters.add(Fighter(R.drawable.gohan, "Gohan", "72.000.000.000", "Potential Unleashed\nBros. Kamehameha","2"))
        fighters.add(Fighter(R.drawable.gogeta, "Gogeta", "250.500.000.000", "God Punisher\nStardust Breaker\nStardust Fall\nUltimate Kamehameha ","4"))
        fighters.add(Fighter(R.drawable.vegito, "Vegito", "350.500.000.000", "Omega Finishing Blow\nSpirit Excalibur\nFinal Kamehameha","3"))
        fighters.add(Fighter(R.drawable.gogetas, "Gogeta SSJ4", "550.500.000.000", "Ultimate Impact\n Ultra Big Bang Kamehameha\nx100 Big Bang Kamehameha","3"))
        fighters.add(Fighter(R.drawable.diez,"No.18", "10.000.000"," Energy Wave\nAccel Dance","2"))
        fighters.add(Fighter(R.drawable.veinte,"No.21", "45.000.000","Photon Wave\nSweet Tooth\nExcellent Full Course","3"))
        fighters.add(Fighter(R.drawable.k,"Krillin", "8.000","Destructo-Disc\nChain Destructo-Disc Barrage\nScattering Energy Wave ","3"))
        fighters.add(Fighter(R.drawable.y,"Yamcha", "5.000","Spirit Ball\nUltimate Wolf Fang Fist","2"))
        fighters.add(Fighter(R.drawable.c,"Cell", "100.000.000","Energy Field\nSolar Kamehameha","2"))
        fighters.add(Fighter(R.drawable.teen,"Teen Gohan", "150.000.000","Motionless Kamehameha\nFather-Son Kamehameha\nFather-Son Kamehameha (Full Power) ","3"))
        fighters.add(Fighter(R.drawable.kid,"Goku kid", "200.000.000","Super Kamehameha\nDragon Fist Explosion\nSuper Ultra Spirit Bomb","3"))
        fighters.add(Fighter(R.drawable.b,"Broly", "500.000.000","Gigantic Charge\nGigantic Impact\nOmega Blaster\nMeteor Shower ","4"))

        return fighters
    }

}