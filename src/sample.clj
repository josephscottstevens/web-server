(ns sample)

(defn handler
  ([request]
    {:status 200
     :headers {"Content-Type" "text/plain"}
     :body (str "Hello world!" (get request :uri))
    }
  )
)
