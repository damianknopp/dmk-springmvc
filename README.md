RESTful with SpringMVC
====================


####build 
_mvn clean install_

####deploy to Tomcat 7.0.40 
_cp tomcat/webapps_

####wait for,

> Jun 02, 2013 11:08:51 PM org.apache.catalina.core.ApplicationContext log
> INFO: Spring WebApplicationInitializers detected on classpath: [dmk.springmvc.config.WebAppInit@5e177273]
> Jun 02, 2013 11:08:51 PM org.apache.catalina.core.ApplicationContext log
> INFO: Initializing Spring root WebApplicationContext
> Jun 02, 2013 11:08:52 PM org.apache.catalina.core.ApplicationContext log
> INFO: Initializing Spring FrameworkServlet 'dispatcher'

####visit,
> http://localhost:8080/springmvc/doc/199
> http://localhost:8080/springmvc/doc/199.htm
> http://localhost:8080/springmvc/doc/199.json
> http://localhost:8080/springmvc/doc/199.xml
> http://localhost:8080/springmvc/doc/test
> http://localhost:8080/springmvc/doc/test.htm
> http://localhost:8080/springmvc/doc/test.json
> http://localhost:8080/springmvc/doc/test.xml
