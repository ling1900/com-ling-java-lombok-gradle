mybatis 最基础示例，java-lombok-gradle 版。

===============================================

gradle 运行：

在 Tasks 中选择（ application 下）：

bootRun

虚拟机参数：

// https://github.com/spring-projects/spring-boot/issues/832#issuecomment-272780482

-Dspring.profiles.active=dev

注意：和 maven 版的参数写法不同。

接口文档：

http://localhost:4011/doc.html

=====================================================

    @Delegate
    @JsonIgnore
    // linglg：只能织入方法，不能织入字段。
    // linglg：问题：不会带入注解。
    private SysPropertyCommon sysPropertyCommon = new SysPropertyCommon();

lombok：

    dependencies {
        compileOnly 'org.projectlombok:lombok:1.18.8'
        annotationProcessor 'org.projectlombok:lombok:1.18.8'
    }

字节码织入（事务）：

    buildscript {
        repositories {
            jcenter()
        }
        dependencies {
            classpath "com.github.sedovalx.gradle:gradle-aspectj-binary:1.0.37"
        }
    }
    
    apply plugin: 'com.github.sedovalx.gradle-aspectj-binary'
    
    weaveClasses.dependsOn compileJava
    classes.dependsOn weaveClasses
    
