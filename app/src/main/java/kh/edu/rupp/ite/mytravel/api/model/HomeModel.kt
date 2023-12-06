package kh.edu.rupp.ite.mytravel.api.model

data class HomeModel(
        var id: Int = getAutoId(),
        var name: String = "",
        var province : String = ""
) {
    companion object{
        fun getAutoId():Int{
            val random = java.util.Random()
            return random.nextInt(100)

        }
    }
}
