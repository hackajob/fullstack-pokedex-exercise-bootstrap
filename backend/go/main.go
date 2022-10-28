package main

import (
	"fmt"
	"log"
	"net/http"
)

const (
	Host = "localhost"
	Port = "8080"
)

func main() {
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
	  fmt.Fprintf(w, "This is a Simple HTTP Web Server!")
	})

	err := http.ListenAndServe(Host+":"+Port, nil)
	if err != nil {
		log.Fatal("Error Starting the HTTP Server : ", err)
		return
	}
}