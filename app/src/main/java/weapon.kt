class Weapon (val name: String, var damage: Int) {
    override fun toString(): String {
        return """
            name: $name
            damage: $damage
            -----------------

        """.trimIndent()
    }
}