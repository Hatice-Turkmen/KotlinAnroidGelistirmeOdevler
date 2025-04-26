package com.example.kotlindersleri.nesne_tabanli_programlama

@Suppress("UNREACHABLE_CODE")
class Odev2 {
    fun soru1 (kenar : Int)
    {
        val toplam = (kenar - 2)*180
        if (kenar <3)
        {
            println("ic acilar toplami = 0")
        }
        else
            println("ic acilar toplami = $toplam")
    }
    fun soru2 (celcius: Int) {
        val fahrenheit = (celcius * 1.8) + 32
        println("Fahreheit : $fahrenheit")
    }
    fun soru3 (kenar1: Int, kenar2 : Int, kenar3 : Int, kenar4 : Int){
        val cevre = kenar1+kenar2+kenar3+kenar4
        println("cevre= $cevre")
    }
    fun soru4 (sayi : Int){
        var sonuc = 1
        for (i in 1..sayi)
        {
            sonuc *=i
        }
        println("faktoriyel = $sonuc")
    }
    fun soru5 (kelime : String): Int {
        var sayac = 0
        for (harf in kelime)
        {
            if (harf == 'a' || harf == 'A')
                sayac++
        }
        return sayac
        println("a harf sayisi = $sayac")
    }
    fun soru6 (gun : Int): Int{
        val maas: Int
        val saat = gun * 8
        maas = if (saat<160){
            saat*10
        }else{
            saat*20
        }
        return maas
        println("maasınız = $maas")
    }
    fun soru7 (kota : Int): Int.Companion {
        var ucret = Int
        if (kota<=50)
        {
            println("ucret =100")
        } else{
            val asim = kota-50
            (100 + (asim * 4)).also { ucret = it }
            println("ucret = $ucret")
        }
        return ucret

    }

}