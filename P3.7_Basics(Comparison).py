m=int(input());
n=int(input());
sum1=0;
sum2=0;
for i in range (2,m):
    if m%i==0:
        sum1=sum1+i;
for i in range (2,n):
    if n%i==0:
        sum2=sum2+i;
if sum1>sum2:
    print(m);
elif sum1<sum2:
    print(n);
else:
    print("No dominance");
