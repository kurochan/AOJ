#include <stdio.h>

int main()
{
    int i,h,h1=0,h2=0,h3=0;
    for(i=0;i<10;i++){
        scanf("%d",&h);
        if(h>h1){
            h3=h2;
            h2=h1;
            h1=h;
        }else if(h>h2){
            h3=h2;
            h2=h;
        }else if(h>h3){
            h3=h;
        }
    }
    printf("%d\n",h1);
    printf("%d\n",h2);
    printf("%d\n",h3);
    return 0;
}
