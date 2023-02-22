fun main(){
        kids()
        cities()
        numbers()
        println(namesarray("June","Laura","Nelly"))

    }
    fun kids(){
        val kids= arrayOf("Mike","Don","Collins","Duke")
        println(kids.contentToString())

    }
    fun cities() {
        var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
        cities.forEach { city-> println(city.capitalize()) }

    }
    fun numbers() {
        var numbersarray = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
        println(numbersarray[1] + numbersarray[4])
        println(numbersarray.indexOf(158))
        println(numbersarray.sort())
        println(numbersarray.contentToString())
    }

    fun namesarray(x: String,y: String,z: String): String{
        var nameStudents= arrayOf(x,y,z)
        return nameStudents.contentToString()
    }