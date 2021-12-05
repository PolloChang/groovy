package design.cases

/**
 * 取得西元日曆月份最後的日期
 */
class GetMonthEndDate {

    /**
     * 取得西元日曆月份最後的日期
     * @param fullYear
     * @param fullMonth
     * @return
     * @throws Exception
     */
    int getEndData(int fullYear,int fullMonth) throws Exception{
        int endDate

        if(fullMonth in [1,3,5,7,8,10,12]){
            endDate = 31
        }else if(fullMonth in [4,6,9,11]){
            endDate = 30
        }else if(fullMonth == 2 && (fullYear % 400 ==0)){
            endDate = 29
        }else if(fullMonth == 2 && (fullYear % 100 ==0)){
            endDate = 28
        }else if(fullMonth == 2 && (fullYear % 4 ==0)){
            endDate = 29
        }else if(fullMonth == 2){
            endDate = 28
        }else{
            throw new Error("月份錯誤")
        }

        return  endDate
    }

}
