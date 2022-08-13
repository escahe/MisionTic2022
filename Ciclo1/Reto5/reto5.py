import csv
id = int(input())
file = open('data.csv',mode='r', encoding='utf-8')
fileReader = csv.reader(file)
table = []
for rows in fileReader:
    if rows[5] == str(id):
        table.append(rows)
patientsToAssist = [[0,0],[0,0]]#[[nMales, medQntity], [nFemales,medQntity]]
for rows in table:
    sysPress = int(rows[8])
    diasPress = int(rows[9])
    if (sysPress < 91 and diasPress < 63) or (162 <= sysPress < 188 and 105 <= diasPress < 119
    ) or (188 <= sysPress < 201 and 119 <= diasPress < 126) or (201 <= sysPress < 214 and 
    126 <= diasPress < 146) or (sysPress >= 214 and diasPress >= 146) or (sysPress >= 152 
    and diasPress < 77):
        if rows[2] == 'm':
            patientsToAssist[0][0] += 1
            patientsToAssist[0][1] += int(rows[7])
        if rows[2] == 'f':
            patientsToAssist[1][0] += 1
            patientsToAssist[1][1] += int(rows[7])
print(table[0][5],table[0][3],table[0][4])
print('scheduled patients')
print('male',patientsToAssist[0][0])
print('female',patientsToAssist[1][0])
print('total', patientsToAssist[0][0]+patientsToAssist[1][0])
print('scheduled medicine quantity')
print('mean', round((patientsToAssist[0][1]+patientsToAssist[1][1])/(patientsToAssist[0][0]+patientsToAssist[1][0]),2))
print('total', patientsToAssist[0][1]+patientsToAssist[1][1])