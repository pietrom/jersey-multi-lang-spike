package com.example.rest

class SimpleCalculator extends Calculator with Calculator2  {
  def add(x: Integer, y: Integer): Integer = {
    x + y
  }
}