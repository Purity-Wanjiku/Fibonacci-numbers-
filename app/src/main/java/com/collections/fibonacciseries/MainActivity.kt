package com.collections.fibonacciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.collections.fibonacciseries.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        fibonacciSeries()

}
    fun fibonacciSeries(){
        val n = 100
        var t1 = 0
        var t2 = 1

        for (i in 1..n) {
            var names = "$t1 "
//               print(list)

            val sum = t1 + t2
            t1 = t2
            t2 = sum

            binding.rvSeries.layoutManager = LinearLayoutManager(this)
            val namesAdapter= NamesRvAdapter(names)  //INSTANTIATE AN ADAPTER.
            binding.rvSeries.adapter=namesAdapter
        }

    }

}



