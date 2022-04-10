package io.keepcoding.marvel_avengers.Repositories

import io.keepcoding.marvel_avengers.Models.Heroe
import io.keepcoding.marvel_avengers.Models.Villain
import io.keepcoding.marvel_avengers.Models.Villains

object VillainRepository {

    val villainsSample: Villains
        get(){
            return arrayListOf(
                Villain("fenix",
                "Fénix",
            "Es una manifestación inmortal y mutable de la fuerza primordial universal de la vida y la pasión. Nacida de la nada, la Fuerza Fénix es una criatura del universo.",
            "Viajes en el tiempo, rayos cósmicos, manipulación del espacio."),
            Villain("venom",
            "Venom",
            "Extraterrestre con una forma amorfa, semi-líquido, que sobrevive mediante la unión con un huésped, por lo general humano.",
            "Formar picos o expandir su tamaño y regeneración. Debido a su contacto con Spider-Man, el simbionte otorga a todos sus anfitriones posteriores los poderes de ese héroe."),
            Villain( "matanza",
            "Matanza",
             "Es la fusión de Cletus Kasady, un asesino en serie, y de un simbionte descendiente del de Venom.",
             "Regeneración, superfuerza, transformar partes de su cuerpo en armas filosas"),
            Villain( "thanos",
            "Thanos",
            "Thanos es un miembro mutante de la raza de superhumanos conocidos como los Eternos de Titán. El personaje posee habilidades comunes a los Eternos, pero se amplifica en mayor grado a través de una combinación de su patrimonio mutante-Eterno, amplificación biónica, misticismo y poder otorgado por la entidad abstracta, la Muerte.",
            "Enorme fuerza, velocidad, reflejos, aglidad, resistencia, durabilidad sobrehumana, invulnerabilidad e inmortalidad"),

            )

        }

}