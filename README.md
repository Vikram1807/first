to run in mysql just make property : in application property : spring.h2.console.enabled=false

you need to go in HibernateConfig.java class and change userName and password according to your and also change the url of mysql in else block line number 40,41,42 
>dont touch url if you are just running default setting from mysql

if u jyst trigger it will run on H2 pretty simple eh!

todo : someday i will fork out calci project from this.

      for now i am just revising my topics
