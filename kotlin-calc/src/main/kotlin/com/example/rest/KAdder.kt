package com.example.rest

class KAdder : Calculator {
	override fun add(x:Int, y:Int):Int { 
      return 2* ( x + y )
   }
}