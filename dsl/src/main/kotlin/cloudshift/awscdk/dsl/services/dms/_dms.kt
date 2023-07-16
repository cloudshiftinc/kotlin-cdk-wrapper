@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnCertificate
import software.amazon.awscdk.services.dms.CfnCertificateProps
import software.amazon.awscdk.services.dms.CfnEndpoint
import software.amazon.awscdk.services.dms.CfnEndpointProps
import software.amazon.awscdk.services.dms.CfnEventSubscription
import software.amazon.awscdk.services.dms.CfnEventSubscriptionProps
import software.amazon.awscdk.services.dms.CfnReplicationInstance
import software.amazon.awscdk.services.dms.CfnReplicationInstanceProps
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps
import software.amazon.awscdk.services.dms.CfnReplicationTask
import software.amazon.awscdk.services.dms.CfnReplicationTaskProps
import software.constructs.Construct

public object dms {
  public inline fun cfnCertificate(
    scope: Construct,
    id: String,
    block: CfnCertificateDsl.() -> Unit = {},
  ): CfnCertificate {
    val builder = CfnCertificateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCertificateProps(block: CfnCertificatePropsDsl.() -> Unit = {}):
      CfnCertificateProps {
    val builder = CfnCertificatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpoint(
    scope: Construct,
    id: String,
    block: CfnEndpointDsl.() -> Unit = {},
  ): CfnEndpoint {
    val builder = CfnEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointDocDbSettingsProperty(block: CfnEndpointDocDbSettingsPropertyDsl.() -> Unit =
      {}): CfnEndpoint.DocDbSettingsProperty {
    val builder = CfnEndpointDocDbSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointDynamoDbSettingsProperty(block: CfnEndpointDynamoDbSettingsPropertyDsl.() -> Unit
      = {}): CfnEndpoint.DynamoDbSettingsProperty {
    val builder = CfnEndpointDynamoDbSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointElasticsearchSettingsProperty(block: CfnEndpointElasticsearchSettingsPropertyDsl.() -> Unit
      = {}): CfnEndpoint.ElasticsearchSettingsProperty {
    val builder = CfnEndpointElasticsearchSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointGcpMySQLSettingsProperty(block: CfnEndpointGcpMySQLSettingsPropertyDsl.() -> Unit
      = {}): CfnEndpoint.GcpMySQLSettingsProperty {
    val builder = CfnEndpointGcpMySQLSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointIbmDb2SettingsProperty(block: CfnEndpointIbmDb2SettingsPropertyDsl.() -> Unit =
      {}): CfnEndpoint.IbmDb2SettingsProperty {
    val builder = CfnEndpointIbmDb2SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointKafkaSettingsProperty(block: CfnEndpointKafkaSettingsPropertyDsl.() -> Unit =
      {}): CfnEndpoint.KafkaSettingsProperty {
    val builder = CfnEndpointKafkaSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointKinesisSettingsProperty(block: CfnEndpointKinesisSettingsPropertyDsl.() -> Unit
      = {}): CfnEndpoint.KinesisSettingsProperty {
    val builder = CfnEndpointKinesisSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointMicrosoftSqlServerSettingsProperty(block: CfnEndpointMicrosoftSqlServerSettingsPropertyDsl.() -> Unit
      = {}): CfnEndpoint.MicrosoftSqlServerSettingsProperty {
    val builder = CfnEndpointMicrosoftSqlServerSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointMongoDbSettingsProperty(block: CfnEndpointMongoDbSettingsPropertyDsl.() -> Unit
      = {}): CfnEndpoint.MongoDbSettingsProperty {
    val builder = CfnEndpointMongoDbSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointMySqlSettingsProperty(block: CfnEndpointMySqlSettingsPropertyDsl.() -> Unit =
      {}): CfnEndpoint.MySqlSettingsProperty {
    val builder = CfnEndpointMySqlSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointNeptuneSettingsProperty(block: CfnEndpointNeptuneSettingsPropertyDsl.() -> Unit
      = {}): CfnEndpoint.NeptuneSettingsProperty {
    val builder = CfnEndpointNeptuneSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointOracleSettingsProperty(block: CfnEndpointOracleSettingsPropertyDsl.() -> Unit =
      {}): CfnEndpoint.OracleSettingsProperty {
    val builder = CfnEndpointOracleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointPostgreSqlSettingsProperty(block: CfnEndpointPostgreSqlSettingsPropertyDsl.() -> Unit
      = {}): CfnEndpoint.PostgreSqlSettingsProperty {
    val builder = CfnEndpointPostgreSqlSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpointProps(block: CfnEndpointPropsDsl.() -> Unit = {}): CfnEndpointProps {
    val builder = CfnEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointRedisSettingsProperty(block: CfnEndpointRedisSettingsPropertyDsl.() -> Unit =
      {}): CfnEndpoint.RedisSettingsProperty {
    val builder = CfnEndpointRedisSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointRedshiftSettingsProperty(block: CfnEndpointRedshiftSettingsPropertyDsl.() -> Unit
      = {}): CfnEndpoint.RedshiftSettingsProperty {
    val builder = CfnEndpointRedshiftSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpointS3SettingsProperty(block: CfnEndpointS3SettingsPropertyDsl.() -> Unit
      = {}): CfnEndpoint.S3SettingsProperty {
    val builder = CfnEndpointS3SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointSybaseSettingsProperty(block: CfnEndpointSybaseSettingsPropertyDsl.() -> Unit =
      {}): CfnEndpoint.SybaseSettingsProperty {
    val builder = CfnEndpointSybaseSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventSubscription(
    scope: Construct,
    id: String,
    block: CfnEventSubscriptionDsl.() -> Unit = {},
  ): CfnEventSubscription {
    val builder = CfnEventSubscriptionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventSubscriptionProps(block: CfnEventSubscriptionPropsDsl.() -> Unit = {}):
      CfnEventSubscriptionProps {
    val builder = CfnEventSubscriptionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReplicationInstance(
    scope: Construct,
    id: String,
    block: CfnReplicationInstanceDsl.() -> Unit = {},
  ): CfnReplicationInstance {
    val builder = CfnReplicationInstanceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReplicationInstanceProps(block: CfnReplicationInstancePropsDsl.() -> Unit =
      {}): CfnReplicationInstanceProps {
    val builder = CfnReplicationInstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReplicationSubnetGroup(
    scope: Construct,
    id: String,
    block: CfnReplicationSubnetGroupDsl.() -> Unit = {},
  ): CfnReplicationSubnetGroup {
    val builder = CfnReplicationSubnetGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReplicationSubnetGroupProps(block: CfnReplicationSubnetGroupPropsDsl.() -> Unit = {}):
      CfnReplicationSubnetGroupProps {
    val builder = CfnReplicationSubnetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReplicationTask(
    scope: Construct,
    id: String,
    block: CfnReplicationTaskDsl.() -> Unit = {},
  ): CfnReplicationTask {
    val builder = CfnReplicationTaskDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReplicationTaskProps(block: CfnReplicationTaskPropsDsl.() -> Unit = {}):
      CfnReplicationTaskProps {
    val builder = CfnReplicationTaskPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
