# TUGAS-4
1a. Bubblesort : Bubble sort adalah algoritma pengurutan sederhana. Algoritma penyortiran ini adalah algoritma berbasis perbandingan di                    mana setiap pasangan elemen yang berdekatan dibandingkan dan elemen-elemen bertukar jika mereka tidak berurutan smpai                      mereka berurutan.        
                 swapped = true while swapped swapped = false for j from 0 to N - 1 if a[j] > a[j + 1] swap( a[j], a[j + 1] ) swapped =                    true 
1b. Insertionsort : Insertion sort adalah sebuah metode pengurutan data dengan menempatkan setiap elemen data pada pisisinya dengan cara                       melakukan perbandingan dengan data – data yang ada.
                    //Array A = {1...n} //Sort algorithm for i = 2 to n j = i while j > 1 if A[j] < A[j - 1] swap A[j] and A[j - 1] j = j                     - 1
1c. Selectionsort : mencari elemen yang tepat untuk diletakkan di posisi yang telah diketahui, dan meletakkannya di posisi tersebut                           setelah data tersebut ditemukan, Selection Sort Membandingkan elemen yang sekarang dengan elemen yang berikutnya                           sampai dengan elemen yang terakhir.
                    Pseudocode of Selection Sort SELECTION-SORT(A) for j ← 1 to n-1 smallest ← j for i ← j + 1 to n if A[ i ] < 
                    A[smallest ] smallest ← i Exchange A[ j ] ↔                    
1d. Mergesort : membagi array data yang diberikan menjadi dua bagian yang lebih kecil. Kedua array yang baru tersebut kemudian akan                       diurutkan secara terpisah. Setelah kedua buah list tersusun, maka akan dibentuk array baru sebagai hasil penggabungan dari                 dua buah array sebelumnya.                    
                func mergesort( var a as array ) if ( n == 1 ) return a
                var l1 as array = a[0] ... a[n/2] var l2 as array = a[n/2+1] ... a[n]
                l1 = mergesort( l1 ) l2 = mergesort( l2 )
                return merge( l1, l2 ) end func
                func merge( var a as array, var b as array ) var c as array
                while ( a and b have elements ) if ( a[0] > b[0] ) add b[0] to the end of c remove b[0] from b else add a[0] to the end of                 c remove a[0] from a while ( a has elements ) add a[0] to the end of c remove a[0] from a while ( b has elements ) add                     b[0] to the end of c remove b[0] from b return c end func.
1e. Shellsort : algoritma penyortiran yang sangat efisien dan didasarkan pada algoritma penyortiran. Algoritma ini menghindari                           pergeseran besar seperti dalam kasus penyisipan, jika nilai yang lebih kecil ada di kanan maka harus                                     dipindahkan ke paling kiri. Algoritma ini menggunakan semacam penyisipan pada elemen yang tersebar luas, pertama untuk                   mengurutkannya dan kemudian mengurutkan elemen yang kurang luas. Jarak ini disebut sebagai interval.
                     procedure shellSort()
                        A : array of items 
                     /* calculate interval*/
                     while interval < A.length /3 do:
                       interval = interval * 3 + 1	    
                     end while   
         while interval > 0 do:
      for outer = interval; outer < A.length; outer ++ do:
      /* select value to be inserted */
      valueToInsert = A[outer]
      inner = outer;
         /*shift element towards right*/
         while inner > interval -1 && A[inner - interval] >= valueToInsert do:
            A[inner] = A[inner - interval]
            inner = inner - interval
         end while
      /* insert the number at hole position */
      A[inner] = valueToInsert
      end for
         /* calculate interval*/
          interval = (interval -1) /3;	  
            end while   
          end procedure
1f. Quicksort : Algoritma pengurutan yang sangat cepat dengan tipe penyelesaian divide and conquer. sehingga cocok untuk mengurutkan                     data dalam jumlah besar. Proses pengurutan Quick Sort adalah sebagai berikut:
                Quicksort(A,p,r) { if (p < r) { q <- Partition(A,p,r) Quicksort(A,p,q) Quicksort(A,q+1,r) } }
                Partition(A,p,r) x <- A[p] i <- p-1 j <- r+1 while (True) { repeat j <- j-1 until (A[j] <= x) repeat i <- i+1 until                     (A[i] >= x) if (i A[j] else return(j) } }
1g. Linearsearch : algoritma pencarian yang sangat sederhana. Dalam jenis pencarian ini, pencarian berurutan dibuat atas semua item satu                    per satu. Setiap item dicentang dan jika kecocokan ditemukan maka barang tertentu itu dikembalikan, jika tidak                          pencarian terus berlanjut sampai akhir pengumpulan data.
                     procedure linear_search (list, value)
                       for each item in the list
                      if match item == value
                    return the item's location
                         end if
                           end for
                           end procedure
1h. Binarysearch : algoritma pencarian cepat dengan kompleksitas run-time Ο (log n). Algoritme pencarian ini bekerja berdasarkan prinsip                    membagi. Agar algoritme ini berfungsi dengan baik, pengumpulan data harus dalam bentuk yang diurutkan.
                   Pencarian item tertentu dengan membandingkan item paling tengah dari koleksi. Jika kecocokan terjadi,                                    maka indeks barang dikembalikan. Jika item tengah lebih besar dari item, maka item tersebut dicari dalam sub-array di                    sebelah kiri item tengah. Jika tidak, item tersebut dicari dalam sub-array di sebelah kanan item tengah. Proses ini                      berlanjut sampai ukuran subarray berkurang menjadi nol.
                         Procedure binary_search
                    A ← sorted array
                    n ← size of array
                    x ← value to be searched
                        Set lowerBound = 1
                       Set upperBound = n 
                    while x not found
                     if upperBound < lowerBound 
                       EXIT: x does not exists.
      set midPoint = lowerBound + ( upperBound - lowerBound ) / 2
      if A[midPoint] < x
         set lowerBound = midPoint + 1
      if A[midPoint] > x
         set upperBound = midPoint - 1 
      if A[midPoint] = x 
         EXIT: x found at location midPoint
   end while
end procedure
1i.Hashtable : struktur data yang menyimpan data dengan cara asosiatif. Dalam tabel hash, data disimpan dalam format array, di mana                    setiap nilai data memiliki nilai indeks uniknya sendiri. Akses data menjadi sangat cepat jika kita tahu indeks data yang                diinginkan.
               Dengan demikian, itu menjadi struktur data di mana penyisipan dan operasi pencarian sangat cepat terlepas dari ukuran                    data. Hash Table menggunakan teknik hash untuk menghasilkan indeks di mana elemen harus dimasukkan atau akan ditempatkan                dari.
               Contoh Pseudokode : ecord pair { key, value }
                     var pair array slot[0..numSlots-1]
 
                       function findSlot(key)
                         i := hash(key) modulus numSlots
                                    loop
         if slot[i] is not occupied or slot[i].key = key
             return i
         i := (i + 1) modulus numSlots
 
 function lookup(key)
     i := findSlot(key)
     if slot[i] is occupied   // key is in table
         return slot[i].value
     else                     // key is not in table
         return not found     
 
 function set(key, value)
     i := findSlot(key)
     if slot[i].key = key
         // (Key already in table. Update value.)
         slot[i].value := value
     else
         // (Insert key and value in un-occupied slot.)
         // (But first, make sure insert won't overload the table)
         if the table is almost full
             rebuild the table larger (note 1)
             i := findSlot(key)
         slot[i].key   := key
         slot[i].value := value
                 























