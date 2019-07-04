package game

import java.util.*

class CheckersPiece(val red: Boolean, initX: Int, initY: Int) {
    var symbol = if(red) "R" else "W"

    init {
        var x = initX
        var y = initY

        var pos = Pair(x, y)

    }

    fun move() {

    }
}