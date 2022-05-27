package com.start.librarypractice

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.gun0912.tedpermission.PermissionListener
import com.start.librarypractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents(){
//        이미지뷰 / 텍스트뷰 / LinearLayout 등은 버튼처럼 serOnClickListener 가능.
        binding.imgProfile.setOnClickListener {

            val myIntent = Intent(this, ViewPhotoActivity::class.java)
            startActivity(myIntent)
        }

        binding.btnCall.setOnClickListener {
//            Intent(4) - ACTION_CALL 활용.

//            권한 획득
//            1)권한 여하에 따른 상황별 대처 방안, 미리 변수에 담아두자.
            val permissionListener = object : PermissionListener{
                override fun onPermissionGranted() {
//                    권한이 최종 획득 완료일때 실행할 코드
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
//                    최종 권한 거부되었을 때.
                    Toast.makeText(this@MainActivity, "권한이 거부되어 전화 연결이 불가능합니다.", Toast.LENGTH_SHORT)
                        .show()
                }

            }
        }

    }

    fun setValues(){

    }
}