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
import software.constructs.Construct

/**
 * Creates a connector using the specified properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * CfnConnector cfnConnector = CfnConnector.Builder.create(this, "MyCfnConnector")
 * .capacity(CapacityProperty.builder()
 * .autoScaling(AutoScalingProperty.builder()
 * .maxWorkerCount(123)
 * .mcuCount(123)
 * .minWorkerCount(123)
 * .scaleInPolicy(ScaleInPolicyProperty.builder()
 * .cpuUtilizationPercentage(123)
 * .build())
 * .scaleOutPolicy(ScaleOutPolicyProperty.builder()
 * .cpuUtilizationPercentage(123)
 * .build())
 * .build())
 * .provisionedCapacity(ProvisionedCapacityProperty.builder()
 * .workerCount(123)
 * // the properties below are optional
 * .mcuCount(123)
 * .build())
 * .build())
 * .connectorConfiguration(Map.of(
 * "connectorConfigurationKey", "connectorConfiguration"))
 * .connectorName("connectorName")
 * .kafkaCluster(KafkaClusterProperty.builder()
 * .apacheKafkaCluster(ApacheKafkaClusterProperty.builder()
 * .bootstrapServers("bootstrapServers")
 * .vpc(VpcProperty.builder()
 * .securityGroups(List.of("securityGroups"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build())
 * .build())
 * .kafkaClusterClientAuthentication(KafkaClusterClientAuthenticationProperty.builder()
 * .authenticationType("authenticationType")
 * .build())
 * .kafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransitProperty.builder()
 * .encryptionType("encryptionType")
 * .build())
 * .kafkaConnectVersion("kafkaConnectVersion")
 * .plugins(List.of(PluginProperty.builder()
 * .customPlugin(CustomPluginProperty.builder()
 * .customPluginArn("customPluginArn")
 * .revision(123)
 * .build())
 * .build()))
 * .serviceExecutionRoleArn("serviceExecutionRoleArn")
 * // the properties below are optional
 * .connectorDescription("connectorDescription")
 * .logDelivery(LogDeliveryProperty.builder()
 * .workerLogDelivery(WorkerLogDeliveryProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsLogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .logGroup("logGroup")
 * .build())
 * .firehose(FirehoseLogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .deliveryStream("deliveryStream")
 * .build())
 * .s3(S3LogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .bucket("bucket")
 * .prefix("prefix")
 * .build())
 * .build())
 * .build())
 * .workerConfiguration(WorkerConfigurationProperty.builder()
 * .revision(123)
 * .workerConfigurationArn("workerConfigurationArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html)
 */
