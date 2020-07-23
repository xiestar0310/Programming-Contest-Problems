#include <stdio.h>
#include <stdlib.h>
int main(){
    int num, guest, invited, way[7]={1,1,1,1,1,1,1};
    scanf("%d", &num);
    for(guest=1; guest<num; guest++){
        scanf("%d", &invited);
        way[invited] = way[invited]*(1 + way[guest]);
    }

    printf("%d\n", way[num]);
    return 0;
}
