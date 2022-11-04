class Weapon (private val name: String,private var damage: Int) {

    override fun toString(): String {
        return """
            name: $name
            damage: $damage
            -----------------

        """.trimIndent()
    }

    fun getName(): String {
        return this.name
    }
}