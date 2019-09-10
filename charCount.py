message = 'It was a birhgt cold day in April, and the clocks were ticking.'
count = {} # 'r':12

for character in message.upper():
    count.setdefault(character,0)
    count[character] = count[character] + 1

print(count)