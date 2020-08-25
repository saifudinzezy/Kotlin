package fundamental.`if`

fun main(){
    //If merupakan sebuah expressions yang dapat mengembalikan nilai
    val openHours = 7
    val now = 7
    val office : String

    office = if (now == 7){
     "Office already open"
    }else if (now == openHours){
        "Wait a minute"
    }else{
        "office is close"
    }

    print(office)
}