package com.example.fragmentos.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel(){

    //Variables
    //Variables observables propias de la vista para mostrarlas en la UI
    val data = ArrayList<String>()
    val observableTaskList = MutableLiveData(data)

    fun addTask(task:String){
        data.add(task)
        observableTaskList.value = data
    }


}