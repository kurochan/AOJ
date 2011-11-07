#include <stdio.h>

int main()
{
    int n,i,temp;
    int s=100000;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        s+=s*0.05;
        temp=s%1000;
        if(temp>0){
            s-=temp;
            s+=1000;
        }
    }
    printf("%d\n",s);
    return 0;
}
