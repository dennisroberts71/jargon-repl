# jargon-repl

A Clojure library designed provide some convenient functions to use while testing with iRODS Jargon in the Clojure REPL.

## Usage

```clojure
(use 'dwr71.jargon-repl)

;; Obtain an access object factory.
(def aof (get-access-object-factory))

;; Obtain an authenticated iRODS account.
(def account (get-account aof {:host "irods.example.org" :port 1247 :user "foo" :password "bar" :zone "baz"}))

;; Optionally get an authenticated iRODS account specifying the home directory and default resource.
(def account (get-account aof {:host     "irods.example.org"
                               :port     1247
                               :user     "foo"
                               :password "bar"
                               :zone     "baz"
                               :home     "/baz/home"
                               :resource "defaultResc"}))
```

## License

Copyright © 2017 Dennis Roberts

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
