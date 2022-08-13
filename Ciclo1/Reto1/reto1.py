altura = float(input())
temperatura = float(input())
if altura > 1200 or temperatura < 18 or temperatura > 32:
  print('No Apto')
elif (altura >= 1000 and altura <= 1200) or (temperatura >= 31 and temperatura <= 32) or (temperatura >= 18 and temperatura <= 20):
  print('Marginalmente Apto')
elif altura < 400 or (altura >=801 and altura <= 999) or (temperatura >= 29 and temperatura <= 30) or (temperatura >= 21 and temperatura <= 24):
  print('Moderadamente Apto')
elif (altura >= 400 and altura <= 800) or (temperatura >= 25 and temperatura <= 28):
  print('Sumamente Apto')