dice = input().split()
intdice = []
for die in dice:
    intdice.append(int(die))
maxdie = int(max(intdice))
mindie = int(min(intdice))
for num in range (maxdie - mindie + 1):
    print(num + 1 + mindie)