@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster
import software.constructs.Construct

@CdkDslMarker
public class CfnClusterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCluster.Builder = CfnCluster.Builder.create(scope, id)

  /**
   * Information about the broker nodes in the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
   * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
   */
  public fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable) {
    cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo)
  }

  /**
   * Information about the broker nodes in the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
   * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
   */
  public fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty) {
    cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo)
  }

  /**
   * Includes all client authentication related information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
   * @param clientAuthentication Includes all client authentication related information. 
   */
  public fun clientAuthentication(clientAuthentication: IResolvable) {
    cdkBuilder.clientAuthentication(clientAuthentication)
  }

  /**
   * Includes all client authentication related information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
   * @param clientAuthentication Includes all client authentication related information. 
   */
  public fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty) {
    cdkBuilder.clientAuthentication(clientAuthentication)
  }

  /**
   * The name of the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername)
   * @param clusterName The name of the cluster. 
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * Represents the configuration that you want MSK to use for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
   * @param configurationInfo Represents the configuration that you want MSK to use for the cluster.
   * 
   */
  public fun configurationInfo(configurationInfo: IResolvable) {
    cdkBuilder.configurationInfo(configurationInfo)
  }

  /**
   * Represents the configuration that you want MSK to use for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
   * @param configurationInfo Represents the configuration that you want MSK to use for the cluster.
   * 
   */
  public fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty) {
    cdkBuilder.configurationInfo(configurationInfo)
  }

  /**
   * The version of the cluster that you want to update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-currentversion)
   * @param currentVersion The version of the cluster that you want to update. 
   */
  public fun currentVersion(currentVersion: String) {
    cdkBuilder.currentVersion(currentVersion)
  }

  /**
   * Includes all encryption-related information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
   * @param encryptionInfo Includes all encryption-related information. 
   */
  public fun encryptionInfo(encryptionInfo: IResolvable) {
    cdkBuilder.encryptionInfo(encryptionInfo)
  }

  /**
   * Includes all encryption-related information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
   * @param encryptionInfo Includes all encryption-related information. 
   */
  public fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty) {
    cdkBuilder.encryptionInfo(encryptionInfo)
  }

  /**
   * Specifies the level of monitoring for the MSK cluster.
   *
   * The possible values are `DEFAULT` , `PER_BROKER` , and `PER_TOPIC_PER_BROKER` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring)
   * @param enhancedMonitoring Specifies the level of monitoring for the MSK cluster. 
   */
  public fun enhancedMonitoring(enhancedMonitoring: String) {
    cdkBuilder.enhancedMonitoring(enhancedMonitoring)
  }

  /**
   * The version of Apache Kafka.
   *
   * You can use Amazon MSK to create clusters that use Apache Kafka versions 1.1.1 and 2.2.1.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion)
   * @param kafkaVersion The version of Apache Kafka. 
   */
  public fun kafkaVersion(kafkaVersion: String) {
    cdkBuilder.kafkaVersion(kafkaVersion)
  }

  /**
   * Logging Info details.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
   * @param loggingInfo Logging Info details. 
   */
  public fun loggingInfo(loggingInfo: IResolvable) {
    cdkBuilder.loggingInfo(loggingInfo)
  }

  /**
   * Logging Info details.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
   * @param loggingInfo Logging Info details. 
   */
  public fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty) {
    cdkBuilder.loggingInfo(loggingInfo)
  }

  /**
   * The number of broker nodes in the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes)
   * @param numberOfBrokerNodes The number of broker nodes in the cluster. 
   */
  public fun numberOfBrokerNodes(numberOfBrokerNodes: Number) {
    cdkBuilder.numberOfBrokerNodes(numberOfBrokerNodes)
  }

  /**
   * The settings for open monitoring.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
   * @param openMonitoring The settings for open monitoring. 
   */
  public fun openMonitoring(openMonitoring: IResolvable) {
    cdkBuilder.openMonitoring(openMonitoring)
  }

  /**
   * The settings for open monitoring.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
   * @param openMonitoring The settings for open monitoring. 
   */
  public fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty) {
    cdkBuilder.openMonitoring(openMonitoring)
  }

  /**
   * This controls storage mode for supported storage tiers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-storagemode)
   * @param storageMode This controls storage mode for supported storage tiers. 
   */
  public fun storageMode(storageMode: String) {
    cdkBuilder.storageMode(storageMode)
  }

  /**
   * Create tags when creating the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-tags)
   * @param tags Create tags when creating the cluster. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnCluster = cdkBuilder.build()
}
