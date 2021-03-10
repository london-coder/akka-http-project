
Global / semanticdbEnabled := true

lazy val akkaHttpVersion   = "10.2.4"
lazy val akkaVersion       = "2.6.13"
lazy val scalaTestVersion  = "3.2.6"


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.example",
      scalaVersion    := "2.13.4"
    )),
    name := "My Akka HTTP Project",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"                % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-spray-json"     % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-actor-typed"         % akkaVersion,
      "com.typesafe.akka" %% "akka-stream"              % akkaVersion,
      "ch.qos.logback"    %  "logback-classic"          % "1.2.3",

      "com.typesafe.akka" %% "akka-http-testkit"        % akkaHttpVersion    % Test,
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion        % Test,
      "org.scalatest"     %% "scalatest"                % scalaTestVersion   % Test
    ),
    scalacOptions ++= Seq(
      "-deprecation",                       // Emit warning and location for usages of deprecated APIs.
      "-encoding", "utf-8",                 // Specify character encoding used by source files.
      "-feature",                           // Emit warning and location for usages of features that should be imported explicitly.
      "-explaintypes",                      // Explain type errors in more detail.
      "-language:_",                        // Existential, higher kinded, existentials, experimentals types... (besides wildcard types) can be written and inferred
      "-Xcheckinit",                        // Wrap field accessors to throw an exception on uninitialized access.
      "-unchecked",                         // Enable additional warnings where generated code depends on assumptions.
      //"-Xfatal-warnings",
      "-Wdead-code",                        // Warn when dead code is identified.
      "-Wextra-implicit",                   // Warn when more than one implicit parameter section is defined.
      "-Wmacros:both",                      // Enable lint warnings on macro expansions.
      "-Wnumeric-widen",                    // Warn when numerics are widened.
      "-Woctal-literal",                    // Warn on obsolete octal syntax.
      "-Wunused:_",                         // Warn if: an import selector is not referenced, a variable is unused, private member is unused, local def is unused explicit / implicit parameter is unused
      "-Wvalue-discard",                    // Warn when non-Unit expression results are unused.
      "-Xlint:adapted-args",                // Warn if an argument list is modified to match the receiver.
      "-Xlint:implicit-recursion",          // Warn when an implicit resolves to an enclosing self-definition.
      "-Xlint:nullary-unit",                // Warn when nullary methods return Unit.
      "-Xlint:inaccessible",                // Warn about inaccessible types in method signatures.
      "-Xlint:infer-any",                   // Warn when a type argument is inferred to be Any.
      "-Xlint:missing-interpolator",        // A string literal appears to be missing an interpolator id.
      "-Xlint:doc-detached",                // A Scaladoc comment appears to be detached from its element.
      "-Xlint:private-shadow",              // A private field (or class parameter) shadows a superclass field.
      "-Xlint:type-parameter-shadow",       // A local type parameter shadows a type already in scope.
      "-Xlint:poly-implicit-overload",      // Parameterized overloaded implicit methods are not visible as view bounds.
      "-Xlint:option-implicit",             // Option.apply used implicit view.
      "-Xlint:delayedinit-select",          // Selecting member of DelayedInit.
      "-Xlint:package-object-classes",      // Class or object defined in package object.
      "-Xlint:stars-align",                 // Pattern sequence wildcard must align with sequence component.
      "-Xlint:constant",                    // Evaluation of a constant arithmetic expression results in an error.
      "-Xlint:nonlocal-return",             // A return statement used an exception for flow control.
      "-Xlint:implicit-not-found",          // Check @implicitNotFound and @implicitAmbiguous messages.
      "-Xlint:serial",                      // @SerialVersionUID on traits and non-serializable classes.
      "-Xlint:valpattern",                  // Enable pattern checks in val definitions.
      "-Xlint:eta-zero",                    // Warn on eta-expansion (rather than auto-application) of zero-ary method.
      "-Xlint:eta-sam",                     // Warn on eta-expansion to meet a Java-defined functional interface that is not explicitly annotated with @FunctionalInterface.
      "-Xlint:deprecation"                  // Enable linted deprecations.
      )

  )
