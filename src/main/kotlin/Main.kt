fun main(args: Array<String>) {
    val InputVal= readln()
    var result = ""
    var countChar = 1
    var prevChar = InputVal[0]
    for(i in 0 .. InputVal.length - 1) {
        if (InputVal[i] == prevChar) {
            countChar++

        } else {
            if (countChar > 1) {
                result = result + prevChar + countChar
            } else {
                result = result + prevChar
            }
            countChar = 1
            prevChar = InputVal[i]

        }
    }
        if (countChar > 1) {
            result = result + prevChar + countChar
        } else {
            result = result + prevChar
        }



    println(result)
}