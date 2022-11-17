import scala.collection.mutable.ListBuffer
import scala.+:

object Main extends App {
  //3a
  val str: String = "Hello, Scala!"
  println(str.reverse)
  println(str.toLowerCase())
  println(str.replace("!", ""))
  println(str.replace("!", "") + " and goodbye python!")

  //3b
  val income:Double = 2000
  println(f"\nГодовой доход: $income%.0f")
  val bonus:Double = 20
  println(f"Размер премии в процентах от годового дохода: $bonus%.0f%%")
  val mealAllowance: Double = 110
  println(f"Компенсация питания: $mealAllowance")
  var salary:Double = ((income * (1 + bonus / 100) + mealAllowance) / 12) * 0.87
  println(s"Размер ЗП в месяц после вычета налога: $salary")
  println()

  //3с
  val salaries: List[Float] = List(100, 150, 200, 80, 120, 75)
  val avg: Float = salaries.sum / salaries.length
  for (i <- salaries)
    if (i >= avg) {val num: Float = (i / avg - 1) * 100
      println(s"${i.toInt}: больше, чем средняя на ${num.round}%")}
    else {val num: Float = (avg / i - 1) * 100
      println(s"${i.toInt}: меньше, чем средняя на ${num.round}%")}
  println()

  //3d
  val my_salary: Float = 190
  val new_salaries: List[Float] = my_salary +: salaries
  println(s"Самая высокая ЗП: ${new_salaries.max}")
  println(s"Самая низкая ЗП: ${new_salaries.min}")
  println()

  //3e
  val new_workers: List[Float] = List(350, 90)
  val new_salaries_2: List[Float] = new_workers ++ new_salaries
  println("Отсортированный список:")
  println(new_salaries_2.sorted)
  println()

  //3f
  var list_salaries_f = List.empty[Float]
  val worker_0: Float = 130
  var step: Int = 0
  var new_salaries_3 = new_salaries_2.sorted
  for (i <- new_salaries_3) {
      if (i <= worker_0) {
        step += 1
      }
  list_salaries_f = new_salaries_3.slice(0, step)
    list_salaries_f = list_salaries_f :+ worker_0
    list_salaries_f = list_salaries_f ++ new_salaries_3.slice(step, new_salaries_3.length)
  }
  println(list_salaries_f)
  println()

  //3g
  val my_list: List[Int] = List(100, 150, 200, 80, 120, 75, 30, 145, 45, 55, 95, 187, 354, 15, 180, 250, 210)
  val mid: Int = 125
  step = 0

  for (i <- my_list) {
    step += 1
    if (i >= mid) {
      println(s"ЗП: $i. Номер сотрудника(middle): $step.")
    }
  }
  println()

  //3h
  var new_list: List[Float] = List.empty
  for (i <- my_list) {
    var now = (i * 1.07).round
    new_list ::= now
  }
  println("До:")
  println(my_list.sorted)
  println("После:")
  println(new_list.sorted)
}