package mx.edu.ittepic.ladm_u2_practica1_jonathanlopez

import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent

class CoposDeNieve () {
    var x = 0f 
    var y = 0f
    var radio = 0f
    var incY = 5
    var incX = 5

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
    }


    fun pintar(c: Canvas, p: Paint){

                c.drawCircle(x,y,radio,p)
    }

    fun despejarSol(){

        x+=incX
    }

    fun despejarNubes(){

        x-=incX
    }


    fun lluvia (alto:Int){

        y+= incY
        if(y>=alto+100){
            y = 0f
        }
    }



}