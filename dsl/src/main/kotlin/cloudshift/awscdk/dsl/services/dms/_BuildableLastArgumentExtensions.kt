@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

public inline fun CfnEndpoint.setDocDbSettings(block: CfnEndpointDocDbSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEndpointDocDbSettingsPropertyDsl()
  builder.apply(block)
  return setDocDbSettings(builder.build())
}

public inline
    fun CfnEndpoint.setDynamoDbSettings(block: CfnEndpointDynamoDbSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnEndpointDynamoDbSettingsPropertyDsl()
  builder.apply(block)
  return setDynamoDbSettings(builder.build())
}

public inline
    fun CfnEndpoint.setElasticsearchSettings(block: CfnEndpointElasticsearchSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEndpointElasticsearchSettingsPropertyDsl()
  builder.apply(block)
  return setElasticsearchSettings(builder.build())
}

public inline
    fun CfnEndpoint.setGcpMySqlSettings(block: CfnEndpointGcpMySQLSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnEndpointGcpMySQLSettingsPropertyDsl()
  builder.apply(block)
  return setGcpMySqlSettings(builder.build())
}

public inline
    fun CfnEndpoint.setIbmDb2Settings(block: CfnEndpointIbmDb2SettingsPropertyDsl.() -> Unit = {}) {
  val builder = CfnEndpointIbmDb2SettingsPropertyDsl()
  builder.apply(block)
  return setIbmDb2Settings(builder.build())
}

public inline fun CfnEndpoint.setKafkaSettings(block: CfnEndpointKafkaSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEndpointKafkaSettingsPropertyDsl()
  builder.apply(block)
  return setKafkaSettings(builder.build())
}

public inline
    fun CfnEndpoint.setKinesisSettings(block: CfnEndpointKinesisSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnEndpointKinesisSettingsPropertyDsl()
  builder.apply(block)
  return setKinesisSettings(builder.build())
}

public inline
    fun CfnEndpoint.setMicrosoftSqlServerSettings(block: CfnEndpointMicrosoftSqlServerSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEndpointMicrosoftSqlServerSettingsPropertyDsl()
  builder.apply(block)
  return setMicrosoftSqlServerSettings(builder.build())
}

public inline
    fun CfnEndpoint.setMongoDbSettings(block: CfnEndpointMongoDbSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnEndpointMongoDbSettingsPropertyDsl()
  builder.apply(block)
  return setMongoDbSettings(builder.build())
}

public inline fun CfnEndpoint.setMySqlSettings(block: CfnEndpointMySqlSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEndpointMySqlSettingsPropertyDsl()
  builder.apply(block)
  return setMySqlSettings(builder.build())
}

public inline
    fun CfnEndpoint.setNeptuneSettings(block: CfnEndpointNeptuneSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnEndpointNeptuneSettingsPropertyDsl()
  builder.apply(block)
  return setNeptuneSettings(builder.build())
}

public inline
    fun CfnEndpoint.setOracleSettings(block: CfnEndpointOracleSettingsPropertyDsl.() -> Unit = {}) {
  val builder = CfnEndpointOracleSettingsPropertyDsl()
  builder.apply(block)
  return setOracleSettings(builder.build())
}

public inline
    fun CfnEndpoint.setPostgreSqlSettings(block: CfnEndpointPostgreSqlSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEndpointPostgreSqlSettingsPropertyDsl()
  builder.apply(block)
  return setPostgreSqlSettings(builder.build())
}

public inline fun CfnEndpoint.setRedisSettings(block: CfnEndpointRedisSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEndpointRedisSettingsPropertyDsl()
  builder.apply(block)
  return setRedisSettings(builder.build())
}

public inline
    fun CfnEndpoint.setRedshiftSettings(block: CfnEndpointRedshiftSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnEndpointRedshiftSettingsPropertyDsl()
  builder.apply(block)
  return setRedshiftSettings(builder.build())
}

public inline fun CfnEndpoint.setS3Settings(block: CfnEndpointS3SettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnEndpointS3SettingsPropertyDsl()
  builder.apply(block)
  return setS3Settings(builder.build())
}

public inline
    fun CfnEndpoint.setSybaseSettings(block: CfnEndpointSybaseSettingsPropertyDsl.() -> Unit = {}) {
  val builder = CfnEndpointSybaseSettingsPropertyDsl()
  builder.apply(block)
  return setSybaseSettings(builder.build())
}
