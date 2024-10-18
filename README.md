# form-jquery-reproducer

## Introduction

This is a reproducer for https://issues.jenkins.io/browse/JENKINS-73988.

Steps to reproduce the issue:

* start the application: `mvn hpi:run`
* click on the reproducer root action (link `/reproducer`)
* click on Trigger me
* Observe the dialog doesn't open, observe the error in the console:

```text
Uncaught TypeError: Cannot read properties of undefined (reading 'submit')
    at Object.form (index.js:256:44)
    at showForm (dialog.js:6:12)
    at HTMLButtonElement.onclick (reproducer/:12:90)
```

* Verify the code works without the jquery3 adjunct by commenting `<st:adjunct includes="io.jenkins.plugins.jquery3"/>`
in `src/main/resources/io/jenkins/plugins/ReproducingAction/index.jelly` and reloading the page.

## LICENSE

Licensed under MIT, see [LICENSE](LICENSE.md)

