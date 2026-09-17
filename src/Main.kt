fun main() {
    // Consigne 1
    val playlist: MutableList<String> = mutableListOf("Bohemian Rhapsody", "Stairway to Heaven", "Hotel California")
    // Consigne 2
    playlist.add("Imagine")
    playlist.add(0, "Like a Rolling Stone")
    playlist.add("Bohemian Rhapsody")
    // Consigne 3
    playlist.set(2, "Smells Like Teen Spirit")
    // Consigne 4
    println("Hotel California" in playlist)
    println(playlist.indexOf("Imagine"))
    // Consigne 5
    playlist.remove("Hotel California")
    playlist.remove(playlist[0])
    // Consigne 6
    playlist.sort()
    println(playlist)
    playlist.sortDescending()
    println(playlist)
}