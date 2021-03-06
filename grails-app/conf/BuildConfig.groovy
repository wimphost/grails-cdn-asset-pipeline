grails.project.work.dir = 'target'
grails.project.source.level = 1.6

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {
    inherits 'global'
    log 'warn'
    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }
    dependencies {
    }
    plugins {
        build ':tomcat:7.0.50.1'
        build(':release:3.0.1') {
            export = false
        }

        runtime ':karman-aws:0.3.1'
        runtime ':asset-pipeline:1.7.1'
    }
}
