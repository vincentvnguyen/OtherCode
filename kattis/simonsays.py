num = input()

for i in range(0, int(num)):
    line = input()
    if line[:11] == "Simon says ":
        print(line[11:])