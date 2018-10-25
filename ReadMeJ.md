MyBatis JP Table
----------------
MyBatisを使って日本語名テーブル、日本語名カラムを英語に変換します。

日本語名テーブルや日本語名カラムはClassに変換できない。

だから、Mapper XML fileのResultMapを使って英語に変換します。

[ResultMaps](http://www.mybatis.org/mybatis-3/ja/sqlmap-xml.html#Result_Maps)

## 環境 

- Java 1.8 
- Windows10 x64
- Spring Boot 2.1.RC1
- mybatis-spring-boot-starter 1.3.2
- h2 database

Spring Tools Suites 4を使って作りました。

## 使い方

1. Git clone
2. gradlew build

## import.sql
H2 Databaseに下記のようなテーブルを作ります。

TableName : 町

|ID|名前|国|
|:--|:--|:--|
|1|東京|日本|

## CityMapper.xml

町をcityに、名前をnameに、国をcountryに変換します。
そしてCityクラスに結び付けます。

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
