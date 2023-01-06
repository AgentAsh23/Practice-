name=mypears
echo $name
a=10
echo $a
echo The integer is $a
bash --version 
b=10
c=5
d=$(($c + $b))
echo The addition of two numbers is $d
echo "Enter FIrst Number"
read num1
echo "ENter Second Number"
read num2
echo "Addition of two numbers is "$(($num1+$num2))
read num3
read num4
if [$num3 -lt$num4];
then
echo "$num4 is smaller than $num3"
else
echo "$num3 is smaller than $num4"
fi
