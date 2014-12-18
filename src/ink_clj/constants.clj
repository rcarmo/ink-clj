(ns ink-clj.constants)

(def extension-mimetypes 
  {".txt"      "text/plain"
   ".htm"      "text/html"
   ".html"     "text/html"
   ".md"       "text/x-markdown"
   ".mkd"      "text/x-markdown"
   ".mkdn"     "text/x-markdown"
   ".markdown" "text/x-markdown"
   ".textile"  "text/x-textile"})

(def mimetype-overrides
   ; used when mimetype is missing from top matter
   {".txt"  "text/x-textile"})

(def index-files
  (set (map #(str "index" %) (keys extension-mimetypes))))

(def ignored-folders #{"CVS" ".hg" ".svn" ".git" ".AppleDouble"})
