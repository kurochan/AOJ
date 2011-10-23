#include <stdio.h>

int main()
{
    int n,a,b,c;
    int isTriangle;
    scanf("%d",&n);
    while(n--){
        isTriangle=0;
        scanf("%d",&a);
        scanf("%d",&b);
        scanf("%d",&c);
        a*=a;
        b*=b;
        c*=c;
        if((a+b)==c){
            isTriangle=1;
        }
        if((a+c)==b){
            isTriangle=1;
        }
        if((b+c)==a){
            isTriangle=1;
        }
        if(isTriangle){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
    return 0;
}
