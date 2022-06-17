package com.swhite.dependencyinjectiondemo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.swhite.dependencyinjectiondemo.R
import com.swhite.dependencyinjectiondemo.di.BaseApp
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var randomString: String
    @Inject lateinit var app: BaseApp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TEST123", randomString + app)
    }
}