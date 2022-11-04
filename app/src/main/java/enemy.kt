open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {
  open fun takeDamage(damage: Int) {
    val remainHitpoints = hitPoints - damage
    if (remainHitpoints > 0) {
      hitPoints = remainHitpoints
      println("$name took $damage points of damage, and has $hitPoints left.")
    } else {
      lives -= 1
      if (lives > 0) {
        println("$name lost a life.")
      } else {
        println("$name is dead.")
      }
    }
  }

  override fun toString():String {
    return "Name: $name, Hitpoints: $hitPoints, Lives: $lives"
  }
}

class Troll(name:String, hitPoints: Int, lives: Int): Enemy(name, hitPoints, lives) {

}

open class Vampire(name:String, hitPoints: Int = 20): Enemy(name, hitPoints, 3) {
  override fun takeDamage(damage: Int) {
    super.takeDamage(damage / 2)
  }
}

class VampyreKing(name:String): Vampire(name) {
  init {
    hitPoints = 140
  }
}