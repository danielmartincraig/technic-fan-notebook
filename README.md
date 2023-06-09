# net.danielmartincraig/technic-fan-notebook

[![License][license]][license-url]

FIXME: Clerk notebook template docstring.

This project is powered by Clerk. Your first notebook lives at
`src/net/danielmartincraig/technic_fan_notebook.clj`.

## Dependencies

`clj`, `shadow-cljs`, `node` and

- [Clojure CLI tools](https://clojure.org/guides/install_clojure)
- [`babashka`](https://github.com/babashka/babashka#installation)

To publish to GitHub Pages, you'll also need `node` installed, preferably via
[`nvm`](https://github.com/nvm-sh/nvm#installing-and-updating).

## Developing with Clerk

To start a server for local Clerk development, run

```sh
bb start-clerk
```

This will start the Clerk server at http://localhost:7777 with a file
watcher that updates the page each time any file in the `src` directory changes.

To manually start the Clerk webserver, start a REPL by running

```sh
clj
```

Then start the server:

```clj
(start!)
```

To show a file, pass it to `clerk/show!`:

```clj
(clerk/show! "src/net/danielmartincraig/technic_fan_notebook.clj")
```

These commands work because dev/user.clj requires `nextjournal.clerk` under a
`clerk` alias, and defines a `start!` function.

## Static Builds

### Local Build

Run

```
bb build-static
```

To generate a static site locally.

### Push to GitHub

Create a repo at https://github.com/new.

### Garden

The easiest way to share a static build is to push to GitHub, then visit

https://github.clerk.garden/net.danielmartincraig/technic-fan-notebook


### GitHub Pages

To release to GitHub Pages, run

```
bb release-gh-pages
```

## Linting

Run

```
clj-kondo --copy-configs --dependencies --lint "$(clojure -Spath)"
```

Then

```
bb lint
```

## License

Copyright © 2023 Daniel Craig

Distributed under the Eclipse Public License version 1.0.

[license]: https://img.shields.io/badge/License-EPL%201.0-green.svg
[license-url]: LICENSE
