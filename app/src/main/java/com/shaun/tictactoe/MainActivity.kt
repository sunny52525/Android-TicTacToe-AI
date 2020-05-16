package com.shaun.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var gameOver = false
    private var matrix: Array<IntArray> = Array(3) { IntArray(3) }


    private var numberOfMoves = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result.setText("")
        for (i in 0..2) {
            for (j in 0..2) {

                matrix[i][j] = -1;
            }
        }
        reset()
        reset.setOnClickListener {
            reset()
        }
        playerstyle.setOnClickListener {
            val intent = Intent(this, multiplayerActivity::class.java)
            startActivity(intent)
            this.finish()
        }

        block1.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (numberOfMoves == 4) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (matrix[0][0] != -1) {
                Toast.makeText(this, "Uh Oh! That move isn't allowed", Toast.LENGTH_SHORT).show()
            } else {
                block1.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                matrix[0][0] = 1
                if (playerwon()) {
                    gameOver = true
                    result.setText("Congrats You Won")
                    return@setOnClickListener
                }
                var bestmove = findBestMove(matrix)
                matrix[bestmove[0]][bestmove[1]] = 0
                botmove(bestmove)
            }

        }
        block2.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            if (numberOfMoves == 4) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (matrix[0][1] != -1) {
                Toast.makeText(this, "Uh Oh! That move isn't allowed", Toast.LENGTH_SHORT).show()
            } else {
                block2.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                matrix[0][1] = 1
                if (playerwon()) {
                    gameOver = true
                    result.setText("Congrats You Won")
                    return@setOnClickListener
                }
                var bestmove = findBestMove(matrix)
                matrix[bestmove[0]][bestmove[1]] = 0
                botmove(bestmove)
            }
        }
        block3.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (numberOfMoves == 4) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (matrix[0][2] != -1) {
                Toast.makeText(this, "Uh Oh! That move isn't allowed", Toast.LENGTH_SHORT).show()
            } else {
                block3.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                matrix[0][2] = 1
                if (playerwon()) {
                    gameOver = true
                    result.setText("Congrats You Won")
                    return@setOnClickListener
                }
                var bestmove = findBestMove(matrix)
                matrix[bestmove[0]][bestmove[1]] = 0
                botmove(bestmove)
            }
        }
        block4.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            if (numberOfMoves == 4) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (matrix[1][0] != -1) {
                Toast.makeText(this, "Uh Oh! That move isn't allowed", Toast.LENGTH_SHORT).show()
            } else {
                block4.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                matrix[1][0] = 1
                if (playerwon()) {
                    gameOver = true
                    result.setText("Congrats You Won")
                    return@setOnClickListener
                }
                var bestmove = findBestMove(matrix)
                matrix[bestmove[0]][bestmove[1]] = 0
                botmove(bestmove)
            }
        }
        block5.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (numberOfMoves == 4) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (matrix[1][1] != -1) {
                Toast.makeText(this, "Uh Oh! That move isn't allowed", Toast.LENGTH_SHORT).show()
            } else {
                block5.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                matrix[1][1] = 1
                if (playerwon()) {
                    gameOver = true
                    result.setText("Congrats You Won")
                    return@setOnClickListener
                }
                var bestmove = findBestMove(matrix)
                matrix[bestmove[0]][bestmove[1]] = 0
                botmove(bestmove)
            }
        }
        block6.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            if (numberOfMoves == 4) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (matrix[1][2] != -1) {
                Toast.makeText(this, "Uh Oh! That move isn't allowed", Toast.LENGTH_SHORT).show()
            } else {
                block6.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                matrix[1][2] = 1
                if (playerwon()) {
                    gameOver = true
                    result.setText("Congrats You Won")
                    return@setOnClickListener
                }
                var bestmove = findBestMove(matrix)
                matrix[bestmove[0]][bestmove[1]] = 0
                botmove(bestmove)
            }
        }
        block7.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            if (numberOfMoves == 4) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (matrix[2][0] != -1) {
                Toast.makeText(this, "Uh Oh! That move isn't allowed", Toast.LENGTH_SHORT).show()
            } else {
                block7.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                matrix[2][0] = 1
                if (playerwon()) {
                    gameOver = true
                    result.setText("Congrats You Won")
                    return@setOnClickListener
                }
                var bestmove = findBestMove(matrix)
                matrix[bestmove[0]][bestmove[1]] = 0
                botmove(bestmove)
            }
        }
        block8.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }


            if (numberOfMoves == 4) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (matrix[2][1] != -1) {
                Toast.makeText(this, "Uh Oh! That move isn't allowed", Toast.LENGTH_SHORT).show()
            } else {
                block8.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                matrix[2][1] = 1
                if (playerwon()) {
                    gameOver = true
                    result.setText("Congrats You Won")
                    return@setOnClickListener
                }
                var bestmove = findBestMove(matrix)
                matrix[bestmove[0]][bestmove[1]] = 0
                botmove(bestmove)
            }
        }
        block9.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            if (numberOfMoves == 4) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Ended . Please Start a new Game", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (matrix[2][2] != -1) {
                Toast.makeText(this, "Uh Oh! That move isn't allowed", Toast.LENGTH_SHORT).show()
            } else {
                block9.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                matrix[2][2] = 1
                if (playerwon()) {
                    gameOver = true
                    result.setText("Congrats You Won")
                    return@setOnClickListener
                }
                var bestmove = findBestMove(matrix)

                matrix[bestmove[0]][bestmove[1]] = 0
                botmove(bestmove)
            }
        }

    }

    fun reset() {
        block1.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block2.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block3.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block3.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block4.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block5.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block6.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block7.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block8.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block9.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        result.setText("")
        numberOfMoves = 0
        gameOver = false
        for (i in 0..2) {
            for (j in 0..2) {
                matrix[i][j] = -1;
            }
        }
    }


    fun isMovesLeft(board: Array<IntArray>): Boolean {
        for (i in 0..2) for (j in 0..2) if (board[i][j] == -1) return true
        return false
    }

    //0 is player 1 is computer
    fun evaluate(b: Array<IntArray>): Int {
        // Checking for Rows for X or O victory.
        for (row in 0..2) {
            if (b[row][0] == b[row][1] &&
                b[row][1] == b[row][2]
            ) {
                if (b[row][0] == 0) return +10 else if (b[row][0] == 1
                ) return -10
            }
        }

        // Checking for Columns for X or O victory.
        for (col in 0..2) {
            if (b[0][col] == b[1][col] &&
                b[1][col] == b[2][col]
            ) {
                if (b[0][col] == 0) return +10 else if (b[0][col] == 1
                ) return -10
            }
        }

        // Checking for Diagonals for X or O victory.
        if (b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
            if (b[0][0] == 0) return +10 else if (b[0][0] == 1
            ) return -10
        }
        if (b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
            if (b[0][2] == 0) return +10 else if (b[0][2] == 1
            ) return -10
        }

        // Else if none of them have won then return 0
        return 0
    }

    // This is the minimax function. It considers all
    // the possible ways the game can go and returns
    // the value of the board
    fun minimax(
        board: Array<IntArray>,
        depth: Int, isMax: Boolean
    ): Int {
        val score = evaluate(board)

        // If Maximizer has won the game
        // return his/her evaluated score
        if (score == 10) return score

        // If Minimizer has won the game
        // return his/her evaluated score
        if (score == -10) return score

        // If there are no more moves and
        // no winner then it is a tie
        if (isMovesLeft(board) == false) return 0

        // If this maximizer's move
        return if (isMax) {
            var best = -1000

            // Traverse all cells
            for (i in 0..2) {
                for (j in 0..2) {
                    // Check if cell is empty
                    if (board[i][j] == -1) {
                        // Make the move
                        board[i][j] = 0

                        // Call minimax recursively and choose
                        // the maximum value
                        best = Math.max(
                            best, minimax(
                                board,
                                depth + 1, !isMax
                            )
                        )

                        // Undo the move
                        board[i][j] = -1
                    }
                }
            }
            return best
        } else {
            var best = 1000

            // Traverse all cells
            for (i in 0..2) {
                for (j in 0..2) {
                    // Check if cell is empty
                    if (board[i][j] == -1) {
                        // Make the move
                        board[i][j] = 1

                        // Call minimax recursively and choose
                        // the minimum value
                        best = Math.min(
                            best, minimax(
                                board,
                                depth + 1, !isMax
                            )
                        )

                        // Undo the move
                        board[i][j] = -1
                    }
                }
            }
            return best
        }
    }

    // This will return the best possible
    // move for the player
    fun findBestMove(board: Array<IntArray>): Array<Int> {
        var bestVal = -1000
        var moves = arrayOf(-1, -1)


        // Traverse all cells, evaluate minimax function
        // for all empty cells. And return the cell
        // with optimal value.
        for (i in 0..2) {
            for (j in 0..2) {
                // Check if cell is empty
                if (board[i][j] == -1) {
                    // Make the move
                    board[i][j] = 0

                    // compute evaluation function for this
                    // move.
                    val moveVal = minimax(board, 0, false)

                    // Undo the move
                    board[i][j] = -1

                    // If the value of the current move is
                    // more than the best value, then update
                    // best/
                    if (moveVal > bestVal) {
                        moves.set(0, i)
                        moves.set(1, j)
                        bestVal = moveVal
                    }
                }
            }
        }

        return moves
    }

    fun botmove(moves: Array<Int>) {


        ++numberOfMoves
        if (moves[0] == 0 && moves[1] == 0)
            block1.setImageDrawable(getResources().getDrawable(R.drawable.cross));
        else if (moves[0] == 0 && moves[1] == 1)
            block2.setImageDrawable(getResources().getDrawable(R.drawable.cross));
        else if (moves[0] == 0 && moves[1] == 2)
            block3.setImageDrawable(getResources().getDrawable(R.drawable.cross));
        else if (moves[0] == 1 && moves[1] == 0)
            block4.setImageDrawable(getResources().getDrawable(R.drawable.cross));
        else if (moves[0] == 1 && moves[1] == 1)
            block5.setImageDrawable(getResources().getDrawable(R.drawable.cross));
        else if (moves[0] == 1 && moves[1] == 2)
            block6.setImageDrawable(getResources().getDrawable(R.drawable.cross));
        else if (moves[0] == 2 && moves[1] == 0)
            block7.setImageDrawable(getResources().getDrawable(R.drawable.cross));
        else if (moves[0] == 2 && moves[1] == 1)
            block8.setImageDrawable(getResources().getDrawable(R.drawable.cross));
        else if (moves[0] == 2 && moves[1] == 2)
            block9.setImageDrawable(getResources().getDrawable(R.drawable.cross));


        for (i in 0..2) {
            for (j in 0..2) {
                print("${matrix[i][j]} ")
            }
            println()
        }



        if (botWon()) {
            result.setText("You Lost")
            gameOver = true
            return

        }
        if (numberOfMoves == 4) {

            result.setText("Its a Draw")
            return
        }

    }

    fun playerwon(): Boolean {

        if (matrix[0][0] == 1 && matrix[0][1] == 1 && matrix[0][2] == 1)
            return true
        else
            if (matrix[1][0] == 1 && matrix[1][1] == 1 && matrix[1][2] == 1)
                return true
            else if (matrix[2][0] == 1 && matrix[2][1] == 1 && matrix[2][2] == 1)
                return true
            else if (matrix[0][0] == 1 && matrix[1][0] == 1 && matrix[2][0] == 1)
                return true
            else
                if (matrix[0][1] == 1 && matrix[1][1] == 1 && matrix[2][1] == 1)
                    return true
                else
                    if (matrix[0][2] == 1 && matrix[1][2] == 1 && matrix[2][2] == 1)
                        return true
                    else if (matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1)
                        return true
                    else if (matrix[0][2] == 1 && matrix[1][1] == 1 && matrix[2][0] == 1)
                        return true

        return false
    }

    fun botWon(): Boolean {

        if (matrix[0][0] == 0 && matrix[0][1] == 0 && matrix[0][2] == 0)
            return true
        else
            if (matrix[1][0] == 0 && matrix[1][1] == 0 && matrix[1][2] == 0)
                return true
            else if (matrix[2][0] == 0 && matrix[2][1] == 0 && matrix[2][2] == 0)
                return true
            else if (matrix[0][0] == 0 && matrix[1][0] == 0 && matrix[2][0] == 0)
                return true
            else
                if (matrix[0][1] == 0 && matrix[1][1] == 0 && matrix[2][1] == 0)
                    return true
                else
                    if (matrix[0][2] == 0 && matrix[1][2] == 0 && matrix[2][2] == 0)
                        return true
                    else if (matrix[0][0] == 0 && matrix[1][1] == 0 && matrix[2][2] == 0)
                        return true
                    else if (matrix[0][2] == 0 && matrix[1][1] == 0 && matrix[2][0] == 0)
                        return true

        return false
    }

}
