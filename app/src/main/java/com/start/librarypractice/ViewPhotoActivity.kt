package com.start.librarypractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.start.librarypractice.databinding.ActivityViewPhotoBinding

class ViewPhotoActivity : AppCompatActivity() {

    lateinit var binding : ActivityViewPhotoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_photo)
    }
}