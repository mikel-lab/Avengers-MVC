package io.keepcoding.marvel_avengers.Repositories

import io.keepcoding.marvel_avengers.Models.Heroe
import io.keepcoding.marvel_avengers.Models.Heroes

object HeroRepository {

    val heroesSample: Heroes
        get(){
            return arrayListOf(
                Heroe("denvers",
                "Capitana Marvel",
             "Piloto de la Fuerza Aérea de Estados Unidos, que se convierte en la Capitana Marvel después de que la Tierra haya quedado atrapada en el centro de un conflicto intergaláctico entre dos razas alienígenas",
             "Niveles sobrehumanos de fuerza, resistencia,y durabilidad física, así como vuelo, un precognitivo sexto sentido limitado"),
            Heroe( "spidey",
            "Spiderman",
            "Joven huérfano neoyorquino que adquiere superpoderes después de ser mordido por una araña radiactiva",
            "Superfuerza, producción de telarañas, sentido arácnido y adhesión a superficies"),
            Heroe("strange",
            "Dr. Extraño",
             "Carece realmente de verdaderos Superpoderes, en su lugar posee vastos poderes místicos",
            "Magia y uso de objetos místicos"),
            Heroe("storm",
            "Tormenta",
            "La caracterizan sus ojos azules, pelo blanco y tez oscura. Es uno de los mutantes más poderosos del planeta. Fue reclutada por Charles Xavier para sus X-Men, que llegaría a liderar.",
             "Control del clima y la atmósfera")

            )

        }





}