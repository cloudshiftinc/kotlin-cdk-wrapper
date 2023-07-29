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

package cloudshift.awscdk.dsl.services.kafkaconnect

import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/** The connector's compute capacity settings. */
public inline fun CfnConnector.setCapacity(block: CfnConnectorCapacityPropertyDsl.() -> Unit = {}) {
    val builder = CfnConnectorCapacityPropertyDsl()
    builder.apply(block)
    return setCapacity(builder.build())
}

/** The details of the Apache Kafka cluster to which the connector is connected. */
public inline fun CfnConnector.setKafkaCluster(
    block: CfnConnectorKafkaClusterPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectorKafkaClusterPropertyDsl()
    builder.apply(block)
    return setKafkaCluster(builder.build())
}

/** The type of client authentication used to connect to the Apache Kafka cluster. */
public inline fun CfnConnector.setKafkaClusterClientAuthentication(
    block: CfnConnectorKafkaClusterClientAuthenticationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectorKafkaClusterClientAuthenticationPropertyDsl()
    builder.apply(block)
    return setKafkaClusterClientAuthentication(builder.build())
}

/** Details of encryption in transit to the Apache Kafka cluster. */
public inline fun CfnConnector.setKafkaClusterEncryptionInTransit(
    block: CfnConnectorKafkaClusterEncryptionInTransitPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectorKafkaClusterEncryptionInTransitPropertyDsl()
    builder.apply(block)
    return setKafkaClusterEncryptionInTransit(builder.build())
}

/** The settings for delivering connector logs to Amazon CloudWatch Logs. */
public inline fun CfnConnector.setLogDelivery(
    block: CfnConnectorLogDeliveryPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectorLogDeliveryPropertyDsl()
    builder.apply(block)
    return setLogDelivery(builder.build())
}

/** The worker configurations that are in use with the connector. */
public inline fun CfnConnector.setWorkerConfiguration(
    block: CfnConnectorWorkerConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectorWorkerConfigurationPropertyDsl()
    builder.apply(block)
    return setWorkerConfiguration(builder.build())
}
