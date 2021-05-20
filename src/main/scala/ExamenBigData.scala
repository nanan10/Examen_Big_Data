object ExamenBigData {
  def main(args: Array[String]): Unit = {
   

  }

  def listefin_n(liste1: List[String]): List[String] = {
    val liste2= liste1.filter(s => (s.charAt(s.length-1) == 'n'))

    return liste2
  }
}