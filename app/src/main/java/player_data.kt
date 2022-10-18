class player_data(val name: String) {
  var lives  = 10
  var level = 3
  var score = 0
}

class monster_data(name: String, level: Int, hp: Int, mana: Int, passive: String = "None", description: String = "to be updated...") {
  protected var name: String = ""
  protected var level: Int = 0
  protected var hp: Int = 0
  protected var mana: Int = 0
  protected val alive: Boolean = true
  protected var passive: String = ""
  protected var description: String = ""

  init  {
    this.name = name
    this.level = level
    this.hp = hp
    this.mana = mana
    this.passive = passive
    this.description = description
  }

  public fun status()
  {
    val ping = if (alive) " alive" else " dead"

      println(
      "-- Monster Status --\n" +
      "$ping \n" +
      "name: ${name}\n" +
      "level: ${level}\n" +
      "hp: ${hp}\n" +
      "mp: ${mana}\n" +
      "------------\n" +
      "passive: ${passive}\n" +
      "description: ${description}\n"


    )
  }
}