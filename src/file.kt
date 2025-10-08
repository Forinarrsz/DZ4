fun main(){ShowGameLogo()
ShowGameLogo()
showEnemy("Markus", 30)
showEnemy("Konnor",100)
spawnEnemy("geralt")
spawnEnemy("Lutik", isBoss = true)
spawnEnemy("six", 300,false)
spawnEnemy("King of the dark", 500,true)
calculateXP(5)
checkInventory("Бита")
castSpell()
castSpell("Avada Kedavra")
    castSpell("lumos",200)
    createWeapon("ak47")
    createWeapon("ak74",100)
    createWeapon(100,true)
    heal()
    heal(20)
    heal(40,true)

}
fun ShowGameLogo(){
    println("Detroit: Become Human")
}
fun showEnemy(name: String, level: Int){
    println("враг ${name}, уровень ${level}")
}
fun spawnEnemy(name: String, health: Int = 100, isBoss:
Boolean = false){
    println("Враг: $name (Здоровье: $health HP ${if (isBoss) " | БОСС!" else ""}")
}
fun calculateXP(level: Int): Int {
    val hp = 1000*level
    return hp

}
fun checkInventory(item: String): Boolean {
    val inventory = listOf("Меч", "Щит", "Зелье")
    return item in inventory
}
fun castSpell() {
    println("Каст случайного заклинания!")
}

fun castSpell(spell: String) {
    println("Каст заклинания $spell!")
}

fun castSpell(spell: String, power: Int) {
    println("Каст $spell с силой $power!")
}
fun createWeapon(name: String): String {
    return "Оружие: $name"
}

fun createWeapon(name: String, damage: Int): String {
    return "Оружие: $name (Урон: $damage)"
}

fun createWeapon(damage: Int, isMagic: Boolean): String {
    return "${if (isMagic) "Магическое" else "Обычное"} оружие (Урон: $damage)"
}
fun heal() {
    println("Вылечено 10 HP")
}

fun heal(amount: Int) {
    println("Вылечено $amount HP")
}

fun heal(amount: Int, isPotion: Boolean) {
    if (isPotion) {
        println("Выпито зелье (+$amount HP)")
    } else {
        println("Заклинание лечения (+$amount HP)")
    }
}