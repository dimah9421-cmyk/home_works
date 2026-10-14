    // Хоменко Дмитрий ИВТ-25
    // Вариант - 20

    #include <stdio.h>
    #include <stdlib.h>
    #include <stdint.h>

    int main(){
        int32_t a;
        int32_t result_a4, result_a12, result_a28;
        
        printf("a = ");
        scanf("%d",&a);
        
        __asm{
            mov EAX, [a]

            // Первая операция (a**2)
            imul EAX, EAX

            // Вторая операция (a**4)
            imul EAX, EAX

            // Запоминаем результат 
            mov result_a4, EAX

        }

        printf("a**4 = %d\n", result_a4);

        __asm{
            mov EAX, [a]
            // Первая операция a**2
            imul EAX, EAX
            
            // Вторая операция a**4
            imul EAX, EAX

                // EBX == a**4
                mov EBX, EAX
            
            // Третия операция a**8
            imul EAX, EAX

            // Четвертая оперция a**12
            imul EAX, EBX

            mov result_a12, EAX
        }

        printf("a**12 = %d\n", result_a12);

        __asm{
            mov eax, [a]

            // Первая операция a**2
            imul eax, eax

            // Вторая операция a**4
            imul eax, eax
            
                // ebx == a**4
                mov ebx, eax

            // Третия операция a**8
            imul eax, eax

                // ecx == a**8
                mov ecx, eax
            
            // Четвертая операция a**16
            imul eax, eax

            // Пятая операция a**20
            imul eax, ebx
            
            // Шестая операция a**28
            imul eax, ecx

            mov result_a28,eax
        }
        printf("a**28 = %d", result_a28);
    }