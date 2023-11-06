package kh.edu.rupp.ite.mytravel.api.model

data class Home(
        val id: Long,
        val title: String,
        val content: String,
        val imageUrl: String
) {
    val name: String
        get() {
            TODO()
        }
}
