MyBatis JP Table
----------------
Japanese Character Table name and column name convert to English by MyBatis.

Japanese Character Name don't change class.

So, I convert to English by ResultMap in MyBatis Mapper XML file.

[ResultMaps](http://www.mybatis.org/mybatis-3/sqlmap-xml.html#Result_Maps)

## Environment 

- Java 1.8 
- Windows10 x64
- Spring Boot 2.1.RC1
- mybatis-spring-boot-starter 1.3.2
- h2 database

I make it by [Spring Tools Suite 4 for eclipse.](https://spring.io/tools)

## How to Try

1. Git clone
2. gradlew build

## import.sql
it make a table underline on H2 Database.

TableName : 町

|ID|名前|国|
|:--|:--|:--|
|1|東京|日本|

## CityMapper.xml

It change '町' to city.

It change '名前' to name.

It change '国' to country.

It connect to City.class.

```xml:CityMapper.xml
<mapper namespace="com.sample.mapper.CityMapper">
	<resultMap id="CityResultMap" type="com.sample.domain.City">
    	<id property="id" column="id" />
    	<result property="name" column="名前" />
    	<result property="country" column="国" />
  	</resultMap>
    <select id="selectCityAll" resultMap="CityResultMap">
        select * from `町`
    </select>
</mapper>

```
