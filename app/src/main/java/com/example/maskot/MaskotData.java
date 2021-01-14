package com.example.maskot;

import java.util.ArrayList;

public class MaskotData {
    private static String[] maskotNames = {
            "Willie",
            "Juanito",
            "Tip n Tap",
            "Gauchito",
            "Naranjito",
            "Pique",
            "Ciao",
            "Striker",
            "Footix",
            "Ato, Nik n Kaz",
            "Goleo n Pille",
            "Zakumi",
            "Fuleco",
            "Zabivaka"
    };

    private static String[] maskotInfo = {
            "Piala Dunia Inggris 1966",
            "Piala Dunia Meksiko 1970",
            "piala Dunia Jerman Barat 1974",
            "Piala Dunia Argentina 1978",
            "Piala Dunia Spanyol 1982",
            "Piala Dunia Meksiko 1986",
            "Piala Dunia Italia 1990",
            "Piala Dunia Amerika Serikat 1994",
            "Piala Dunia Perancis 1998",
            "Piala Dunia Korsel dan Jepang 2002",
            "Piala Dunia Jerman 2006",
            "Piala Dunia Afrika Selatan 2010",
            "Piala Dunia Brazil 2014",
            "Piala Dunia Rusia 2018"
    };

    private static String[] maskotDetail = {
            "Willie menjadi maskot pertama dalam sejarah gelaran Piala Dunia. Sebagai tuan rumah, Inggris yang akrab dengan julukan Tiga Singa sengaja memilih seekor singa sebagai maskot yang kemudian diberi nama Willie.\n" +
                    "\n" +
                    "Willie yang mengenakan kaos Union Jack bertuliskan World Cup menjadi keberuntungan sekaligus keuntungan bagi tuan rumah. Tidak hanya keluar sebagi juara, penjualan Willie pun laku keras di pasaran.",
            "Juanito diperkenalkan tuan rumah Meksiko sebagai maskot gelaran pesta sepak bola empat tahunan. Juanito merupakan bocah bertubuh gemuk mengenakan seragam hijau khas Meksiko lengkap dengan topi Sombrero terletak di kepala.\n" +
                    "\n" +
                    "Juanito merupakan dua suku kata yang digabungkan. Juan dan Ito. Juan merupakan nama yang cukup populer di Meksiko. Cukup mudah menemukan warga Meksiko bernama Juan lantara sudah jamak digunakan. Penambahan Ito menjadikan Juanito bermakna Juan Kecil.",
            "Tip and Tap menjadi maskot ketiga yang digunakan dalam pesta sepak bola paling bergengsi di dunia. Maskot kali ini cukup sederhana namun kaya makna.\n" +
                    "\n" +
                    "Digambarkan dua bocah berambut hitam dan pirang saling merangkul bahu mengenakan seragam khas Jerman dengan atasan putih dan bawahan hitam. Kemudian bertuliskan WM (Weltmeisterschaft) 74 yang artinya World Cup (Piala Dunia) Tahun 1974.\n" +
                    "\n" +
                    "Tip and Tap mewakili suara-suara persatuan dan persaudaraan yang tidak terkekang pada perbedaan warna kulit dan rambut. Konon, Tip and Tap menjadi ruh dari bersatunya Jerman Barat dan Timur pada 1990 dengan diruntuhkannya Tembok Berlin.\n" +
                    "\n" +
                    "Sama seperti Willie, Tap and Tap membawa keberuntungan bagi timnas Jerman. Di laga final Jerman mengandaskan Belanda untuk kemudian merengkuh gelar juara dunia ketiga.",
            "Gauchito atau Gaucho yang memiliki arti penunggang kuda menjadi maskot Piala Dunia selanjutnya. Kali ini Argentina ditunjuk sebagai tuan rumah.\n" +
                    "\n" +
                    "Gauchito yang mengenakan seregam Argentina sengaja diberi syal di leher berwarna kuning, mengenakan topi koboi, dan menggengam cambuk. Entah mengapa Argentina lebih memilih pendekatan seorang penunggang kuda ketimbang tarian Tango.\n" +
                    "\n" +
                    "Maskot tersebut pun sempat memercik kontroversi lantaran muncul loga Puma di seragam Gauchito. Padahal timnas Argentina saat itu disponsori Adidas.",
            "Naranjito mungkin satu-satunya maskot yang digunakan dalam ajang olahraga yang mewakili buah-buahan. Namun, jika melihat Spanyol sebagai tuan rumah, maka tidak heran jeruk dijadikan inspirasi sebagai maskot.\n" +
                    "\n" +
                    "Selain aksi gladiator manusia versus banteng atau biasa disebut matador, jeruk juga menjadi simbol nasional. Uniknya, Naranjito yang merupakan jeruk besar memegang bola itu mampu mengalahkan 586 kandidat.",
            "Bak tidak ingin kalah dengan maskot empat tahun sebelumnya yang terinspirasi dari buah jeruk, Meksiko yang kembali menjadi tuan rumah menjagokan cabai jalapeno. Cabai yang menjadi ciri khas dari masakan Meksiko itu dijadikan maskot dan diberi nama Pique.\n" +
                    "\n" +
                    "Tak hanya jalapeno yang menyiratkan identitas Meksiko, Pique diberi kumis melintang khas Amerika Latin lengkap dengan menggunakan topi Sombrero. Nama Pique berasal dari kata picante yang artinya cabai.",
            "Prestasi sejumlah klub Serie A di kancah Eropa membawa seluruh pemain terbaik dunia tumplek-blek di Italia dalam gelaran Piala Dunia 1990. Gengsi Italia sebagai salah satu kiblat sepak bola memaksa Piala Dunia kali harus berbeda dari sebelumnya. Ciao merupakan perbedaan unik Piala Dunia 1990 dari segi maskot. Susunan balok yang menyerupai pesepak bola dengan kepala yang juga si kulit bundar dipilih sebagai maskot. Susunan balok, yang mungkin hari ini kita sebut lego, menguatkan jati diri Italia dengan masuknya Tricolore Italia, yakni merah, putih, hijau (bendera Italia). Sedangkan nama Ciao diambil dari kebiasaan orang Italia dalam mengucap salam dalma kehidupan sosial. Maskot Ciao juga berangkat dari game tetris yang sedang tren saat itu. Yakni sebuah game dengan misi menenpatkan setiap bangun ruang secara tepat dan saling mengunci.",
            "Setelah Inggris, Amerika Serikat menjadi tuan rumah selanjutnya yang menggunakan karakter hewan sebagai maskot. Seekor anjing mengenakan seragam berwarna merah, putih, dan biru bertuliskan USA 94 diberi nama Striker.\n" +
                    "\n" +
                    "Kabarnya pemilihan anjing sebagai maskot lantaran hewan berkaki empat itu menjadi peliharaan favorit masyarakat Amerika Serikat. Sementara burung elang yang menjadi simbol kenegaraan justru tidak dipilih.",
            "Maskot yang terinspirasi dari binatang kembali muncul pada gelaran Piala Dunia 1998 di Prancis. Maskot tersebut diberi nama Footix yang merupakan seekor ayam jantan.\n" +
                    "\n" +
                    "Maskot tersebut dipilih lantaran Les Blues menjadikan unggas tersebut sebagai logo sekaligus menjadi julukan. Footix memiliki identitas bertubuh biru, berjengger merah dan berparuh kuning. Warna-warna tersebut merupakan identitas timnas Prancis.",
            "Ato, Nik, dan Kaz makhluk Spheriks yang tinggal di Atmozone yang juga merupakan pemain Atmoball atau sepak bola. Ketiga merupakan karakter khayalan yang sesungguhnya tidak memiliki makna ataupun kedekatan budaya dengan Jepang dan juga Korsel.\n" +
                    "\n" +
                    "Korsel dan Jepang menjadi tuan rumah hajatan sepak bola terbesar di bumi bersamaan dengan milenium baru. Maka wajar maskot yang dipilih menunjukkan imajinasi kedua negara di era yang baru.",
            "Goleo merupakan seekor singa dengan menggunakan seragam Jerman bernomor 06 yang mewakili tahun penyelenggaraan 2006. Sementara Pille merupakan bola sepak yang dapat berbicara.\n" +
                    "\n" +
                    "Goleo merupakan lakuran antara kata gol dan leo. Maka, secara harfiah Goleo bermakna singa gol. Sementara Pille merupakan kata sehari-hari untuk menyebut sepak bola.",
            "Zakumi merupakan seekor leopard atau macan tutul kecil dengan rambut hijau. Nama Zakumi juga lakuran yang diambil dari kode internasional Afrika Selatan yang biasa disingkat ZA. Sedangkan Kumi dalam bahasa setempat berarti 10 atau merujuk pada tahun penyelenggaran Piala Dunia.",
            "Armadillo yang merupakan hewan endemik di Brazil didaulat menjadi maskot Piala Dunia 2014. Hewan omnivora yang banyak hidup di wilayah Amerika Selatan dan Utara jumlahnya kian menepis, Bahkan khusus di wilayah Brazil Armadillo mendekati kepunahan.\n" +
                    "\n" +
                    "Terpilihnya Fuleco oleh 1,7 juta orang selain mengalahkan kandidat lain seperti Zuzeco dan Amijubi juga memiliki pesan terkait kesadaran lingkungan.",
            "Maskot Piala Dunia kali ini berwujudkan seekor serigala mengenakan kaca mata olahraga dan mengenakan baju berwana putih biru serta celana merah. Warna tersbeut merujuk pada warana bendera kebangsaan Rusia.\n" +
                    "\n" +
                    "Sementara, Zabivaka merupakan istilah warga Rusia dalam menyebut seseorang yang mencetak gol."
    };

    private static int[] maskotImage = {
            R.drawable.willie,
            R.drawable.juanito,
            R.drawable.tipntap,
            R.drawable.gauchito,
            R.drawable.naranjito,
            R.drawable.pique,
            R.drawable.ciao,
            R.drawable.striker,
            R.drawable.footix,
            R.drawable.nikatokaz,
            R.drawable.goleo,
            R.drawable.zakumi,
            R.drawable.fuleco,
            R.drawable.zabivaka
    };

    static ArrayList<Maskot> getListData() {
        ArrayList<Maskot> list = new ArrayList<>();
        for (int position = 0; position < maskotNames.length; position++) {
            Maskot maskot = new Maskot();
            maskot.setName(maskotNames[position]);
            maskot.setDetail(maskotDetail[position]);
            maskot.setInfo(maskotInfo[position]);
            maskot.setPhoto(maskotImage[position]);
            list.add(maskot);
        }
        return list;
    }
}
