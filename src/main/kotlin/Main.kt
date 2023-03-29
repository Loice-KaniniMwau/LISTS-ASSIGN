fun main() {
println( myNames(listOf("maryanne","lucyanne","chepchumba","kennedy","kibet","lucy","kanini","emma","mary","kevin")))

    println( averageHeight(listOf(5.6,7.9,4.7,5.3)))
    allpeople()
  var person1=Persons("mary",34,6.7,56.7)
    var person2=Persons("kennedy",64,7.4,67.3)
    var final= listOf(person1,person2).plus(allpeople())
   println(final)


    var car1 = AllVehicles("KYF020F",60)
    var car2 = AllVehicles("KBM230G",50)
    var car3 = AllVehicles("KCF343P",70)
    var car4 = AllVehicles("KFD343V",75)
    var finalcars= listOf(car1,car2,car3,car4)
    println(carlist(finalcars))


    //var finalCars= listOf(car1,car2,car3)
}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun myNames(allNmaes:List<String>):List<String> {
    var firstName =allNmaes.filter { item->allNmaes.indexOf(item)%2==0 &&(allNmaes.indexOf(item))!=0 }
  return firstName


}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class theHeight(var myAve:Double,var totalHeight:Double)
fun averageHeight(allHeight:List<Double>):theHeight{
    var myAve=allHeight.average()
    var totalHeight=0.0
    for (height in allHeight)
        totalHeight+=height
  var allHeights=theHeight(myAve,totalHeight)
    return  allHeights
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
 data class Persons(var name:String,var age:Int,var height: Double,var weight:Double)
    fun allpeople() {
    var person = Persons("loice", 21, 5.78, 50.1)
    var person1 = Persons("maryanne", 30, 5.99, 56.1)
    var person2 = Persons("jecinta", 14, 6.4, 56.98)
    var People = listOf(person, person1, person2)
    var finalPeople=People.sortedBy { item->item.age }
    println(finalPeople)


}





fun mypeople(name: String,age: Int,height: theHeight,weight: Double):Any{
   var person3=Persons("kennedy",34,5.6,70.3)
    var person4=Persons("kibet",32,6.7,50.6)
    var final= listOf(person3,person4)
    return final

}


//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class AllVehicles(var registration:String, var mileage:Int)
fun carlist(Cars:List<AllVehicles>):Int{
    var Myaverage=0
    Cars.forEach { car->car.mileage
        Myaverage=car.mileage
    }
    var totalAverage=Myaverage/Cars.count()
    return totalAverage
}









