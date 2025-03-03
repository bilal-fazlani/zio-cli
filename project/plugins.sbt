addSbtPlugin("ch.epfl.scala"                     % "sbt-scalafix"                  % "0.13.0")
addSbtPlugin("com.eed3si9n"                      % "sbt-buildinfo"                 % "0.13.1")
addSbtPlugin("com.github.sbt"                    % "sbt-unidoc"                    % "0.5.0")
addSbtPlugin("com.github.sbt"                    % "sbt-ci-release"                % "1.9.2")
addSbtPlugin("com.github.cb372"                  % "sbt-explicit-dependencies"     % "0.2.16")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings"              % "3.0.0")
addSbtPlugin("org.portable-scala"                % "sbt-scalajs-crossproject"      % "1.3.2")
addSbtPlugin("org.scala-js"                      % "sbt-scalajs"                   % "1.18.2")
addSbtPlugin("org.portable-scala"                % "sbt-scala-native-crossproject" % "1.3.2")
addSbtPlugin("org.scala-native"                  % "sbt-scala-native"              % "0.5.7")
addSbtPlugin("org.scalameta"                     % "sbt-mdoc"                      % "2.6.4")
addSbtPlugin("org.scalameta"                     % "sbt-scalafmt"                  % "2.5.4")
addSbtPlugin("org.scoverage"                     % "sbt-scoverage"                 % "2.3.1")
addSbtPlugin("pl.project13.scala"                % "sbt-jmh"                       % "0.4.7")
addSbtPlugin("org.scalameta"                     % "sbt-native-image"              % "0.3.4")
addSbtPlugin("dev.zio"                           % "zio-sbt-website"               % "0.4.0-alpha.30")

resolvers += Resolver.sonatypeRepo("public")
