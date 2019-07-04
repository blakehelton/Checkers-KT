package game

fun main(args: Array<String>) { CheckersGame }

object CheckersGame {

    val board = Array(8) { arrayOfNulls<CheckersPiece>(8) }

    init {
        for(i in board.indices) {
            for(j in board[i].indices) {
                val red = (i > 3)
                if (i < 3 || i > 4) {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) board[i][j] = CheckersPiece(red, i, j)

                    } else {
                        if (j % 2 != 0) board[i][j] = CheckersPiece(red, i, j)
                    }
                }
            }
        }

        for(row in board) {
            for(item in row) {
                print(item?.symbol ?: "-")
            }
            println()
        }
    }

    fun gameLoop() {

    }
}