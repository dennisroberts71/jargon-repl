(ns dwr71.jargon-repl
  (:import [org.irods.jargon.core.connection IRODSAccount]
           [org.irods.jargon.core.pub IRODSFileSystem]))

(defn get-access-object-factory
  "Obtains an iRODS access object factory."
  []
  (.getIRODSAccessObjectFactory (IRODSFileSystem/instance)))

(defn get-account
  "Obtains an authenticated iRODS account."
  [aof {:keys [host port user password home zone resource] :or {resource ""}}]
  (let [home (or home (str "/" zone "/home"))]
    (-> (.authenticateIRODSAccount aof (IRODSAccount/instance host port user password home zone resource))
        .getAuthenticatedIRODSAccount)))
