1. variable 72
2. String Template 72
3. Basic Type 73
4. Collection 76 
   1. List 76 : ordered collection, allow duplicate
   2. Set 77  : unordered collection, only store unique value
   3. Map 79  : set of key-value pair, unique key, allow duplicate value
5. Control FLow 
   1. If 82 
   2. When 83
   3. Range 86 
   4. For 
   5. While 
6. Function 
   1. Basic Function 1
   3. NamedArguments
   4. Default Value Parameter
   5. No Return Function
   6. Single Expression
   7. Early Return In Function 
   8. Function Exercise 1 
   9. Function Exercise 2
   10. Function Exercise 3  
   11. Lambda Expression
   12. (Lambda) Pass To Other Function
   13. (Lambda) Function Type  
   14. (Lambda) Return From Other Function
   15. (Lambda) Invoke Separately 
   16. Tailing Lambdas
   17. Lambda Expression Exercise 1
   18. Lambda Expression Exercise 2
7. Class
   1. Properties
   2. Member Function
   3. Data Classes
   4. Exercise 1  
   5. Exercise 2 
   6. Exercise 3 
8. Null Safety 
   1. Nullable types
   2. Check for null values
   3. Use safe calls 
   4. Use Elvis operator 
   5. Exercise
9. Intermediate: Extension Function
   1. First Example
   2. Extension-oriented design  
      >Design yang memisahkan fungsi core (utama), dengan fungsi (tambahan) berguna lainnya tapi tidak essensial
      >   - Fungsi core / utama di tulis di dalam body class
      >   - Fungsi tambahan di tulis menggunakan extension 
   3. Exercise 1 
   4. Exercise 2
10. Intermediate: Scope Function 
    1. let:
       >- return hasil lambda
       >- akses member receiver dengan "it"
       >- biasanya di gunakan untuk cek apakah receiver null atau tidak, kalau tidak null 
         block scope akan di jalankan
    2. apply (tidak return value, nilai receiver bisa berubah, ketika di ubah di block scooping)
       >- return object receiver
       >- akses member object menggunakan "this" atau lansung di memanggil membernya
       >- biasanya di gunakan untuk inisiasi object receiver
    3. run (return value, nilai receiver tidak akan berubah, kalau pun diubah di block scooping)
       >- return hasil lambda
       >- akses member receiver dengan "this" atau panggil membernya langsung
       >- data member receiver tidak akan berubah, meski di ubah di dalam block scoping
    4. also
       >- return object receiver
       >- akses member object menggunakan "it"
    5. with
    6. Exercise 1 
    7. Exercise 2
    
       | Scope Function Type | retun            | akses_member       | note                            |
       |---------------------|------------------|--------------------|---------------------------------
       | let                 | return: lambda   | akses_member: it   | biasa digunakan cek null        |
       | apply               | return: receiver | akses_member: this | biasa digunakan inisiai  object |
       | run                 | return: lambda   | akses_member: this |                                 |
       | also                | return: receiver | akses_member: it   |                                 |

11. Intermediate: Lambda Expression With Receiver
    1. Contoh 1 
    2. Contoh 2   
    3. Exercise 1
    4. Exercise 2
    5. Exercise 3
12. Intermediate: Class and Interface
    1. Class inheritance
    2. Abstract Class
        >Abstract Class
        >- bisa memilik member abstract dan member yang ada implementasinya
        >- hanya bisa di extends
    3. Interface Implementation
    4. Delegation
    5. Exercise 1
    6. Exercise 2  
    7. Exercise 3
    8. Exercise 4
13. Intermediate: Object
    1. Object Declaration
    2. Data Object
    3. Companion Object
    4. Exercise 1
    5. Exercise 2
    6. Exercise 3
14. Intermediate: Open and Special Classes   
    1. Open Class
    2. Open Class & Interface
    3. Sealed Class (Special Class)
    4. Enum Class (Special Class) 
    5. Inline Value Class  (Special Class)
    6. Exercise 1
    7. Exercise 2
15. Intermediate: Properties
    1. Backing Fields
    2. Extension Properties
    3. Delegated Properties
    4. Standard Delegates: Lazy Properties
    5. Standard Delegates: Observable Properties
    6. Exercise 1
    7. Exercise 2
    8. Exercise 3 
    9. Exercise 4
16. Intermediate: Null safety
    1. Smart casts and safe casts
    2. Null values and collections
    3. Early return and the Elvis operator 
    4. Exercise 1
    5. Exercise 2 --> Next
    6. Exercise 3
    7. Exercise 4
17. Intermediate: Libraries and APIs

