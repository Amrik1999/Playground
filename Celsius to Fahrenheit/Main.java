#include <stdio.h>
float fahrenheit(float celsius);
float kelvin(float celsius);
int main()
{
    float celsius;
    scanf("%f",&celsius);
    printf("temperature in Fahrenheit %f", fahrenheit(celsius));
    printf("\ntemperature in Kelvin %f", kelvin(celsius));
    return 0;
}
float fahrenheit(float celsius)
{
	float f=9.0/5.0 * (celsius) + 32;
  return f;
}
float kelvin(float celsius)
{
	float k= celsius + 273.15;
  return k;
}
