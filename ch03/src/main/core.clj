(ns main.core
  (:gen-class))

(defn dec-maker
  [x]
  #(- % x))

(defn mapset
  [x list]
  (set (map x list))
  )

(defn -main
  []

  ; Dec
  (def dec9 (dec-maker 9))
  (println "dec9" (dec9 10))

  ; Map over set
  (println "mapset" (mapset inc [1 1 2 2]))
  )