package com.shakircam.busticket.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.shakircam.busticket.adapter.BusAdapter
import com.shakircam.busticket.databinding.ActivityMainBinding
import com.shakircam.busticket.repository.BusRepository
import com.shakircam.busticket.ui.view_model.BusViewModel
import com.shakircam.busticket.ui.view_model.BusViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mAdapter by lazy { BusAdapter() }
    lateinit var viewModel : BusViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        val repository = BusRepository()
        val  viewModelProviderFactory = BusViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory).get(BusViewModel::class.java)
        setContentView(view)
         initRecyclerView()
        viewModel.ticketListItemsLiveData.observe(this, { result ->
            mAdapter.items = result

        })
        
    }
    private fun initRecyclerView(){
        binding.recyclerview.adapter = mAdapter
        binding.recyclerview.setHasFixedSize(true)
        binding.recyclerview.layoutManager =
            LinearLayoutManager(this
                    .applicationContext,
                LinearLayoutManager.VERTICAL,
                false
            )
    }


}