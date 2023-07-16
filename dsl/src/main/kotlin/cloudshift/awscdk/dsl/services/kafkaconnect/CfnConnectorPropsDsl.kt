@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector
import software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps

@CdkDslMarker
public class CfnConnectorPropsDsl {
  private val cdkBuilder: CfnConnectorProps.Builder = CfnConnectorProps.builder()

  private val _plugins: MutableList<Any> = mutableListOf()

  public fun capacity(capacity: IResolvable) {
    cdkBuilder.capacity(capacity)
  }

  public fun capacity(capacity: CfnConnector.CapacityProperty) {
    cdkBuilder.capacity(capacity)
  }

  public fun connectorConfiguration(connectorConfiguration: Map<String, String>) {
    cdkBuilder.connectorConfiguration(connectorConfiguration)
  }

  public fun connectorConfiguration(connectorConfiguration: IResolvable) {
    cdkBuilder.connectorConfiguration(connectorConfiguration)
  }

  public fun connectorDescription(connectorDescription: String) {
    cdkBuilder.connectorDescription(connectorDescription)
  }

  public fun connectorName(connectorName: String) {
    cdkBuilder.connectorName(connectorName)
  }

  public fun kafkaCluster(kafkaCluster: IResolvable) {
    cdkBuilder.kafkaCluster(kafkaCluster)
  }

  public fun kafkaCluster(kafkaCluster: CfnConnector.KafkaClusterProperty) {
    cdkBuilder.kafkaCluster(kafkaCluster)
  }

  public fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: IResolvable) {
    cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication)
  }

  public
      fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: CfnConnector.KafkaClusterClientAuthenticationProperty) {
    cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication)
  }

  public fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: IResolvable) {
    cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit)
  }

  public
      fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: CfnConnector.KafkaClusterEncryptionInTransitProperty) {
    cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit)
  }

  public fun kafkaConnectVersion(kafkaConnectVersion: String) {
    cdkBuilder.kafkaConnectVersion(kafkaConnectVersion)
  }

  public fun logDelivery(logDelivery: IResolvable) {
    cdkBuilder.logDelivery(logDelivery)
  }

  public fun logDelivery(logDelivery: CfnConnector.LogDeliveryProperty) {
    cdkBuilder.logDelivery(logDelivery)
  }

  public fun plugins(vararg plugins: Any) {
    _plugins.addAll(listOf(*plugins))
  }

  public fun plugins(plugins: Collection<Any>) {
    _plugins.addAll(plugins)
  }

  public fun plugins(plugins: IResolvable) {
    cdkBuilder.plugins(plugins)
  }

  public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
    cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
  }

  public fun workerConfiguration(workerConfiguration: IResolvable) {
    cdkBuilder.workerConfiguration(workerConfiguration)
  }

  public fun workerConfiguration(workerConfiguration: CfnConnector.WorkerConfigurationProperty) {
    cdkBuilder.workerConfiguration(workerConfiguration)
  }

  public fun build(): CfnConnectorProps {
    if(_plugins.isNotEmpty()) cdkBuilder.plugins(_plugins)
    return cdkBuilder.build()
  }
}
