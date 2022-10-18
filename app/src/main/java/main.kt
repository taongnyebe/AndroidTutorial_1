fun main(args: Array<String>) {
  println("Testing the address")

  var integer : Int
  var sting : String
  var float : Float
  var double : Double
  var boolean : Boolean
  var char : Char

  integer = 123
  sting = "Hello"
  float = 123.45f
  double = 123.45
  println("added inside: $integer $sting \nadded outside: " + double)


  val player_tim = player_data("Tim")
  println("-- Player --\n" +
      "Address Data: $player_tim \n" +
      "Name: " + player_tim.name + "\n" +
      "Lives: " + player_tim.lives + "\n" +
      "Level: " + player_tim.level + "\n" +
      "Score: " + player_tim.score + "\n"
  )

  print("\n\n")

  val minion = monster_data("Minion", 1, 10, 5)
  minion.status()







}