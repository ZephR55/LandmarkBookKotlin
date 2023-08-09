package com.bekiraydemir.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.bekiraydemir.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.bekiraydemir.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landMarkList: ArrayList<LandMark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landMarkList = ArrayList<LandMark>()


        //data
        val pisa = LandMark("Pisa","Italy",R.drawable.pisa)
        val eiffel = LandMark("Eiffel","France",R.drawable.eiffel)
        val colosseum = LandMark("Colosseum","Rome",R.drawable.colosseum)
        val londonbridge = LandMark("London Bridge","UK",R.drawable.londonbridge)

        landMarkList.add(pisa)
        landMarkList.add(eiffel)
        landMarkList.add(colosseum)
        landMarkList.add(londonbridge)


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter( landMarkList)
        binding.recyclerView.adapter = landmarkAdapter




    }
}