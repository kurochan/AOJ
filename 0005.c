#include <stdio.h>

unsigned long gcd(unsigned long a,unsigned long b)
{
    unsigned long q;
    while(q=a%b){
        a=b;
        b=q;
    }
    return b;
}

unsigned long lcm(unsigned long a,unsigned long b)
{
    return (a/gcd(a,b))*b;
}

int main()
{
    unsigned long a,b;
    while(~scanf("%ld %ld",&a,&b)){
        printf("%ld %ld\n",gcd(a,b),lcm(a,b));
    }
    return 0;
}
