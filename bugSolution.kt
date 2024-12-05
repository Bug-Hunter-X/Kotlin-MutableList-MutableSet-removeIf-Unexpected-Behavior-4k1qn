fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val listCopy = list.toMutableList() // Create a copy
    listCopy.removeIf { it > 2 }
    println(listCopy) // Output: [1, 2]
    println(list) // Original list remains unchanged

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val setCopy = set.toMutableSet()
    setCopy.removeIf { it > 2 }
    println(setCopy) // Output: [1, 2]
    println(set) // Original set remains unchanged

    //Alternative solution using filter and toMutableList
    val filteredList = list.filter { it <=2 }.toMutableList()
    println(filteredList) //Output: [1,2]
    
    val filteredSet = set.filter { it <=2 }.toMutableSet()
    println(filteredSet) //Output: [1,2]
} 