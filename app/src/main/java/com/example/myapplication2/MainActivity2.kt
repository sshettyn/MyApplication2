package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

private const val TAG = "MainActivity2"

class MainActivity2 : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    Log.v(TAG,"onCreate2")
    setContentView(R.layout.activity_main2)
    /*if(intent.getStringExtra("TEXT")!=null) {
      Toast.makeText(this, intent.getStringExtra("text"), Toast.LENGTH_LONG).show()
    }*/
    val tv = findViewById<TextView>(R.id.textView2)
    if(intent.getParcelableArrayExtra("dataparcelable")!=null){
      tv.text = (intent.getParcelableArrayExtra("dataparcelable") as Student).name
    }
  }

  override fun onStop() {
    super.onStop()
    Log.v(TAG,"onStop2")
  }

  override fun onRestart() {
    super.onRestart()
    Log.v(TAG,"onRestart2")
  }

  override fun onStart() {
    super.onStart()
    Log.v(TAG,"onStart2")

  }

  override fun onPause() {
    super.onPause()
    Log.v(TAG,"onPause2")

  }

  override fun onResume() {
    super.onResume()
    Log.v(TAG,"onResume2")

  }

  override fun onDestroy() {
    super.onDestroy()
    Log.v(TAG,"onDestroy2")

  }
}