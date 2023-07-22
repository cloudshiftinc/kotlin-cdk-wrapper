@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster
import software.amazon.awscdk.services.msk.CfnClusterProps

@CdkDslMarker
public class CfnClusterPropsDsl {
  private val cdkBuilder: CfnClusterProps.Builder = CfnClusterProps.builder()

  /**
   * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
   */
  public fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable) {
    cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo)
  }

  /**
   * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
   */
  public fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty) {
    cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo)
  }

  /**
   * @param clientAuthentication Includes all client authentication related information.
   */
  public fun clientAuthentication(clientAuthentication: IResolvable) {
    cdkBuilder.clientAuthentication(clientAuthentication)
  }

  /**
   * @param clientAuthentication Includes all client authentication related information.
   */
  public fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty) {
    cdkBuilder.clientAuthentication(clientAuthentication)
  }

  /**
   * @param clusterName The name of the cluster. 
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * @param configurationInfo Represents the configuration that you want MSK to use for the cluster.
   */
  public fun configurationInfo(configurationInfo: IResolvable) {
    cdkBuilder.configurationInfo(configurationInfo)
  }

  /**
   * @param configurationInfo Represents the configuration that you want MSK to use for the cluster.
   */
  public fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty) {
    cdkBuilder.configurationInfo(configurationInfo)
  }

  /**
   * @param currentVersion The version of the cluster that you want to update.
   */
  public fun currentVersion(currentVersion: String) {
    cdkBuilder.currentVersion(currentVersion)
  }

  /**
   * @param encryptionInfo Includes all encryption-related information.
   */
  public fun encryptionInfo(encryptionInfo: IResolvable) {
    cdkBuilder.encryptionInfo(encryptionInfo)
  }

  /**
   * @param encryptionInfo Includes all encryption-related information.
   */
  public fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty) {
    cdkBuilder.encryptionInfo(encryptionInfo)
  }

  /**
   * @param enhancedMonitoring Specifies the level of monitoring for the MSK cluster.
   * The possible values are `DEFAULT` , `PER_BROKER` , and `PER_TOPIC_PER_BROKER` .
   */
  public fun enhancedMonitoring(enhancedMonitoring: String) {
    cdkBuilder.enhancedMonitoring(enhancedMonitoring)
  }

  /**
   * @param kafkaVersion The version of Apache Kafka. 
   * You can use Amazon MSK to create clusters that use Apache Kafka versions 1.1.1 and 2.2.1.
   */
  public fun kafkaVersion(kafkaVersion: String) {
    cdkBuilder.kafkaVersion(kafkaVersion)
  }

  /**
   * @param loggingInfo Logging Info details.
   */
  public fun loggingInfo(loggingInfo: IResolvable) {
    cdkBuilder.loggingInfo(loggingInfo)
  }

  /**
   * @param loggingInfo Logging Info details.
   */
  public fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty) {
    cdkBuilder.loggingInfo(loggingInfo)
  }

  /**
   * @param numberOfBrokerNodes The number of broker nodes in the cluster. 
   */
  public fun numberOfBrokerNodes(numberOfBrokerNodes: Number) {
    cdkBuilder.numberOfBrokerNodes(numberOfBrokerNodes)
  }

  /**
   * @param openMonitoring The settings for open monitoring.
   */
  public fun openMonitoring(openMonitoring: IResolvable) {
    cdkBuilder.openMonitoring(openMonitoring)
  }

  /**
   * @param openMonitoring The settings for open monitoring.
   */
  public fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty) {
    cdkBuilder.openMonitoring(openMonitoring)
  }

  /**
   * @param storageMode This controls storage mode for supported storage tiers.
   */
  public fun storageMode(storageMode: String) {
    cdkBuilder.storageMode(storageMode)
  }

  /**
   * @param tags Create tags when creating the cluster.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnClusterProps = cdkBuilder.build()
}
