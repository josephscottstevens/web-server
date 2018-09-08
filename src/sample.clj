(ns sample
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.util.response :as resp]
  )
)

(defroutes app
  (GET "/" [] (resp/redirect "/index.html"))
  (GET "/test" [] "<h1>test</h1>")
  (route/resources "/")
  (route/not-found "<h1>Page not found</h1>")
)
