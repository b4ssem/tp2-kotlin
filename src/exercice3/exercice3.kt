package exercice3

fun main(){
    // Consigne 1
    val glossaire: MutableMap<String, String> = mutableMapOf("API" to "Application Programming Interface", "IDE" to "Integrated Development Environment")

    // Consigne 2
    glossaire["SDK"] = "Software Development Kit"
    glossaire["IDE"] = "Environnement de développement intégré qui aide les développeurs à écrire du code"
    println(glossaire)

    // Consigne 3
    var defAPI = glossaire["API"]
    println("Définition d'une API: $defAPI")
    println(glossaire.getOrDefault("Framework","Terme non trouvé"))
    println("Définition de SDK: ${glossaire.getOrDefault("SDK","Terme non trouvé")}")

    // Consigne 3
    glossaire.remove("API")
    println(glossaire)

    // Consigne 4
    for (i in glossaire){
        println("Terme : ${i.key}")
        println("Définition: ${i.value}")
    }
}