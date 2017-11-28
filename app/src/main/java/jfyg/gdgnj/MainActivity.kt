package jfyg.gdgnj

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val names = mutableListOf(
                "Annmaria", "Hallsy", "Alyse", "Greggory", "Kelly", "Silvanus", "Addy", "Tatiana", "Wandis",
                "Courtnay", "Huntlee", "Joshuah", "Ericka", "Torrance", "Allan", "Kristina", "Merci",
                "Corliss", "Elfrida", "Gerald", "Ronna", "Ambrosius", "Sianna", "Kliment", "Townsend",
                "Abner", "Sean", "Iorgos", "Althea", "Fan", "Kiri", "Kendell", "Freddi", "Currie",
                "Marcello", "Padget", "Arvy", "Patton", "Aime", "Rodrick", "Marysa", "Hobey", "Deb",
                "Sallyann", "Padraic", "Rhiamon", "Ebenezer (ಠ_ಠ)", "Dorise", "Ebonee", "Nicolis", "Valene", "Sauveur",
                "Raleigh", "Cathi", "Freeman", "Melisent", "Maressa", "Farrand", "Nita", "Petronille",
                "Orin", "Dick", "Benjamen", "Marieann", "Daile", "Morgun", "Corine", "Danielle", "Crystie",
                "Emery", "Brittani", "Bennett", "Dulcine", "Lucho", "Margarita", "Merralee", "Idelle",
                "Iolande", "Cynde", "Dolly", "Adelle", "Rem", "Jimmy", "Daryl", "Vinnie", "Rosalind",
                "Lonni", "Donna", "Gus", "Gilbertina", "Dottie", "Jason", "Georgy", "Israel", "Gram",
                "Saidee", "Mirabelle", "Helli", "Emile", "Wallache").map { NamesModel(it) }

        val recyclerView: RecyclerView = findViewById(R.id.rv_list) as RecyclerView
        recyclerView.setHasFixedSize(true)

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val namesAdapter = RVAdapter(names)
        recyclerView.adapter = namesAdapter
    }
}

