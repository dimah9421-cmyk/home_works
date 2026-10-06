// Хоменко Дмитрий ИВТ 25-1 
// выр 20 
#include <stdio.h>
#include <stdint.h>

int main(){
    char a1;
    short b1;
    int c1;
    printf("введите a1 = ");
    scanf("%c", &a1);
    printf("введите b1 = ");
    scanf("%hd", &b1);
    printf("введите c1 = ");
    scanf("%d", &c1);

    char a2;
    short b2;
    int c2;
    __asm {
        mov AH, a1
        mov BX, b1
        mov EDX, c1
    
        mov a2, AH
        mov b2, BX
        mov c2, EDX 
    }
    printf("a2 = %c\n", a2);
    printf("b2 = %d\n", b2);
    printf("c2 = %d\n ", c2);
}