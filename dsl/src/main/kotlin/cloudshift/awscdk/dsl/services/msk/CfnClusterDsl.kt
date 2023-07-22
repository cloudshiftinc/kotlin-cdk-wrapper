@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster
import software.constructs.Construct

/**
 * Creates a new MSK cluster.
 *
 * The following Python 3.6 examples shows how you can create a cluster that's distributed over two
 * Availability Zones. Before you run this Python script, replace the example subnet and security-group
 * IDs with the IDs of your subnets and security group. When you create an MSK cluster, its brokers get
 * evenly distributed over a number of Availability Zones that's equal to the number of subnets that
 * you specify in the `BrokerNodeGroupInfo` parameter. In this example, you can add a third subnet to
 * get a cluster that's distributed over three Availability Zones.
 *
 * ```
 * import boto3 client = boto3.client('kafka') response = client.create_cluster(
 * BrokerNodeGroupInfo={ 'BrokerAZDistribution': 'DEFAULT', 'ClientSubnets': [
 * 'subnet-012345678901fedcba', 'subnet-9876543210abcdef01' ], 'InstanceType': 'kafka.m5.large',
 * 'SecurityGroups': [ 'sg-012345abcdef789789' ] }, ClusterName='SalesCluster', EncryptionInfo={
 * 'EncryptionInTransit': { 'ClientBroker': 'TLS_PLAINTEXT', 'InCluster': True } },
 * EnhancedMonitoring='PER_TOPIC_PER_BROKER', KafkaVersion='2.2.1', NumberOfBrokerNodes=2
 * ) print(response)
 * ```
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
 * .brokerNodeGroupInfo(BrokerNodeGroupInfoProperty.builder()
 * .clientSubnets(List.of("clientSubnets"))
 * .instanceType("instanceType")
 * // the properties below are optional
 * .brokerAzDistribution("brokerAzDistribution")
 * .connectivityInfo(ConnectivityInfoProperty.builder()
 * .publicAccess(PublicAccessProperty.builder()
 * .type("type")
 * .build())
 * .vpcConnectivity(VpcConnectivityProperty.builder()
 * .clientAuthentication(VpcConnectivityClientAuthenticationProperty.builder()
 * .sasl(VpcConnectivitySaslProperty.builder()
 * .iam(VpcConnectivityIamProperty.builder()
 * .enabled(false)
 * .build())
 * .scram(VpcConnectivityScramProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .tls(VpcConnectivityTlsProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .build())
 * .build())
 * .securityGroups(List.of("securityGroups"))
 * .storageInfo(StorageInfoProperty.builder()
 * .ebsStorageInfo(EBSStorageInfoProperty.builder()
 * .provisionedThroughput(ProvisionedThroughputProperty.builder()
 * .enabled(false)
 * .volumeThroughput(123)
 * .build())
 * .volumeSize(123)
 * .build())
 * .build())
 * .build())
 * .clusterName("clusterName")
 * .kafkaVersion("kafkaVersion")
 * .numberOfBrokerNodes(123)
 * // the properties below are optional
 * .clientAuthentication(ClientAuthenticationProperty.builder()
 * .sasl(SaslProperty.builder()
 * .iam(IamProperty.builder()
 * .enabled(false)
 * .build())
 * .scram(ScramProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .tls(TlsProperty.builder()
 * .certificateAuthorityArnList(List.of("certificateAuthorityArnList"))
 * .enabled(false)
 * .build())
 * .unauthenticated(UnauthenticatedProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .configurationInfo(ConfigurationInfoProperty.builder()
 * .arn("arn")
 * .revision(123)
 * .build())
 * .currentVersion("currentVersion")
 * .encryptionInfo(EncryptionInfoProperty.builder()
 * .encryptionAtRest(EncryptionAtRestProperty.builder()
 * .dataVolumeKmsKeyId("dataVolumeKmsKeyId")
 * .build())
 * .encryptionInTransit(EncryptionInTransitProperty.builder()
 * .clientBroker("clientBroker")
 * .inCluster(false)
 * .build())
 * .build())
 * .enhancedMonitoring("enhancedMonitoring")
 * .loggingInfo(LoggingInfoProperty.builder()
 * .brokerLogs(BrokerLogsProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .logGroup("logGroup")
 * .build())
 * .firehose(FirehoseProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .deliveryStream("deliveryStream")
 * .build())
 * .s3(S3Property.builder()
 * .enabled(false)
 * // the properties below are optional
 * .bucket("bucket")
 * .prefix("prefix")
 * .build())
 * .build())
 * .build())
 * .openMonitoring(OpenMonitoringProperty.builder()
 * .prometheus(PrometheusProperty.builder()
 * .jmxExporter(JmxExporterProperty.builder()
 * .enabledInBroker(false)
 * .build())
 * .nodeExporter(NodeExporterProperty.builder()
 * .enabledInBroker(false)
 * .build())
 * .build())
 * .build())
 * .storageMode("storageMode")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html)
 */
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
