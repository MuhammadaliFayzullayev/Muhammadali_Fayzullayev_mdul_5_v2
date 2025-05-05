## 1)
## Thread bu bir protsesda mustaqil ish bajaruvchi birlik
## 2)
## Multitasking – bir nechta dasturlarni bir vaqtda bajarish (OS darajasida).
## Multithreading – bir dastur ichida bir nechta vazifani bir vaqtda bajarish
## 3)
##  ThreadPool – oldindan yaratilgan threadlar to‘plami. Ko‘p vazifalarni navbat bilan threadlarga topshiradi. Tezroq va samarali ishlaydi
## 4)
## Runnable hech narsa qaytarmaydi (void run())
## Callable qiymat qaytaradi (V call() throws exception)
## 5)
## Future – kelajakda hisoblab chiqiladigan natijani ushlab turuvchi obyekt. Asosan Callable bilan ishlatiladi.
## 6)
## Future – natijani kutib turadi (blocking).
## CompletableFuture – non-blocking, chaining (async pipeline) imkoniyatini beradi.
## 7)
## volatile – o‘zgaruvchining qiymati har doim RAMdan o‘qilsin. Threadlar o‘zgarishni real vaqtda ko‘rishi uchun.
## 8)
## Thread-safe
## Caching, predictability uchun
## Shartlari:
## Class final bo‘lishi kerak
## Fieldlar private va final
## No setter
## Defensive copy ishlatish
## 9)
## Kodning bajarilishi ketma-ket emas, vazifa fon rejimida bajariladi va tugagach natijasi olinadi.
## 10)
## Compare-And-Swap (CAS) algoritmi orqali ishlaydi. Lock emas, atomik CPU instruktsiyalari yordamida.
## 11)
## Serialization – obyektni byte stream’ga aylantirish.
## Deserialization – byte stream’dan obyektni tiklash.
## 12)
## Serializable – Java default serialization.
## Externalizable – developer readExternal / writeExternal metodlarini qo‘lda yozadi, ko‘proq nazorat.
## 13)
## synchronized – method yoki block’da faqat 1 thread’ga ruxsat beradi.
## ReentrantLock – qo‘lda lock/unlock boshqariladi, flexible.
## Atomic classes – (AtomicInteger, AtomicBoolean) CAS orqali thread-safe o‘zgarishlar.
## 14)
## Dastur ishlashi haqida yozuvlar olib borish (debug, info, error).
## 15)
## Fon thread bo‘lib, asosiy threadlar tugasa, u ham avtomatik tugaydi (masalan: garbage collector).
## 16)
## JAR (Java ARchive) — bu Java dasturlari uchun arxivlangan fayl bo‘lib, .class fayllar, resurslar (rasmlar, matnlar) va META-INF metadata faylini o‘z ichiga oladi.
## jar fayl — Java dasturini tarqatish yoki ishga tushirish uchun qulay shakldir.
## 17)
## Maven — Java loyihalarini boshqarish va build qilish vositasi.
## U quyidagilarni avtomatlashtiradi:
## Kutubxonalarni yuklash (pom.xml fayl orqali)
## Dastur tuzish (compile), test qilish, JAR yaratish
## Loyihani tuzilmasini standartlashtirish
## Maven'ning asosiy fayli: pom.xml (dependencies, plugins va h.k. shu yerga yoziladi)
## 18)
## Behavior parameterization — bu metodga xatti-harakatni (behavior) parametr sifatida uzatish.
## Java 8 dan boshlab lambda expressions orqali amalga oshiriladi.
## 19)
## Turi	Tavsif
## Imperative	Qanday bajarilishini yozasiz (step-by-step)
## Declarative	Nimani bajarish kerakligini yozasiz (nima emas, qanday)
## 20)
## ✅ Stream:
## Java 8 da kiritilgan
## Data oqimi (ma’lumotlar ustida zanjirsimon amallar bajarish)
## Lazily evaluated (kerak bo‘lmaguncha hisoblanmaydi)
## Immutable (o‘zgartirilmaydi)
## ✅ Collection:
## Ma’lumotlar to‘plami (List, Set, Map va h.k.)
## Ma’lumotlar saqlanadi va har doim mavjud
## Mutlaq (hammasi xotirada)