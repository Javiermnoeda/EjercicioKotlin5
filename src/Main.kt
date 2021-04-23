
fun main(){
    var numeroAleatorio = 0
    val listaNumeros = mutableListOf<Int>()
    var media : Double = 0.0
    val listaNumerosMayorMedia: MutableList<Int> = mutableListOf()

    repeat (100){
        numeroAleatorio = (0..100).random()
        listaNumeros.add(numeroAleatorio)
        media += numeroAleatorio
    }

    //println("Lista de todos los numeros aleatorios: $listaNumeros") (era para comprobar que funciona)

    media /= listaNumeros.size //Equivalente a media = media/listaNumeros.size
    println("La media es de los numeros es: $media")

    for (i in listaNumeros){
        if (i >= media) listaNumerosMayorMedia.add(i)

    }

    println("La lista de los numeros es mayor que la media es: $listaNumerosMayorMedia")

}