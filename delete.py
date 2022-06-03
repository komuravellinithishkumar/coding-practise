f = open('C:\\Users\\komur\\OneDrive\\Desktop\\dbms\\Data\\data\\orders.sql', "r+")
arr = f.read().split('\n')[3217491:]
file = open(
    "C:\\Users\\komur\\OneDrive\\Desktop\\dbms\\Data\\data\\order12.sql", "w+")
# count =0
for i in arr:
    # count=count+1
    file.write(str(i) + '\n')
file.close()
f.close()
# print(count)
