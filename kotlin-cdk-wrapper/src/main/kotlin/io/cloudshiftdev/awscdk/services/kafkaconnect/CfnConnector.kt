@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kafkaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a connector using the specified properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
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
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workerConfiguration(WorkerConfigurationProperty.builder()
 * .revision(123)
 * .workerConfigurationArn("workerConfigurationArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html)
 */
public open class CfnConnector(
  cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectorProps,
  ) :
      this(software.amazon.awscdk.services.kafkaconnect.CfnConnector(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConnectorProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectorProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the newly created connector.
   */
  public open fun attrConnectorArn(): String = unwrap(this).getAttrConnectorArn()

  /**
   * The connector's compute capacity settings.
   */
  public open fun capacity(): Any = unwrap(this).getCapacity()

  /**
   * The connector's compute capacity settings.
   */
  public open fun capacity(`value`: IResolvable) {
    unwrap(this).setCapacity(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The connector's compute capacity settings.
   */
  public open fun capacity(`value`: CapacityProperty) {
    unwrap(this).setCapacity(`value`.let(CapacityProperty.Companion::unwrap))
  }

  /**
   * The connector's compute capacity settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f7e37a8165fad58bd8ca4dadf760ea39c593867ba513098dc0a5b1b868bcda0e")
  public open fun capacity(`value`: CapacityProperty.Builder.() -> Unit): Unit =
      capacity(CapacityProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The configuration of the connector.
   */
  public open fun connectorConfiguration(): Any = unwrap(this).getConnectorConfiguration()

  /**
   * The configuration of the connector.
   */
  public open fun connectorConfiguration(`value`: IResolvable) {
    unwrap(this).setConnectorConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration of the connector.
   */
  public open fun connectorConfiguration(`value`: Map<String, String>) {
    unwrap(this).setConnectorConfiguration(`value`)
  }

  /**
   * The description of the connector.
   */
  public open fun connectorDescription(): String? = unwrap(this).getConnectorDescription()

  /**
   * The description of the connector.
   */
  public open fun connectorDescription(`value`: String) {
    unwrap(this).setConnectorDescription(`value`)
  }

  /**
   * The name of the connector.
   */
  public open fun connectorName(): String = unwrap(this).getConnectorName()

  /**
   * The name of the connector.
   */
  public open fun connectorName(`value`: String) {
    unwrap(this).setConnectorName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The details of the Apache Kafka cluster to which the connector is connected.
   */
  public open fun kafkaCluster(): Any = unwrap(this).getKafkaCluster()

  /**
   * The details of the Apache Kafka cluster to which the connector is connected.
   */
  public open fun kafkaCluster(`value`: IResolvable) {
    unwrap(this).setKafkaCluster(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The details of the Apache Kafka cluster to which the connector is connected.
   */
  public open fun kafkaCluster(`value`: KafkaClusterProperty) {
    unwrap(this).setKafkaCluster(`value`.let(KafkaClusterProperty.Companion::unwrap))
  }

  /**
   * The details of the Apache Kafka cluster to which the connector is connected.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c0e47e22de36a4f98192c47657ee6c8dd1b1f1de05174f172ee3a41e097a737")
  public open fun kafkaCluster(`value`: KafkaClusterProperty.Builder.() -> Unit): Unit =
      kafkaCluster(KafkaClusterProperty(`value`))

  /**
   * The type of client authentication used to connect to the Apache Kafka cluster.
   */
  public open fun kafkaClusterClientAuthentication(): Any =
      unwrap(this).getKafkaClusterClientAuthentication()

  /**
   * The type of client authentication used to connect to the Apache Kafka cluster.
   */
  public open fun kafkaClusterClientAuthentication(`value`: IResolvable) {
    unwrap(this).setKafkaClusterClientAuthentication(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The type of client authentication used to connect to the Apache Kafka cluster.
   */
  public open
      fun kafkaClusterClientAuthentication(`value`: KafkaClusterClientAuthenticationProperty) {
    unwrap(this).setKafkaClusterClientAuthentication(`value`.let(KafkaClusterClientAuthenticationProperty.Companion::unwrap))
  }

  /**
   * The type of client authentication used to connect to the Apache Kafka cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79f285b1768271cd3be075cb630d67e839424702cf6975ad35304c87853810be")
  public open
      fun kafkaClusterClientAuthentication(`value`: KafkaClusterClientAuthenticationProperty.Builder.() -> Unit):
      Unit = kafkaClusterClientAuthentication(KafkaClusterClientAuthenticationProperty(`value`))

  /**
   * Details of encryption in transit to the Apache Kafka cluster.
   */
  public open fun kafkaClusterEncryptionInTransit(): Any =
      unwrap(this).getKafkaClusterEncryptionInTransit()

  /**
   * Details of encryption in transit to the Apache Kafka cluster.
   */
  public open fun kafkaClusterEncryptionInTransit(`value`: IResolvable) {
    unwrap(this).setKafkaClusterEncryptionInTransit(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Details of encryption in transit to the Apache Kafka cluster.
   */
  public open
      fun kafkaClusterEncryptionInTransit(`value`: KafkaClusterEncryptionInTransitProperty) {
    unwrap(this).setKafkaClusterEncryptionInTransit(`value`.let(KafkaClusterEncryptionInTransitProperty.Companion::unwrap))
  }

  /**
   * Details of encryption in transit to the Apache Kafka cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c2af4dc530628fa4bf04a3253299a8e6a7e8f88d647158f48e9e6ff39085da0f")
  public open
      fun kafkaClusterEncryptionInTransit(`value`: KafkaClusterEncryptionInTransitProperty.Builder.() -> Unit):
      Unit = kafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransitProperty(`value`))

  /**
   * The version of Kafka Connect.
   */
  public open fun kafkaConnectVersion(): String = unwrap(this).getKafkaConnectVersion()

  /**
   * The version of Kafka Connect.
   */
  public open fun kafkaConnectVersion(`value`: String) {
    unwrap(this).setKafkaConnectVersion(`value`)
  }

  /**
   * The settings for delivering connector logs to Amazon CloudWatch Logs.
   */
  public open fun logDelivery(): Any? = unwrap(this).getLogDelivery()

  /**
   * The settings for delivering connector logs to Amazon CloudWatch Logs.
   */
  public open fun logDelivery(`value`: IResolvable) {
    unwrap(this).setLogDelivery(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings for delivering connector logs to Amazon CloudWatch Logs.
   */
  public open fun logDelivery(`value`: LogDeliveryProperty) {
    unwrap(this).setLogDelivery(`value`.let(LogDeliveryProperty.Companion::unwrap))
  }

  /**
   * The settings for delivering connector logs to Amazon CloudWatch Logs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ba8063ca6ae1282c0cc30eebc46c9f7dba7cf41362886298daadff631ddcba43")
  public open fun logDelivery(`value`: LogDeliveryProperty.Builder.() -> Unit): Unit =
      logDelivery(LogDeliveryProperty(`value`))

  /**
   * Specifies which plugin to use for the connector.
   */
  public open fun plugins(): Any = unwrap(this).getPlugins()

  /**
   * Specifies which plugin to use for the connector.
   */
  public open fun plugins(`value`: IResolvable) {
    unwrap(this).setPlugins(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies which plugin to use for the connector.
   */
  public open fun plugins(`value`: List<Any>) {
    unwrap(this).setPlugins(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies which plugin to use for the connector.
   */
  public open fun plugins(vararg `value`: Any): Unit = plugins(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web
   * Services resources.
   */
  public open fun serviceExecutionRoleArn(): String = unwrap(this).getServiceExecutionRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web
   * Services resources.
   */
  public open fun serviceExecutionRoleArn(`value`: String) {
    unwrap(this).setServiceExecutionRoleArn(`value`)
  }

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The worker configurations that are in use with the connector.
   */
  public open fun workerConfiguration(): Any? = unwrap(this).getWorkerConfiguration()

  /**
   * The worker configurations that are in use with the connector.
   */
  public open fun workerConfiguration(`value`: IResolvable) {
    unwrap(this).setWorkerConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The worker configurations that are in use with the connector.
   */
  public open fun workerConfiguration(`value`: WorkerConfigurationProperty) {
    unwrap(this).setWorkerConfiguration(`value`.let(WorkerConfigurationProperty.Companion::unwrap))
  }

  /**
   * The worker configurations that are in use with the connector.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("14acaf9e89d56cd6383140fdebf7fa0f87dfbbd537fedc5b2a349c3141c89c27")
  public open fun workerConfiguration(`value`: WorkerConfigurationProperty.Builder.() -> Unit): Unit
      = workerConfiguration(WorkerConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kafkaconnect.CfnConnector].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The connector's compute capacity settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-capacity)
     * @param capacity The connector's compute capacity settings. 
     */
    public fun capacity(capacity: IResolvable)

    /**
     * The connector's compute capacity settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-capacity)
     * @param capacity The connector's compute capacity settings. 
     */
    public fun capacity(capacity: CapacityProperty)

    /**
     * The connector's compute capacity settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-capacity)
     * @param capacity The connector's compute capacity settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a28e3fe727ebac0ff0a0c39d565ebe0ca4f8d289a499b54b7ce74470c870616e")
    public fun capacity(capacity: CapacityProperty.Builder.() -> Unit)

    /**
     * The configuration of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorconfiguration)
     * @param connectorConfiguration The configuration of the connector. 
     */
    public fun connectorConfiguration(connectorConfiguration: IResolvable)

    /**
     * The configuration of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorconfiguration)
     * @param connectorConfiguration The configuration of the connector. 
     */
    public fun connectorConfiguration(connectorConfiguration: Map<String, String>)

    /**
     * The description of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectordescription)
     * @param connectorDescription The description of the connector. 
     */
    public fun connectorDescription(connectorDescription: String)

    /**
     * The name of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorname)
     * @param connectorName The name of the connector. 
     */
    public fun connectorName(connectorName: String)

    /**
     * The details of the Apache Kafka cluster to which the connector is connected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkacluster)
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    public fun kafkaCluster(kafkaCluster: IResolvable)

    /**
     * The details of the Apache Kafka cluster to which the connector is connected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkacluster)
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    public fun kafkaCluster(kafkaCluster: KafkaClusterProperty)

    /**
     * The details of the Apache Kafka cluster to which the connector is connected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkacluster)
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6dd773d181ed0aac254e294d037bc872f93ed1faa5933c0b07a1fbe36bab8323")
    public fun kafkaCluster(kafkaCluster: KafkaClusterProperty.Builder.() -> Unit)

    /**
     * The type of client authentication used to connect to the Apache Kafka cluster.
     *
     * The value is NONE when no client authentication is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterclientauthentication)
     * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
     * the Apache Kafka cluster. 
     */
    public fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: IResolvable)

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
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: KafkaClusterClientAuthenticationProperty)

    /**
     * The type of client authentication used to connect to the Apache Kafka cluster.
     *
     * The value is NONE when no client authentication is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterclientauthentication)
     * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
     * the Apache Kafka cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4386cc0e7a881c7a4d570341e558095b4cb16641d63304fb27cc11b2df26947c")
    public
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: KafkaClusterClientAuthenticationProperty.Builder.() -> Unit)

    /**
     * Details of encryption in transit to the Apache Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit)
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    public fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: IResolvable)

    /**
     * Details of encryption in transit to the Apache Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit)
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    public
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransitProperty)

    /**
     * Details of encryption in transit to the Apache Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit)
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8474bab3c67b6e75611f207f74ca61ff26cd36b858d794c209bce165ff793796")
    public
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransitProperty.Builder.() -> Unit)

    /**
     * The version of Kafka Connect.
     *
     * It has to be compatible with both the Apache Kafka cluster's version and the plugins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaconnectversion)
     * @param kafkaConnectVersion The version of Kafka Connect. 
     */
    public fun kafkaConnectVersion(kafkaConnectVersion: String)

    /**
     * The settings for delivering connector logs to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-logdelivery)
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs. 
     */
    public fun logDelivery(logDelivery: IResolvable)

    /**
     * The settings for delivering connector logs to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-logdelivery)
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs. 
     */
    public fun logDelivery(logDelivery: LogDeliveryProperty)

    /**
     * The settings for delivering connector logs to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-logdelivery)
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("438bb8f4ab1ca2fd3d0c88e2fcc1da1690c4f7d73960a884e35fc6a0f2bd182a")
    public fun logDelivery(logDelivery: LogDeliveryProperty.Builder.() -> Unit)

    /**
     * Specifies which plugin to use for the connector.
     *
     * You must specify a single-element list. Amazon MSK Connect does not currently support
     * specifying multiple plugins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-plugins)
     * @param plugins Specifies which plugin to use for the connector. 
     */
    public fun plugins(plugins: IResolvable)

    /**
     * Specifies which plugin to use for the connector.
     *
     * You must specify a single-element list. Amazon MSK Connect does not currently support
     * specifying multiple plugins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-plugins)
     * @param plugins Specifies which plugin to use for the connector. 
     */
    public fun plugins(plugins: List<Any>)

    /**
     * Specifies which plugin to use for the connector.
     *
     * You must specify a single-element list. Amazon MSK Connect does not currently support
     * specifying multiple plugins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-plugins)
     * @param plugins Specifies which plugin to use for the connector. 
     */
    public fun plugins(vararg plugins: Any)

    /**
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web
     * Services resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-serviceexecutionrolearn)
     * @param serviceExecutionRoleArn The Amazon Resource Name (ARN) of the IAM role used by the
     * connector to access Amazon Web Services resources. 
     */
    public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The worker configurations that are in use with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-workerconfiguration)
     * @param workerConfiguration The worker configurations that are in use with the connector. 
     */
    public fun workerConfiguration(workerConfiguration: IResolvable)

    /**
     * The worker configurations that are in use with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-workerconfiguration)
     * @param workerConfiguration The worker configurations that are in use with the connector. 
     */
    public fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty)

    /**
     * The worker configurations that are in use with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-workerconfiguration)
     * @param workerConfiguration The worker configurations that are in use with the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97114309572ef97b5be882f0acf8eb370e3aed681ea88fa18771b0331c921bd0")
    public
        fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kafkaconnect.CfnConnector.Builder =
        software.amazon.awscdk.services.kafkaconnect.CfnConnector.Builder.create(scope, id)

    /**
     * The connector's compute capacity settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-capacity)
     * @param capacity The connector's compute capacity settings. 
     */
    override fun capacity(capacity: IResolvable) {
      cdkBuilder.capacity(capacity.let(IResolvable.Companion::unwrap))
    }

    /**
     * The connector's compute capacity settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-capacity)
     * @param capacity The connector's compute capacity settings. 
     */
    override fun capacity(capacity: CapacityProperty) {
      cdkBuilder.capacity(capacity.let(CapacityProperty.Companion::unwrap))
    }

    /**
     * The connector's compute capacity settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-capacity)
     * @param capacity The connector's compute capacity settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a28e3fe727ebac0ff0a0c39d565ebe0ca4f8d289a499b54b7ce74470c870616e")
    override fun capacity(capacity: CapacityProperty.Builder.() -> Unit): Unit =
        capacity(CapacityProperty(capacity))

    /**
     * The configuration of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorconfiguration)
     * @param connectorConfiguration The configuration of the connector. 
     */
    override fun connectorConfiguration(connectorConfiguration: IResolvable) {
      cdkBuilder.connectorConfiguration(connectorConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorconfiguration)
     * @param connectorConfiguration The configuration of the connector. 
     */
    override fun connectorConfiguration(connectorConfiguration: Map<String, String>) {
      cdkBuilder.connectorConfiguration(connectorConfiguration)
    }

    /**
     * The description of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectordescription)
     * @param connectorDescription The description of the connector. 
     */
    override fun connectorDescription(connectorDescription: String) {
      cdkBuilder.connectorDescription(connectorDescription)
    }

    /**
     * The name of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-connectorname)
     * @param connectorName The name of the connector. 
     */
    override fun connectorName(connectorName: String) {
      cdkBuilder.connectorName(connectorName)
    }

    /**
     * The details of the Apache Kafka cluster to which the connector is connected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkacluster)
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    override fun kafkaCluster(kafkaCluster: IResolvable) {
      cdkBuilder.kafkaCluster(kafkaCluster.let(IResolvable.Companion::unwrap))
    }

    /**
     * The details of the Apache Kafka cluster to which the connector is connected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkacluster)
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    override fun kafkaCluster(kafkaCluster: KafkaClusterProperty) {
      cdkBuilder.kafkaCluster(kafkaCluster.let(KafkaClusterProperty.Companion::unwrap))
    }

    /**
     * The details of the Apache Kafka cluster to which the connector is connected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkacluster)
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     * connected. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6dd773d181ed0aac254e294d037bc872f93ed1faa5933c0b07a1fbe36bab8323")
    override fun kafkaCluster(kafkaCluster: KafkaClusterProperty.Builder.() -> Unit): Unit =
        kafkaCluster(KafkaClusterProperty(kafkaCluster))

    /**
     * The type of client authentication used to connect to the Apache Kafka cluster.
     *
     * The value is NONE when no client authentication is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterclientauthentication)
     * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
     * the Apache Kafka cluster. 
     */
    override fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: IResolvable) {
      cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication.let(IResolvable.Companion::unwrap))
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
    override
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: KafkaClusterClientAuthenticationProperty) {
      cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication.let(KafkaClusterClientAuthenticationProperty.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4386cc0e7a881c7a4d570341e558095b4cb16641d63304fb27cc11b2df26947c")
    override
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: KafkaClusterClientAuthenticationProperty.Builder.() -> Unit):
        Unit =
        kafkaClusterClientAuthentication(KafkaClusterClientAuthenticationProperty(kafkaClusterClientAuthentication))

    /**
     * Details of encryption in transit to the Apache Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit)
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    override fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: IResolvable) {
      cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit.let(IResolvable.Companion::unwrap))
    }

    /**
     * Details of encryption in transit to the Apache Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit)
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    override
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransitProperty) {
      cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit.let(KafkaClusterEncryptionInTransitProperty.Companion::unwrap))
    }

    /**
     * Details of encryption in transit to the Apache Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit)
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8474bab3c67b6e75611f207f74ca61ff26cd36b858d794c209bce165ff793796")
    override
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransitProperty.Builder.() -> Unit):
        Unit =
        kafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransitProperty(kafkaClusterEncryptionInTransit))

    /**
     * The version of Kafka Connect.
     *
     * It has to be compatible with both the Apache Kafka cluster's version and the plugins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-kafkaconnectversion)
     * @param kafkaConnectVersion The version of Kafka Connect. 
     */
    override fun kafkaConnectVersion(kafkaConnectVersion: String) {
      cdkBuilder.kafkaConnectVersion(kafkaConnectVersion)
    }

    /**
     * The settings for delivering connector logs to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-logdelivery)
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs. 
     */
    override fun logDelivery(logDelivery: IResolvable) {
      cdkBuilder.logDelivery(logDelivery.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings for delivering connector logs to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-logdelivery)
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs. 
     */
    override fun logDelivery(logDelivery: LogDeliveryProperty) {
      cdkBuilder.logDelivery(logDelivery.let(LogDeliveryProperty.Companion::unwrap))
    }

    /**
     * The settings for delivering connector logs to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-logdelivery)
     * @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("438bb8f4ab1ca2fd3d0c88e2fcc1da1690c4f7d73960a884e35fc6a0f2bd182a")
    override fun logDelivery(logDelivery: LogDeliveryProperty.Builder.() -> Unit): Unit =
        logDelivery(LogDeliveryProperty(logDelivery))

    /**
     * Specifies which plugin to use for the connector.
     *
     * You must specify a single-element list. Amazon MSK Connect does not currently support
     * specifying multiple plugins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-plugins)
     * @param plugins Specifies which plugin to use for the connector. 
     */
    override fun plugins(plugins: IResolvable) {
      cdkBuilder.plugins(plugins.let(IResolvable.Companion::unwrap))
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
    override fun plugins(plugins: List<Any>) {
      cdkBuilder.plugins(plugins.map{CdkObjectWrappers.unwrap(it)})
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
    override fun plugins(vararg plugins: Any): Unit = plugins(plugins.toList())

    /**
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web
     * Services resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-serviceexecutionrolearn)
     * @param serviceExecutionRoleArn The Amazon Resource Name (ARN) of the IAM role used by the
     * connector to access Amazon Web Services resources. 
     */
    override fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
      cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The worker configurations that are in use with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-workerconfiguration)
     * @param workerConfiguration The worker configurations that are in use with the connector. 
     */
    override fun workerConfiguration(workerConfiguration: IResolvable) {
      cdkBuilder.workerConfiguration(workerConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The worker configurations that are in use with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-workerconfiguration)
     * @param workerConfiguration The worker configurations that are in use with the connector. 
     */
    override fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty) {
      cdkBuilder.workerConfiguration(workerConfiguration.let(WorkerConfigurationProperty.Companion::unwrap))
    }

    /**
     * The worker configurations that are in use with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html#cfn-kafkaconnect-connector-workerconfiguration)
     * @param workerConfiguration The worker configurations that are in use with the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97114309572ef97b5be882f0acf8eb370e3aed681ea88fa18771b0331c921bd0")
    override
        fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty.Builder.() -> Unit):
        Unit = workerConfiguration(WorkerConfigurationProperty(workerConfiguration))

    public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnConnector =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kafkaconnect.CfnConnector.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector):
        CfnConnector = CfnConnector(cdkObject)

    internal fun unwrap(wrapped: CfnConnector):
        software.amazon.awscdk.services.kafkaconnect.CfnConnector = wrapped.cdkObject as
        software.amazon.awscdk.services.kafkaconnect.CfnConnector
  }

  /**
   * The details of the Apache Kafka cluster to which the connector is connected.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * ApacheKafkaClusterProperty apacheKafkaClusterProperty = ApacheKafkaClusterProperty.builder()
   * .bootstrapServers("bootstrapServers")
   * .vpc(VpcProperty.builder()
   * .securityGroups(List.of("securityGroups"))
   * .subnets(List.of("subnets"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-apachekafkacluster.html)
   */
  public interface ApacheKafkaClusterProperty {
    /**
     * The bootstrap servers of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-apachekafkacluster.html#cfn-kafkaconnect-connector-apachekafkacluster-bootstrapservers)
     */
    public fun bootstrapServers(): String

    /**
     * Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-apachekafkacluster.html#cfn-kafkaconnect-connector-apachekafkacluster-vpc)
     */
    public fun vpc(): Any

    /**
     * A builder for [ApacheKafkaClusterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bootstrapServers The bootstrap servers of the cluster. 
       */
      public fun bootstrapServers(bootstrapServers: String)

      /**
       * @param vpc Details of an Amazon VPC which has network connectivity to the Apache Kafka
       * cluster. 
       */
      public fun vpc(vpc: IResolvable)

      /**
       * @param vpc Details of an Amazon VPC which has network connectivity to the Apache Kafka
       * cluster. 
       */
      public fun vpc(vpc: VpcProperty)

      /**
       * @param vpc Details of an Amazon VPC which has network connectivity to the Apache Kafka
       * cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("602b2768e2d8a0ee2730ffc3a7f4675e941ffc462200b0277abcfb952548c75a")
      public fun vpc(vpc: VpcProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty.builder()

      /**
       * @param bootstrapServers The bootstrap servers of the cluster. 
       */
      override fun bootstrapServers(bootstrapServers: String) {
        cdkBuilder.bootstrapServers(bootstrapServers)
      }

      /**
       * @param vpc Details of an Amazon VPC which has network connectivity to the Apache Kafka
       * cluster. 
       */
      override fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpc Details of an Amazon VPC which has network connectivity to the Apache Kafka
       * cluster. 
       */
      override fun vpc(vpc: VpcProperty) {
        cdkBuilder.vpc(vpc.let(VpcProperty.Companion::unwrap))
      }

      /**
       * @param vpc Details of an Amazon VPC which has network connectivity to the Apache Kafka
       * cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("602b2768e2d8a0ee2730ffc3a7f4675e941ffc462200b0277abcfb952548c75a")
      override fun vpc(vpc: VpcProperty.Builder.() -> Unit): Unit = vpc(VpcProperty(vpc))

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty,
    ) : CdkObject(cdkObject),
        ApacheKafkaClusterProperty {
      /**
       * The bootstrap servers of the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-apachekafkacluster.html#cfn-kafkaconnect-connector-apachekafkacluster-bootstrapservers)
       */
      override fun bootstrapServers(): String = unwrap(this).getBootstrapServers()

      /**
       * Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-apachekafkacluster.html#cfn-kafkaconnect-connector-apachekafkacluster-vpc)
       */
      override fun vpc(): Any = unwrap(this).getVpc()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApacheKafkaClusterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty):
          ApacheKafkaClusterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApacheKafkaClusterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApacheKafkaClusterProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty
    }
  }

  /**
   * Specifies how the connector scales.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * AutoScalingProperty autoScalingProperty = AutoScalingProperty.builder()
   * .maxWorkerCount(123)
   * .mcuCount(123)
   * .minWorkerCount(123)
   * .scaleInPolicy(ScaleInPolicyProperty.builder()
   * .cpuUtilizationPercentage(123)
   * .build())
   * .scaleOutPolicy(ScaleOutPolicyProperty.builder()
   * .cpuUtilizationPercentage(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html)
   */
  public interface AutoScalingProperty {
    /**
     * The maximum number of workers allocated to the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html#cfn-kafkaconnect-connector-autoscaling-maxworkercount)
     */
    public fun maxWorkerCount(): Number

    /**
     * The number of microcontroller units (MCUs) allocated to each connector worker.
     *
     * The valid values are 1,2,4,8.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html#cfn-kafkaconnect-connector-autoscaling-mcucount)
     */
    public fun mcuCount(): Number

    /**
     * The minimum number of workers allocated to the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html#cfn-kafkaconnect-connector-autoscaling-minworkercount)
     */
    public fun minWorkerCount(): Number

    /**
     * The sacle-in policy for the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html#cfn-kafkaconnect-connector-autoscaling-scaleinpolicy)
     */
    public fun scaleInPolicy(): Any

    /**
     * The sacle-out policy for the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html#cfn-kafkaconnect-connector-autoscaling-scaleoutpolicy)
     */
    public fun scaleOutPolicy(): Any

    /**
     * A builder for [AutoScalingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxWorkerCount The maximum number of workers allocated to the connector. 
       */
      public fun maxWorkerCount(maxWorkerCount: Number)

      /**
       * @param mcuCount The number of microcontroller units (MCUs) allocated to each connector
       * worker. 
       * The valid values are 1,2,4,8.
       */
      public fun mcuCount(mcuCount: Number)

      /**
       * @param minWorkerCount The minimum number of workers allocated to the connector. 
       */
      public fun minWorkerCount(minWorkerCount: Number)

      /**
       * @param scaleInPolicy The sacle-in policy for the connector. 
       */
      public fun scaleInPolicy(scaleInPolicy: IResolvable)

      /**
       * @param scaleInPolicy The sacle-in policy for the connector. 
       */
      public fun scaleInPolicy(scaleInPolicy: ScaleInPolicyProperty)

      /**
       * @param scaleInPolicy The sacle-in policy for the connector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("924a00c92bc533726be73cecf82968cb4d0833bcbd4018288d92d9c5250bc720")
      public fun scaleInPolicy(scaleInPolicy: ScaleInPolicyProperty.Builder.() -> Unit)

      /**
       * @param scaleOutPolicy The sacle-out policy for the connector. 
       */
      public fun scaleOutPolicy(scaleOutPolicy: IResolvable)

      /**
       * @param scaleOutPolicy The sacle-out policy for the connector. 
       */
      public fun scaleOutPolicy(scaleOutPolicy: ScaleOutPolicyProperty)

      /**
       * @param scaleOutPolicy The sacle-out policy for the connector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("758b465f5bd575830bc6a5bd3795c00ca401ed930331d39366b2312db08cbbf3")
      public fun scaleOutPolicy(scaleOutPolicy: ScaleOutPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty.builder()

      /**
       * @param maxWorkerCount The maximum number of workers allocated to the connector. 
       */
      override fun maxWorkerCount(maxWorkerCount: Number) {
        cdkBuilder.maxWorkerCount(maxWorkerCount)
      }

      /**
       * @param mcuCount The number of microcontroller units (MCUs) allocated to each connector
       * worker. 
       * The valid values are 1,2,4,8.
       */
      override fun mcuCount(mcuCount: Number) {
        cdkBuilder.mcuCount(mcuCount)
      }

      /**
       * @param minWorkerCount The minimum number of workers allocated to the connector. 
       */
      override fun minWorkerCount(minWorkerCount: Number) {
        cdkBuilder.minWorkerCount(minWorkerCount)
      }

      /**
       * @param scaleInPolicy The sacle-in policy for the connector. 
       */
      override fun scaleInPolicy(scaleInPolicy: IResolvable) {
        cdkBuilder.scaleInPolicy(scaleInPolicy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scaleInPolicy The sacle-in policy for the connector. 
       */
      override fun scaleInPolicy(scaleInPolicy: ScaleInPolicyProperty) {
        cdkBuilder.scaleInPolicy(scaleInPolicy.let(ScaleInPolicyProperty.Companion::unwrap))
      }

      /**
       * @param scaleInPolicy The sacle-in policy for the connector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("924a00c92bc533726be73cecf82968cb4d0833bcbd4018288d92d9c5250bc720")
      override fun scaleInPolicy(scaleInPolicy: ScaleInPolicyProperty.Builder.() -> Unit): Unit =
          scaleInPolicy(ScaleInPolicyProperty(scaleInPolicy))

      /**
       * @param scaleOutPolicy The sacle-out policy for the connector. 
       */
      override fun scaleOutPolicy(scaleOutPolicy: IResolvable) {
        cdkBuilder.scaleOutPolicy(scaleOutPolicy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scaleOutPolicy The sacle-out policy for the connector. 
       */
      override fun scaleOutPolicy(scaleOutPolicy: ScaleOutPolicyProperty) {
        cdkBuilder.scaleOutPolicy(scaleOutPolicy.let(ScaleOutPolicyProperty.Companion::unwrap))
      }

      /**
       * @param scaleOutPolicy The sacle-out policy for the connector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("758b465f5bd575830bc6a5bd3795c00ca401ed930331d39366b2312db08cbbf3")
      override fun scaleOutPolicy(scaleOutPolicy: ScaleOutPolicyProperty.Builder.() -> Unit): Unit =
          scaleOutPolicy(ScaleOutPolicyProperty(scaleOutPolicy))

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty,
    ) : CdkObject(cdkObject),
        AutoScalingProperty {
      /**
       * The maximum number of workers allocated to the connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html#cfn-kafkaconnect-connector-autoscaling-maxworkercount)
       */
      override fun maxWorkerCount(): Number = unwrap(this).getMaxWorkerCount()

      /**
       * The number of microcontroller units (MCUs) allocated to each connector worker.
       *
       * The valid values are 1,2,4,8.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html#cfn-kafkaconnect-connector-autoscaling-mcucount)
       */
      override fun mcuCount(): Number = unwrap(this).getMcuCount()

      /**
       * The minimum number of workers allocated to the connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html#cfn-kafkaconnect-connector-autoscaling-minworkercount)
       */
      override fun minWorkerCount(): Number = unwrap(this).getMinWorkerCount()

      /**
       * The sacle-in policy for the connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html#cfn-kafkaconnect-connector-autoscaling-scaleinpolicy)
       */
      override fun scaleInPolicy(): Any = unwrap(this).getScaleInPolicy()

      /**
       * The sacle-out policy for the connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html#cfn-kafkaconnect-connector-autoscaling-scaleoutpolicy)
       */
      override fun scaleOutPolicy(): Any = unwrap(this).getScaleOutPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty):
          AutoScalingProperty = CdkObjectWrappers.wrap(cdkObject) as? AutoScalingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty
    }
  }

  /**
   * Information about the capacity of the connector, whether it is auto scaled or provisioned.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * CapacityProperty capacityProperty = CapacityProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-capacity.html)
   */
  public interface CapacityProperty {
    /**
     * Information about the auto scaling parameters for the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-capacity.html#cfn-kafkaconnect-connector-capacity-autoscaling)
     */
    public fun autoScaling(): Any? = unwrap(this).getAutoScaling()

    /**
     * Details about a fixed capacity allocated to a connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-capacity.html#cfn-kafkaconnect-connector-capacity-provisionedcapacity)
     */
    public fun provisionedCapacity(): Any? = unwrap(this).getProvisionedCapacity()

    /**
     * A builder for [CapacityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoScaling Information about the auto scaling parameters for the connector.
       */
      public fun autoScaling(autoScaling: IResolvable)

      /**
       * @param autoScaling Information about the auto scaling parameters for the connector.
       */
      public fun autoScaling(autoScaling: AutoScalingProperty)

      /**
       * @param autoScaling Information about the auto scaling parameters for the connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7a412176b38c29ebe46783b201a03503cbcb42a74b83bfee7be5fe0b678eb0e")
      public fun autoScaling(autoScaling: AutoScalingProperty.Builder.() -> Unit)

      /**
       * @param provisionedCapacity Details about a fixed capacity allocated to a connector.
       */
      public fun provisionedCapacity(provisionedCapacity: IResolvable)

      /**
       * @param provisionedCapacity Details about a fixed capacity allocated to a connector.
       */
      public fun provisionedCapacity(provisionedCapacity: ProvisionedCapacityProperty)

      /**
       * @param provisionedCapacity Details about a fixed capacity allocated to a connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fec1ae0c9c7d700bf06aac993e71e814c415279d482e34eb01cc0d31840896a")
      public
          fun provisionedCapacity(provisionedCapacity: ProvisionedCapacityProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty.builder()

      /**
       * @param autoScaling Information about the auto scaling parameters for the connector.
       */
      override fun autoScaling(autoScaling: IResolvable) {
        cdkBuilder.autoScaling(autoScaling.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param autoScaling Information about the auto scaling parameters for the connector.
       */
      override fun autoScaling(autoScaling: AutoScalingProperty) {
        cdkBuilder.autoScaling(autoScaling.let(AutoScalingProperty.Companion::unwrap))
      }

      /**
       * @param autoScaling Information about the auto scaling parameters for the connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7a412176b38c29ebe46783b201a03503cbcb42a74b83bfee7be5fe0b678eb0e")
      override fun autoScaling(autoScaling: AutoScalingProperty.Builder.() -> Unit): Unit =
          autoScaling(AutoScalingProperty(autoScaling))

      /**
       * @param provisionedCapacity Details about a fixed capacity allocated to a connector.
       */
      override fun provisionedCapacity(provisionedCapacity: IResolvable) {
        cdkBuilder.provisionedCapacity(provisionedCapacity.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param provisionedCapacity Details about a fixed capacity allocated to a connector.
       */
      override fun provisionedCapacity(provisionedCapacity: ProvisionedCapacityProperty) {
        cdkBuilder.provisionedCapacity(provisionedCapacity.let(ProvisionedCapacityProperty.Companion::unwrap))
      }

      /**
       * @param provisionedCapacity Details about a fixed capacity allocated to a connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fec1ae0c9c7d700bf06aac993e71e814c415279d482e34eb01cc0d31840896a")
      override
          fun provisionedCapacity(provisionedCapacity: ProvisionedCapacityProperty.Builder.() -> Unit):
          Unit = provisionedCapacity(ProvisionedCapacityProperty(provisionedCapacity))

      public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty,
    ) : CdkObject(cdkObject),
        CapacityProperty {
      /**
       * Information about the auto scaling parameters for the connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-capacity.html#cfn-kafkaconnect-connector-capacity-autoscaling)
       */
      override fun autoScaling(): Any? = unwrap(this).getAutoScaling()

      /**
       * Details about a fixed capacity allocated to a connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-capacity.html#cfn-kafkaconnect-connector-capacity-provisionedcapacity)
       */
      override fun provisionedCapacity(): Any? = unwrap(this).getProvisionedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapacityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty):
          CapacityProperty = CdkObjectWrappers.wrap(cdkObject) as? CapacityProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty
    }
  }

  /**
   * The settings for delivering connector logs to Amazon CloudWatch Logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * CloudWatchLogsLogDeliveryProperty cloudWatchLogsLogDeliveryProperty =
   * CloudWatchLogsLogDeliveryProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .logGroup("logGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-cloudwatchlogslogdelivery.html)
   */
  public interface CloudWatchLogsLogDeliveryProperty {
    /**
     * Whether log delivery to Amazon CloudWatch Logs is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-cloudwatchlogslogdelivery.html#cfn-kafkaconnect-connector-cloudwatchlogslogdelivery-enabled)
     */
    public fun enabled(): Any

    /**
     * The name of the CloudWatch log group that is the destination for log delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-cloudwatchlogslogdelivery.html#cfn-kafkaconnect-connector-cloudwatchlogslogdelivery-loggroup)
     */
    public fun logGroup(): String? = unwrap(this).getLogGroup()

    /**
     * A builder for [CloudWatchLogsLogDeliveryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Whether log delivery to Amazon CloudWatch Logs is enabled. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Whether log delivery to Amazon CloudWatch Logs is enabled. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param logGroup The name of the CloudWatch log group that is the destination for log
       * delivery.
       */
      public fun logGroup(logGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty.builder()

      /**
       * @param enabled Whether log delivery to Amazon CloudWatch Logs is enabled. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Whether log delivery to Amazon CloudWatch Logs is enabled. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logGroup The name of the CloudWatch log group that is the destination for log
       * delivery.
       */
      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty,
    ) : CdkObject(cdkObject),
        CloudWatchLogsLogDeliveryProperty {
      /**
       * Whether log delivery to Amazon CloudWatch Logs is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-cloudwatchlogslogdelivery.html#cfn-kafkaconnect-connector-cloudwatchlogslogdelivery-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The name of the CloudWatch log group that is the destination for log delivery.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-cloudwatchlogslogdelivery.html#cfn-kafkaconnect-connector-cloudwatchlogslogdelivery-loggroup)
       */
      override fun logGroup(): String? = unwrap(this).getLogGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogsLogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty):
          CloudWatchLogsLogDeliveryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogsLogDeliveryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsLogDeliveryProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty
    }
  }

  /**
   * A plugin is an AWS resource that contains the code that defines a connector's logic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * CustomPluginProperty customPluginProperty = CustomPluginProperty.builder()
   * .customPluginArn("customPluginArn")
   * .revision(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-customplugin.html)
   */
  public interface CustomPluginProperty {
    /**
     * The Amazon Resource Name (ARN) of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-customplugin.html#cfn-kafkaconnect-connector-customplugin-custompluginarn)
     */
    public fun customPluginArn(): String

    /**
     * The revision of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-customplugin.html#cfn-kafkaconnect-connector-customplugin-revision)
     */
    public fun revision(): Number

    /**
     * A builder for [CustomPluginProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customPluginArn The Amazon Resource Name (ARN) of the custom plugin. 
       */
      public fun customPluginArn(customPluginArn: String)

      /**
       * @param revision The revision of the custom plugin. 
       */
      public fun revision(revision: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty.builder()

      /**
       * @param customPluginArn The Amazon Resource Name (ARN) of the custom plugin. 
       */
      override fun customPluginArn(customPluginArn: String) {
        cdkBuilder.customPluginArn(customPluginArn)
      }

      /**
       * @param revision The revision of the custom plugin. 
       */
      override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty,
    ) : CdkObject(cdkObject),
        CustomPluginProperty {
      /**
       * The Amazon Resource Name (ARN) of the custom plugin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-customplugin.html#cfn-kafkaconnect-connector-customplugin-custompluginarn)
       */
      override fun customPluginArn(): String = unwrap(this).getCustomPluginArn()

      /**
       * The revision of the custom plugin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-customplugin.html#cfn-kafkaconnect-connector-customplugin-revision)
       */
      override fun revision(): Number = unwrap(this).getRevision()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomPluginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty):
          CustomPluginProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomPluginProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPluginProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty
    }
  }

  /**
   * The settings for delivering logs to Amazon Kinesis Data Firehose.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * FirehoseLogDeliveryProperty firehoseLogDeliveryProperty = FirehoseLogDeliveryProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .deliveryStream("deliveryStream")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-firehoselogdelivery.html)
   */
  public interface FirehoseLogDeliveryProperty {
    /**
     * The name of the Kinesis Data Firehose delivery stream that is the destination for log
     * delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-firehoselogdelivery.html#cfn-kafkaconnect-connector-firehoselogdelivery-deliverystream)
     */
    public fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

    /**
     * Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-firehoselogdelivery.html#cfn-kafkaconnect-connector-firehoselogdelivery-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [FirehoseLogDeliveryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryStream The name of the Kinesis Data Firehose delivery stream that is the
       * destination for log delivery.
       */
      public fun deliveryStream(deliveryStream: String)

      /**
       * @param enabled Specifies whether connector logs get delivered to Amazon Kinesis Data
       * Firehose. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether connector logs get delivered to Amazon Kinesis Data
       * Firehose. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty.builder()

      /**
       * @param deliveryStream The name of the Kinesis Data Firehose delivery stream that is the
       * destination for log delivery.
       */
      override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      /**
       * @param enabled Specifies whether connector logs get delivered to Amazon Kinesis Data
       * Firehose. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether connector logs get delivered to Amazon Kinesis Data
       * Firehose. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty,
    ) : CdkObject(cdkObject),
        FirehoseLogDeliveryProperty {
      /**
       * The name of the Kinesis Data Firehose delivery stream that is the destination for log
       * delivery.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-firehoselogdelivery.html#cfn-kafkaconnect-connector-firehoselogdelivery-deliverystream)
       */
      override fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

      /**
       * Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-firehoselogdelivery.html#cfn-kafkaconnect-connector-firehoselogdelivery-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseLogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty):
          FirehoseLogDeliveryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FirehoseLogDeliveryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseLogDeliveryProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty
    }
  }

  /**
   * The client authentication information used in order to authenticate with the Apache Kafka
   * cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * KafkaClusterClientAuthenticationProperty kafkaClusterClientAuthenticationProperty =
   * KafkaClusterClientAuthenticationProperty.builder()
   * .authenticationType("authenticationType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkaclusterclientauthentication.html)
   */
  public interface KafkaClusterClientAuthenticationProperty {
    /**
     * The type of client authentication used to connect to the Apache Kafka cluster.
     *
     * Value NONE means that no client authentication is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkaclusterclientauthentication.html#cfn-kafkaconnect-connector-kafkaclusterclientauthentication-authenticationtype)
     */
    public fun authenticationType(): String

    /**
     * A builder for [KafkaClusterClientAuthenticationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationType The type of client authentication used to connect to the Apache
       * Kafka cluster. 
       * Value NONE means that no client authentication is used.
       */
      public fun authenticationType(authenticationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty.builder()

      /**
       * @param authenticationType The type of client authentication used to connect to the Apache
       * Kafka cluster. 
       * Value NONE means that no client authentication is used.
       */
      override fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty,
    ) : CdkObject(cdkObject),
        KafkaClusterClientAuthenticationProperty {
      /**
       * The type of client authentication used to connect to the Apache Kafka cluster.
       *
       * Value NONE means that no client authentication is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkaclusterclientauthentication.html#cfn-kafkaconnect-connector-kafkaclusterclientauthentication-authenticationtype)
       */
      override fun authenticationType(): String = unwrap(this).getAuthenticationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KafkaClusterClientAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty):
          KafkaClusterClientAuthenticationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KafkaClusterClientAuthenticationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaClusterClientAuthenticationProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty
    }
  }

  /**
   * Details of encryption in transit to the Apache Kafka cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * KafkaClusterEncryptionInTransitProperty kafkaClusterEncryptionInTransitProperty =
   * KafkaClusterEncryptionInTransitProperty.builder()
   * .encryptionType("encryptionType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkaclusterencryptionintransit.html)
   */
  public interface KafkaClusterEncryptionInTransitProperty {
    /**
     * The type of encryption in transit to the Apache Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkaclusterencryptionintransit.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit-encryptiontype)
     */
    public fun encryptionType(): String

    /**
     * A builder for [KafkaClusterEncryptionInTransitProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionType The type of encryption in transit to the Apache Kafka cluster. 
       */
      public fun encryptionType(encryptionType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty.builder()

      /**
       * @param encryptionType The type of encryption in transit to the Apache Kafka cluster. 
       */
      override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty,
    ) : CdkObject(cdkObject),
        KafkaClusterEncryptionInTransitProperty {
      /**
       * The type of encryption in transit to the Apache Kafka cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkaclusterencryptionintransit.html#cfn-kafkaconnect-connector-kafkaclusterencryptionintransit-encryptiontype)
       */
      override fun encryptionType(): String = unwrap(this).getEncryptionType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KafkaClusterEncryptionInTransitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty):
          KafkaClusterEncryptionInTransitProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KafkaClusterEncryptionInTransitProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaClusterEncryptionInTransitProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty
    }
  }

  /**
   * The details of the Apache Kafka cluster to which the connector is connected.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * KafkaClusterProperty kafkaClusterProperty = KafkaClusterProperty.builder()
   * .apacheKafkaCluster(ApacheKafkaClusterProperty.builder()
   * .bootstrapServers("bootstrapServers")
   * .vpc(VpcProperty.builder()
   * .securityGroups(List.of("securityGroups"))
   * .subnets(List.of("subnets"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkacluster.html)
   */
  public interface KafkaClusterProperty {
    /**
     * The Apache Kafka cluster to which the connector is connected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkacluster.html#cfn-kafkaconnect-connector-kafkacluster-apachekafkacluster)
     */
    public fun apacheKafkaCluster(): Any

    /**
     * A builder for [KafkaClusterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apacheKafkaCluster The Apache Kafka cluster to which the connector is connected. 
       */
      public fun apacheKafkaCluster(apacheKafkaCluster: IResolvable)

      /**
       * @param apacheKafkaCluster The Apache Kafka cluster to which the connector is connected. 
       */
      public fun apacheKafkaCluster(apacheKafkaCluster: ApacheKafkaClusterProperty)

      /**
       * @param apacheKafkaCluster The Apache Kafka cluster to which the connector is connected. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d733d131c117c3d594dc55c27b1ce3ba06a34359fe5f405a937694015bf92eda")
      public
          fun apacheKafkaCluster(apacheKafkaCluster: ApacheKafkaClusterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty.builder()

      /**
       * @param apacheKafkaCluster The Apache Kafka cluster to which the connector is connected. 
       */
      override fun apacheKafkaCluster(apacheKafkaCluster: IResolvable) {
        cdkBuilder.apacheKafkaCluster(apacheKafkaCluster.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param apacheKafkaCluster The Apache Kafka cluster to which the connector is connected. 
       */
      override fun apacheKafkaCluster(apacheKafkaCluster: ApacheKafkaClusterProperty) {
        cdkBuilder.apacheKafkaCluster(apacheKafkaCluster.let(ApacheKafkaClusterProperty.Companion::unwrap))
      }

      /**
       * @param apacheKafkaCluster The Apache Kafka cluster to which the connector is connected. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d733d131c117c3d594dc55c27b1ce3ba06a34359fe5f405a937694015bf92eda")
      override
          fun apacheKafkaCluster(apacheKafkaCluster: ApacheKafkaClusterProperty.Builder.() -> Unit):
          Unit = apacheKafkaCluster(ApacheKafkaClusterProperty(apacheKafkaCluster))

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty,
    ) : CdkObject(cdkObject),
        KafkaClusterProperty {
      /**
       * The Apache Kafka cluster to which the connector is connected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkacluster.html#cfn-kafkaconnect-connector-kafkacluster-apachekafkacluster)
       */
      override fun apacheKafkaCluster(): Any = unwrap(this).getApacheKafkaCluster()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaClusterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty):
          KafkaClusterProperty = CdkObjectWrappers.wrap(cdkObject) as? KafkaClusterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaClusterProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty
    }
  }

  /**
   * Details about log delivery.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * LogDeliveryProperty logDeliveryProperty = LogDeliveryProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-logdelivery.html)
   */
  public interface LogDeliveryProperty {
    /**
     * The workers can send worker logs to different destination types.
     *
     * This configuration specifies the details of these destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-logdelivery.html#cfn-kafkaconnect-connector-logdelivery-workerlogdelivery)
     */
    public fun workerLogDelivery(): Any

    /**
     * A builder for [LogDeliveryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param workerLogDelivery The workers can send worker logs to different destination types. 
       * This configuration specifies the details of these destinations.
       */
      public fun workerLogDelivery(workerLogDelivery: IResolvable)

      /**
       * @param workerLogDelivery The workers can send worker logs to different destination types. 
       * This configuration specifies the details of these destinations.
       */
      public fun workerLogDelivery(workerLogDelivery: WorkerLogDeliveryProperty)

      /**
       * @param workerLogDelivery The workers can send worker logs to different destination types. 
       * This configuration specifies the details of these destinations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a798e2587e298cbcf87002ac2e8daf944a99c15ed912f790fac86650d746959f")
      public fun workerLogDelivery(workerLogDelivery: WorkerLogDeliveryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty.builder()

      /**
       * @param workerLogDelivery The workers can send worker logs to different destination types. 
       * This configuration specifies the details of these destinations.
       */
      override fun workerLogDelivery(workerLogDelivery: IResolvable) {
        cdkBuilder.workerLogDelivery(workerLogDelivery.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param workerLogDelivery The workers can send worker logs to different destination types. 
       * This configuration specifies the details of these destinations.
       */
      override fun workerLogDelivery(workerLogDelivery: WorkerLogDeliveryProperty) {
        cdkBuilder.workerLogDelivery(workerLogDelivery.let(WorkerLogDeliveryProperty.Companion::unwrap))
      }

      /**
       * @param workerLogDelivery The workers can send worker logs to different destination types. 
       * This configuration specifies the details of these destinations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a798e2587e298cbcf87002ac2e8daf944a99c15ed912f790fac86650d746959f")
      override
          fun workerLogDelivery(workerLogDelivery: WorkerLogDeliveryProperty.Builder.() -> Unit):
          Unit = workerLogDelivery(WorkerLogDeliveryProperty(workerLogDelivery))

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty,
    ) : CdkObject(cdkObject),
        LogDeliveryProperty {
      /**
       * The workers can send worker logs to different destination types.
       *
       * This configuration specifies the details of these destinations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-logdelivery.html#cfn-kafkaconnect-connector-logdelivery-workerlogdelivery)
       */
      override fun workerLogDelivery(): Any = unwrap(this).getWorkerLogDelivery()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty):
          LogDeliveryProperty = CdkObjectWrappers.wrap(cdkObject) as? LogDeliveryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDeliveryProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty
    }
  }

  /**
   * A plugin is an AWS resource that contains the code that defines your connector logic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * PluginProperty pluginProperty = PluginProperty.builder()
   * .customPlugin(CustomPluginProperty.builder()
   * .customPluginArn("customPluginArn")
   * .revision(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-plugin.html)
   */
  public interface PluginProperty {
    /**
     * Details about a custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-plugin.html#cfn-kafkaconnect-connector-plugin-customplugin)
     */
    public fun customPlugin(): Any

    /**
     * A builder for [PluginProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customPlugin Details about a custom plugin. 
       */
      public fun customPlugin(customPlugin: IResolvable)

      /**
       * @param customPlugin Details about a custom plugin. 
       */
      public fun customPlugin(customPlugin: CustomPluginProperty)

      /**
       * @param customPlugin Details about a custom plugin. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e427c8ea1a5ed4344fd8f1dc9fe49f76a4bbb12bb04b172cb9cd064b3e2c082")
      public fun customPlugin(customPlugin: CustomPluginProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty.builder()

      /**
       * @param customPlugin Details about a custom plugin. 
       */
      override fun customPlugin(customPlugin: IResolvable) {
        cdkBuilder.customPlugin(customPlugin.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customPlugin Details about a custom plugin. 
       */
      override fun customPlugin(customPlugin: CustomPluginProperty) {
        cdkBuilder.customPlugin(customPlugin.let(CustomPluginProperty.Companion::unwrap))
      }

      /**
       * @param customPlugin Details about a custom plugin. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e427c8ea1a5ed4344fd8f1dc9fe49f76a4bbb12bb04b172cb9cd064b3e2c082")
      override fun customPlugin(customPlugin: CustomPluginProperty.Builder.() -> Unit): Unit =
          customPlugin(CustomPluginProperty(customPlugin))

      public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty,
    ) : CdkObject(cdkObject),
        PluginProperty {
      /**
       * Details about a custom plugin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-plugin.html#cfn-kafkaconnect-connector-plugin-customplugin)
       */
      override fun customPlugin(): Any = unwrap(this).getCustomPlugin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PluginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty):
          PluginProperty = CdkObjectWrappers.wrap(cdkObject) as? PluginProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PluginProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty
    }
  }

  /**
   * Details about a connector's provisioned capacity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * ProvisionedCapacityProperty provisionedCapacityProperty = ProvisionedCapacityProperty.builder()
   * .workerCount(123)
   * // the properties below are optional
   * .mcuCount(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-provisionedcapacity.html)
   */
  public interface ProvisionedCapacityProperty {
    /**
     * The number of microcontroller units (MCUs) allocated to each connector worker.
     *
     * The valid values are 1,2,4,8.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-provisionedcapacity.html#cfn-kafkaconnect-connector-provisionedcapacity-mcucount)
     */
    public fun mcuCount(): Number? = unwrap(this).getMcuCount()

    /**
     * The number of workers that are allocated to the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-provisionedcapacity.html#cfn-kafkaconnect-connector-provisionedcapacity-workercount)
     */
    public fun workerCount(): Number

    /**
     * A builder for [ProvisionedCapacityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mcuCount The number of microcontroller units (MCUs) allocated to each connector
       * worker.
       * The valid values are 1,2,4,8.
       */
      public fun mcuCount(mcuCount: Number)

      /**
       * @param workerCount The number of workers that are allocated to the connector. 
       */
      public fun workerCount(workerCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty.builder()

      /**
       * @param mcuCount The number of microcontroller units (MCUs) allocated to each connector
       * worker.
       * The valid values are 1,2,4,8.
       */
      override fun mcuCount(mcuCount: Number) {
        cdkBuilder.mcuCount(mcuCount)
      }

      /**
       * @param workerCount The number of workers that are allocated to the connector. 
       */
      override fun workerCount(workerCount: Number) {
        cdkBuilder.workerCount(workerCount)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty,
    ) : CdkObject(cdkObject),
        ProvisionedCapacityProperty {
      /**
       * The number of microcontroller units (MCUs) allocated to each connector worker.
       *
       * The valid values are 1,2,4,8.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-provisionedcapacity.html#cfn-kafkaconnect-connector-provisionedcapacity-mcucount)
       */
      override fun mcuCount(): Number? = unwrap(this).getMcuCount()

      /**
       * The number of workers that are allocated to the connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-provisionedcapacity.html#cfn-kafkaconnect-connector-provisionedcapacity-workercount)
       */
      override fun workerCount(): Number = unwrap(this).getWorkerCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedCapacityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty):
          ProvisionedCapacityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProvisionedCapacityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedCapacityProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty
    }
  }

  /**
   * Details about delivering logs to Amazon S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * S3LogDeliveryProperty s3LogDeliveryProperty = S3LogDeliveryProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .bucket("bucket")
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-s3logdelivery.html)
   */
  public interface S3LogDeliveryProperty {
    /**
     * The name of the S3 bucket that is the destination for log delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-s3logdelivery.html#cfn-kafkaconnect-connector-s3logdelivery-bucket)
     */
    public fun bucket(): String? = unwrap(this).getBucket()

    /**
     * Specifies whether connector logs get sent to the specified Amazon S3 destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-s3logdelivery.html#cfn-kafkaconnect-connector-s3logdelivery-enabled)
     */
    public fun enabled(): Any

    /**
     * The S3 prefix that is the destination for log delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-s3logdelivery.html#cfn-kafkaconnect-connector-s3logdelivery-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [S3LogDeliveryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the S3 bucket that is the destination for log delivery.
       */
      public fun bucket(bucket: String)

      /**
       * @param enabled Specifies whether connector logs get sent to the specified Amazon S3
       * destination. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether connector logs get sent to the specified Amazon S3
       * destination. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param prefix The S3 prefix that is the destination for log delivery.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty.builder()

      /**
       * @param bucket The name of the S3 bucket that is the destination for log delivery.
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param enabled Specifies whether connector logs get sent to the specified Amazon S3
       * destination. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether connector logs get sent to the specified Amazon S3
       * destination. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param prefix The S3 prefix that is the destination for log delivery.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty,
    ) : CdkObject(cdkObject),
        S3LogDeliveryProperty {
      /**
       * The name of the S3 bucket that is the destination for log delivery.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-s3logdelivery.html#cfn-kafkaconnect-connector-s3logdelivery-bucket)
       */
      override fun bucket(): String? = unwrap(this).getBucket()

      /**
       * Specifies whether connector logs get sent to the specified Amazon S3 destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-s3logdelivery.html#cfn-kafkaconnect-connector-s3logdelivery-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The S3 prefix that is the destination for log delivery.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-s3logdelivery.html#cfn-kafkaconnect-connector-s3logdelivery-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty):
          S3LogDeliveryProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LogDeliveryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LogDeliveryProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty
    }
  }

  /**
   * The scale-in policy for the connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * ScaleInPolicyProperty scaleInPolicyProperty = ScaleInPolicyProperty.builder()
   * .cpuUtilizationPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-scaleinpolicy.html)
   */
  public interface ScaleInPolicyProperty {
    /**
     * Specifies the CPU utilization percentage threshold at which you want connector scale in to be
     * triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-scaleinpolicy.html#cfn-kafkaconnect-connector-scaleinpolicy-cpuutilizationpercentage)
     */
    public fun cpuUtilizationPercentage(): Number

    /**
     * A builder for [ScaleInPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpuUtilizationPercentage Specifies the CPU utilization percentage threshold at which
       * you want connector scale in to be triggered. 
       */
      public fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty.builder()

      /**
       * @param cpuUtilizationPercentage Specifies the CPU utilization percentage threshold at which
       * you want connector scale in to be triggered. 
       */
      override fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number) {
        cdkBuilder.cpuUtilizationPercentage(cpuUtilizationPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty,
    ) : CdkObject(cdkObject),
        ScaleInPolicyProperty {
      /**
       * Specifies the CPU utilization percentage threshold at which you want connector scale in to
       * be triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-scaleinpolicy.html#cfn-kafkaconnect-connector-scaleinpolicy-cpuutilizationpercentage)
       */
      override fun cpuUtilizationPercentage(): Number = unwrap(this).getCpuUtilizationPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScaleInPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty):
          ScaleInPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? ScaleInPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScaleInPolicyProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty
    }
  }

  /**
   * The scale-out policy for the connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * ScaleOutPolicyProperty scaleOutPolicyProperty = ScaleOutPolicyProperty.builder()
   * .cpuUtilizationPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-scaleoutpolicy.html)
   */
  public interface ScaleOutPolicyProperty {
    /**
     * The CPU utilization percentage threshold at which you want connector scale out to be
     * triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-scaleoutpolicy.html#cfn-kafkaconnect-connector-scaleoutpolicy-cpuutilizationpercentage)
     */
    public fun cpuUtilizationPercentage(): Number

    /**
     * A builder for [ScaleOutPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpuUtilizationPercentage The CPU utilization percentage threshold at which you want
       * connector scale out to be triggered. 
       */
      public fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty.builder()

      /**
       * @param cpuUtilizationPercentage The CPU utilization percentage threshold at which you want
       * connector scale out to be triggered. 
       */
      override fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number) {
        cdkBuilder.cpuUtilizationPercentage(cpuUtilizationPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty,
    ) : CdkObject(cdkObject),
        ScaleOutPolicyProperty {
      /**
       * The CPU utilization percentage threshold at which you want connector scale out to be
       * triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-scaleoutpolicy.html#cfn-kafkaconnect-connector-scaleoutpolicy-cpuutilizationpercentage)
       */
      override fun cpuUtilizationPercentage(): Number = unwrap(this).getCpuUtilizationPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScaleOutPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty):
          ScaleOutPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? ScaleOutPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScaleOutPolicyProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty
    }
  }

  /**
   * Information about the VPC in which the connector resides.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * VpcProperty vpcProperty = VpcProperty.builder()
   * .securityGroups(List.of("securityGroups"))
   * .subnets(List.of("subnets"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-vpc.html)
   */
  public interface VpcProperty {
    /**
     * The security groups for the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-vpc.html#cfn-kafkaconnect-connector-vpc-securitygroups)
     */
    public fun securityGroups(): List<String>

    /**
     * The subnets for the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-vpc.html#cfn-kafkaconnect-connector-vpc-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [VpcProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroups The security groups for the connector. 
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups The security groups for the connector. 
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param subnets The subnets for the connector. 
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets The subnets for the connector. 
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty.builder()

      /**
       * @param securityGroups The security groups for the connector. 
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups The security groups for the connector. 
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param subnets The subnets for the connector. 
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets The subnets for the connector. 
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty,
    ) : CdkObject(cdkObject),
        VpcProperty {
      /**
       * The security groups for the connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-vpc.html#cfn-kafkaconnect-connector-vpc-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

      /**
       * The subnets for the connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-vpc.html#cfn-kafkaconnect-connector-vpc-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty):
          VpcProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty
    }
  }

  /**
   * The configuration of the workers, which are the processes that run the connector logic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * WorkerConfigurationProperty workerConfigurationProperty = WorkerConfigurationProperty.builder()
   * .revision(123)
   * .workerConfigurationArn("workerConfigurationArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerconfiguration.html)
   */
  public interface WorkerConfigurationProperty {
    /**
     * The revision of the worker configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerconfiguration.html#cfn-kafkaconnect-connector-workerconfiguration-revision)
     */
    public fun revision(): Number

    /**
     * The Amazon Resource Name (ARN) of the worker configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerconfiguration.html#cfn-kafkaconnect-connector-workerconfiguration-workerconfigurationarn)
     */
    public fun workerConfigurationArn(): String

    /**
     * A builder for [WorkerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param revision The revision of the worker configuration. 
       */
      public fun revision(revision: Number)

      /**
       * @param workerConfigurationArn The Amazon Resource Name (ARN) of the worker configuration. 
       */
      public fun workerConfigurationArn(workerConfigurationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty.builder()

      /**
       * @param revision The revision of the worker configuration. 
       */
      override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      /**
       * @param workerConfigurationArn The Amazon Resource Name (ARN) of the worker configuration. 
       */
      override fun workerConfigurationArn(workerConfigurationArn: String) {
        cdkBuilder.workerConfigurationArn(workerConfigurationArn)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty,
    ) : CdkObject(cdkObject),
        WorkerConfigurationProperty {
      /**
       * The revision of the worker configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerconfiguration.html#cfn-kafkaconnect-connector-workerconfiguration-revision)
       */
      override fun revision(): Number = unwrap(this).getRevision()

      /**
       * The Amazon Resource Name (ARN) of the worker configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerconfiguration.html#cfn-kafkaconnect-connector-workerconfiguration-workerconfigurationarn)
       */
      override fun workerConfigurationArn(): String = unwrap(this).getWorkerConfigurationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty):
          WorkerConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WorkerConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkerConfigurationProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty
    }
  }

  /**
   * Workers can send worker logs to different destination types.
   *
   * This configuration specifies the details of these destinations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * WorkerLogDeliveryProperty workerLogDeliveryProperty = WorkerLogDeliveryProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerlogdelivery.html)
   */
  public interface WorkerLogDeliveryProperty {
    /**
     * Details about delivering logs to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerlogdelivery.html#cfn-kafkaconnect-connector-workerlogdelivery-cloudwatchlogs)
     */
    public fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

    /**
     * Details about delivering logs to Amazon Kinesis Data Firehose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerlogdelivery.html#cfn-kafkaconnect-connector-workerlogdelivery-firehose)
     */
    public fun firehose(): Any? = unwrap(this).getFirehose()

    /**
     * Details about delivering logs to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerlogdelivery.html#cfn-kafkaconnect-connector-workerlogdelivery-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [WorkerLogDeliveryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogs Details about delivering logs to Amazon CloudWatch Logs.
       */
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable)

      /**
       * @param cloudWatchLogs Details about delivering logs to Amazon CloudWatch Logs.
       */
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsLogDeliveryProperty)

      /**
       * @param cloudWatchLogs Details about delivering logs to Amazon CloudWatch Logs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b34ed067daf3cee6b27e33033b603aa3c961ea9fe7de81813ea3812eddb8208")
      public
          fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsLogDeliveryProperty.Builder.() -> Unit)

      /**
       * @param firehose Details about delivering logs to Amazon Kinesis Data Firehose.
       */
      public fun firehose(firehose: IResolvable)

      /**
       * @param firehose Details about delivering logs to Amazon Kinesis Data Firehose.
       */
      public fun firehose(firehose: FirehoseLogDeliveryProperty)

      /**
       * @param firehose Details about delivering logs to Amazon Kinesis Data Firehose.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2116faf9d5c1f153da9b6f426df7784b11b55d98d47ba0945959d2465615a8af")
      public fun firehose(firehose: FirehoseLogDeliveryProperty.Builder.() -> Unit)

      /**
       * @param s3 Details about delivering logs to Amazon S3.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Details about delivering logs to Amazon S3.
       */
      public fun s3(s3: S3LogDeliveryProperty)

      /**
       * @param s3 Details about delivering logs to Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("833142e3bf8e8d5d48d244d2bbd4a8143694542994e5182c29c48d9a84385376")
      public fun s3(s3: S3LogDeliveryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty.builder()

      /**
       * @param cloudWatchLogs Details about delivering logs to Amazon CloudWatch Logs.
       */
      override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogs Details about delivering logs to Amazon CloudWatch Logs.
       */
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsLogDeliveryProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogsLogDeliveryProperty.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogs Details about delivering logs to Amazon CloudWatch Logs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b34ed067daf3cee6b27e33033b603aa3c961ea9fe7de81813ea3812eddb8208")
      override
          fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsLogDeliveryProperty.Builder.() -> Unit):
          Unit = cloudWatchLogs(CloudWatchLogsLogDeliveryProperty(cloudWatchLogs))

      /**
       * @param firehose Details about delivering logs to Amazon Kinesis Data Firehose.
       */
      override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param firehose Details about delivering logs to Amazon Kinesis Data Firehose.
       */
      override fun firehose(firehose: FirehoseLogDeliveryProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseLogDeliveryProperty.Companion::unwrap))
      }

      /**
       * @param firehose Details about delivering logs to Amazon Kinesis Data Firehose.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2116faf9d5c1f153da9b6f426df7784b11b55d98d47ba0945959d2465615a8af")
      override fun firehose(firehose: FirehoseLogDeliveryProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseLogDeliveryProperty(firehose))

      /**
       * @param s3 Details about delivering logs to Amazon S3.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Details about delivering logs to Amazon S3.
       */
      override fun s3(s3: S3LogDeliveryProperty) {
        cdkBuilder.s3(s3.let(S3LogDeliveryProperty.Companion::unwrap))
      }

      /**
       * @param s3 Details about delivering logs to Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("833142e3bf8e8d5d48d244d2bbd4a8143694542994e5182c29c48d9a84385376")
      override fun s3(s3: S3LogDeliveryProperty.Builder.() -> Unit): Unit =
          s3(S3LogDeliveryProperty(s3))

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty,
    ) : CdkObject(cdkObject),
        WorkerLogDeliveryProperty {
      /**
       * Details about delivering logs to Amazon CloudWatch Logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerlogdelivery.html#cfn-kafkaconnect-connector-workerlogdelivery-cloudwatchlogs)
       */
      override fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

      /**
       * Details about delivering logs to Amazon Kinesis Data Firehose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerlogdelivery.html#cfn-kafkaconnect-connector-workerlogdelivery-firehose)
       */
      override fun firehose(): Any? = unwrap(this).getFirehose()

      /**
       * Details about delivering logs to Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerlogdelivery.html#cfn-kafkaconnect-connector-workerlogdelivery-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkerLogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty):
          WorkerLogDeliveryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WorkerLogDeliveryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkerLogDeliveryProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty
    }
  }
}
