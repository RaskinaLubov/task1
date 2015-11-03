package com.artezio.lraskina

/**
 * Created by RaskinaLubov on 01.11.2015.
 */
class Teacher(name:String, age:Int) extends Person(name:String, age:Int) with ScienceWork {

  var academicDegree:String = ""

  def this(name:String, age:Int, academicDegree:String) = {
    this(name, age)
    this.setAcademicDegree(academicDegree)
  }

  def teach(condition:Condition):String = {

    "Now teacher "+getInfo+" am teachering " + condition
  }

  override def getMoreInfo = {
    if(!this.academicDegree.isEmpty)"academicDegree:"+this.academicDegree else ""
  }

   override def setAcademicDegree(degree: String): String = {this.academicDegree = degree; "Teacher "+getInfo+" has academic degree "+this.academicDegree}
}
