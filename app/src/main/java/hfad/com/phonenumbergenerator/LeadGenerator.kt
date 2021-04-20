package hfad.com.phonenumbergenerator

// this class handles the lead generations
class LeadGenerator {

    // step one get the codes from network providers i.e 0803,0805 etc
    private  fun genertaePhoneCode():String{

        val phoneCode: Array<String> = arrayOf("0803","0703","0903","0813","0810","0814","0816","0806","0805","0705","0905","0807",
        "0815", "0811", "0905", "0809", "0909", "0817","0818","0802","0902","0701","0808","0708","0812")

        return phoneCode[(Math.random() * phoneCode.size).toInt()]
    }

    // generate the first three number
    private fun generateFirstThreeDigit():Int{

        return 100 + (Math.random() * (999-100)).toInt()
    }

    // generate the first three number
    private fun generateFourDigit():Int{

        return 1000 + (Math.random() * (9999-1000)).toInt()
    }

    // compile the results

    fun results(howMany:Int):MutableSet<String>{

        // create an an emptyset to avoid duplicate
        val numbers = mutableSetOf<String>()

        // loop through when set is not empty
        while (numbers.size <= howMany){

            numbers.add("${genertaePhoneCode()} ${generateFirstThreeDigit()} ${generateFourDigit()}")
        }

        return(numbers)
    }

}