# Втора лабораториска вежба по Софтверско инженерство
# Марија Блажевска, бр. на индекс 223049
Control flow graph


![CGF](https://github.com/marijablazevskaa/SI_2024_lab2_223049/assets/138380083/e843f983-0813-4528-ada5-9e79aba14543)


Цикломатска комплексност
Цикломатска комплексност на овој код е 10, да добив преку формулата E-N+2, односно бројот на ребра 36(ребро 9 и 10 ги ставив во еден јазол), минус бројот на јазли 28, потоа +2, па така цикломатската комплексност изнесува 10.

Тест случаи според критериумот Every Branch

![Screenshot (405)](https://github.com/marijablazevskaa/SI_2024_lab2_223049/assets/138380083/c6462485-e339-458e-a1c5-b0c736e6a8eb)



Тест случаи според критериумот Multiple Condition

![Screenshot (406)](https://github.com/marijablazevskaa/SI_2024_lab2_223049/assets/138380083/a3e2f847-931e-4d0d-bc54-b6621ae5308d)


Објаснување на напишаните unit tests

Со цел полесно да ги најдам сите branches во кодот одлучив да го користам IntelliJ.

![Screenshot (404)](https://github.com/marijablazevskaa/SI_2024_lab2_223049/assets/138380083/7fd670d7-8f69-46ee-9900-59fd19beb5fc)




Исто така, за multiple condition решив со помош на тафтологија да ги тестирам сите можни комбинации од три различни услови, 2^3, значи 8 случаи. Користејќи assertTrue за првиот случај(бидејќи се очекува сите три слуачи да бидат вистинити) и assertFalse за сите останати случаи, ги покрив различните ситуации.



