package com.artezio.lraskina

/**
 * Created by RaskinaLubov on 01.11.2015.
 */
class Student(name: String, age: Int) extends Person(name: String, age: Int) {

  var cours: Int = 0
  var isRecovered: Boolean = false

  def this(name: String, age: Int, cours: Int) = {
    this(name, age)
    this cours = cours
  }

  def this(name: String, age: Int, cours: Int, isRecovered: Boolean) = {
    this(name: String, age: Int, cours: Int)
    this isRecovered = isRecovered
  }

  override def getMoreInfo = {
    if(this.cours!=0)"cours:"+this.cours else "" + " isRecovered:"+this.isRecovered

  }

  def study(mood: Boolean): String = {
    if(mood) "Student "+this.getInfo+" is studing" else  "Student "+getInfo+" is not studing"
  }


}

object Student{
  def apply(name:String, age:Int):Student = {
  new Student(name,age)
  }

  def apply (name:String, age:Int, cours: Int): Student = {
    new Student(name, age, cours)
  }

  def apply (name:String, age:Int, cours: Int, isRecovered: Boolean): Student = {
    new Student(name, age, cours, isRecovered: Boolean)
  }

}