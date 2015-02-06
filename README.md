# ink-clj 

An app template for building Clojure-backed websites with [Ink][i].

## [New Relic][nr] Setup on Dokku

To enable [New Relic][nr] tracing, set these environment variables - they will override the YAML config:

```
dokku config:set ink-clj NEW_RELIC_APP_NAME=ink-clj \
                         NEW_RELIC_LICENSE_KEY=:redacted:
                         JVM_OPTS="-javaagent:/app/newrelic/newrelic.jar"
```

## License

Double licensed under the [Eclipse Public License](http://www.eclipse.org/legal/epl-v10.html) (the same as Clojure) and
the [MIT License](http://opensource.org/licenses/MIT).

[i]: http://ink.sapo.pt
[nr]: http://www.newrelic.com
