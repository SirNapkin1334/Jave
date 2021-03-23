#include <stdio.h>

int main() {
	int myInt;
	scanf("%d", &myInt);
	if (myInt == 1 || myInt == 3) {
		printf("Yay!");
	} else printf("Aww!");
	return 0;
}
