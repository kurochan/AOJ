#include <stdio.h>

int main()
{
    int i,w,charge=0;
    while(1){
        charge=0;
        scanf("%d",&w);
        if(w<0){
            break;
        }
        w-=10;
        charge+=1150;
        for(i=0;i<10&&w>0;i++){
            w--;
            charge+=125;
        }
        for(i=0;i<10&&w>0;i++){
            w--;
            charge+=140;
        }
        while(w>0){
            w--;
            charge+=160;
        }
        printf("%d\n",4280-charge);
    }
    return 0;
}
