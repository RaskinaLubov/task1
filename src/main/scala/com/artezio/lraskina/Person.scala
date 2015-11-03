package com.artezio.lraskina

/**
 * Created by RaskinaLubov on 01.11.2015.
 */
abstract class Person(val name:String, val age: Int) {
  def getMoreInfo:String
  def getInfo = "[name:"+name+" "+"age:"+age+" "+getMoreInfo+"]"
}
