while True:
    leer = input().split()
    n = int(leer[0])
    k = int(leer[1])
    m = int(leer[2])
    if n >= 1 and k >= 1:
        break
inventario = []
for i in range(n):
    leer = input().split()
    for j in range(k):
        leer[j] = int(leer[j])
    inventario.append(leer)
pacientes = []
for i in range(m):
    leer = input().split()
    for j in range(5):
        leer[j] = int(leer[j])
    pacientes.append(leer)
dosis = []
post_inventario = []
for i in range(len(inventario)):
    dosis.append([0]*len(inventario[0]))
    post_inventario.append([0]*len(inventario[0]))
for i in range(m):
    if 0 > pacientes[i][0] > n or 0 > pacientes[i][1] > k or pacientes[i][2] < 0:
        continue
    pSis = pacientes[i][3]
    pDias = pacientes[i][4]
    if (pSis < 72 and pDias < 65) or (124 <= pSis < 138 and 81 <= pDias < 93) or (
        138 <= pSis < 156 and 93 <= pDias < 102) or (156 <= pSis < 175 and 102 <= pDias <114
        ) or (pSis >= 175 and pDias >= 114) or (pSis >= 136 and pDias < 92):
        dosis[pacientes[i][0] - 1][pacientes[i][1] - 1] += pacientes[i][2]
for i in range(n):
    for j in range(k):
        post_inventario[i][j] = inventario[i][j] - dosis[i][j]
dosis1 = []
for i in range(n):
    print(i+1)
    print(post_inventario[i].index(min(post_inventario[i]))+1, min(post_inventario[i]))
    print(post_inventario[i].index(max(post_inventario[i]))+1, max(post_inventario[i]))
    total = 0
    for j in range(k):
        total += dosis[i][j]
    print('{:.2f}'.format(min(dosis[i])), '{:.2f}'.format(total/k), '{:.2f}'.format(max(dosis[i])))
    cuentaPacientes = 0
    for j in range(m):
        if pacientes[j][0] == i+1:
            cuentaPacientes += 1
    if cuentaPacientes == 0:
        print('0.00')
    else:
        print('{:.2f}'.format(total/cuentaPacientes))
    dosis1.append(dosis[i][0])
print((dosis1.index(min(dosis1))+1), min(dosis1))
print((dosis1.index(max(dosis1))+1), max(dosis1))