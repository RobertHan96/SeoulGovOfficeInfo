package com.studiohana.seoulgovofficeinfo.datas


class OfficeTask(val id : Int, val task : String ) {
    object  shared {
        val guItems  = arrayListOf<OfficeTask>(
            OfficeTask(1, "여권"),
            OfficeTask(1, "가족 관계"),
            OfficeTask(1, "지방세"),
            OfficeTask(1, "자동차, 과태료"),
            OfficeTask(1, "복지"),
            OfficeTask(1, "환경/위생"),
            OfficeTask(1, "부동산/건축"),
            OfficeTask(1, "광고물/현수막")
        )

        val taxItems  = arrayListOf<OfficeTask>(
            OfficeTask(2, "납세자 보호"),
            OfficeTask(2, "체납 징세"),
            OfficeTask(2, "부가가치세"),
            OfficeTask(2, "재산세"),
            OfficeTask(2, "법인세"),
            OfficeTask(2, "소득세")
        )
    }

}