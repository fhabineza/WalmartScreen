package com.example.walmartscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun beautyClicked(view: View) {
        Toast.makeText(this, "You have chosen the Beauty category of shopping", Toast.LENGTH_SHORT)
            .show()
        val intent = Intent(applicationContext, ListView::class.java)
        intent.putExtra("type", "beauty")
        startActivity(intent)
    }

    fun clothesClicked(view: View) {
        Toast.makeText(this, "You have chosen the Clothes category of shopping", Toast.LENGTH_SHORT)
            .show()
        val intent = Intent(applicationContext, ListView::class.java)
        intent.putExtra("type", "clothes")
        startActivity(intent)
    }

    fun electronicsClicked(view: View) {
        Toast.makeText(
            this,
            "You have chosen the Electronics category of shopping",
            Toast.LENGTH_SHORT
        ).show()
        val intent = Intent(applicationContext, ListView::class.java)
        intent.putExtra("type", "electronics")
        startActivity(intent)
    }

    fun foodIsClicked(view: View) {
        Toast.makeText(this, "You have chosen the Food category of shopping", Toast.LENGTH_SHORT)
            .show()
        val intent = Intent(applicationContext, ListView::class.java)
        intent.putExtra("type", "food")
        startActivity(intent)
    }

}
