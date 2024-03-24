@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kafkaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConnector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
 * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
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
public interface CfnConnectorProps {
  /**
   * The connector's compute capacity settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-capacity)
   */
  public fun capacity(): Any

  /**
   * The configuration of the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorconfiguration)
   */
  public fun connectorConfiguration(): Any

  /**
   * The description of the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectordescription)
   */
  public fun connectorDescription(): String? = unwrap(this).getConnectorDescription()

  /**
   * The name of the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorname)
   */
  public fun connectorName(): String

  /**
   * The details of the Apache Kafka cluster to which the connector is connected.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkacluster)
   */
  public fun kafkaCluster(): Any

  /**
   * The type of client authentication used to connect to the Apache Kafka cluster.
   *
   * The value is NONE when no client authentication is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterclientauthentication)
   */
  public fun kafkaClusterClientAuthentication(): Any

  /**
   * Details of encryption in transit to the Apache Kafka cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit)
   */
  public fun kafkaClusterEncryptionInTransit(): Any

  /**
   * The version of Kafka Connect.
   *
   * It has to be compatible with both the Apache Kafka cluster's version and the plugins.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaconnectversion)
   */
  public fun kafkaConnectVersion(): String

  /**
   * The settings for delivering connector logs to Amazon CloudWatch Logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-logdelivery)
   */
  public fun logDelivery(): Any? = unwrap(this).getLogDelivery()

  /**
   * Specifies which plugin to use for the connector.
   *
   * You must specify a single-element list. Amazon MSK Connect does not currently support
   * specifying multiple plugins.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-plugins)
   */
  public fun plugins(): Any

  /**
   * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web
   * Services resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-serviceexecutionrolearn)
   */
  public fun serviceExecutionRoleArn(): String

  /**
   * The worker configurations that are in use with the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-workerconfiguration)
   */
  public fun workerConfiguration(): Any? = unwrap(this).getWorkerConfiguration()

  /**
   * A builder for [CfnConnectorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacity The connector's compute capacity settings. 
     */
    public fun capacity(capacity: IResolvable)

    /**
     * @param capacity The connector's compute capacity settings. 
     */
    public fun capacity(capacity: CfnConnector.CapacityProperty)

    /**
     * @param capacity The connector's compute capacity settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8b2479a80263b65c2fcbd5ce8331689fde62b2dfd36a9f48d5982e9851c2f03")
    public fun capacity(capacity: CfnConnector.CapacityProperty.Builder.() -> Unit)

    /**
     * @param connectorConfiguration The configuration of the connector. 
     */
    public fun connectorConfiguration(connectorConfiguration: IResolvable)

    /**
     * @param connectorConfiguration The configuration of the connector. 
     */
    public fun connectorConfiguration(connectorConfiguration: Map<String, String>)

    /**
     * @param connectorDescription The description of the connector.
     */
    public fun connectorDescription(connectorDescription: String)

    /**
     * @param connectorName The name of the connector. 
     */
    public fun connectorName(connectorName: String)

