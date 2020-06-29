package com.formationandroid.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity()
{

	override fun onCreate(savedInstanceState: Bundle?)
	{
		// appel au parent obligatoire :
		super.onCreate(savedInstanceState)

		// fait le lien entre la classe kotlin et le xml de l'activité :
		setContentView(R.layout.activity_main)

		// log :
		Log.i(TAG, "onCreate")
	}

}