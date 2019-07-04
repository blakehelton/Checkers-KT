package lib

import kotlin.collections.ArrayList

abstract class Game {
    abstract val pieces: ArrayList<GamePiece>
    abstract val players: ArrayList<Player>
}