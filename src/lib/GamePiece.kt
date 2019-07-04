package lib

interface GamePiece {
    var symbol: String
    val worth: Number?

    fun startTurn()
    fun turn()
    fun endTurn()

    fun onDeath()
    fun onPlace()
    fun move()
}