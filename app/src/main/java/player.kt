class Player(val name: String, private var level: Int = 1, private var lives: Int = 3, private var score: Int = 0) {
    private val default_weapon = Weapon("Fist", 1)
    private var weapon: Weapon = default_weapon
    private var inventory = ArrayList<Loot>()

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: ${weapon.getName()}
        """.trimIndent()
    }

    fun show() {
        if (lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }

    }

    fun showInventory() {
        println(">> $name's Inventory <<")
        for (item in inventory) {
            println(item)
        }

    }

    fun showWeapon() {
        println(">> $name's Weapon <<")
        println(weapon)
    }

    fun addInventory(loot: Loot) {
        this.inventory.add(loot)
        if (inventory.contains(loot)) {
            println("Added ${loot.getName()} to inventory")
        } else {
            println("Can't add ${loot.getName()} to inventory")
        }
    }

    fun addInventory(loot: ArrayList<Loot>) {
        this.inventory.addAll(loot)
        for (item in loot) {
            if (inventory.contains(item)) {
                println("Added ${item.getName()} to inventory")
            } else {
                println("Can't add ${item.getName()} to inventory")
            }
        }
    }

    fun addWeapon(weapon: Weapon) {
        this.weapon = weapon
        if (this.weapon.getName() == weapon.getName()) {
            println("Added ${weapon.getName()} to inventory")
        } else {
            println("Can't add ${weapon.getName()} to inventory")
        }
    }

    fun removeInventory(loot: Loot): Boolean {
        return if (inventory.contains(loot)) {
            this.inventory.remove(loot)
            println("${loot.getName()} is removed from inventory")
            true
        } else {
            println("No ${loot.getName()} from inventory")
            false
        }
    }

    fun removeInventory(loot: ArrayList<Loot>): ArrayList<String> {
        var report = ArrayList<String>()
        for (item in loot) {
            if (inventory.contains(item)) {
                this.inventory.remove(item)
                println("${item.getName()} is removed from inventory")
            } else {
                println("No ${item.getName()} from inventory")
            }
        }

        return report
    }

    fun removeWeapon(weapon: Weapon): Boolean {
        return if (this.weapon == weapon) {
            this.weapon = default_weapon
            println("${weapon.getName()} is removed from hand")
            true
        } else {
            println("No ${weapon.getName()} in hold")
            false
        }
    }
}