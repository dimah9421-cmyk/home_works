#include <stdio.h>
#include <stdint.h>

int main(){
    uint16_t a;
    printf("a = ");
    scanf("%hi",&a);

    uint32_t b;
    __asm {
        mov ECX, a
        mov b, ECX
    }

    printf("b = %hi",b);
}