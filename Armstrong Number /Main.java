
  #include <stdio.h>
int main()
{
    int number, originalNumber, remainder, result = 0;

   
    scanf("%d", &number);

    originalNumber = number;

    while (originalNumber != 0)
    {
        remainder = originalNumber%10;
        result += remainder*remainder*remainder;
        originalNumber /= 10;
    }

    if(result == number)
        printf("Armstrong Number",number);
    else
        printf("Not an Armstrong Number",number);

    return 0;

}