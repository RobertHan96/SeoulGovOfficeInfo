package com.studiohana.seoulgovofficeinfo.datas

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Office(val name : String, val tel : String, val address : String, val publicSite : String, val lat : Double, val lng : Double) :
    Parcelable {
    object  shared {
        val guList  = arrayListOf<Office>(
            Office( "종로",  "02-2148-1114",  "서울특별시 종로구 삼봉로43",
                "https://www.jongno.go.kr/portalMain.do", 37.572896,  126.979254 ),
            Office( "중구",  "02-3396-4114",  "서울특별시 중구 창경궁로 17",
                "http://www.junggu.seoul.kr/index.jsp", 37.5636204,  126.997976 ),
            Office( "성동",  "02-2286-5114",  "서울특별시 성동구 고산자로 270",
                "http://www.sd.go.kr/sd/newMapInfo.do?mCode=13G030050000&displayId=&op=way",
                37.563132,  127.036611),
            Office( "용산",  "02-2199-6114",  "서울특별시 용산구 녹사평대로 150(이태원동)",
                "http://www.yongsan.go.kr/index.htm", 37.532556,  126.990333),
            Office( "광진",  "02-450-1114",  "울특별시 광진구 자양1동 자양로 117",
                "https://www.gwangjin.go.kr/index1.html", 37.538627,  127.082517 ),
            Office( "동대문",  "02-2127-5000",  "서울특별시 동대문구 용두동 천호대로 145",
                "http://www.ddm.go.kr/", 37.574220,  127.039603 ),
            Office( "중랑",  "02-2094-0114",  "서울특별시 중랑구 신내동 662",
                "https://www.jungnang.go.kr/popup_index2.jsp", 37.606534,  127.092544 ),
            Office( "성북",  "02-2241-3114",  "서울특별시 성북구 삼선동5가 보문로 168",
                "https://www.sb.go.kr/", 37.589332,  127.016689 ),
            Office( "강북",  "02-901-6114",  "서울특별시 강북구 수유동 도봉로89길 13",
                "http://www.gangbuk.go.kr/intro_gb.jsp", 37.639553,  127.025405 ),
            Office( "도봉",  "02-2091-2120",  "서울특별시 도봉구 방학1동 마들로 656",
                "http://www.dobong.go.kr/", 37.668684,  127.046882 ),
            Office( "노원",  "02-2116-3114",  "서울특별시 노원구 노해로 437",
                "https://www.nowon.kr/www/index.do", 37.654047,  127.056477 ),
            Office( "은평",  "02-351-6114",  "서울특별시 은평구 녹번동 은평로 195",
                "http://www.eunpyeong.seoul.kr/", 37.602746,  126.929369 ),
            Office( "서대문",  "02-330-1301",  "서울특별시 서대문구 연희동 연희로 248",
                "http://www.sdm.go.kr/index.do", 37.579083,  126.936790 ),
            Office( "마포",  "02-3153-8114",  "서울특별시 마포구 성산2동 월드컵로 212)",
                "https://www.mapo.go.kr/site/main/home", 37.566148,  126.901838 ),
            Office( "양천",  "02-2620-3114",  "서울특별시 양천구 신정동 목동동로 105",
                "http://www.yangcheon.go.kr/site/yangcheon/main.do", 37.516942,  126.866779 ),
            Office( "강서",  "02-2600-6114",  "서울특별시 강서구 화곡6동 화곡로 302",
                "http://www.gangseo.seoul.kr/new_portal/index.jsp", 37.550853,  126.849463 ),
            Office( "구로",  "02-860-2114",  "서울특별시 구로구 구로동 가마산로 245",
                "http://www.guro.go.kr/", 37.495368,  126.887146 ),
            Office( "금천",  "02-2627-2114",  "서울특별시 금천구 시흥대로73길 70",
                "https://www.geumcheon.go.kr/portal/index.do", 37.456560,  126.895360 ),
            Office( "영등포",  "02-2670-3114",  "서울특별시 영등포구 당산동3가 당산로 123",
                "https://www.ydp.go.kr/www/index.do", 37.526342,  126.896067),
            Office( "동작",  "02-820-1114",  "서울특별시 동작구 노량진2동 장승배기로 161",
                "https://www.dongjak.go.kr/", 37.512380,  126.939704 ),
            Office( "관악",  "02-879-5000",  "서울특별시 관악구 관악로 145)",
                "http://www.gwanak.go.kr/", 37.477959,  126.951639 ),
            Office( "서초",  "02-2155-6114",  "서울특별시 서초구 서초2동 남부순환로 2584",
                "https://www.seocho.go.kr/site/seocho/main.do", 37.483548,  127.032361 ),
            Office( "강남",  "02-3423-5114",  "서울특별시 강남구 삼성2동 학동로 426",
                "http://www.gangnam.go.kr/index.htm", 37.517268,  127.047662 ),
            Office( "송파",  "02-2147-2000",  "서울특별시 송파구 잠실6동 올림픽로 326",
                "http://www.songpa.go.kr/index.jsp", 37.514623,  127.105849 ),
            Office( "강동",  "1577-1188",  "서울특별시 강동구 성내동 성내로 25",
                "https://www.gangdong.go.kr/", 37.530168,  127.123785 )
        )

        val taxList  = arrayListOf<Office>(
            Office( "종로",  "02-760-9200",  "서울특별시 종로구 낙원동 삼일대로30길 22",
                "https://s.nts.go.kr/jn/Default.asp", 37.573768,  126.988918 ),
            Office( "중부\n(중구 일부)",  "02-2260-9200",  "서울특별시 중구 명동 소공로 70",
                "https://s.nts.go.kr/jb/Default.asp", 37.561456,  126.982094 ),
            Office( "남대문\n(중구 일부)",  "02-2260-0200",  "서울특별시 중구 저동1가 삼일대로 340",
                "https://s.nts.go.kr/ndm/Default.asp", 37.564911,  126.988183 ),
            Office( "용산",  "02-748-8200",  "서울특별시 용산구 한강로3가 서빙고로24길 15",
                "https://s.nts.go.kr/yos/Default.asp", 37.523148,  126.968822 ),
            Office( "성북",  "02-760-8200",  "서울특별시 성북구 삼선동3가 삼선교로16길 13",
                "https://s.nts.go.kr/sb/Default.asp", 37.588028, 127.010965),
            Office( "서대문",  "02-2287-4200",  "서울특별시 서대문구 미근동 충정로 60 KT&G 서대문타워 13층, 14층",
                "https://s.nts.go.kr/sdm/Default.asp", 37.5638356, 126.9638821 ),
            Office( "도봉",  "02-944-0200",  "서울특별시 강북구 미아동 도봉로 117",
                "https://s.nts.go.kr/db/Default.asp", 37.6197001, 127.0260522),
            Office( "노원/창동",  "02-3499-0200",  "서울특별시 도봉구 창동 15",
                "https://s.nts.go.kr/nw/Default.asp", 37.653110, 127.051203),
            Office( "은평",  "02-2132-9200",  "서울특별시 은평구 갈현2동 서오릉로 7",
                "https://s.nts.go.kr/ep/Default.asp", 37.606421, 126.921325),
            Office( "마포",  "02-705-7200",  "서울특별시 마포구 신수동 독막로 234",
                "https://s.nts.go.kr/menu/main/main1.asp?tax_code=105", 37.546462, 126.939491),
            Office( "영등포",  "02-2630-9200",  "서울특별시 영등포구 당산2동 선유동1로 38",
                "https://s.nts.go.kr/ydp/Default.asp", 37.525244, 126.892654),
            Office( "강서",  "02-2630-4200",  "서울특별시 강서구 가양1동 마곡서1로 60",
                "https://s.nts.go.kr/gs/Default.asp", 37.5621683, 126.819343),
            Office( "양천",  "02-2650-9200",  "서울특별시 양천구 신정동 목동동로 165",
                "https://s.nts.go.kr/yc/Default.asp", 37.520502, 126.8677649),
            Office( "구로",  "02-2630-7200",  "서울특별시 영등포구 문래동 경인로 778",
                "https://s.nts.go.kr/gr/Default.asp", 37.5134612, 126.869798),
            Office( "동작\n(영등포 일부)",  "02-840-9200",  "서울특별시 영등포구 신길6동 대방천로 259",
                "https://s.nts.go.kr/dj/Default.asp", 37.499081, 126.919751),
            Office( "금천",  "02-850-4200",  "서울특별시 금천구 독산3동 953-9",
                "https://s.nts.go.kr/gc/Default.asp", 37.477966, 126.899864),
            Office( "관악",  "02-2173-4200",  "서울특별시 관악구 신원동 문성로 187",
                "https://s.nts.go.kr/ga/Default.asp", 37.479382, 126.924387),
            Office( "강남\n(강남 일부)",  "02-519-4200",  "서울특별시 강남구 청담동 학동로 425",
                "https://s.nts.go.kr/gn/Default.asp", 37.518712, 127.047042),
            Office( "삼성\n(강남 일부)",  "02-3011-7200",  "서울특별시 강남구 테헤란로 114 1,5,6,9,10층",
                "https://s.nts.go.kr/ss/Default.asp", 37.498332, 127.030211),
            Office( "역삼\n(강남 일부)",  "02-3011-8200",  "서울특별시 강남구 테헤란로 114 역삼빌딩 7,8,9층",
                "https://s.nts.go.kr/ys/Default.asp", 37.498332, 127.030211),
            Office( "반포\n(서초 일부)",  "02-590-4200",  "서울특별시 서초구 방배동 방배로 163",
                "https://s.nts.go.kr/bp/Default.asp", 37.487966, 126.992892),
            Office( "서초",  "02-3011-6200",  "서울특별시 강남구 테헤란로 114 3,4층",
                "https://s.nts.go.kr/sc/Default.asp", 37.498332, 127.030211),
            Office( "송파\n(송파 일부)",  "02-2224-9200",  "서울특별시 송파구 강동대로 62",
                "https://s.nts.go.kr/menu/main/main2.asp?tax_code=215", 37.526437, 127.113995),
            Office( "잠실\n(송파 일부)",  "02-2055-9200",  "서울특별시 송파구 강동대로 62",
                "https://s.nts.go.kr/js/Default.asp", 37.526770,  127.113647),
            Office( "성동/광진",  "02-460-4200",  "서울특별시 성동구 광나루로 297",
                "https://s.nts.go.kr/menu/intro/intro.asp?tax_code=206#map", 37.548497,  127.062846 ),
            Office( "동대문",  "02-958-0200",  "서울특별시 동대문구 약령시로 159",
                "https://s.nts.go.kr/ddm/Default.asp", 37.583205, 127.047907),
            Office( "중랑",  "02-2170-0200",  "서울특별시 중랑구 상봉동 137-1",
                "https://s.nts.go.kr/jr/Default.asp", 37.592749, 127.072456),
            Office( "강동",  "02-2224-0200",  "서울특별시 강동구 길동 천호대로 1139",
                "https://s.nts.go.kr/gd/Default.asp", 37.534580, 127.138174)
        )

    }

}