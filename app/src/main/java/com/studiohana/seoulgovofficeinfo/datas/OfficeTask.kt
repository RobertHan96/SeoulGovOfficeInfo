package com.studiohana.seoulgovofficeinfo.datas

import kotlinx.android.parcel.Parcelize


class OfficeTask(val id : Int, val task : String ) {
    object  shared {
        val guItems  = arrayListOf<OfficeTask>(
            OfficeTask(1, "여권 발급"),
            OfficeTask(1, "지방세 신고"),
            OfficeTask(1, "차량 등록"),
            OfficeTask(1, "복지 상담"),
            OfficeTask(1, "도로 정비")
        )

        val taxItems  = arrayListOf<OfficeTask>(
            OfficeTask(2, "연말 정산"),
            OfficeTask(2, "상속"),
            OfficeTask(2, "세무 상담")
        )
    }

}