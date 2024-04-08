package com.hsr2024.mungtest3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hsr2024.mungtest3.databinding.ActivityMainBinding

// 20240408. HSR 병합 확인.
// 20240408. LES 병합 확인.
// 20240408. YulyClass 병합 확인
//20240408. LSB 병합 확인

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //로컬 유리브랜치에서 작업했음.

    }
}