class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    private var weapon: Weapon = Weapon("Fist", 1)
    private var inventory = ArrayList<Loot>()

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: ${weapon.name}
            damage: ${weapon.damage}
            
        """.trimIndent()
    }

    fun show() {
        if (lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }

    }

    fun showInvetory() {
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
    }

    fun addInventory(loot: ArrayList<Loot>) {
        this.inventory.addAll(loot)
    }

    fun addWeapon(weapon: Weapon) {
        this.weapon = weapon
    }

    fun removeInventory(loot: Loot): Boolean {
        return this.inventory.remove(loot)
    }

    fun removeInventory(loot: ArrayList<Loot>): Boolean {
        return this.inventory.removeAll(loot)
    }

    fun removeWeapon(weapon: Weapon): Boolean {
        return this.weapon == weapon
    }
}