from typing_extensions import TypeVarTuple


class Sieve:

    ma = 10**9 + 7
    array = [1 for i in range(ma)]
    print(array)
    compute = False

    def sieve(self):
        self.compute = True

        for i in range(2, self.ma):
            if self.array[i] == 1:
                k = 2 * i  # 6
                while(k**2 < self.ma):
                    self.array[k] = 0
                    k += i  # 9, 12, 15, 18, 21, 24
            else:
                continue

    def isPrime(self, num):
        if not self.compute:
            self.sieve()

        print(self.array)

        return True if self.array[num] == 1 else False


if __name__ == "__main__":
    s = Sieve()

    print(s.isPrime(13))
