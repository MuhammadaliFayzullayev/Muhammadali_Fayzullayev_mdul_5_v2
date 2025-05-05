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
## 