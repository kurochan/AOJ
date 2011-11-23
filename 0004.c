#include <stdio.h>

int main()
{
    int a,b,c,d,e,f;
    float x,y;
    while(scanf("%d %d %d %d %d %d",&a,&b,&c,&d,&e,&f)!=EOF){
        y=(c*d-a*f)/(b*d-a*e);//+0.0005;        
        x=(c-b*y)/a;//+0.0005;
        printf("%0.3f %0.3f\n",x,y);
    }
    return 0;

}
