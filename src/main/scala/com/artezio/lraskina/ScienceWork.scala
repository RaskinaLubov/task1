package com.artezio.lraskina

/**
 * Created by RaskinaLubov on 01.11.2015.
 */
trait ScienceWork {
  def setAcademicDegree(degree:String):String
  def setNewAcademicDegree(degree:String):String = {
   setAcademicDegree(degree)
  }
}
