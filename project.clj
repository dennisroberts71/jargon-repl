(defproject dwr71/jargon-repl "0.0.1-SNAPSHOT"
  :description "Convenience functions for testing iRODS Jargon in a Clojure REPL."
  :url "https://github.com/dennisroberts71/jargon-repl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.irods.jargon/jargon-core "4.2.1.0-SNAPSHOT"]]
  :repositories [["dice.repository.snapshots" {:url "https://raw.github.com/DICE-UNC/DICE-Maven/master/snapshots"}]
                 ["dice.repository" {:url "https://raw.github.com/DICE-UNC/DICE-Maven/master/releases"}]])
