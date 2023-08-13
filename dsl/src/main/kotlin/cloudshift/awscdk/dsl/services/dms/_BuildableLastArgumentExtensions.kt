@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.dms

import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint
import software.amazon.awscdk.services.dms.CfnReplicationConfig

/** Settings in JSON format for the source and target DocumentDB endpoint. */
public inline fun CfnEndpoint.setDocDbSettings(
    block: CfnEndpointDocDbSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointDocDbSettingsPropertyDsl()
    builder.apply(block)
    return setDocDbSettings(builder.build())
}

/** Settings in JSON format for the target Amazon DynamoDB endpoint. */
public inline fun CfnEndpoint.setDynamoDbSettings(
    block: CfnEndpointDynamoDbSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointDynamoDbSettingsPropertyDsl()
    builder.apply(block)
    return setDynamoDbSettings(builder.build())
}

/** Settings in JSON format for the target OpenSearch endpoint. */
public inline fun CfnEndpoint.setElasticsearchSettings(
    block: CfnEndpointElasticsearchSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointElasticsearchSettingsPropertyDsl()
    builder.apply(block)
    return setElasticsearchSettings(builder.build())
}

/** Settings in JSON format for the source GCP MySQL endpoint. */
public inline fun CfnEndpoint.setGcpMySqlSettings(
    block: CfnEndpointGcpMySQLSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointGcpMySQLSettingsPropertyDsl()
    builder.apply(block)
    return setGcpMySqlSettings(builder.build())
}

/** Settings in JSON format for the source IBM Db2 LUW endpoint. */
public inline fun CfnEndpoint.setIbmDb2Settings(
    block: CfnEndpointIbmDb2SettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointIbmDb2SettingsPropertyDsl()
    builder.apply(block)
    return setIbmDb2Settings(builder.build())
}

/** Settings in JSON format for the target Apache Kafka endpoint. */
public inline fun CfnEndpoint.setKafkaSettings(
    block: CfnEndpointKafkaSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointKafkaSettingsPropertyDsl()
    builder.apply(block)
    return setKafkaSettings(builder.build())
}

/** Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams. */
public inline fun CfnEndpoint.setKinesisSettings(
    block: CfnEndpointKinesisSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointKinesisSettingsPropertyDsl()
    builder.apply(block)
    return setKinesisSettings(builder.build())
}

/** Settings in JSON format for the source and target Microsoft SQL Server endpoint. */
public inline fun CfnEndpoint.setMicrosoftSqlServerSettings(
    block: CfnEndpointMicrosoftSqlServerSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointMicrosoftSqlServerSettingsPropertyDsl()
    builder.apply(block)
    return setMicrosoftSqlServerSettings(builder.build())
}

/** Settings in JSON format for the source MongoDB endpoint. */
public inline fun CfnEndpoint.setMongoDbSettings(
    block: CfnEndpointMongoDbSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointMongoDbSettingsPropertyDsl()
    builder.apply(block)
    return setMongoDbSettings(builder.build())
}

/** Settings in JSON format for the source and target MySQL endpoint. */
public inline fun CfnEndpoint.setMySqlSettings(
    block: CfnEndpointMySqlSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointMySqlSettingsPropertyDsl()
    builder.apply(block)
    return setMySqlSettings(builder.build())
}

/** Settings in JSON format for the target Amazon Neptune endpoint. */
public inline fun CfnEndpoint.setNeptuneSettings(
    block: CfnEndpointNeptuneSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointNeptuneSettingsPropertyDsl()
    builder.apply(block)
    return setNeptuneSettings(builder.build())
}

/** Settings in JSON format for the source and target Oracle endpoint. */
public inline fun CfnEndpoint.setOracleSettings(
    block: CfnEndpointOracleSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointOracleSettingsPropertyDsl()
    builder.apply(block)
    return setOracleSettings(builder.build())
}

/** Settings in JSON format for the source and target PostgreSQL endpoint. */
public inline fun CfnEndpoint.setPostgreSqlSettings(
    block: CfnEndpointPostgreSqlSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointPostgreSqlSettingsPropertyDsl()
    builder.apply(block)
    return setPostgreSqlSettings(builder.build())
}

/** Settings in JSON format for the target Redis endpoint. */
public inline fun CfnEndpoint.setRedisSettings(
    block: CfnEndpointRedisSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointRedisSettingsPropertyDsl()
    builder.apply(block)
    return setRedisSettings(builder.build())
}

/** Settings in JSON format for the Amazon Redshift endpoint. */
public inline fun CfnEndpoint.setRedshiftSettings(
    block: CfnEndpointRedshiftSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointRedshiftSettingsPropertyDsl()
    builder.apply(block)
    return setRedshiftSettings(builder.build())
}

/** Settings in JSON format for the source and target Amazon S3 endpoint. */
public inline fun CfnEndpoint.setS3Settings(
    block: CfnEndpointS3SettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointS3SettingsPropertyDsl()
    builder.apply(block)
    return setS3Settings(builder.build())
}

/** Settings in JSON format for the source and target SAP ASE endpoint. */
public inline fun CfnEndpoint.setSybaseSettings(
    block: CfnEndpointSybaseSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointSybaseSettingsPropertyDsl()
    builder.apply(block)
    return setSybaseSettings(builder.build())
}

/** Configuration parameters for provisioning a AWS DMS Serverless replication. */
public inline fun CfnReplicationConfig.setComputeConfig(
    block: CfnReplicationConfigComputeConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnReplicationConfigComputeConfigPropertyDsl()
    builder.apply(block)
    return setComputeConfig(builder.build())
}
