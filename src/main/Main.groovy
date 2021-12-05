package main

import design.date.ConvertStringToDate

class Main {
    static void main(String[] args){
        ConvertStringToDate testI = new ConvertStringToDate()

        String inputS = "十二月 03, 2021 12:44:31 下午"



        println testI.convertCHT(inputS)
    }
}