    /**
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    public fun kafkaCluster(kafkaCluster: IResolvable)

    /**
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    public fun kafkaCluster(kafkaCluster: CfnConnector.KafkaClusterProperty)

    /**
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdba5b4d307c8c1b332e87c30ea7c51e2986281f630f731826c9a2bd8b4f0f95")
    public fun kafkaCluster(kafkaCluster: CfnConnector.KafkaClusterProperty.Builder.() -> Unit)

    /**
     * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
     * the Apache Kafka cluster. 
     * The value is NONE when no client authentication is used.
     */
    public fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: IResolvable)

    /**
     * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
     * the Apache Kafka cluster. 
     * The value is NONE when no client authentication is used.
     */
    public
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: CfnConnector.KafkaClusterClientAuthenticationProperty)

    /**
     * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
     * the Apache Kafka cluster. 
     * The value is NONE when no client authentication is used.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea4a628ca5d52f12a25b0cf83ba2aab7d075d6ee72fbe7bcaf4b2dcef26da605")
    public
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: CfnConnector.KafkaClusterClientAuthenticationProperty.Builder.() -> Unit)

    /**
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    public fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: IResolvable)

    /**
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    public
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: CfnConnector.KafkaClusterEncryptionInTransitProperty)

    /**
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94067a03a06d3ea822ab00733e544d45cbf4661b94bf5c1cc044ea3465488449")
    public
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: CfnConnector.KafkaClusterEncryptionInTransitProperty.Builder.() -> Unit)

    /**
     * @param kafkaConnectVersion The version of Kafka Connect. 
     * It has to be compatible with both the Apache Kafka cluster's version and the plugins.
     */
    public fun kafkaConnectVersion(kafkaConnectVersion: String)

    /**
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs.
     */
    public fun logDelivery(logDelivery: IResolvable)

    /**
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs.
     */
    public fun logDelivery(logDelivery: CfnConnector.LogDeliveryProperty)

    /**
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd3b926248f58f68b73d7fbf57f6879c44df865b55422e3fff5e97429ff3ceb4")
    public fun logDelivery(logDelivery: CfnConnector.LogDeliveryProperty.Builder.() -> Unit)

    /**
     * @param plugins Specifies which plugin to use for the connector. 
     * You must specify a single-element list. Amazon MSK Connect does not currently support
     * specifying multiple plugins.
     */
    public fun plugins(plugins: IResolvable)

    /**
     * @param plugins Specifies which plugin to use for the connector. 
     * You must specify a single-element list. Amazon MSK Connect does not currently support
     * specifying multiple plugins.
     */
    public fun plugins(plugins: List<Any>)

    /**
     * @param plugins Specifies which plugin to use for the connector. 
     * You must specify a single-element list. Amazon MSK Connect does not currently support
     * specifying multiple plugins.
     */
    public fun plugins(vararg plugins: Any)

    /**
     * @param serviceExecutionRoleArn The Amazon Resource Name (ARN) of the IAM role used by the
     * connector to access Amazon Web Services resources. 
     */
    public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String)

    /**
     * @param workerConfiguration The worker configurations that are in use with the connector.
     */
    public fun workerConfiguration(workerConfiguration: IResolvable)

    /**
     * @param workerConfiguration The worker configurations that are in use with the connector.
     */
    public fun workerConfiguration(workerConfiguration: CfnConnector.WorkerConfigurationProperty)

    /**
     * @param workerConfiguration The worker configurations that are in use with the connector.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54796cd539cae1f3ff008337ebc187a07d7bd6236baa88aed258f060927167c9")
    public
        fun workerConfiguration(workerConfiguration: CfnConnector.WorkerConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps.Builder =
        software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps.builder()

    /**
     * @param capacity The connector's compute capacity settings. 
     */
    override fun capacity(capacity: IResolvable) {
      cdkBuilder.capacity(capacity.let(IResolvable::unwrap))
    }

    /**
     * @param capacity The connector's compute capacity settings. 
     */
    override fun capacity(capacity: CfnConnector.CapacityProperty) {
      cdkBuilder.capacity(capacity.let(CfnConnector.CapacityProperty::unwrap))
    }

    /**
     * @param capacity The connector's compute capacity settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8b2479a80263b65c2fcbd5ce8331689fde62b2dfd36a9f48d5982e9851c2f03")
    override fun capacity(capacity: CfnConnector.CapacityProperty.Builder.() -> Unit): Unit =
        capacity(CfnConnector.CapacityProperty(capacity))

    /**
     * @param connectorConfiguration The configuration of the connector. 
     */
    override fun connectorConfiguration(connectorConfiguration: IResolvable) {
      cdkBuilder.connectorConfiguration(connectorConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param connectorConfiguration The configuration of the connector. 
     */
    override fun connectorConfiguration(connectorConfiguration: Map<String, String>) {
      cdkBuilder.connectorConfiguration(connectorConfiguration)
    }

    /**
     * @param connectorDescription The description of the connector.
     */
    override fun connectorDescription(connectorDescription: String) {
      cdkBuilder.connectorDescription(connectorDescription)
    }

    /**
     * @param connectorName The name of the connector. 
     */
    override fun connectorName(connectorName: String) {
      cdkBuilder.connectorName(connectorName)
    }

    /**
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    override fun kafkaCluster(kafkaCluster: IResolvable) {
      cdkBuilder.kafkaCluster(kafkaCluster.let(IResolvable::unwrap))
    }

    /**
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    override fun kafkaCluster(kafkaCluster: CfnConnector.KafkaClusterProperty) {
      cdkBuilder.kafkaCluster(kafkaCluster.let(CfnConnector.KafkaClusterProperty::unwrap))
    }

    /**
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdba5b4d307c8c1b332e87c30ea7c51e2986281f630f731826c9a2bd8b4f0f95")
    override fun kafkaCluster(kafkaCluster: CfnConnector.KafkaClusterProperty.Builder.() -> Unit):
        Unit = kafkaCluster(CfnConnector.KafkaClusterProperty(kafkaCluster))

    /**
     * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
     * the Apache Kafka cluster. 
     * The value is NONE when no client authentication is used.
     */
    override fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: IResolvable) {
      cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication.let(IResolvable::unwrap))
    }

    /**
     * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
     * the Apache Kafka cluster. 
     * The value is NONE when no client authentication is used.
     */
    override
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: CfnConnector.KafkaClusterClientAuthenticationProperty) {
      cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication.let(CfnConnector.KafkaClusterClientAuthenticationProperty::unwrap))
    }

    /**
     * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
     * the Apache Kafka cluster. 
     * The value is NONE when no client authentication is used.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea4a628ca5d52f12a25b0cf83ba2aab7d075d6ee72fbe7bcaf4b2dcef26da605")
    override
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: CfnConnector.KafkaClusterClientAuthenticationProperty.Builder.() -> Unit):
        Unit =
        kafkaClusterClientAuthentication(CfnConnector.KafkaClusterClientAuthenticationProperty(kafkaClusterClientAuthentication))

    /**
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    override fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: IResolvable) {
      cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit.let(IResolvable::unwrap))
    }

    /**
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    override
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: CfnConnector.KafkaClusterEncryptionInTransitProperty) {
      cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit.let(CfnConnector.KafkaClusterEncryptionInTransitProperty::unwrap))
    }

    /**
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94067a03a06d3ea822ab00733e544d45cbf4661b94bf5c1cc044ea3465488449")
    override
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: CfnConnector.KafkaClusterEncryptionInTransitProperty.Builder.() -> Unit):
        Unit =
        kafkaClusterEncryptionInTransit(CfnConnector.KafkaClusterEncryptionInTransitProperty(kafkaClusterEncryptionInTransit))

    /**
     * @param kafkaConnectVersion The version of Kafka Connect. 
     * It has to be compatible with both the Apache Kafka cluster's version and the plugins.
     */
    override fun kafkaConnectVersion(kafkaConnectVersion: String) {
      cdkBuilder.kafkaConnectVersion(kafkaConnectVersion)
    }

    /**
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs.
     */
    override fun logDelivery(logDelivery: IResolvable) {
      cdkBuilder.logDelivery(logDelivery.let(IResolvable::unwrap))
    }

    /**
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs.
     */
    override fun logDelivery(logDelivery: CfnConnector.LogDeliveryProperty) {
      cdkBuilder.logDelivery(logDelivery.let(CfnConnector.LogDeliveryProperty::unwrap))
    }

    /**
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd3b926248f58f68b73d7fbf57f6879c44df865b55422e3fff5e97429ff3ceb4")
    override fun logDelivery(logDelivery: CfnConnector.LogDeliveryProperty.Builder.() -> Unit): Unit
        = logDelivery(CfnConnector.LogDeliveryProperty(logDelivery))

    /**
     * @param plugins Specifies which plugin to use for the connector. 
     * You must specify a single-element list. Amazon MSK Connect does not currently support
     * specifying multiple plugins.
     */
    override fun plugins(plugins: IResolvable) {
      cdkBuilder.plugins(plugins.let(IResolvable::unwrap))
    }

    /**
     * @param plugins Specifies which plugin to use for the connector. 
     * You must specify a single-element list. Amazon MSK Connect does not currently support
     * specifying multiple plugins.
     */
    override fun plugins(plugins: List<Any>) {
      cdkBuilder.plugins(plugins.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param plugins Specifies which plugin to use for the connector. 
     * You must specify a single-element list. Amazon MSK Connect does not currently support
     * specifying multiple plugins.
     */
    override fun plugins(vararg plugins: Any): Unit = plugins(plugins.toList())

    /**
     * @param serviceExecutionRoleArn The Amazon Resource Name (ARN) of the IAM role used by the
     * connector to access Amazon Web Services resources. 
     */
    override fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
      cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
    }

    /**
     * @param workerConfiguration The worker configurations that are in use with the connector.
     */
    override fun workerConfiguration(workerConfiguration: IResolvable) {
      cdkBuilder.workerConfiguration(workerConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param workerConfiguration The worker configurations that are in use with the connector.
     */
    override
        fun workerConfiguration(workerConfiguration: CfnConnector.WorkerConfigurationProperty) {
      cdkBuilder.workerConfiguration(workerConfiguration.let(CfnConnector.WorkerConfigurationProperty::unwrap))
    }

    /**
     * @param workerConfiguration The worker configurations that are in use with the connector.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54796cd539cae1f3ff008337ebc187a07d7bd6236baa88aed258f060927167c9")
    override
        fun workerConfiguration(workerConfiguration: CfnConnector.WorkerConfigurationProperty.Builder.() -> Unit):
        Unit = workerConfiguration(CfnConnector.WorkerConfigurationProperty(workerConfiguration))

    public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps,
  ) : CdkObject(cdkObject), CfnConnectorProps {
    /**
     * The connector's compute capacity settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-capacity)
     */
    override fun capacity(): Any = unwrap(this).getCapacity()

    /**
     * The configuration of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorconfiguration)
     */
    override fun connectorConfiguration(): Any = unwrap(this).getConnectorConfiguration()

    /**
     * The description of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectordescription)
     */
    override fun connectorDescription(): String? = unwrap(this).getConnectorDescription()

    /**
     * The name of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorname)
     */
    override fun connectorName(): String = unwrap(this).getConnectorName()

    /**
     * The details of the Apache Kafka cluster to which the connector is connected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkacluster)
     */
    override fun kafkaCluster(): Any = unwrap(this).getKafkaCluster()

    /**
     * The type of client authentication used to connect to the Apache Kafka cluster.
     *
     * The value is NONE when no client authentication is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterclientauthentication)
     */
    override fun kafkaClusterClientAuthentication(): Any =
        unwrap(this).getKafkaClusterClientAuthentication()

    /**
     * Details of encryption in transit to the Apache Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit)
     */
    override fun kafkaClusterEncryptionInTransit(): Any =
        unwrap(this).getKafkaClusterEncryptionInTransit()

    /**
     * The version of Kafka Connect.
     *
     * It has to be compatible with both the Apache Kafka cluster's version and the plugins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaconnectversion)
     */
    override fun kafkaConnectVersion(): String = unwrap(this).getKafkaConnectVersion()

    /**
     * The settings for delivering connector logs to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-logdelivery)
     */
    override fun logDelivery(): Any? = unwrap(this).getLogDelivery()

    /**
     * Specifies which plugin to use for the connector.
     *
     * You must specify a single-element list. Amazon MSK Connect does not currently support
     * specifying multiple plugins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-plugins)
     */
    override fun plugins(): Any = unwrap(this).getPlugins()

    /**
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web
     * Services resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-serviceexecutionrolearn)
     */
    override fun serviceExecutionRoleArn(): String = unwrap(this).getServiceExecutionRoleArn()

    /**
     * The worker configurations that are in use with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-workerconfiguration)
     */
    override fun workerConfiguration(): Any? = unwrap(this).getWorkerConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps):
        CfnConnectorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConnectorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProps):
        software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps
  }
}
