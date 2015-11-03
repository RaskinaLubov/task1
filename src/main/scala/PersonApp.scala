import com.artezio.lraskina.{Teacher, Condition, Student}

/**
 * Created by RaskinaLubov on 01.11.2015.
 */
object PersonApp {

  def main(args:Array[String]):Unit = {
    val stud1 = new Student("Vasiy",21);
    System.out.println(stud1.getInfo)

    val stud2 = Student("Petia",49)
    System.out.println(stud2.getInfo)

    val stud3 = Student("Jul",19,3)
    System.out.println(stud3.getInfo)

    val stud4 = Student("Maria",20,5,true)
    System.out.println(stud4.getInfo)

    System.out.println(stud1.study(false))
    System.out.println(stud2.study(true))

    val teacher1 = new Teacher("Max",35)
    val teacher2 = new Teacher("Leo",40,"Master")

    System.out.println(teacher1.getInfo)
    System.out.println(teacher2.getInfo)


    val conMath = new Condition("mathematics")
    val conHis = new Condition("History")
    val conGeo = new Condition("Geography")
    val conPhy = new Condition("Physics")


    System.out.println(teacher1.teach(conMath))
    System.out.println(teacher1.teach(conHis))

    System.out.println(teacher2.teach(conGeo))
    System.out.println(teacher2.teach(conPhy))

    System.out.println(teacher1.setNewAcademicDegree("Bachelor"))
    System.out.println(teacher1.getInfo)

    System.out.println(teacher1.setNewAcademicDegree("academicDegree3"))
    System.out.println(teacher2.setNewAcademicDegree("academicDegree4"))

    System.out.println(teacher1.getInfo)
    System.out.println(teacher2.getInfo)

  }

}
