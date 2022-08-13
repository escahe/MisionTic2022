i = int(input())
sumAltura = 0.00
sumTemperatura = 0.00
conteoSumaApto = 0
conteoModApto = 0
conteoMargApto = 0
conteoNoApto = 0
while i != 0:
    altura = float(input())
    temperatura = float(input())
    sumAltura += altura
    sumTemperatura += temperatura
    if altura > 1200 or temperatura < 18 or temperatura > 32:
        conteoNoApto += 1
    elif (altura >= 1000 and altura <= 1200) or (temperatura >= 31 and 
            temperatura <= 32) or (temperatura >= 18 and temperatura <= 20):

        conteoMargApto += 1
    elif altura < 400 or (altura >=801 and altura <= 999) or (temperatura >= 29 and 
            temperatura <= 30) or (temperatura >= 21 and temperatura <= 24):

        conteoModApto += 1
    elif (altura >= 400 and altura <= 800) or (temperatura >= 25 and 
            temperatura <= 28):
            
        conteoSumaApto += 1
    i-= 1
j = conteoSumaApto + conteoModApto + conteoMargApto + conteoNoApto
print('{:.2f}'.format(sumAltura/j,2))
print('{:.2f}'.format(sumTemperatura/j,2))
print("sumamente apto",conteoSumaApto)
print("moderadamente apto",conteoModApto)
print("marginalmente apto",conteoMargApto)
print('no apto', conteoNoApto)