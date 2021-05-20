object ExamenBigData {
  def main(args: Array[String]): Unit = {
    val resultat= List("julien","paul", "jean","rac", "trec", "joel", "ed", "chris", "maurice")

    println(listefin_n(resultat))
  }

  def listefin_n(liste1: List[String]): List[String] = {
    val liste2= liste1.filter(s => (s.charAt(s.length-1) == 'n'))
    return liste2
  }
  def liste_double():Unit={
    val  Maliste = List(List("ecommercemag.fr"," "),List("https://www.journalducm.com/contact/","Payant"),
      List("https://www.zatsaz.com/",""),List("https://www.lerevenu.com",""),
      List("https://www.cadre-dirigfdeant-magazine.com/","payant"),
      List("https://www.silicon.fr/services/contact#annoncer/","Payant"),
      List("https://www.channelbiz.fr/nous-contacter/",""),
      List("https://www.itespresso.fr/",""),
      List("https://www.industrie-mag.com/article4.html","invite"),
      List("https://www.jesuisundev.com/article-invite/","invite"),
      List("https://www.numerama.com/",""))
    Maliste.foreach(l=>{println(l(0))})

 }




}