@CdkDslMarker
public class CfnConnectorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConnector.Builder = CfnConnector.Builder.create(scope, id)

  private val _plugins: MutableList<Any> = mutableListOf()

  /**
   * The connector's compute capacity settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-capacity)
   * @param capacity The connector's compute capacity settings. 
   */
  public fun capacity(capacity: IResolvable) {
    cdkBuilder.capacity(capacity)
  }

  /**
   * The connector's compute capacity settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-capacity)
   * @param capacity The connector's compute capacity settings. 
   */
  public fun capacity(capacity: CfnConnector.CapacityProperty) {
    cdkBuilder.capacity(capacity)
  }

  /**
   * The configuration of the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorconfiguration)
   * @param connectorConfiguration The configuration of the connector. 
   */
  public fun connectorConfiguration(connectorConfiguration: Map<String, String>) {
    cdkBuilder.connectorConfiguration(connectorConfiguration)
  }

  /**
   * The configuration of the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorconfiguration)
   * @param connectorConfiguration The configuration of the connector. 
   */
  public fun connectorConfiguration(connectorConfiguration: IResolvable) {
    cdkBuilder.connectorConfiguration(connectorConfiguration)
  }

  /**
   * The description of the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectordescription)
   * @param connectorDescription The description of the connector. 
   */
  public fun connectorDescription(connectorDescription: String) {
    cdkBuilder.connectorDescription(connectorDescription)
  }

  /**
   * The name of the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorname)
   * @param connectorName The name of the connector. 
   */
  public fun connectorName(connectorName: String) {
    cdkBuilder.connectorName(connectorName)
  }

  /**
   * The details of the Apache Kafka cluster to which the connector is connected.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkacluster)
   * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
   * connected. 
   */
  public fun kafkaCluster(kafkaCluster: IResolvable) {
    cdkBuilder.kafkaCluster(kafkaCluster)
  }

  /**
   * The details of the Apache Kafka cluster to which the connector is connected.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkacluster)
   * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
   * connected. 
   */
  public fun kafkaCluster(kafkaCluster: CfnConnector.KafkaClusterProperty) {
    cdkBuilder.kafkaCluster(kafkaCluster)
  }

  /**
   * The type of client authentication used to connect to the Apache Kafka cluster.
   *
   * The value is NONE when no client authentication is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterclientauthentication)
   * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
   * the Apache Kafka cluster. 
   */
  public fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: IResolvable) {
    cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication)
  }

  /**
   * The type of client authentication used to connect to the Apache Kafka cluster.
   *
   * The value is NONE when no client authentication is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterclientauthentication)
   * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
   * the Apache Kafka cluster. 
   */
  public
      fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: CfnConnector.KafkaClusterClientAuthenticationProperty) {
    cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication)
  }

  /**
   * Details of encryption in transit to the Apache Kafka cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit)
   * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
   * cluster. 
   */
  public fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: IResolvable) {
    cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit)
  }

  /**
   * Details of encryption in transit to the Apache Kafka cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit)
   * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
   * cluster. 
   */
  public
      fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: CfnConnector.KafkaClusterEncryptionInTransitProperty) {
    cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit)
  }

  /**
   * The version of Kafka Connect.
   *
   * It has to be compatible with both the Apache Kafka cluster's version and the plugins.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaconnectversion)
   * @param kafkaConnectVersion The version of Kafka Connect. 
   */
  public fun kafkaConnectVersion(kafkaConnectVersion: String) {
    cdkBuilder.kafkaConnectVersion(kafkaConnectVersion)
  }

  /**
   * The settings for delivering connector logs to Amazon CloudWatch Logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-logdelivery)
   * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs. 
   */
  public fun logDelivery(logDelivery: IResolvable) {
    cdkBuilder.logDelivery(logDelivery)
  }

  /**
   * The settings for delivering connector logs to Amazon CloudWatch Logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-logdelivery)
   * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs. 
   */
  public fun logDelivery(logDelivery: CfnConnector.LogDeliveryProperty) {
    cdkBuilder.logDelivery(logDelivery)
  }

  /**
   * Specifies which plugin to use for the connector.
   *
   * You must specify a single-element list. Amazon MSK Connect does not currently support
   * specifying multiple plugins.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-plugins)
   * @param plugins Specifies which plugin to use for the connector. 
   */
  public fun plugins(vararg plugins: Any) {
    _plugins.addAll(listOf(*plugins))
  }

  /**
   * Specifies which plugin to use for the connector.
   *
   * You must specify a single-element list. Amazon MSK Connect does not currently support
   * specifying multiple plugins.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-plugins)
   * @param plugins Specifies which plugin to use for the connector. 
   */
  public fun plugins(plugins: Collection<Any>) {
    _plugins.addAll(plugins)
  }

  /**
   * Specifies which plugin to use for the connector.
   *
   * You must specify a single-element list. Amazon MSK Connect does not currently support
   * specifying multiple plugins.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-plugins)
   * @param plugins Specifies which plugin to use for the connector. 
   */
  public fun plugins(plugins: IResolvable) {
    cdkBuilder.plugins(plugins)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web
   * Services resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-serviceexecutionrolearn)
   * @param serviceExecutionRoleArn The Amazon Resource Name (ARN) of the IAM role used by the
   * connector to access Amazon Web Services resources. 
   */
  public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
    cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
  }

  /**
   * The worker configurations that are in use with the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-workerconfiguration)
   * @param workerConfiguration The worker configurations that are in use with the connector. 
   */
  public fun workerConfiguration(workerConfiguration: IResolvable) {
    cdkBuilder.workerConfiguration(workerConfiguration)
  }

  /**
   * The worker configurations that are in use with the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-workerconfiguration)
   * @param workerConfiguration The worker configurations that are in use with the connector. 
   */
  public fun workerConfiguration(workerConfiguration: CfnConnector.WorkerConfigurationProperty) {
    cdkBuilder.workerConfiguration(workerConfiguration)
  }

  public fun build(): CfnConnector {
    if(_plugins.isNotEmpty()) cdkBuilder.plugins(_plugins)
    return cdkBuilder.build()
  }
}
