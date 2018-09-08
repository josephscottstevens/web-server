(ns sample
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
  )
)

(defroutes app
  (GET "/" [] "<h1>Hello World</h1>")
  (GET "/test" [] "<h1>test</h1>")
  (route/not-found "<h1>Page not found</h1>")
)
