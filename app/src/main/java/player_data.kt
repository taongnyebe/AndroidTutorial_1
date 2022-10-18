class PlayerData(val name: String) {
  var lives  = 10
  var level = 3
  var score = 0
}

class MonsterData(name: String, level: Int, hp: Int, mana: Int, passive: String = "None", description: String = "to be updated...") {
  private var name: String = ""
  private var level: Int = 0
  private var hp: Int = 0
  private var mana: Int = 0
  private var alive: Boolean = true
  private var passive: String = ""
  private var description: String = ""

  init  {
    this.name = name
    this.level = level
    this.hp = hp
    this.mana = mana
    this.passive = passive
    this.description = description
  }

  fun setDamage(damage: Int) {
    if (this.hp > 0) {
      this.hp -= damage
      if (this.hp < 0) {
        this.alive = false
        return println("${this.name} is dead")
      }
      println("${this.name} - hp:${this.hp} (-${damage})")
    } else {
      this.alive = false
    }
  }

  fun status() {
    val ping = if (this.alive) " alive" else " dead"

    println(
      "-- Monster Status --\n" +
      "$ping \n" +
      "name: ${this.name}\n" +
      "level: ${this.level}\n" +
      "hp: ${this.hp}\n" +
      "mp: ${this.mana}\n" +
      "------------\n" +
      "passive: ${this.passive}\n" +
      "description: ${this.description}\n"


    )
  }
}

class WeaponData(name: String, type: String, damage: Int, durability: Int, description: String = "to be updated...") {
  private var name: String = ""
  private var type: String = ""
  private var durability: Int = 0
  private var damage: Int = 0
  private var description: String = ""

  init {
    this.name = name
    this.type = type
    this.durability = durability
    this.damage = damage
    this.description = description
  }

  fun status() {
    var status : String
    if (this.durability == 100) {
      status = "New"
    } else if (this.durability > 80) {
      status = "Good"
    } else if (this.durability > 60) {
      status = "Fair"
    } else if (this.durability > 40) {
      status = "Poor"
    } else if (this.durability > 20) {
      status = "Bad"
    } else {
      status = "Broken"
    }

    val total_damage = this.damage * (this.durability / 100)


    println(
      "-- Weapon Status --\n" +
      "name: ${this.name}\n" +
      "type: $status(${this.durability})\n" +
      "type: ${this.type}\n" +
      "damage: ${total_damage.toInt()}\n" +
      "description: ${this.description}\n"
    )
  }

  fun getDamage(): Int { return this.damage * (this.durability / 100)}
}