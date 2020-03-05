package mx.edu.ittepic.ladm_u2_practica1_jonathanlopez



class HiloAnimacion (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(60)
            puntero.runOnUiThread {
                puntero.lienzo!!.animarCopos()
            }
        }
    }
}