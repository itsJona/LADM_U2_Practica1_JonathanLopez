package mx.edu.ittepic.ladm_u2_practica1_jonathanlopez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.View
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class Lienzo (p:MainActivity) : View(p){
    var r=100
    var copo1 = CoposDeNieve(100,50-2000,10)
    var copo2 = CoposDeNieve(500,200-2000,5)
    var copo3 = CoposDeNieve(160,120-2000,15)
    var copo4 = CoposDeNieve(600,900-2000,5)
    var copo5 = CoposDeNieve(516,300-2000,15)
    var copo6 = CoposDeNieve(800,520-2000,10)
    var copo7 = CoposDeNieve(450,600-2000,5)
    var copo8 = CoposDeNieve(964,700-2000,10)
    var copo9 = CoposDeNieve(60,800-2000,15)
    var copo10 = CoposDeNieve(700,10-2000,15)
    var copo11 = CoposDeNieve(160,400-2000,15)
    var copo12 = CoposDeNieve(100+100,50-2900,10)
    var copo13 = CoposDeNieve(500+100,200-2900,5)
    var copo14 = CoposDeNieve(160+100,120-2900,15)
    var copo15 = CoposDeNieve(600+100,900-2900,5)
    var copo16 = CoposDeNieve(516+100,300-2900,15)
    var copo17 = CoposDeNieve(450+100,600-2900,5)
    var copo18 = CoposDeNieve(964+100,700-2900,10)
    var copo19 = CoposDeNieve(60+100,800-2900,15)
    var copo20 = CoposDeNieve(700+100,10-2900,15)
    var copo21 = CoposDeNieve(160,400-2900,15)


    var nube1=CoposDeNieve(100+200,300,50)
    var nube2=CoposDeNieve(150+200,350,60)
    var nube3=CoposDeNieve(150+200,250,50)
    var nube4=CoposDeNieve(200+200,350,60)
    var nube5=CoposDeNieve(200+200,250,60)
    var nube6=CoposDeNieve(250+200,350,60)
    var nube7=CoposDeNieve(250+200,250,60)
    var nube8=CoposDeNieve(300+200,300,60)
    var sol =CoposDeNieve(900,300,120)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        var p = Paint()
        val path = Path()


        //CIELO
        p.color= Color.rgb(198,214,214)
        c.drawRect(0f,0f,width.toFloat(),height.toFloat(),p)

        //MONTAÑAS
        p.color= Color.rgb(111,150,46)
        c.drawCircle(-1250f     ,3550f,3000f,p)
        c.drawCircle(width+1350f,3550f,3000f,p)

        p.color= Color.rgb(149,201,63)
        c.drawCircle(540f,4000f,3000f,p)

        //PARED DE CASA
        p.color= Color.rgb(251,231,148)
        c.drawRect(175f,950f,700f,1300f,p)

        //PUERTA
        p.color= Color.rgb(96,51,11)
        c.drawRect(275f,1100f,375f,1300f,p)
        //SOL

        //TRONCO
        p.color =Color.rgb(137,95,34)
        c.drawRect(150f+700f,1200f-100f,200f+700f,1400f-100f,p)
        //HOJAS 1
        p.color =Color.rgb(70,120,35)
        c.drawCircle(130f+700f,1200f-100f,50f,p)
        c.drawCircle(180f+700f,1200f-100f,50f,p)
        c.drawCircle(230f+700f,1200f-100f,40f,p)

        c.drawCircle(150f+700f,1250f-100f,40f,p)
        c.drawCircle(210f+700f,1250f-100f,50f,p)

        c.drawCircle(150f+700f,1150f-100f,40f,p)
        c.drawCircle(210f+700f,1150f-100f,50f,p)
        //NUBE
        p.color =Color.rgb(255,255,255)
        nube1.pintar(c,p)
        nube2.pintar(c,p)
        nube3.pintar(c,p)
        nube4.pintar(c,p)
        nube5.pintar(c,p)
        nube6.pintar(c,p)
        nube7.pintar(c,p)
        nube8.pintar(c,p)
        //SOL
        p.color =Color.rgb(255,255,0)
        sol.pintar(c,p)

        //VENTANA
        p.color= Color.rgb(148,237,246)
        p.style = Paint.Style.FILL
        c.drawCircle(550f,1110f,80f,p)
        p.color= Color.rgb(96,51,11)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 10f
        c.drawCircle(550f,1110f,80f,p)
        //TECHO
        path.moveTo(100f, 950f)
        path.lineTo(775f, 950f)
        path.lineTo(437f, 750f)
        p.style = Paint.Style.FILL
        p.color= Color.rgb(96,51,11)
        c.drawPath(path, p)




        //COPOS
        p.style = Paint.Style.FILL
        p.color= Color.argb(200,255,255,255)
        copo1.pintar(c,p)
        copo2.pintar(c,p)
        copo3.pintar(c,p)
        copo4.pintar(c,p)
        copo5.pintar(c,p)
        copo6.pintar(c,p)
        copo7.pintar(c,p)
        copo8.pintar(c,p)
        copo9.pintar(c,p)
        copo10.pintar(c,p)
        copo11.pintar(c,p)

        copo12.pintar(c,p)
        copo13.pintar(c,p)
        copo14.pintar(c,p)
        copo15.pintar(c,p)
        copo16.pintar(c,p)
        copo17.pintar(c,p)
        copo18.pintar(c,p)
        copo19.pintar(c,p)
        copo20.pintar(c,p)





    }

    fun animarCopos() {

        copo1.lluvia(height)
        copo2.lluvia(height)
        copo3.lluvia(height)
        copo4.lluvia(height)
        copo5.lluvia(height)
        copo6.lluvia(height)
        copo7.lluvia(height)
        copo8.lluvia(height)
        copo9.lluvia(height)
        copo10.lluvia(height)
        copo11.lluvia(height)
        copo12.lluvia(height)
        copo13.lluvia(height)
        copo14.lluvia(height)
        copo15.lluvia(height)
        copo16.lluvia(height)
        copo17.lluvia(height)
        copo18.lluvia(height)
        copo19.lluvia(height)
        copo20.lluvia(height)

        nube1.despejarNubes()
        nube2.despejarNubes()
        nube3.despejarNubes()
        nube4.despejarNubes()
        nube5.despejarNubes()
        nube6.despejarNubes()
        nube7.despejarNubes()
        nube8.despejarNubes()

        sol.despejarSol()

        invalidate()
    }



}