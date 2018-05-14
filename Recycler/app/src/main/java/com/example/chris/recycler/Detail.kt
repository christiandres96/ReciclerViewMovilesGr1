package com.example.chris.recycler

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        text_nombre.text = getIntent().getExtras().getString("nombre")
        text_apellido.text = getIntent().getExtras().getString("apellido")
        text_cedula.text = getIntent().getExtras().getString("cedula")
        text_like.text = getIntent().getExtras().getString("like")

        if (text_like.text=="LIKE"){
            //nombreActual.setBackgroundColor(Color.RED)
            text_like.setTextColor(Color.BLUE)
        }
        else{
            text_like.setTextColor(Color.RED)
        }

    }




}
