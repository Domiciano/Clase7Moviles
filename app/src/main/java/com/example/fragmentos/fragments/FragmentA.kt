package com.example.fragmentos.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.fragmentos.databinding.FragmentABinding
import com.example.fragmentos.databinding.FragmentBBinding
import com.example.fragmentos.viewmodels.TaskViewModel

class FragmentA : Fragment() {

    lateinit var binding: FragmentABinding
    private val viewModel: TaskViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        binding.addBtn.setOnClickListener {
            val text = binding.taskET.text.toString()
            viewModel.addTask(text)
        }

        return binding.root
    }

    companion object{
        fun newInstance() = FragmentA()
    }

}