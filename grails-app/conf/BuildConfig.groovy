grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.20'
        runtime ('postgresql:postgresql:9.1-901.jdbc4')
    }

    plugins {
        build ":tomcat:$grailsVersion"

        runtime ":hibernate:$grailsVersion"
        runtime(":zipped-resources:1.0")
        runtime(":less-resources:1.3.0.2")
        runtime ":zipped-resources:1.0"
        runtime ":yui-minify-resources:0.1.4"
        runtime ":database-migration:1.1"
        runtime(":twitter-bootstrap:2.1.1")
        runtime(":fields:1.3")
        runtime(":resources:1.1.6")
        runtime(":jquery:1.8.0")

        compile ":cache:1.0.0"
        compile ":db-reverse-engineer:0.4"

        compile(":cloud-foundry:1.2.3")
        compile(":cloud-foundry-ui:1.1")
        runtime(":svn:1.0.2")
        compile(":google-visualization:0.2.1")
    }
}
