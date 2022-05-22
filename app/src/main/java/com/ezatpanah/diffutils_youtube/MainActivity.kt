package com.ezatpanah.diffutils_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ezatpanah.diffutils_youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val sampleAdapter by lazy{ SampleAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sampleAdapter.differ.submitList(loadData())

        binding.apply {
            rvMain.apply {
                layoutManager=LinearLayoutManager(this@MainActivity)
                adapter=sampleAdapter
            }
        }
    }
    fun loadData() : MutableList<SampleModel>{
        val nameList : MutableList<SampleModel> = mutableListOf()
        nameList.add(SampleModel(1,"Sample 1"))
        nameList.add(SampleModel(2,"Sample 2"))
        nameList.add(SampleModel(3,"Sample 3"))
        nameList.add(SampleModel(4,"Sample 4"))
        nameList.add(SampleModel(5,"Sample 5"))
        nameList.add(SampleModel(6,"Sample 6"))
        nameList.add(SampleModel(7,"Sample 7"))
        nameList.add(SampleModel(8,"Sample 8"))
        nameList.add(SampleModel(9,"Sample 9"))
        nameList.add(SampleModel(10,"Sample 10"))
        nameList.add(SampleModel(11,"Sample 11"))
        nameList.add(SampleModel(12,"Sample 12"))

        return nameList
    }
}