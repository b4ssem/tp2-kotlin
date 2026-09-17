package exercice2

fun main(){
    // Consigne 1
    val articleTags: MutableSet<String> = mutableSetOf("kotlin", "programmation", "android")
    // Consigne 2
    articleTags.add("dev")
    articleTags.add("kotlin")
    println(articleTags)
    // Consigne 3
    println("java" in articleTags)
    val popularTags: MutableSet<String> = mutableSetOf("kotlin", "android", "jetpack")
    println(popularTags.equals(articleTags))
    //Consigne 4
    articleTags.remove("android")
    //Consigne 5
    val unionTags: MutableSet<String> = mutableSetOf()
    unionTags.addAll(articleTags)
    unionTags.addAll(popularTags)
    println(unionTags)
}
