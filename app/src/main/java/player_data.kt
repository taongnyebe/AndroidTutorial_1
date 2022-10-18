import kotlin.math.roundToInt

open class Data(type: String, name: String, level: Int, hp: Int, mana: Int, passive: String = "None",
                weapon: WeaponData = WeaponData("Fist", "None", 1, 100),
                description: String = "to be updated..."){
  protected var name: String = ""
  protected var type: String = ""
  protected var level: Int = 0
  protected var hp: Int = 0
  protected var mana: Int = 0
  protected var alive: Boolean = true
  protected var passive: String = ""
  protected var weapon: WeaponData = WeaponData("None", "None", 0, 0 )
  protected var description: String = ""

  init  {
    this.name = name
    this.type = type
    this.level = level
    this.hp = hp
    this.mana = mana
    this.passive = passive
    this.weapon = weapon
    this.description = description
  }

  open fun status() {
    val ping = if (this.alive) "alive" else "dead"

    println(
      "-- ${this.type} Status --\n" +
      "$ping \n" +
      "------------\n" +
      "name: ${this.name}\n" +
      "level: ${this.level}\n" +
      "hp: ${this.hp}\n" +
      "mp: ${this.mana}\n" +
      "------------\n" +
      "passive: ${this.passive}\n" +
      "description: ${this.description}\n" +
      "------------\n" +
      "weapon: ${this.weapon.getName()}\n"
    )
  }

  fun setDamage(damage: Int) {
    if (this.hp > 0) {
      this.hp -= damage
      if (this.hp < 0) {
        this.alive = false
        println("${this.name} is dead")
        if (this.type == "Monster") {
          println("Monster Droped \"${this.weapon.getName()}\"")
          this.weapon
        }
        return
      }
      println("${this.name} - hp:${this.hp} (-${damage})")
    } else {
      this.alive = false
    }
  }

  fun getDefence(): Int {
    return this.level * 2
  }

  fun checkWeapon() {
    return this.weapon.status()
  }

  fun attack(defence : Int): Int {
    println("${this.name} attack with ${this.weapon.getName()} ${this.weapon.getDamage(defence)}")
    return this.weapon.getDamage(defence)
  }
}

class PlayerData(type: String, name: String, level: Int, hp: Int, mana: Int, passive: String = "None",
                 weapon: WeaponData = WeaponData("Fist", "None", 1, 100),
                 description: String = "to be updated...")
  : Data(type, name, level, hp, mana, passive, weapon, description) {

  fun pickUpWeapon(weapon: WeaponData) {
    this.weapon = weapon
    println("${this.name} picked up \"${this.weapon.getName()}\"")
  }
}

class MonsterData(type: String, m_type: String, m_class: String, name: String, level: Int, hp: Int, mana: Int, passive: String = "None",
                  weapon: WeaponData = WeaponData("Fist", "None", 1, 100),
                  description: String = "to be updated...")
  : Data(type, name, level, hp, mana, passive, weapon, description) {

  private var m_type: String = ""
  private var m_class: String = ""

  init {
    this.m_type = m_type
    this.m_class = m_class
  }

  override fun status() {
    val ping = if (this.alive) "alive" else "dead"

    println("""
      -- ${this.type} Status --
              $ping
      -------------------------
      Type: ${this.m_type}
      Class: ${this.m_class}
      -------------------------
      Name: ${this.name}
      Level: ${this.level}
      HP: ${this.hp}
      MP: ${this.mana}
      -------------------------
      Weapon: ${this.weapon.getName()}
      -------------------------
      Passive: ${this.passive}
      Description: ${this.description}
    """.trimIndent())
  }

  fun dropItem(): WeaponData {
    return this.weapon
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

  fun getName(): String {
    return this.name
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

    val total_damage = this.damage.toFloat() * (this.durability / 100)


    println(
      "-- Weapon Status --\n" +
              "name: ${this.name}\n" +
              "type: $status(${this.durability})\n" +
              "type: ${this.type}\n" +
              "damage: ${total_damage.roundToInt()}\n" +
              "description: ${this.description}\n"
    )
  }

  fun getDamage(defence: Int): Int {
    val total = this.damage.toFloat() * this.durability / 100
    if (this.type.lowercase() != "none") {
      this.durability -= defence
    }
    return total.roundToInt()
  }
}

/*



}
*/