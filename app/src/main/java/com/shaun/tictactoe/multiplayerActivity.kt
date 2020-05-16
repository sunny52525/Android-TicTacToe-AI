package com.shaun.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.multiplayer.*


class multiplayerActivity : AppCompatActivity() {
    private var numberOfMoves = 0
    private var gameOver = false
    private var matrix: Array<IntArray> = Array(3) { IntArray(3) }
    private var chance = 0 //0 for o 1 for x
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.multiplayer)
        resultm.text = ""
        reset()

        resetm.setOnClickListener {
            reset()
            chance = 0
        }
        playerstylem.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }

        block1m.setOnClickListener {

            if (gameOver) {
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (numberOfMoves == 9) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (matrix[0][0] != -1) {
                Toast.makeText(this, "Uh Oh! This move isn't allowed", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (chance == 0) {
                matrix[0][0] = 0
                block1m.setImageResource(R.drawable.circle)
            } else {
                matrix[0][0] = 1
                block1m.setImageResource(R.drawable.cross)

            }
            if (playerowon()) {
                resultm.setText("Player 2 Won")
                gameOver = true


            } else if (playerxwon()) {
                resultm.setText("Player 1 Won")
                gameOver = true

            }

            ++numberOfMoves
            chance = if (chance == 0)
                1
            else
                0
            if (numberOfMoves == 9) {
                if (playerowon()) {
                    resultm.setText("Player 2 Won")
                    gameOver = true


                } else if (playerxwon()) {
                    resultm.setText("Player 1 Won")
                    gameOver = true

                } else
                    resultm.setText("Its a draw")
                gameOver = true
            }

        }
        block2m.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (numberOfMoves == 9) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (matrix[0][1] != -1) {
                Toast.makeText(this, "Uh Oh! This move isn't allowed", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (chance == 0) {
                matrix[0][1] = 0
                block2m.setImageResource(R.drawable.circle)
            } else {
                matrix[0][1] = 1
                block2m.setImageResource(R.drawable.cross)

            }
            if (playerowon()) {
                resultm.setText("Player 2 Won")
                gameOver = true


            } else if (playerxwon()) {
                resultm.setText("Player 1 Won")
                gameOver = true

            }
            ++numberOfMoves
            chance = if (chance == 0)
                1
            else
                0
            if (numberOfMoves == 9) {
                if (playerowon()) {
                    resultm.setText("Player 2 Won")
                    gameOver = true


                } else if (playerxwon()) {
                    resultm.setText("Player 1 Won")
                    gameOver = true

                } else
                    resultm.setText("Its a draw")
                gameOver = true
            }
        }
        block3m.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (numberOfMoves == 9) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (matrix[0][2] != -1) {
                Toast.makeText(this, "Uh Oh! This move isn't allowed", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (chance == 0) {
                matrix[0][2] = 0
                block3m.setImageResource(R.drawable.circle)
            } else {
                matrix[0][2] = 1
                block3m.setImageResource(R.drawable.cross)

            }
            if (playerowon()) {
                resultm.setText("Player 2 Won")
                gameOver = true


            } else if (playerxwon()) {
                resultm.setText("Player 1 Won")
                gameOver = true

            }
            ++numberOfMoves
            chance = if (chance == 0)
                1
            else
                0
            if (numberOfMoves == 9) {
                if (playerowon()) {
                    resultm.setText("Player 2 Won")
                    gameOver = true


                } else if (playerxwon()) {
                    resultm.setText("Player 1 Won")
                    gameOver = true

                } else
                    resultm.setText("Its a draw")
                gameOver = true
            }
        }
        block4m.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (numberOfMoves == 9) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (matrix[1][0] != -1) {
                Toast.makeText(this, "Uh Oh! This move isn't allowed", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (chance == 0) {
                matrix[1][0] = 0
                block4m.setImageResource(R.drawable.circle)
            } else {
                matrix[1][0] = 1
                block4m.setImageResource(R.drawable.cross)

            }
            if (playerowon()) {
                resultm.setText("Player 2 Won")
                gameOver = true


            } else if (playerxwon()) {
                resultm.setText("Player 1 Won")
                gameOver = true

            }
            ++numberOfMoves
            chance = if (chance == 0)
                1
            else
                0
            if (numberOfMoves == 9) {
                if (playerowon()) {
                    resultm.setText("Player 2 Won")
                    gameOver = true


                } else if (playerxwon()) {
                    resultm.setText("Player 1 Won")
                    gameOver = true

                } else
                    resultm.setText("Its a draw")
                gameOver = true
            }
        }
        block5m.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (numberOfMoves == 9) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (matrix[1][1] != -1) {
                Toast.makeText(this, "Uh Oh! This move isn't allowed", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (chance == 0) {
                matrix[1][1] = 0
                block5m.setImageResource(R.drawable.circle)
            } else {
                matrix[1][1] = 1
                block5m.setImageResource(R.drawable.cross)

            }
            if (playerowon()) {
                resultm.setText("Player 2 Won")
                gameOver = true


            } else if (playerxwon()) {
                resultm.setText("Player 1 Won")
                gameOver = true

            }
            ++numberOfMoves
            chance = if (chance == 0)
                1
            else
                0
            if (numberOfMoves == 9) {
                if (playerowon()) {
                    resultm.setText("Player 2 Won")
                    gameOver = true


                } else if (playerxwon()) {
                    resultm.setText("Player 1 Won")
                    gameOver = true

                } else
                    resultm.setText("Its a draw")
                gameOver = true
            }
        }
        block6m.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (numberOfMoves == 9) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (matrix[1][2] != -1) {
                Toast.makeText(this, "Uh Oh! This move isn't allowed", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (chance == 0) {
                matrix[1][2] = 0
                block6m.setImageResource(R.drawable.circle)
            } else {
                matrix[1][2] = 1
                block6m.setImageResource(R.drawable.cross)

            }
            if (playerowon()) {
                resultm.setText("Player 2 Won")
                gameOver = true


            } else if (playerxwon()) {
                resultm.setText("Player 1 Won")
                gameOver = true

            }
            ++numberOfMoves
            chance = if (chance == 0)
                1
            else
                0
            if (numberOfMoves == 9) {
                if (playerowon()) {
                    resultm.setText("Player 2 Won")
                    gameOver = true


                } else if (playerxwon()) {
                    resultm.setText("Player 1 Won")
                    gameOver = true

                } else
                    resultm.setText("Its a draw")
                gameOver = true
            }
        }
        block7m.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (numberOfMoves == 9) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (matrix[2][0] != -1) {
                Toast.makeText(this, "Uh Oh! This move isn't allowed", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (chance == 0) {
                matrix[2][0] = 0
                block7m.setImageResource(R.drawable.circle)
            } else {
                matrix[2][0] = 1
                block7m.setImageResource(R.drawable.cross)

            }
            if (playerowon()) {
                resultm.setText("Player 2 Won")
                gameOver = true


            } else if (playerxwon()) {
                resultm.setText("Player 1 Won")
                gameOver = true

            }
            ++numberOfMoves
            chance = if (chance == 0)
                1
            else
                0
            if (numberOfMoves == 9) {
                if (playerowon()) {
                    resultm.setText("Player 2 Won")
                    gameOver = true


                } else if (playerxwon()) {
                    resultm.setText("Player 1 Won")
                    gameOver = true

                } else
                    resultm.setText("Its a draw")
                gameOver = true
            }
        }
        block8m.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (numberOfMoves == 9) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (matrix[2][1] != -1) {
                Toast.makeText(this, "Uh Oh! This move isn't allowed", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (chance == 0) {
                matrix[2][1] = 0
                block8m.setImageResource(R.drawable.circle)
            } else {
                matrix[2][1] = 1
                block8m.setImageResource(R.drawable.cross)

            }
            if (playerowon()) {
                resultm.setText("Player 2 Won")
                gameOver = true


            } else if (playerxwon()) {
                resultm.setText("Player 1 Won")
                gameOver = true

            }
            ++numberOfMoves
            chance = if (chance == 0)
                1
            else
                0
            if (numberOfMoves == 9) {
                if (playerowon()) {
                    resultm.setText("Player 2 Won")
                    gameOver = true


                } else if (playerxwon()) {
                    resultm.setText("Player 1 Won")
                    gameOver = true

                } else
                    resultm.setText("Its a draw")
                gameOver = true
            }
        }
        block9m.setOnClickListener {
            if (gameOver) {
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (numberOfMoves == 9) {
                result.setText("Its a Draw")
                Toast.makeText(this, "Game Over Start a New Game", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (matrix[2][2] != -1) {
                Toast.makeText(this, "Uh Oh! This move isn't allowed", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (chance == 0) {
                matrix[2][2] = 0
                block9m.setImageResource(R.drawable.circle)
            } else {
                matrix[2][2] = 1
                block9m.setImageResource(R.drawable.cross)

            }
            if (playerowon()) {
                resultm.setText("Player 2 Won")
                gameOver = true


            } else if (playerxwon()) {
                resultm.setText("Player 1 Won")
                gameOver = true

            }
            ++numberOfMoves
            chance = if (chance == 0)
                1
            else
                0
            if (numberOfMoves == 9) {
                if (playerowon()) {
                    resultm.setText("Player 2 Won")
                    gameOver = true


                } else if (playerxwon()) {
                    resultm.setText("Player 1 Won")
                    gameOver = true

                } else
                    resultm.setText("Its a draw")
                gameOver = true
            }
        }


    }


    fun reset() {
        block1m.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block2m.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block3m.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block3m.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block4m.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block5m.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block6m.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block7m.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block8m.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        block9m.setImageDrawable(getResources().getDrawable(R.drawable.nothing));
        resultm.setText("")
        numberOfMoves = 0
        gameOver = false
        for (i in 0..2) {
            for (j in 0..2) {
                matrix[i][j] = -1;
            }
        }
    }

    fun playerowon(): Boolean {

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

    fun playerxwon(): Boolean {

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