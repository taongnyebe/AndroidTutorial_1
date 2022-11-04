fun main() {
  /* Lesson 1
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

  /* Challenge 1
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
  */

  /* OOP Coding
  val stone_axe = WeaponData("Stone Axe", "Axe", 5, 100)

  val jack = PlayerData("Player","Jack", 1, 100, 100)
  jack.status()

  val minion = MonsterData("Monster", "Humanoid", "Pawn", "Minion", 1, 10, 5,
    weapon = WeaponData("Claw", "None", 2, 100))
  minion.status()
  val thick_minion = MonsterData("Monster", "Humanoid", "Rook", "Thick Minion", 3, 15, 5,
    weapon = WeaponData("Fist", "None", 5, 100))
  thick_minion.status()

  println("----- Playing -----")
  minion.setDamage(jack.attack(minion.getDefence()))
  jack.setDamage(minion.attack(jack.getDefence()))
  jack.pickUpWeapon(stone_axe)
  minion.setDamage(jack.attack(minion.getDefence()))
  jack.setDamage(minion.attack(jack.getDefence()))
  jack.checkWeapon()
  minion.setDamage(jack.attack(minion.getDefence()))
  jack.checkWeapon()
  println("Jack continues to walk")
  println("Jack Meets Thick Minion")
  thick_minion.setDamage(jack.attack(thick_minion.getDefence()))
  jack.setDamage(thick_minion.attack(jack.getDefence()))
  thick_minion.setDamage(jack.attack(thick_minion.getDefence()))
  jack.setDamage(thick_minion.attack(jack.getDefence()))
  thick_minion.setDamage(jack.attack(thick_minion.getDefence()))
  jack.setDamage(thick_minion.attack(jack.getDefence()))
  thick_minion.setDamage(jack.attack(thick_minion.getDefence()))
  jack.setDamage(thick_minion.attack(jack.getDefence()))
  thick_minion.setDamage(jack.attack(thick_minion.getDefence()))
  jack.checkWeapon()
  println("--- Game Over ---")
  */

  /* Lesson 2
  val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
  tim.inventory.add(redPotion)
  tim.showInvetory()
  println(tim)
   */

  /* Challenge 2
  println("\n\n")
  println("----- Challenge 2 -----")
  println("1.\n")
  tim.showInvetory()
  println("2.\n")
  tim.showWeapon()
   */

  /* Lesson 3
  println("\n\n")
  println("----- Lesson 3 -----")
  val chest_armor = Loot("Chest Armor", LootType.ARMOR, 80.0)
  val ring_charm = Loot("Ring Charm", LootType.RING, 40.0)
  tim.inventory.add(chest_armor)
  tim.inventory.add(ring_charm)
  tim.showInvetory()
   */

  /* Challenge 3
  for (i in 0..100) {
    if (i % 3 == 0 && i % 5 == 0) {
        println(i)
    }
  }
  */

  /* Lesson 4
  val tim = Player("Tim")
  val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
  val chest_armor = Loot("Chest Armor", LootType.ARMOR, 80.0)
  val ring_charm = Loot("Ring Charm", LootType.RING, 40.0)
  val stone_axe = Weapon("Stone Axe", 5)

  tim.addInventory(redPotion)
  tim.addWeapon(stone_axe)
  tim.addInventory(ArrayList(listOf(chest_armor, ring_charm)))
  tim.show()
  tim.showInventory()
  tim.showWeapon()
  tim.removeInventory(redPotion)
  tim.showInventory()

  */

  // Lesson 5

  val dracula = VampyreKing("Dracula")
  println(dracula)
  while (dracula.lives > 0)
  {
    dracula.takeDamage(12)
  }


}