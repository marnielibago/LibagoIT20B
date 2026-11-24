 # Sorting Algorithms Activity

## Program Overview
This Java program is nagpakita kon giunsa pag-work ang Bubble Sort, Selection Sort, ug Insertion Sort. Mokuha ni ug lista sa mga numbers nga wala pa naarrange ug iarrange ni sila gikan sa pinakaubos padulong sa pinakataas gamit ning tulo ka Sorting Algorithms.
---

## How Each Sorting Algorithm Works

### 1. Bubble Sort
Ang Bubble Sort mag-check og duha ka number nga nagtupad, unya i-swap niya sila kon sayop ang ilang pagkasunod.Then mag sieg dayon og balik-balik ni hangtod  nga ang pinakadakong mga number mo-"bubble up" na padulong sa last ug ma-sort na ang tanan lista.

### 2. Selection Sort
Ang Selection Sort mobahin bahin sa lista gikan sa sorted ug unsorted nga bahin. Sa kada round, mangita ni sa pinakagamay nga number sa unsorted, unya i-swap na niya sa sunod nga pwesto sa sorted nga side.

### 3. Insertion Sort
Ang Insertion Sort mo-sort sa lista og tagsa-tagsa ka number. Mokuha ni sa sunod nga unsorted nga number unya i-shift  niya padulong sa right ang mga mas dagkong numbers hangtod nga makita ang sakto nga pwesto para ana nga numbers.

---

## Differences Between the Three Sorting Algorithms
- **Bubble Sort** sige lang og balik-balik og swap sa mga apad nga numbers.
- **Selection Sort** mangita una sa pinakagamay nga numbers, maong kausa ra mo-swap kada pass.
- **Insertion Sort** i-shift lang ang mga numbers aron masulod ang kada item sa saktong pwesto imbes nga sige og swap sa mga pares.
---

## Reflection Questions

### 1. How does each sorting algorithm arrange numbers? What makes their processes different?
- **Bubble Sort** gina push ang mga dagko na numbers padulong sa last in a way nga makuan sa sige og swap sa mga apad nga numbers.
- **Selection Sort** mangita sa pinakagamay nga numbers ug ibalhin sa atubangan.
- **Insertion Sort** mo kuha og usa ka numbers ug i-slide padulong sa iyang saktong pwesto kauban sa mga na-sort na nga numbers.
- **What makes them different:** Ang Bubble Sort magbase sa sige og swap, ang Selection Sort mangita una sa pinakagamay nga value, ug ang Insertion Sort mo-shift sa mga element aron diretso nga masulod ang mga item sa ilang saktong pwesto.

### 2. Among the three sorting algorithms, which one do you think is the easiest to understand and implement? Why?
**Bubble Sort** mao ni ang pinakasayon sabton tungod kay diretso ra kaayo ang pag-compare sa duha ka tapad nga numbers ug pag-swap ani, ug simple ra nga mga loop ang kinahanglan.

### 3. If the numbers are already sorted, which algorithm do you think would perform better? Explain your answer based on how the algorithms work.
**Insertion Sort** works best sa lista nga daan nang naka-sort tungod kay i-check ra niya ang kada number base sa numbers nga nag-una ani, makita nga sakto na ang pagsunod sunod, ug padayon na dayon nga walay gi-shift. Ang Selection Sort mag-scan gihapon sa tibuok unsorted nga base sa kada each time bisan og walay dapat ibalhin.
### 4. What will happen if you add more numbers to your array? How might this affect the performance of each sorting algorithm?
If I add more numbers, mo-run nga mas hinay gyud kaayo. Tungod kay naggamit  og nested loops, pagdugang og mas daghang numbers mag-multiply sa kadaghan sa mga ipagcompare ug swap nga kinahanglan nilang buhaton.

### 5. As a future programmer, why is it important to understand different sorting algorithms instead of using just one?
Ang lain-laing programs mag-handle og lain-laing nga kadaghanon sa data ug naay lain-laing kinahanglanon sa speed o memory. Ang pagkahibalo og daghang sorting algorithms makatabang sa mopili sa kuan pinakamaayong  para sa trabaho imbes nga ipugos ang isa ka hinay nga method.
