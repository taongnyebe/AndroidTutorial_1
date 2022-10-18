fun main() {
  /*
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
  */

  // Challenge 1
  val tim = Player("Tim")

  val louise = Player("Louise", 5)

  val axe = Weapon("Axe", 12)
  val spear = Weapon("Spear", 14)
  louise.weapon = spear
  tim.weapon = axe
  println(tim.show())
  println(louise.show())
  val temp = louise.weapon
  louise.weapon = tim.weapon
  tim.weapon = temp
  println(tim.show())
  println(louise.show())

  // OOP Coding
  val stone_axe = WeaponData("Stone Axe", "Axe", 5, 100)

  val jack = PlayerData("Player","Jack", 1, 100, 100)
  jack.status()

  val minion = MonsterData("Monster", "Humanoid", "Pawn", "Minion", 1, 10, 5,
    weapon = WeaponData("Claw", "None", 2, 100))
  minion.status()

  println("----- Playing -----")
  minion.setDamage(jack.attack(minion.getDefence()))
  jack.setDamage(minion.attack(jack.getDefence()))
  jack.pickUpWeapon(stone_axe)
  minion.setDamage(jack.attack(minion.getDefence()))
  jack.setDamage(minion.attack(jack.getDefence()))
  jack.checkWeapon()
  minion.setDamage(jack.attack(minion.getDefence()))



}