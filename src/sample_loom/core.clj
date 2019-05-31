(ns sample-loom.core
  (:gen-class)
  (:require [loom.graph :as lg]))

(defn foo
  "I don't do a whole lot."
  [x]
  (lg/digraph [[:a 1] [:b 2]]))

(defn -main
  [& args]
  (println (foo 100)))
