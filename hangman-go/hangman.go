package main

import (
	"bufio"
	"fmt"
	"io/ioutil"
	"math/rand"
	"os"
	"strings"
	"time"
)

var lives int = 6
var words []string
var target, hidden string

func main() {
	initialize()
}

func initialize() {

	// Get words
	loadFile()

	// Pick target word
	target = words[generateRandNum()]

	// Hide target words letters
	hidden = strings.Repeat("*", len(target))

	// Start game
	game()
}

func generateRandNum() int {
	rand.Seed(time.Now().UnixNano())
	return rand.Intn(len(words))
}

// Reads words from text file
func loadFile() {
	// Read text file
	content, err := ioutil.ReadFile("words.txt")
	if err != nil {
		fmt.Println(err)
	}

	s := strings.Fields(string(content))
	words = s
}

func game() {
	reader := bufio.NewReader(os.Stdin)
	for lives != 0 {
		fmt.Println(hidden)
		// Take input
		char, _ := reader.ReadString('\n')

		// Check character
		ans := checkInput(strings.TrimSpace(char))
		if !ans {
			fmt.Println("wrong guess!!!")
			lives--
			continue
		} else {
			fmt.Println("correct guess!!!")
		}
	}
	fmt.Println("word was: ", target)
}

func checkInput(char string) bool {
	hiddenArr := strings.Split(hidden, "")

	var ans bool = false
	for i, v := range target {
		if strings.Compare(string(v), char) == 0 {
			hiddenArr[i] = char
			ans = true
		}
	}

	hidden = strings.Join(hiddenArr, "")
	return ans

}
