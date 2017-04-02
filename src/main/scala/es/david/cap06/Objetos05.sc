package es.david.cap06

import java.util.Calendar
import java.text.SimpleDateFormat

object Objetos05 {

  CashRegister.open                               //> opened
  CashRegister.close                              //> closed
  
  DateUtils.getCurrentTime                        //> res0: String = 7:34 PM
  DateUtils.getCurrentDate                        //> res1: String = domingo, abril 2
}

// queremos crear un Singleton (Una sola instancia)
object CashRegister {
  def open { println("opened") }
  def close { println("closed") }
}

object DateUtils {
  // as "diaSemana, mes diaNumero"
  def getCurrentDate: String = getCurrentDateTime("EEEE, MMMM d")
  // as "6:20 p.m."
  def getCurrentTime: String = getCurrentDateTime("K:m aa")

  private def getCurrentDateTime(dateTimeFormat: String): String = {
    val dateFormat = new SimpleDateFormat(dateTimeFormat)
    val cal = Calendar.getInstance()
    dateFormat.format(cal.getTime())
  }
}