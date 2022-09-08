package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
  var count = 0

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    Log.v(TAG,"onCreate")
    setContentView(R.layout.activity_main)
    val textView = findViewById<TextView>(R.id.textView)

    if(savedInstanceState!=null){
      textView.text = savedInstanceState.getString("count")
      count = savedInstanceState.getString("count")?.toInt()!!
    }

    val button = findViewById<Button>(R.id.buttonClick)
    button.setOnClickListener {
       count++
       textView.text = count.toString()
    }
  }

  override fun onRestoreInstanceState(savedInstanceState: Bundle) {
    super.onRestoreInstanceState(savedInstanceState)
  }

  override fun onSaveInstanceState(outState: Bundle) {
    outState.putString("count",count.toString())
    super.onSaveInstanceState(outState)

  }

  override fun onStop() {
    super.onStop()
    Log.v(TAG,"onStop")
  }

  override fun onRestart() {
    super.onRestart()
    Log.v(TAG,"onRestart")
  }

  override fun onStart() {
    super.onStart()
    Log.v(TAG,"onStart")

  }

  override fun onPause() {
    super.onPause()
    Log.v(TAG,"onPause")

  }

  override fun onResume() {
    super.onResume()
    Log.v(TAG,"onResume")

  }

  override fun onDestroy() {
    super.onDestroy()
    Log.v(TAG,"onDestroy")

  }
}