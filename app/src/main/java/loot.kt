enum class LootType {
    POTION, RING, ARMOR
}
class Loot(name: String, type: LootType, value: Double) {
    private var name: String
    private var type: LootType
    private var value: Double

    init {
        this.name = name
        this.type = type
        this.value = value
    }

    override fun toString(): String {
        return """
            name: $name
            type: $type
            value: $value
            -----------------
        """.trimIndent()
    }
}