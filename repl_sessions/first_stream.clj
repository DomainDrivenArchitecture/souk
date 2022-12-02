(ns repl-sessions.first-stream
  (:require [lambdaisland.souk.json-ld :refer :all]))

(spit "resources/lambdaisland/souk/json_ld_contexts.edn"
      (with-out-str (clojure.pprint/pprint @context-cache)))

(reset!
 context-cache
 {"https://www.w3.org/ns/activitystreams"
  {"Dislike" "as:Dislike",
   "Leave" "as:Leave",
   "Application" "as:Application",
   "Listen" "as:Listen",
   "followers" {"@id" "as:followers", "@type" "@id"},
   "startIndex" {"@id" "as:startIndex", "@type" "xsd:nonNegativeInteger"},
   "View" "as:View",
   "inbox" {"@id" "ldp:inbox", "@type" "@id"},
   "object" {"@id" "as:object", "@type" "@id"},
   "Like" "as:Like",
   "shares" {"@id" "as:shares", "@type" "@id"},
   "nameMap" {"@id" "as:name", "@container" "@language"},
   "width" {"@id" "as:width", "@type" "xsd:nonNegativeInteger"},
   "Relationship" "as:Relationship",
   "origin" {"@id" "as:origin", "@type" "@id"},
   "Link" "as:Link",
   "url" {"@id" "as:url", "@type" "@id"},
   "bto" {"@id" "as:bto", "@type" "@id"},
   "inReplyTo" {"@id" "as:inReplyTo", "@type" "@id"},
   "next" {"@id" "as:next", "@type" "@id"},
   "ldp" "http://www.w3.org/ns/ldp#",
   "signClientKey" {"@id" "as:signClientKey", "@type" "@id"},
   "CollectionPage" "as:CollectionPage",
   "describes" {"@id" "as:describes", "@type" "@id"},
   "anyOf" {"@id" "as:anyOf", "@type" "@id"},
   "Organization" "as:Organization",
   "OrderedCollection" "as:OrderedCollection",
   "orderedItems" {"@id" "as:items", "@type" "@id", "@container" "@list"},
   "Announce" "as:Announce",
   "OrderedCollectionPage" "as:OrderedCollectionPage",
   "height" {"@id" "as:height", "@type" "xsd:nonNegativeInteger"},
   "Note" "as:Note",
   "formerType" {"@id" "as:formerType", "@type" "@id"},
   "Offer" "as:Offer",
   "Video" "as:Video",
   "Object" "as:Object",
   "Travel" "as:Travel",
   "Mention" "as:Mention",
   "image" {"@id" "as:image", "@type" "@id"},
   "Audio" "as:Audio",
   "IntransitiveActivity" "as:IntransitiveActivity",
   "endpoints" {"@id" "as:endpoints", "@type" "@id"},
   "bcc" {"@id" "as:bcc", "@type" "@id"},
   "Flag" "as:Flag",
   "longitude" {"@id" "as:longitude", "@type" "xsd:float"},
   "Question" "as:Question",
   "radius" {"@id" "as:radius", "@type" "xsd:float"},
   "Public" {"@id" "as:Public", "@type" "@id"},
   "Activity" "as:Activity",
   "IsMember" "as:IsMember",
   "id" "@id",
   "proxyUrl" {"@id" "as:proxyUrl", "@type" "@id"},
   "IsContact" "as:IsContact",
   "Event" "as:Event",
   "hreflang" "as:hreflang",
   "Block" "as:Block",
   "Person" "as:Person",
   "altitude" {"@id" "as:altitude", "@type" "xsd:float"},
   "sharedInbox" {"@id" "as:sharedInbox", "@type" "@id"},
   "latitude" {"@id" "as:latitude", "@type" "xsd:float"},
   "liked" {"@id" "as:liked", "@type" "@id"},
   "Arrive" "as:Arrive",
   "summary" "as:summary",
   "Delete" "as:Delete",
   "attachment" {"@id" "as:attachment", "@type" "@id"},
   "relationship" {"@id" "as:relationship", "@type" "@id"},
   "href" {"@id" "as:href", "@type" "@id"},
   "name" "as:name",
   "closed" {"@id" "as:closed", "@type" "xsd:dateTime"},
   "vcard" "http://www.w3.org/2006/vcard/ns#",
   "Article" "as:Article",
   "tag" {"@id" "as:tag", "@type" "@id"},
   "published" {"@id" "as:published", "@type" "xsd:dateTime"},
   "items" {"@id" "as:items", "@type" "@id"},
   "startTime" {"@id" "as:startTime", "@type" "xsd:dateTime"},
   "location" {"@id" "as:location", "@type" "@id"},
   "Update" "as:Update",
   "Add" "as:Add",
   "Read" "as:Read",
   "context" {"@id" "as:context", "@type" "@id"},
   "partOf" {"@id" "as:partOf", "@type" "@id"},
   "Remove" "as:Remove",
   "preferredUsername" "as:preferredUsername",
   "Profile" "as:Profile",
   "totalItems" {"@id" "as:totalItems", "@type" "xsd:nonNegativeInteger"},
   "prev" {"@id" "as:prev", "@type" "@id"},
   "Follow" "as:Follow",
   "IsFollowing" "as:IsFollowing",
   "Tombstone" "as:Tombstone",
   "subject" {"@id" "as:subject", "@type" "@id"},
   "Page" "as:Page",
   "@vocab" "_:",
   "current" {"@id" "as:current", "@type" "@id"},
   "content" "as:content",
   "units" "as:units",
   "Place" "as:Place",
   "instrument" {"@id" "as:instrument", "@type" "@id"},
   "Undo" "as:Undo",
   "alsoKnownAs" {"@id" "as:alsoKnownAs", "@type" "@id"},
   "duration" {"@id" "as:duration", "@type" "xsd:duration"},
   "last" {"@id" "as:last", "@type" "@id"},
   "rel" "as:rel",
   "source" "as:source",
   "TentativeReject" "as:TentativeReject",
   "type" "@type",
   "outbox" {"@id" "as:outbox", "@type" "@id"},
   "mediaType" "as:mediaType",
   "oneOf" {"@id" "as:oneOf", "@type" "@id"},
   "deleted" {"@id" "as:deleted", "@type" "xsd:dateTime"},
   "target" {"@id" "as:target", "@type" "@id"},
   "replies" {"@id" "as:replies", "@type" "@id"},
   "provideClientKey" {"@id" "as:provideClientKey", "@type" "@id"},
   "Create" "as:Create",
   "updated" {"@id" "as:updated", "@type" "xsd:dateTime"},
   "generator" {"@id" "as:generator", "@type" "@id"},
   "endTime" {"@id" "as:endTime", "@type" "xsd:dateTime"},
   "TentativeAccept" "as:TentativeAccept",
   "oauthAuthorizationEndpoint"
   {"@id" "as:oauthAuthorizationEndpoint", "@type" "@id"},
   "audience" {"@id" "as:audience", "@type" "@id"},
   "Service" "as:Service",
   "Image" "as:Image",
   "Accept" "as:Accept",
   "Document" "as:Document",
   "preview" {"@id" "as:preview", "@type" "@id"},
   "Invite" "as:Invite",
   "contentMap" {"@id" "as:content", "@container" "@language"},
   "Group" "as:Group",
   "oauthTokenEndpoint" {"@id" "as:oauthTokenEndpoint", "@type" "@id"},
   "uploadMedia" {"@id" "as:uploadMedia", "@type" "@id"},
   "to" {"@id" "as:to", "@type" "@id"},
   "accuracy" {"@id" "as:accuracy", "@type" "xsd:float"},
   "IsFollowedBy" "as:IsFollowedBy",
   "Reject" "as:Reject",
   "summaryMap" {"@id" "as:summary", "@container" "@language"},
   "Join" "as:Join",
   "Move" "as:Move",
   "as" "https://www.w3.org/ns/activitystreams#",
   "actor" {"@id" "as:actor", "@type" "@id"},
   "likes" {"@id" "as:likes", "@type" "@id"},
   "following" {"@id" "as:following", "@type" "@id"},
   "streams" {"@id" "as:streams", "@type" "@id"},
   "cc" {"@id" "as:cc", "@type" "@id"},
   "attributedTo" {"@id" "as:attributedTo", "@type" "@id"},
   "result" {"@id" "as:result", "@type" "@id"},
   "xsd" "http://www.w3.org/2001/XMLSchema#",
   "first" {"@id" "as:first", "@type" "@id"},
   "Collection" "as:Collection",
   "icon" {"@id" "as:icon", "@type" "@id"},
   "Ignore" "as:Ignore"},
  "https://w3id.org/security/v1"
  {"EncryptedMessage" "sec:EncryptedMessage",
   "dc" "http://purl.org/dc/terms/",
   "canonicalizationAlgorithm" "sec:canonicalizationAlgorithm",
   "owner" {"@id" "sec:owner", "@type" "@id"},
   "created" {"@id" "dc:created", "@type" "xsd:dateTime"},
   "signatureValue" "sec:signatureValue",
   "CryptographicKey" "sec:Key",
   "publicKeyPem" "sec:publicKeyPem",
   "iterationCount" "sec:iterationCount",
   "id" "@id",
   "publicKey" {"@id" "sec:publicKey", "@type" "@id"},
   "Ed25519Signature2018" "sec:Ed25519Signature2018",
   "publicKeyWif" "sec:publicKeyWif",
   "GraphSignature2012" "sec:GraphSignature2012",
   "creator" {"@id" "dc:creator", "@type" "@id"},
   "publicKeyBase58" "sec:publicKeyBase58",
   "cipherAlgorithm" "sec:cipherAlgorithm",
   "digestAlgorithm" "sec:digestAlgorithm",
   "LinkedDataSignature2015" "sec:LinkedDataSignature2015",
   "cipherData" "sec:cipherData",
   "privateKey" {"@id" "sec:privateKey", "@type" "@id"},
   "EcdsaKoblitzSignature2016" "sec:EcdsaKoblitzSignature2016",
   "expires" {"@id" "sec:expiration", "@type" "xsd:dateTime"},
   "signatureAlgorithm" "sec:signingAlgorithm",
   "signature" "sec:signature",
   "domain" "sec:domain",
   "LinkedDataSignature2016" "sec:LinkedDataSignature2016",
   "revoked" {"@id" "sec:revoked", "@type" "xsd:dateTime"},
   "encryptionKey" "sec:encryptionKey",
   "cipherKey" "sec:cipherKey",
   "salt" "sec:salt",
   "digestValue" "sec:digestValue",
   "type" "@type",
   "password" "sec:password",
   "expiration" {"@id" "sec:expiration", "@type" "xsd:dateTime"},
   "publicKeyService" {"@id" "sec:publicKeyService", "@type" "@id"},
   "nonce" "sec:nonce",
   "authenticationTag" "sec:authenticationTag",
   "privateKeyPem" "sec:privateKeyPem",
   "sec" "https://w3id.org/security#",
   "normalizationAlgorithm" "sec:normalizationAlgorithm",
   "initializationVector" "sec:initializationVector",
   "xsd" "http://www.w3.org/2001/XMLSchema#"}})

(:body (json-get "https://toot.cat/users/plexus"))

"@type" "https://www.w3.org/ns/activitystreams#Person"

(:body (json-get "https://toot.cat/users/plexus/outbox"))
(:body (json-get "https://toot.cat/users/plexus/outbox?page=true"))
(:body (json-get "https://www.w3.org/ns/activitystreams"))

(:body (json-get "https://toot.cat/users/plexus/outbox"))

(expand-context
 (get (:body (json-get "https://toot.cat/users/plexus"))
      "@context"))

{"inbox" "https://www.w3.org/ns/activitystreams#inbox"
 "as" "https://www.w3.org/ns/activitystreams#"
 }

JSON-LD linked data
RDF Resource Description Framework

[entity attribute value]
[subject predicate object]

["http://.../clojure" "http://.../type-of-language" "https://..../functional"]

Uniform Resource Locator: URL
Uniform Resource Identifier: URI
Internationalized Resource Identifiers: IRI


"@context"
- url
- map (object)
- list of ...
