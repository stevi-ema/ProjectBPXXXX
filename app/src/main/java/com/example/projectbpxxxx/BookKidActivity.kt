package com.example.projectbpxxxx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectbpxxxx.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {

    lateinit var binding:ActivityBookKidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //event saat button Fairy di klik
        binding.buttonFairy.setOnClickListener {
            replaceFragment(FairyFragment())
        }
        //event saat button Fable di klik
        binding.buttonFable.setOnClickListener{
            replaceFragment(FableFragment())
        }

        //event saat button Science di klik
        binding.buttonScience.setOnClickListener {
            replaceFragment(ScienceFragment())
        }
    }

    private fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
}