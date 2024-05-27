# Втора лабораториска вежба по Софтверско инженерство
# Марија Блажевска, бр. на индекс 223049
Control flow graph


![CGF](https://github.com/marijablazevskaa/SI_2024_lab2_223049/assets/138380083/e843f983-0813-4528-ada5-9e79aba14543)


Цикломатска комплексност

Цикломатска комплексност на овој код е 10, да добив преку формулата E-N+2, односно бројот на ребра 36, минус бројот на јазли 28, потоа +2, па така цикломатската комплексност изнесува 10.

Тест случаи според критериумот Every Branch

![Screenshot (405)](https://github.com/marijablazevskaa/SI_2024_lab2_223049/assets/138380083/c6462485-e339-458e-a1c5-b0c736e6a8eb)



Тест случаи според критериумот Multiple Condition

![Screenshot (406)](https://github.com/marijablazevskaa/SI_2024_lab2_223049/assets/138380083/a3e2f847-931e-4d0d-bc54-b6621ae5308d)


Објаснување на напишаните unit tests

Со цел полесно да ги најдам сите branches во кодот одлучив да го користам дебагирањето во IntelliJ(котистејќи ги breakpoints) и Excel за внесување на резултатите.

![Screenshot (404)](https://github.com/marijablazevskaa/SI_2024_lab2_223049/assets/138380083/7fd670d7-8f69-46ee-9900-59fd19beb5fc)




Исто така, за multiple condition решив со помош на тафтологија да ги тестирам сите можни комбинации од три различни услови, 2^3, значи 8 случаи, иако за три изрази по дефиниција може да се истестира и само со 4 случаи(T-X-X->T, F-F-F->F, F-T-X->T, F-F-T->T). Користејќи assertTrue за првиот случај и assertFalse за сите останати случаи(може да се искористи и assertEquals), ги покрив различните ситуации. На пример, за вредносите кај F-T-T,вредноста на price ја ставив 120 бидејќи треба да е помало од 300 за да е false, за попустот ставив 1 за да е поголемо од 0, потоа за баркодот првата цифра ја поставив 0 за да биде true, додека name и payment за сите слуачи ги оставив marija и 120. На овој начин ги одредував вредностите за сите останати ситуации.



