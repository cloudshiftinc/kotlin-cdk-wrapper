@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

public inline fun CfnConnector.setCapacity(block: CfnConnectorCapacityPropertyDsl.() -> Unit = {}) {
  val builder = CfnConnectorCapacityPropertyDsl()
  builder.apply(block)
  return setCapacity(builder.build())
}

public inline fun CfnConnector.setKafkaCluster(block: CfnConnectorKafkaClusterPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectorKafkaClusterPropertyDsl()
  builder.apply(block)
  return setKafkaCluster(builder.build())
}

public inline
    fun CfnConnector.setKafkaClusterClientAuthentication(block: CfnConnectorKafkaClusterClientAuthenticationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectorKafkaClusterClientAuthenticationPropertyDsl()
  builder.apply(block)
  return setKafkaClusterClientAuthentication(builder.build())
}

public inline
    fun CfnConnector.setKafkaClusterEncryptionInTransit(block: CfnConnectorKafkaClusterEncryptionInTransitPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectorKafkaClusterEncryptionInTransitPropertyDsl()
  builder.apply(block)
  return setKafkaClusterEncryptionInTransit(builder.build())
}

public inline fun CfnConnector.setLogDelivery(block: CfnConnectorLogDeliveryPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnConnectorLogDeliveryPropertyDsl()
  builder.apply(block)
  return setLogDelivery(builder.build())
}

public inline
    fun CfnConnector.setWorkerConfiguration(block: CfnConnectorWorkerConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectorWorkerConfigurationPropertyDsl()
  builder.apply(block)
  return setWorkerConfiguration(builder.build())
}
