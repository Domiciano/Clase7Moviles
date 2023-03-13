package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.example.fragmentos.databinding.ActivityMainBinding
import com.example.fragmentos.fragments.FragmentA
import com.example.fragmentos.fragments.FragmentB
import com.example.fragmentos.viewmodels.TaskViewModel

class MainActivity : AppCompatActivity() {

    val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    val fragmentA = FragmentA.newInstance()
    val fragmentB = FragmentB.newInstance()
    private val viewModel: TaskViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        showFragment(fragmentA)

        binding.A.setOnClickListener {
            showFragment(fragmentA)
        }
        binding.B.setOnClickListener {
            showFragment(fragmentB)
        }
    }

    fun showFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}