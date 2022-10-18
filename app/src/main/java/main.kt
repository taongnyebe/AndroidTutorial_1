fun main() {
  println("Testing the address")

  var double = 123.456
  var boolean : Boolean
  var char : Char

  val integer : Int = 123
  val sting : String = "Hello"
  val float : Float = 123.45f
  double = 123.45
  println("added inside: $integer $sting $float \nadded outside: $double")



  val playerTim = PlayerData("Tim")
  println("-- Player --\n" +
      "Address Data: $playerTim \n" +
      "Name: " + playerTim.name + "\n" +
      "Lives: " + playerTim.lives + "\n" +
      "Level: " + playerTim.level + "\n" +
      "Score: " + playerTim.score + "\n"
  )

  print("\n\n")

  val minion = MonsterData("Minion", 1, 10, 5)
  val stone_axe = WeaponData("Stone Axe", "Axe", 5, 100)
  val metal_axe = WeaponData("Metal Axe", "Axe", 10, 100)

  stone_axe.status()
  metal_axe.status()
  minion.status()
  minion.setDamage(stone_axe.getDamage())













}