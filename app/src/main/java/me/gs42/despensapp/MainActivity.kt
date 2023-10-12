package me.gs42.despensapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonInventory = findViewById<Button>(R.id.InventoryButton)
        buttonInventory.setOnClickListener {
                val intent = Intent(this, InventoryActivity::class.java)
                startActivity(intent)
            }
    }
}