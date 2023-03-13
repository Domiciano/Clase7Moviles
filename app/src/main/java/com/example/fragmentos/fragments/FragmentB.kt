package com.example.fragmentos.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.fragmentos.databinding.FragmentBBinding
import com.example.fragmentos.viewmodels.TaskViewModel

class FragmentB : Fragment(){

    lateinit var binding:FragmentBBinding
    private val viewModel: TaskViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)
        viewModel.observableTaskList.observe(viewLifecycleOwner){
            binding.taskList.text = ""
            for(task in it){
                binding.taskList.append("$task\n")
            }
        }
        return binding.root
    }
    companion object{
        fun newInstance() = FragmentB()
    }

}