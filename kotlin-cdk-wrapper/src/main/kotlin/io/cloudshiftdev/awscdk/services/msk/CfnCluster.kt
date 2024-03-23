@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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
 * import io.cloudshiftdev.awscdk.services.msk.*;
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
public open class CfnCluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps,
  ) :
      this(software.amazon.awscdk.services.msk.CfnCluster(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnClusterProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClusterProps(props)
  )

  /**
   *
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Information about the broker nodes in the cluster.
   */
  public open fun brokerNodeGroupInfo(): Any = unwrap(this).getBrokerNodeGroupInfo()

  /**
   * Information about the broker nodes in the cluster.
   */
  public open fun brokerNodeGroupInfo(`value`: IResolvable) {
    unwrap(this).setBrokerNodeGroupInfo(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the broker nodes in the cluster.
   */
  public open fun brokerNodeGroupInfo(`value`: BrokerNodeGroupInfoProperty) {
    unwrap(this).setBrokerNodeGroupInfo(`value`.let(BrokerNodeGroupInfoProperty::unwrap))
  }

  /**
   * Information about the broker nodes in the cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7e2e5f674f03566fe2694ac2bf0caa871b5f616c2a86cba3276740eb6d90f6c4")
  public open fun brokerNodeGroupInfo(`value`: BrokerNodeGroupInfoProperty.Builder.() -> Unit): Unit
      = brokerNodeGroupInfo(BrokerNodeGroupInfoProperty(`value`))

  /**
   * VPC connection control settings for brokers.
   */
  public open fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

  /**
   * VPC connection control settings for brokers.
   */
  public open fun clientAuthentication(`value`: IResolvable) {
    unwrap(this).setClientAuthentication(`value`.let(IResolvable::unwrap))
  }

  /**
   * VPC connection control settings for brokers.
   */
  public open fun clientAuthentication(`value`: ClientAuthenticationProperty) {
    unwrap(this).setClientAuthentication(`value`.let(ClientAuthenticationProperty::unwrap))
  }

  /**
   * VPC connection control settings for brokers.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f2cb45484d4623c714814349ac98bb946f3b38ef448433a4148730a1b589e02")
  public open fun clientAuthentication(`value`: ClientAuthenticationProperty.Builder.() -> Unit):
      Unit = clientAuthentication(ClientAuthenticationProperty(`value`))

  /**
   * The name of the cluster.
   */
  public open fun clusterName(): String = unwrap(this).getClusterName()

  /**
   * The name of the cluster.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * Represents the configuration that you want MSK to use for the cluster.
   */
  public open fun configurationInfo(): Any? = unwrap(this).getConfigurationInfo()

  /**
   * Represents the configuration that you want MSK to use for the cluster.
   */
  public open fun configurationInfo(`value`: IResolvable) {
    unwrap(this).setConfigurationInfo(`value`.let(IResolvable::unwrap))
  }

  /**
   * Represents the configuration that you want MSK to use for the cluster.
   */
  public open fun configurationInfo(`value`: ConfigurationInfoProperty) {
    unwrap(this).setConfigurationInfo(`value`.let(ConfigurationInfoProperty::unwrap))
  }

  /**
   * Represents the configuration that you want MSK to use for the cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b24b0584c9fe8c8550ea380a1376a99b68f67fd23a2c4c53ad10e9062d32a311")
  public open fun configurationInfo(`value`: ConfigurationInfoProperty.Builder.() -> Unit): Unit =
      configurationInfo(ConfigurationInfoProperty(`value`))

  /**
   * The version of the cluster that you want to update.
   */
  public open fun currentVersion(): String? = unwrap(this).getCurrentVersion()

  /**
   * The version of the cluster that you want to update.
   */
  public open fun currentVersion(`value`: String) {
    unwrap(this).setCurrentVersion(`value`)
  }

  /**
   * Includes all encryption-related information.
   */
  public open fun encryptionInfo(): Any? = unwrap(this).getEncryptionInfo()

  /**
   * Includes all encryption-related information.
   */
  public open fun encryptionInfo(`value`: IResolvable) {
    unwrap(this).setEncryptionInfo(`value`.let(IResolvable::unwrap))
  }

  /**
   * Includes all encryption-related information.
   */
  public open fun encryptionInfo(`value`: EncryptionInfoProperty) {
    unwrap(this).setEncryptionInfo(`value`.let(EncryptionInfoProperty::unwrap))
  }

  /**
   * Includes all encryption-related information.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35b70b0321fc20ff434b49d0362c682d8ab55b391d776935f57b7979a5afd93c")
  public open fun encryptionInfo(`value`: EncryptionInfoProperty.Builder.() -> Unit): Unit =
      encryptionInfo(EncryptionInfoProperty(`value`))

  /**
   * Specifies the level of monitoring for the MSK cluster.
   */
  public open fun enhancedMonitoring(): String? = unwrap(this).getEnhancedMonitoring()

  /**
   * Specifies the level of monitoring for the MSK cluster.
   */
  public open fun enhancedMonitoring(`value`: String) {
    unwrap(this).setEnhancedMonitoring(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The version of Apache Kafka.
   */
  public open fun kafkaVersion(): String = unwrap(this).getKafkaVersion()

  /**
   * The version of Apache Kafka.
   */
  public open fun kafkaVersion(`value`: String) {
    unwrap(this).setKafkaVersion(`value`)
  }

  /**
   * Logging Info details.
   */
  public open fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

  /**
   * Logging Info details.
   */
  public open fun loggingInfo(`value`: IResolvable) {
    unwrap(this).setLoggingInfo(`value`.let(IResolvable::unwrap))
  }

  /**
   * Logging Info details.
   */
  public open fun loggingInfo(`value`: LoggingInfoProperty) {
    unwrap(this).setLoggingInfo(`value`.let(LoggingInfoProperty::unwrap))
  }

  /**
   * Logging Info details.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a40fee8e3a8755dbb891ff6119b045e98a9f230c7187de2508cf3a490a028b1d")
  public open fun loggingInfo(`value`: LoggingInfoProperty.Builder.() -> Unit): Unit =
      loggingInfo(LoggingInfoProperty(`value`))

  /**
   * The number of broker nodes in the cluster.
   */
  public open fun numberOfBrokerNodes(): Number = unwrap(this).getNumberOfBrokerNodes()

  /**
   * The number of broker nodes in the cluster.
   */
  public open fun numberOfBrokerNodes(`value`: Number) {
    unwrap(this).setNumberOfBrokerNodes(`value`)
  }

  /**
   * The settings for open monitoring.
   */
  public open fun openMonitoring(): Any? = unwrap(this).getOpenMonitoring()

  /**
   * The settings for open monitoring.
   */
  public open fun openMonitoring(`value`: IResolvable) {
    unwrap(this).setOpenMonitoring(`value`.let(IResolvable::unwrap))
  }

  /**
   * The settings for open monitoring.
   */
  public open fun openMonitoring(`value`: OpenMonitoringProperty) {
    unwrap(this).setOpenMonitoring(`value`.let(OpenMonitoringProperty::unwrap))
  }

  /**
   * The settings for open monitoring.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dcc34407947db21f9991c2defb5d60297c42573e7713e8671a7f8ab8236a98c1")
  public open fun openMonitoring(`value`: OpenMonitoringProperty.Builder.() -> Unit): Unit =
      openMonitoring(OpenMonitoringProperty(`value`))

  /**
   * This controls storage mode for supported storage tiers.
   */
  public open fun storageMode(): String? = unwrap(this).getStorageMode()

  /**
   * This controls storage mode for supported storage tiers.
   */
  public open fun storageMode(`value`: String) {
    unwrap(this).setStorageMode(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Create tags when creating the cluster.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Create tags when creating the cluster.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.msk.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Information about the broker nodes in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable)

    /**
     * Information about the broker nodes in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty)

    /**
     * Information about the broker nodes in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61ad7de6319342519a3c1d5709ea2dd2cd0a7ca9f7ee3b5bb8f1e1d709ab7ec7")
    public
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty.Builder.() -> Unit)

    /**
     * VPC connection control settings for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication VPC connection control settings for brokers. 
     */
    public fun clientAuthentication(clientAuthentication: IResolvable)

    /**
     * VPC connection control settings for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication VPC connection control settings for brokers. 
     */
    public fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty)

    /**
     * VPC connection control settings for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication VPC connection control settings for brokers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94990ea4553395f051fbe13922809ed1ab7a187bb46dc003a9cea5fcce16655a")
    public
        fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty.Builder.() -> Unit)

    /**
     * The name of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername)
     * @param clusterName The name of the cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * Represents the configuration that you want MSK to use for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster. 
     */
    public fun configurationInfo(configurationInfo: IResolvable)

    /**
     * Represents the configuration that you want MSK to use for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster. 
     */
    public fun configurationInfo(configurationInfo: ConfigurationInfoProperty)

    /**
     * Represents the configuration that you want MSK to use for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03a15325d3f00abc56619850e839d374872995e53db76160e9cfd6a13842a014")
    public fun configurationInfo(configurationInfo: ConfigurationInfoProperty.Builder.() -> Unit)

    /**
     * The version of the cluster that you want to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-currentversion)
     * @param currentVersion The version of the cluster that you want to update. 
     */
    public fun currentVersion(currentVersion: String)

    /**
     * Includes all encryption-related information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo Includes all encryption-related information. 
     */
    public fun encryptionInfo(encryptionInfo: IResolvable)

    /**
     * Includes all encryption-related information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo Includes all encryption-related information. 
     */
    public fun encryptionInfo(encryptionInfo: EncryptionInfoProperty)

    /**
     * Includes all encryption-related information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo Includes all encryption-related information. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3fdb09acff026972fdfc983e70307d7b654758bf6624a536e6fc64e6bd49810")
    public fun encryptionInfo(encryptionInfo: EncryptionInfoProperty.Builder.() -> Unit)

    /**
     * Specifies the level of monitoring for the MSK cluster.
     *
     * The possible values are `DEFAULT` , `PER_BROKER` , and `PER_TOPIC_PER_BROKER` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring)
     * @param enhancedMonitoring Specifies the level of monitoring for the MSK cluster. 
     */
    public fun enhancedMonitoring(enhancedMonitoring: String)

    /**
     * The version of Apache Kafka.
     *
     * You can use Amazon MSK to create clusters that use Apache Kafka versions 1.1.1 and 2.2.1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion)
     * @param kafkaVersion The version of Apache Kafka. 
     */
    public fun kafkaVersion(kafkaVersion: String)

    /**
     * Logging Info details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo Logging Info details. 
     */
    public fun loggingInfo(loggingInfo: IResolvable)

    /**
     * Logging Info details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo Logging Info details. 
     */
    public fun loggingInfo(loggingInfo: LoggingInfoProperty)

    /**
     * Logging Info details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo Logging Info details. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c5ffd2c1ffe53f697e777a19dc8afa8e9b2aae871e686ca438912c09b5ccff3")
    public fun loggingInfo(loggingInfo: LoggingInfoProperty.Builder.() -> Unit)

    /**
     * The number of broker nodes in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes)
     * @param numberOfBrokerNodes The number of broker nodes in the cluster. 
     */
    public fun numberOfBrokerNodes(numberOfBrokerNodes: Number)

    /**
     * The settings for open monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring The settings for open monitoring. 
     */
    public fun openMonitoring(openMonitoring: IResolvable)

    /**
     * The settings for open monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring The settings for open monitoring. 
     */
    public fun openMonitoring(openMonitoring: OpenMonitoringProperty)

    /**
     * The settings for open monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring The settings for open monitoring. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfb8e468253cc86a8dbad997c1624bae69c363d28d7aeb6903324f1029add53e")
    public fun openMonitoring(openMonitoring: OpenMonitoringProperty.Builder.() -> Unit)

    /**
     * This controls storage mode for supported storage tiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-storagemode)
     * @param storageMode This controls storage mode for supported storage tiers. 
     */
    public fun storageMode(storageMode: String)

    /**
     * Create tags when creating the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-tags)
     * @param tags Create tags when creating the cluster. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.Builder =
        software.amazon.awscdk.services.msk.CfnCluster.Builder.create(scope, id)

    /**
     * Information about the broker nodes in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    override fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(IResolvable::unwrap))
    }

    /**
     * Information about the broker nodes in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    override fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(BrokerNodeGroupInfoProperty::unwrap))
    }

    /**
     * Information about the broker nodes in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61ad7de6319342519a3c1d5709ea2dd2cd0a7ca9f7ee3b5bb8f1e1d709ab7ec7")
    override
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty.Builder.() -> Unit):
        Unit = brokerNodeGroupInfo(BrokerNodeGroupInfoProperty(brokerNodeGroupInfo))

    /**
     * VPC connection control settings for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication VPC connection control settings for brokers. 
     */
    override fun clientAuthentication(clientAuthentication: IResolvable) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(IResolvable::unwrap))
    }

    /**
     * VPC connection control settings for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication VPC connection control settings for brokers. 
     */
    override fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(ClientAuthenticationProperty::unwrap))
    }

    /**
     * VPC connection control settings for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication VPC connection control settings for brokers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94990ea4553395f051fbe13922809ed1ab7a187bb46dc003a9cea5fcce16655a")
    override
        fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty.Builder.() -> Unit):
        Unit = clientAuthentication(ClientAuthenticationProperty(clientAuthentication))

    /**
     * The name of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername)
     * @param clusterName The name of the cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * Represents the configuration that you want MSK to use for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster. 
     */
    override fun configurationInfo(configurationInfo: IResolvable) {
      cdkBuilder.configurationInfo(configurationInfo.let(IResolvable::unwrap))
    }

    /**
     * Represents the configuration that you want MSK to use for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster. 
     */
    override fun configurationInfo(configurationInfo: ConfigurationInfoProperty) {
      cdkBuilder.configurationInfo(configurationInfo.let(ConfigurationInfoProperty::unwrap))
    }

    /**
     * Represents the configuration that you want MSK to use for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03a15325d3f00abc56619850e839d374872995e53db76160e9cfd6a13842a014")
    override fun configurationInfo(configurationInfo: ConfigurationInfoProperty.Builder.() -> Unit):
        Unit = configurationInfo(ConfigurationInfoProperty(configurationInfo))

    /**
     * The version of the cluster that you want to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-currentversion)
     * @param currentVersion The version of the cluster that you want to update. 
     */
    override fun currentVersion(currentVersion: String) {
      cdkBuilder.currentVersion(currentVersion)
    }

    /**
     * Includes all encryption-related information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo Includes all encryption-related information. 
     */
    override fun encryptionInfo(encryptionInfo: IResolvable) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(IResolvable::unwrap))
    }

    /**
     * Includes all encryption-related information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo Includes all encryption-related information. 
     */
    override fun encryptionInfo(encryptionInfo: EncryptionInfoProperty) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(EncryptionInfoProperty::unwrap))
    }

    /**
     * Includes all encryption-related information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo Includes all encryption-related information. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3fdb09acff026972fdfc983e70307d7b654758bf6624a536e6fc64e6bd49810")
    override fun encryptionInfo(encryptionInfo: EncryptionInfoProperty.Builder.() -> Unit): Unit =
        encryptionInfo(EncryptionInfoProperty(encryptionInfo))

    /**
     * Specifies the level of monitoring for the MSK cluster.
     *
     * The possible values are `DEFAULT` , `PER_BROKER` , and `PER_TOPIC_PER_BROKER` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring)
     * @param enhancedMonitoring Specifies the level of monitoring for the MSK cluster. 
     */
    override fun enhancedMonitoring(enhancedMonitoring: String) {
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
    override fun kafkaVersion(kafkaVersion: String) {
      cdkBuilder.kafkaVersion(kafkaVersion)
    }

    /**
     * Logging Info details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo Logging Info details. 
     */
    override fun loggingInfo(loggingInfo: IResolvable) {
      cdkBuilder.loggingInfo(loggingInfo.let(IResolvable::unwrap))
    }

    /**
     * Logging Info details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo Logging Info details. 
     */
    override fun loggingInfo(loggingInfo: LoggingInfoProperty) {
      cdkBuilder.loggingInfo(loggingInfo.let(LoggingInfoProperty::unwrap))
    }

    /**
     * Logging Info details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo Logging Info details. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c5ffd2c1ffe53f697e777a19dc8afa8e9b2aae871e686ca438912c09b5ccff3")
    override fun loggingInfo(loggingInfo: LoggingInfoProperty.Builder.() -> Unit): Unit =
        loggingInfo(LoggingInfoProperty(loggingInfo))

    /**
     * The number of broker nodes in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes)
     * @param numberOfBrokerNodes The number of broker nodes in the cluster. 
     */
    override fun numberOfBrokerNodes(numberOfBrokerNodes: Number) {
      cdkBuilder.numberOfBrokerNodes(numberOfBrokerNodes)
    }

    /**
     * The settings for open monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring The settings for open monitoring. 
     */
    override fun openMonitoring(openMonitoring: IResolvable) {
      cdkBuilder.openMonitoring(openMonitoring.let(IResolvable::unwrap))
    }

    /**
     * The settings for open monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring The settings for open monitoring. 
     */
    override fun openMonitoring(openMonitoring: OpenMonitoringProperty) {
      cdkBuilder.openMonitoring(openMonitoring.let(OpenMonitoringProperty::unwrap))
    }

    /**
     * The settings for open monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring The settings for open monitoring. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfb8e468253cc86a8dbad997c1624bae69c363d28d7aeb6903324f1029add53e")
    override fun openMonitoring(openMonitoring: OpenMonitoringProperty.Builder.() -> Unit): Unit =
        openMonitoring(OpenMonitoringProperty(openMonitoring))

    /**
     * This controls storage mode for supported storage tiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-storagemode)
     * @param storageMode This controls storage mode for supported storage tiers. 
     */
    override fun storageMode(storageMode: String) {
      cdkBuilder.storageMode(storageMode)
    }

    /**
     * Create tags when creating the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-tags)
     * @param tags Create tags when creating the cluster. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.msk.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.msk.CfnCluster =
        wrapped.cdkObject
  }

  /**
   * The broker logs configuration for this MSK cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * BrokerLogsProperty brokerLogsProperty = BrokerLogsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html)
   */
  public interface BrokerLogsProperty {
    /**
     * Details of the CloudWatch Logs destination for broker logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html#cfn-msk-cluster-brokerlogs-cloudwatchlogs)
     */
    public fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

    /**
     * Details of the Kinesis Data Firehose delivery stream that is the destination for broker logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html#cfn-msk-cluster-brokerlogs-firehose)
     */
    public fun firehose(): Any? = unwrap(this).getFirehose()

    /**
     * Details of the Amazon S3 destination for broker logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html#cfn-msk-cluster-brokerlogs-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [BrokerLogsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogs Details of the CloudWatch Logs destination for broker logs.
       */
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable)

      /**
       * @param cloudWatchLogs Details of the CloudWatch Logs destination for broker logs.
       */
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty)

      /**
       * @param cloudWatchLogs Details of the CloudWatch Logs destination for broker logs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00173fc901fc925154645a69e02e48c96b0e6dac33fb9043bebccb842ae75583")
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty.Builder.() -> Unit)

      /**
       * @param firehose Details of the Kinesis Data Firehose delivery stream that is the
       * destination for broker logs.
       */
      public fun firehose(firehose: IResolvable)

      /**
       * @param firehose Details of the Kinesis Data Firehose delivery stream that is the
       * destination for broker logs.
       */
      public fun firehose(firehose: FirehoseProperty)

      /**
       * @param firehose Details of the Kinesis Data Firehose delivery stream that is the
       * destination for broker logs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82c8164ccd7edc7f38961bf3b9efe2458c79026290d580bf7b2a72c33348744d")
      public fun firehose(firehose: FirehoseProperty.Builder.() -> Unit)

      /**
       * @param s3 Details of the Amazon S3 destination for broker logs.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Details of the Amazon S3 destination for broker logs.
       */
      public fun s3(s3: S3Property)

      /**
       * @param s3 Details of the Amazon S3 destination for broker logs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a20013b1bb05fba1ee7c0fa50447d6a12e6e9abc5d45e51ff716e5a1c196cd9d")
      public fun s3(s3: S3Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty.builder()

      /**
       * @param cloudWatchLogs Details of the CloudWatch Logs destination for broker logs.
       */
      override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLogs Details of the CloudWatch Logs destination for broker logs.
       */
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogsProperty::unwrap))
      }

      /**
       * @param cloudWatchLogs Details of the CloudWatch Logs destination for broker logs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00173fc901fc925154645a69e02e48c96b0e6dac33fb9043bebccb842ae75583")
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty.Builder.() -> Unit): Unit =
          cloudWatchLogs(CloudWatchLogsProperty(cloudWatchLogs))

      /**
       * @param firehose Details of the Kinesis Data Firehose delivery stream that is the
       * destination for broker logs.
       */
      override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      /**
       * @param firehose Details of the Kinesis Data Firehose delivery stream that is the
       * destination for broker logs.
       */
      override fun firehose(firehose: FirehoseProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseProperty::unwrap))
      }

      /**
       * @param firehose Details of the Kinesis Data Firehose delivery stream that is the
       * destination for broker logs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82c8164ccd7edc7f38961bf3b9efe2458c79026290d580bf7b2a72c33348744d")
      override fun firehose(firehose: FirehoseProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseProperty(firehose))

      /**
       * @param s3 Details of the Amazon S3 destination for broker logs.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      /**
       * @param s3 Details of the Amazon S3 destination for broker logs.
       */
      override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property::unwrap))
      }

      /**
       * @param s3 Details of the Amazon S3 destination for broker logs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a20013b1bb05fba1ee7c0fa50447d6a12e6e9abc5d45e51ff716e5a1c196cd9d")
      override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty,
    ) : CdkObject(cdkObject), BrokerLogsProperty {
      /**
       * Details of the CloudWatch Logs destination for broker logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html#cfn-msk-cluster-brokerlogs-cloudwatchlogs)
       */
      override fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

      /**
       * Details of the Kinesis Data Firehose delivery stream that is the destination for broker
       * logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html#cfn-msk-cluster-brokerlogs-firehose)
       */
      override fun firehose(): Any? = unwrap(this).getFirehose()

      /**
       * Details of the Amazon S3 destination for broker logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html#cfn-msk-cluster-brokerlogs-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BrokerLogsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty):
          BrokerLogsProperty = CdkObjectWrappers.wrap(cdkObject) as? BrokerLogsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BrokerLogsProperty):
          software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty
    }
  }

  /**
   * Describes the setup to be used for the broker nodes in the cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * BrokerNodeGroupInfoProperty brokerNodeGroupInfoProperty = BrokerNodeGroupInfoProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html)
   */
  public interface BrokerNodeGroupInfoProperty {
    /**
     * This parameter is currently not in use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-brokerazdistribution)
     */
    public fun brokerAzDistribution(): String? = unwrap(this).getBrokerAzDistribution()

    /**
     * The list of subnets to connect to in the client virtual private cloud (VPC).
     *
     * Amazon creates elastic network interfaces inside these subnets. Client applications use
     * elastic network interfaces to produce and consume data.
     *
     * If you use the US West (N. California) Region, specify exactly two subnets. For other Regions
     * where Amazon MSK is available, you can specify either two or three subnets. The subnets that you
     * specify must be in distinct Availability Zones. When you create a cluster, Amazon MSK
     * distributes the broker nodes evenly across the subnets that you specify.
     *
     * Client subnets can't occupy the Availability Zone with ID `use1-az3` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-clientsubnets)
     */
    public fun clientSubnets(): List<String>

    /**
     * Information about the cluster's connectivity setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-connectivityinfo)
     */
    public fun connectivityInfo(): Any? = unwrap(this).getConnectivityInfo()

    /**
     * The type of Amazon EC2 instances to use for brokers.
     *
     * The following instance types are allowed: kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge,
     * kafka.m5.4xlarge, kafka.m5.8xlarge, kafka.m5.12xlarge, kafka.m5.16xlarge, kafka.m5.24xlarge, and
     * kafka.t3.small.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-instancetype)
     */
    public fun instanceType(): String

    /**
     * The security groups to associate with the elastic network interfaces in order to specify who
     * can connect to and communicate with the Amazon MSK cluster.
     *
     * If you don't specify a security group, Amazon MSK uses the default security group associated
     * with the VPC. If you specify security groups that were shared with you, you must ensure that you
     * have permissions to them. Specifically, you need the `ec2:DescribeSecurityGroups` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * Contains information about storage volumes attached to Amazon MSK broker nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-storageinfo)
     */
    public fun storageInfo(): Any? = unwrap(this).getStorageInfo()

    /**
     * A builder for [BrokerNodeGroupInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param brokerAzDistribution This parameter is currently not in use.
       */
      public fun brokerAzDistribution(brokerAzDistribution: String)

      /**
       * @param clientSubnets The list of subnets to connect to in the client virtual private cloud
       * (VPC). 
       * Amazon creates elastic network interfaces inside these subnets. Client applications use
       * elastic network interfaces to produce and consume data.
       *
       * If you use the US West (N. California) Region, specify exactly two subnets. For other
       * Regions where Amazon MSK is available, you can specify either two or three subnets. The
       * subnets that you specify must be in distinct Availability Zones. When you create a cluster,
       * Amazon MSK distributes the broker nodes evenly across the subnets that you specify.
       *
       * Client subnets can't occupy the Availability Zone with ID `use1-az3` .
       */
      public fun clientSubnets(clientSubnets: List<String>)

      /**
       * @param clientSubnets The list of subnets to connect to in the client virtual private cloud
       * (VPC). 
       * Amazon creates elastic network interfaces inside these subnets. Client applications use
       * elastic network interfaces to produce and consume data.
       *
       * If you use the US West (N. California) Region, specify exactly two subnets. For other
       * Regions where Amazon MSK is available, you can specify either two or three subnets. The
       * subnets that you specify must be in distinct Availability Zones. When you create a cluster,
       * Amazon MSK distributes the broker nodes evenly across the subnets that you specify.
       *
       * Client subnets can't occupy the Availability Zone with ID `use1-az3` .
       */
      public fun clientSubnets(vararg clientSubnets: String)

      /**
       * @param connectivityInfo Information about the cluster's connectivity setting.
       */
      public fun connectivityInfo(connectivityInfo: IResolvable)

      /**
       * @param connectivityInfo Information about the cluster's connectivity setting.
       */
      public fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty)

      /**
       * @param connectivityInfo Information about the cluster's connectivity setting.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70eb7530aacae09040edb4b6256d0549719e092e94edac49299c9e785aeddc62")
      public fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty.Builder.() -> Unit)

      /**
       * @param instanceType The type of Amazon EC2 instances to use for brokers. 
       * The following instance types are allowed: kafka.m5.large, kafka.m5.xlarge,
       * kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.8xlarge, kafka.m5.12xlarge, kafka.m5.16xlarge,
       * kafka.m5.24xlarge, and kafka.t3.small.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param securityGroups The security groups to associate with the elastic network interfaces
       * in order to specify who can connect to and communicate with the Amazon MSK cluster.
       * If you don't specify a security group, Amazon MSK uses the default security group
       * associated with the VPC. If you specify security groups that were shared with you, you must
       * ensure that you have permissions to them. Specifically, you need the
       * `ec2:DescribeSecurityGroups` permission.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups The security groups to associate with the elastic network interfaces
       * in order to specify who can connect to and communicate with the Amazon MSK cluster.
       * If you don't specify a security group, Amazon MSK uses the default security group
       * associated with the VPC. If you specify security groups that were shared with you, you must
       * ensure that you have permissions to them. Specifically, you need the
       * `ec2:DescribeSecurityGroups` permission.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param storageInfo Contains information about storage volumes attached to Amazon MSK broker
       * nodes.
       */
      public fun storageInfo(storageInfo: IResolvable)

      /**
       * @param storageInfo Contains information about storage volumes attached to Amazon MSK broker
       * nodes.
       */
      public fun storageInfo(storageInfo: StorageInfoProperty)

      /**
       * @param storageInfo Contains information about storage volumes attached to Amazon MSK broker
       * nodes.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ad02fa94afddc6233268390a43d23a87a02529e8eb0720bc086f03e699c7e4b")
      public fun storageInfo(storageInfo: StorageInfoProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty.builder()

      /**
       * @param brokerAzDistribution This parameter is currently not in use.
       */
      override fun brokerAzDistribution(brokerAzDistribution: String) {
        cdkBuilder.brokerAzDistribution(brokerAzDistribution)
      }

      /**
       * @param clientSubnets The list of subnets to connect to in the client virtual private cloud
       * (VPC). 
       * Amazon creates elastic network interfaces inside these subnets. Client applications use
       * elastic network interfaces to produce and consume data.
       *
       * If you use the US West (N. California) Region, specify exactly two subnets. For other
       * Regions where Amazon MSK is available, you can specify either two or three subnets. The
       * subnets that you specify must be in distinct Availability Zones. When you create a cluster,
       * Amazon MSK distributes the broker nodes evenly across the subnets that you specify.
       *
       * Client subnets can't occupy the Availability Zone with ID `use1-az3` .
       */
      override fun clientSubnets(clientSubnets: List<String>) {
        cdkBuilder.clientSubnets(clientSubnets)
      }

      /**
       * @param clientSubnets The list of subnets to connect to in the client virtual private cloud
       * (VPC). 
       * Amazon creates elastic network interfaces inside these subnets. Client applications use
       * elastic network interfaces to produce and consume data.
       *
       * If you use the US West (N. California) Region, specify exactly two subnets. For other
       * Regions where Amazon MSK is available, you can specify either two or three subnets. The
       * subnets that you specify must be in distinct Availability Zones. When you create a cluster,
       * Amazon MSK distributes the broker nodes evenly across the subnets that you specify.
       *
       * Client subnets can't occupy the Availability Zone with ID `use1-az3` .
       */
      override fun clientSubnets(vararg clientSubnets: String): Unit =
          clientSubnets(clientSubnets.toList())

      /**
       * @param connectivityInfo Information about the cluster's connectivity setting.
       */
      override fun connectivityInfo(connectivityInfo: IResolvable) {
        cdkBuilder.connectivityInfo(connectivityInfo.let(IResolvable::unwrap))
      }

      /**
       * @param connectivityInfo Information about the cluster's connectivity setting.
       */
      override fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty) {
        cdkBuilder.connectivityInfo(connectivityInfo.let(ConnectivityInfoProperty::unwrap))
      }

      /**
       * @param connectivityInfo Information about the cluster's connectivity setting.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70eb7530aacae09040edb4b6256d0549719e092e94edac49299c9e785aeddc62")
      override fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty.Builder.() -> Unit):
          Unit = connectivityInfo(ConnectivityInfoProperty(connectivityInfo))

      /**
       * @param instanceType The type of Amazon EC2 instances to use for brokers. 
       * The following instance types are allowed: kafka.m5.large, kafka.m5.xlarge,
       * kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.8xlarge, kafka.m5.12xlarge, kafka.m5.16xlarge,
       * kafka.m5.24xlarge, and kafka.t3.small.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param securityGroups The security groups to associate with the elastic network interfaces
       * in order to specify who can connect to and communicate with the Amazon MSK cluster.
       * If you don't specify a security group, Amazon MSK uses the default security group
       * associated with the VPC. If you specify security groups that were shared with you, you must
       * ensure that you have permissions to them. Specifically, you need the
       * `ec2:DescribeSecurityGroups` permission.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups The security groups to associate with the elastic network interfaces
       * in order to specify who can connect to and communicate with the Amazon MSK cluster.
       * If you don't specify a security group, Amazon MSK uses the default security group
       * associated with the VPC. If you specify security groups that were shared with you, you must
       * ensure that you have permissions to them. Specifically, you need the
       * `ec2:DescribeSecurityGroups` permission.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param storageInfo Contains information about storage volumes attached to Amazon MSK broker
       * nodes.
       */
      override fun storageInfo(storageInfo: IResolvable) {
        cdkBuilder.storageInfo(storageInfo.let(IResolvable::unwrap))
      }

      /**
       * @param storageInfo Contains information about storage volumes attached to Amazon MSK broker
       * nodes.
       */
      override fun storageInfo(storageInfo: StorageInfoProperty) {
        cdkBuilder.storageInfo(storageInfo.let(StorageInfoProperty::unwrap))
      }

      /**
       * @param storageInfo Contains information about storage volumes attached to Amazon MSK broker
       * nodes.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ad02fa94afddc6233268390a43d23a87a02529e8eb0720bc086f03e699c7e4b")
      override fun storageInfo(storageInfo: StorageInfoProperty.Builder.() -> Unit): Unit =
          storageInfo(StorageInfoProperty(storageInfo))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty,
    ) : CdkObject(cdkObject), BrokerNodeGroupInfoProperty {
      /**
       * This parameter is currently not in use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-brokerazdistribution)
       */
      override fun brokerAzDistribution(): String? = unwrap(this).getBrokerAzDistribution()

      /**
       * The list of subnets to connect to in the client virtual private cloud (VPC).
       *
       * Amazon creates elastic network interfaces inside these subnets. Client applications use
       * elastic network interfaces to produce and consume data.
       *
       * If you use the US West (N. California) Region, specify exactly two subnets. For other
       * Regions where Amazon MSK is available, you can specify either two or three subnets. The
       * subnets that you specify must be in distinct Availability Zones. When you create a cluster,
       * Amazon MSK distributes the broker nodes evenly across the subnets that you specify.
       *
       * Client subnets can't occupy the Availability Zone with ID `use1-az3` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-clientsubnets)
       */
      override fun clientSubnets(): List<String> = unwrap(this).getClientSubnets()

      /**
       * Information about the cluster's connectivity setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-connectivityinfo)
       */
      override fun connectivityInfo(): Any? = unwrap(this).getConnectivityInfo()

      /**
       * The type of Amazon EC2 instances to use for brokers.
       *
       * The following instance types are allowed: kafka.m5.large, kafka.m5.xlarge,
       * kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.8xlarge, kafka.m5.12xlarge, kafka.m5.16xlarge,
       * kafka.m5.24xlarge, and kafka.t3.small.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * The security groups to associate with the elastic network interfaces in order to specify
       * who can connect to and communicate with the Amazon MSK cluster.
       *
       * If you don't specify a security group, Amazon MSK uses the default security group
       * associated with the VPC. If you specify security groups that were shared with you, you must
       * ensure that you have permissions to them. Specifically, you need the
       * `ec2:DescribeSecurityGroups` permission.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      /**
       * Contains information about storage volumes attached to Amazon MSK broker nodes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-storageinfo)
       */
      override fun storageInfo(): Any? = unwrap(this).getStorageInfo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BrokerNodeGroupInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty):
          BrokerNodeGroupInfoProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BrokerNodeGroupInfoProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BrokerNodeGroupInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty
    }
  }

  /**
   * Includes all client authentication information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * ClientAuthenticationProperty clientAuthenticationProperty =
   * ClientAuthenticationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html)
   */
  public interface ClientAuthenticationProperty {
    /**
     * Details for client authentication using SASL.
     *
     * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to true.
     * You must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose `TLS_PLAINTEXT` ,
     * then you must also set `unauthenticated` to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html#cfn-msk-cluster-clientauthentication-sasl)
     */
    public fun sasl(): Any? = unwrap(this).getSasl()

    /**
     * Details for ClientAuthentication using TLS.
     *
     * To turn on TLS access control, you must also turn on `EncryptionInTransit` by setting
     * `inCluster` to true and `clientBroker` to `TLS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html#cfn-msk-cluster-clientauthentication-tls)
     */
    public fun tls(): Any? = unwrap(this).getTls()

    /**
     * Details for ClientAuthentication using no authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html#cfn-msk-cluster-clientauthentication-unauthenticated)
     */
    public fun unauthenticated(): Any? = unwrap(this).getUnauthenticated()

    /**
     * A builder for [ClientAuthenticationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sasl Details for client authentication using SASL.
       * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to
       * true. You must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose
       * `TLS_PLAINTEXT` , then you must also set `unauthenticated` to true.
       */
      public fun sasl(sasl: IResolvable)

      /**
       * @param sasl Details for client authentication using SASL.
       * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to
       * true. You must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose
       * `TLS_PLAINTEXT` , then you must also set `unauthenticated` to true.
       */
      public fun sasl(sasl: SaslProperty)

      /**
       * @param sasl Details for client authentication using SASL.
       * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to
       * true. You must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose
       * `TLS_PLAINTEXT` , then you must also set `unauthenticated` to true.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("713c425e8307846c7f9d89f7971c7cab5fd866d3111c9ded45af6da17f6b2b36")
      public fun sasl(sasl: SaslProperty.Builder.() -> Unit)

      /**
       * @param tls Details for ClientAuthentication using TLS.
       * To turn on TLS access control, you must also turn on `EncryptionInTransit` by setting
       * `inCluster` to true and `clientBroker` to `TLS` .
       */
      public fun tls(tls: IResolvable)

      /**
       * @param tls Details for ClientAuthentication using TLS.
       * To turn on TLS access control, you must also turn on `EncryptionInTransit` by setting
       * `inCluster` to true and `clientBroker` to `TLS` .
       */
      public fun tls(tls: TlsProperty)

      /**
       * @param tls Details for ClientAuthentication using TLS.
       * To turn on TLS access control, you must also turn on `EncryptionInTransit` by setting
       * `inCluster` to true and `clientBroker` to `TLS` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5404832d90b1ea5c7ea1ebc1ff6128e87f9402511c0cd0dc499441dd0a223dd0")
      public fun tls(tls: TlsProperty.Builder.() -> Unit)

      /**
       * @param unauthenticated Details for ClientAuthentication using no authentication.
       */
      public fun unauthenticated(unauthenticated: IResolvable)

      /**
       * @param unauthenticated Details for ClientAuthentication using no authentication.
       */
      public fun unauthenticated(unauthenticated: UnauthenticatedProperty)

      /**
       * @param unauthenticated Details for ClientAuthentication using no authentication.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a919ef04e218ebd8fb3f81e42bd0dd313075ff02b066e0e3a1218a994857c38d")
      public fun unauthenticated(unauthenticated: UnauthenticatedProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty.builder()

      /**
       * @param sasl Details for client authentication using SASL.
       * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to
       * true. You must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose
       * `TLS_PLAINTEXT` , then you must also set `unauthenticated` to true.
       */
      override fun sasl(sasl: IResolvable) {
        cdkBuilder.sasl(sasl.let(IResolvable::unwrap))
      }

      /**
       * @param sasl Details for client authentication using SASL.
       * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to
       * true. You must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose
       * `TLS_PLAINTEXT` , then you must also set `unauthenticated` to true.
       */
      override fun sasl(sasl: SaslProperty) {
        cdkBuilder.sasl(sasl.let(SaslProperty::unwrap))
      }

      /**
       * @param sasl Details for client authentication using SASL.
       * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to
       * true. You must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose
       * `TLS_PLAINTEXT` , then you must also set `unauthenticated` to true.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("713c425e8307846c7f9d89f7971c7cab5fd866d3111c9ded45af6da17f6b2b36")
      override fun sasl(sasl: SaslProperty.Builder.() -> Unit): Unit = sasl(SaslProperty(sasl))

      /**
       * @param tls Details for ClientAuthentication using TLS.
       * To turn on TLS access control, you must also turn on `EncryptionInTransit` by setting
       * `inCluster` to true and `clientBroker` to `TLS` .
       */
      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable::unwrap))
      }

      /**
       * @param tls Details for ClientAuthentication using TLS.
       * To turn on TLS access control, you must also turn on `EncryptionInTransit` by setting
       * `inCluster` to true and `clientBroker` to `TLS` .
       */
      override fun tls(tls: TlsProperty) {
        cdkBuilder.tls(tls.let(TlsProperty::unwrap))
      }

      /**
       * @param tls Details for ClientAuthentication using TLS.
       * To turn on TLS access control, you must also turn on `EncryptionInTransit` by setting
       * `inCluster` to true and `clientBroker` to `TLS` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5404832d90b1ea5c7ea1ebc1ff6128e87f9402511c0cd0dc499441dd0a223dd0")
      override fun tls(tls: TlsProperty.Builder.() -> Unit): Unit = tls(TlsProperty(tls))

      /**
       * @param unauthenticated Details for ClientAuthentication using no authentication.
       */
      override fun unauthenticated(unauthenticated: IResolvable) {
        cdkBuilder.unauthenticated(unauthenticated.let(IResolvable::unwrap))
      }

      /**
       * @param unauthenticated Details for ClientAuthentication using no authentication.
       */
      override fun unauthenticated(unauthenticated: UnauthenticatedProperty) {
        cdkBuilder.unauthenticated(unauthenticated.let(UnauthenticatedProperty::unwrap))
      }

      /**
       * @param unauthenticated Details for ClientAuthentication using no authentication.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a919ef04e218ebd8fb3f81e42bd0dd313075ff02b066e0e3a1218a994857c38d")
      override fun unauthenticated(unauthenticated: UnauthenticatedProperty.Builder.() -> Unit):
          Unit = unauthenticated(UnauthenticatedProperty(unauthenticated))

      public fun build():
          software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty,
    ) : CdkObject(cdkObject), ClientAuthenticationProperty {
      /**
       * Details for client authentication using SASL.
       *
       * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to
       * true. You must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose
       * `TLS_PLAINTEXT` , then you must also set `unauthenticated` to true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html#cfn-msk-cluster-clientauthentication-sasl)
       */
      override fun sasl(): Any? = unwrap(this).getSasl()

      /**
       * Details for ClientAuthentication using TLS.
       *
       * To turn on TLS access control, you must also turn on `EncryptionInTransit` by setting
       * `inCluster` to true and `clientBroker` to `TLS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html#cfn-msk-cluster-clientauthentication-tls)
       */
      override fun tls(): Any? = unwrap(this).getTls()

      /**
       * Details for ClientAuthentication using no authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html#cfn-msk-cluster-clientauthentication-unauthenticated)
       */
      override fun unauthenticated(): Any? = unwrap(this).getUnauthenticated()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClientAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty):
          ClientAuthenticationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClientAuthenticationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientAuthenticationProperty):
          software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty
    }
  }

  /**
   * Details of the CloudWatch Logs destination for broker logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * CloudWatchLogsProperty cloudWatchLogsProperty = CloudWatchLogsProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .logGroup("logGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html)
   */
  public interface CloudWatchLogsProperty {
    /**
     * Specifies whether broker logs get sent to the specified CloudWatch Logs destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html#cfn-msk-cluster-cloudwatchlogs-enabled)
     */
    public fun enabled(): Any

    /**
     * The CloudWatch log group that is the destination for broker logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html#cfn-msk-cluster-cloudwatchlogs-loggroup)
     */
    public fun logGroup(): String? = unwrap(this).getLogGroup()

    /**
     * A builder for [CloudWatchLogsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Specifies whether broker logs get sent to the specified CloudWatch Logs
       * destination. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether broker logs get sent to the specified CloudWatch Logs
       * destination. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param logGroup The CloudWatch log group that is the destination for broker logs.
       */
      public fun logGroup(logGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty.builder()

      /**
       * @param enabled Specifies whether broker logs get sent to the specified CloudWatch Logs
       * destination. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether broker logs get sent to the specified CloudWatch Logs
       * destination. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param logGroup The CloudWatch log group that is the destination for broker logs.
       */
      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsProperty {
      /**
       * Specifies whether broker logs get sent to the specified CloudWatch Logs destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html#cfn-msk-cluster-cloudwatchlogs-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The CloudWatch log group that is the destination for broker logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html#cfn-msk-cluster-cloudwatchlogs-loggroup)
       */
      override fun logGroup(): String? = unwrap(this).getLogGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty):
          CloudWatchLogsProperty = CdkObjectWrappers.wrap(cdkObject) as? CloudWatchLogsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsProperty):
          software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty
    }
  }

  /**
   * Specifies the configuration to use for the brokers.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * ConfigurationInfoProperty configurationInfoProperty = ConfigurationInfoProperty.builder()
   * .arn("arn")
   * .revision(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html)
   */
  public interface ConfigurationInfoProperty {
    /**
     * ARN of the configuration to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html#cfn-msk-cluster-configurationinfo-arn)
     */
    public fun arn(): String

    /**
     * The revision of the configuration to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html#cfn-msk-cluster-configurationinfo-revision)
     */
    public fun revision(): Number

    /**
     * A builder for [ConfigurationInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn ARN of the configuration to use. 
       */
      public fun arn(arn: String)

      /**
       * @param revision The revision of the configuration to use. 
       */
      public fun revision(revision: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty.builder()

      /**
       * @param arn ARN of the configuration to use. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param revision The revision of the configuration to use. 
       */
      override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty,
    ) : CdkObject(cdkObject), ConfigurationInfoProperty {
      /**
       * ARN of the configuration to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html#cfn-msk-cluster-configurationinfo-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * The revision of the configuration to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html#cfn-msk-cluster-configurationinfo-revision)
       */
      override fun revision(): Number = unwrap(this).getRevision()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty):
          ConfigurationInfoProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConfigurationInfoProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty
    }
  }

  /**
   * Broker access controls.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * ConnectivityInfoProperty connectivityInfoProperty = ConnectivityInfoProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-connectivityinfo.html)
   */
  public interface ConnectivityInfoProperty {
    /**
     * Access control settings for the cluster's brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-connectivityinfo.html#cfn-msk-cluster-connectivityinfo-publicaccess)
     */
    public fun publicAccess(): Any? = unwrap(this).getPublicAccess()

    /**
     * VPC connection control settings for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-connectivityinfo.html#cfn-msk-cluster-connectivityinfo-vpcconnectivity)
     */
    public fun vpcConnectivity(): Any? = unwrap(this).getVpcConnectivity()

    /**
     * A builder for [ConnectivityInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param publicAccess Access control settings for the cluster's brokers.
       */
      public fun publicAccess(publicAccess: IResolvable)

      /**
       * @param publicAccess Access control settings for the cluster's brokers.
       */
      public fun publicAccess(publicAccess: PublicAccessProperty)

      /**
       * @param publicAccess Access control settings for the cluster's brokers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a7888d4955b3315da4a19ed9554bec66f86fb723efe1814ec8149ab6ece268e")
      public fun publicAccess(publicAccess: PublicAccessProperty.Builder.() -> Unit)

      /**
       * @param vpcConnectivity VPC connection control settings for brokers.
       */
      public fun vpcConnectivity(vpcConnectivity: IResolvable)

      /**
       * @param vpcConnectivity VPC connection control settings for brokers.
       */
      public fun vpcConnectivity(vpcConnectivity: VpcConnectivityProperty)

      /**
       * @param vpcConnectivity VPC connection control settings for brokers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ca41c7a838de77bd0fa0a604512e42a1b2e929eec389c095805c30bf57f92ae")
      public fun vpcConnectivity(vpcConnectivity: VpcConnectivityProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty.builder()

      /**
       * @param publicAccess Access control settings for the cluster's brokers.
       */
      override fun publicAccess(publicAccess: IResolvable) {
        cdkBuilder.publicAccess(publicAccess.let(IResolvable::unwrap))
      }

      /**
       * @param publicAccess Access control settings for the cluster's brokers.
       */
      override fun publicAccess(publicAccess: PublicAccessProperty) {
        cdkBuilder.publicAccess(publicAccess.let(PublicAccessProperty::unwrap))
      }

      /**
       * @param publicAccess Access control settings for the cluster's brokers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a7888d4955b3315da4a19ed9554bec66f86fb723efe1814ec8149ab6ece268e")
      override fun publicAccess(publicAccess: PublicAccessProperty.Builder.() -> Unit): Unit =
          publicAccess(PublicAccessProperty(publicAccess))

      /**
       * @param vpcConnectivity VPC connection control settings for brokers.
       */
      override fun vpcConnectivity(vpcConnectivity: IResolvable) {
        cdkBuilder.vpcConnectivity(vpcConnectivity.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConnectivity VPC connection control settings for brokers.
       */
      override fun vpcConnectivity(vpcConnectivity: VpcConnectivityProperty) {
        cdkBuilder.vpcConnectivity(vpcConnectivity.let(VpcConnectivityProperty::unwrap))
      }

      /**
       * @param vpcConnectivity VPC connection control settings for brokers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ca41c7a838de77bd0fa0a604512e42a1b2e929eec389c095805c30bf57f92ae")
      override fun vpcConnectivity(vpcConnectivity: VpcConnectivityProperty.Builder.() -> Unit):
          Unit = vpcConnectivity(VpcConnectivityProperty(vpcConnectivity))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty,
    ) : CdkObject(cdkObject), ConnectivityInfoProperty {
      /**
       * Access control settings for the cluster's brokers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-connectivityinfo.html#cfn-msk-cluster-connectivityinfo-publicaccess)
       */
      override fun publicAccess(): Any? = unwrap(this).getPublicAccess()

      /**
       * VPC connection control settings for brokers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-connectivityinfo.html#cfn-msk-cluster-connectivityinfo-vpcconnectivity)
       */
      override fun vpcConnectivity(): Any? = unwrap(this).getVpcConnectivity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectivityInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty):
          ConnectivityInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? ConnectivityInfoProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectivityInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty
    }
  }

  /**
   * Contains information about the EBS storage volumes attached to the broker nodes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * EBSStorageInfoProperty eBSStorageInfoProperty = EBSStorageInfoProperty.builder()
   * .provisionedThroughput(ProvisionedThroughputProperty.builder()
   * .enabled(false)
   * .volumeThroughput(123)
   * .build())
   * .volumeSize(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html)
   */
  public interface EBSStorageInfoProperty {
    /**
     * EBS volume provisioned throughput information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html#cfn-msk-cluster-ebsstorageinfo-provisionedthroughput)
     */
    public fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

    /**
     * The size in GiB of the EBS volume for the data drive on each broker node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html#cfn-msk-cluster-ebsstorageinfo-volumesize)
     */
    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * A builder for [EBSStorageInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param provisionedThroughput EBS volume provisioned throughput information.
       */
      public fun provisionedThroughput(provisionedThroughput: IResolvable)

      /**
       * @param provisionedThroughput EBS volume provisioned throughput information.
       */
      public fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty)

      /**
       * @param provisionedThroughput EBS volume provisioned throughput information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("becd042847a0cda11c380a0be5e18fc2c67b234230e0f9a0119385cca50f9349")
      public
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit)

      /**
       * @param volumeSize The size in GiB of the EBS volume for the data drive on each broker node.
       */
      public fun volumeSize(volumeSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty.builder()

      /**
       * @param provisionedThroughput EBS volume provisioned throughput information.
       */
      override fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
      }

      /**
       * @param provisionedThroughput EBS volume provisioned throughput information.
       */
      override fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(ProvisionedThroughputProperty::unwrap))
      }

      /**
       * @param provisionedThroughput EBS volume provisioned throughput information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("becd042847a0cda11c380a0be5e18fc2c67b234230e0f9a0119385cca50f9349")
      override
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit):
          Unit = provisionedThroughput(ProvisionedThroughputProperty(provisionedThroughput))

      /**
       * @param volumeSize The size in GiB of the EBS volume for the data drive on each broker node.
       */
      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty,
    ) : CdkObject(cdkObject), EBSStorageInfoProperty {
      /**
       * EBS volume provisioned throughput information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html#cfn-msk-cluster-ebsstorageinfo-provisionedthroughput)
       */
      override fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

      /**
       * The size in GiB of the EBS volume for the data drive on each broker node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html#cfn-msk-cluster-ebsstorageinfo-volumesize)
       */
      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EBSStorageInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty):
          EBSStorageInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? EBSStorageInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EBSStorageInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty
    }
  }

  /**
   * The data-volume encryption details.
   *
   * You can't update encryption at rest settings for existing clusters.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * EncryptionAtRestProperty encryptionAtRestProperty = EncryptionAtRestProperty.builder()
   * .dataVolumeKmsKeyId("dataVolumeKmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html)
   */
  public interface EncryptionAtRestProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon KMS key for encrypting data at rest.
     *
     * If you don't specify a KMS key, MSK creates one for you and uses it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html#cfn-msk-cluster-encryptionatrest-datavolumekmskeyid)
     */
    public fun dataVolumeKmsKeyId(): String

    /**
     * A builder for [EncryptionAtRestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataVolumeKmsKeyId The Amazon Resource Name (ARN) of the Amazon KMS key for
       * encrypting data at rest. 
       * If you don't specify a KMS key, MSK creates one for you and uses it.
       */
      public fun dataVolumeKmsKeyId(dataVolumeKmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty.builder()

      /**
       * @param dataVolumeKmsKeyId The Amazon Resource Name (ARN) of the Amazon KMS key for
       * encrypting data at rest. 
       * If you don't specify a KMS key, MSK creates one for you and uses it.
       */
      override fun dataVolumeKmsKeyId(dataVolumeKmsKeyId: String) {
        cdkBuilder.dataVolumeKmsKeyId(dataVolumeKmsKeyId)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty,
    ) : CdkObject(cdkObject), EncryptionAtRestProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon KMS key for encrypting data at rest.
       *
       * If you don't specify a KMS key, MSK creates one for you and uses it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html#cfn-msk-cluster-encryptionatrest-datavolumekmskeyid)
       */
      override fun dataVolumeKmsKeyId(): String = unwrap(this).getDataVolumeKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty):
          EncryptionAtRestProperty = CdkObjectWrappers.wrap(cdkObject) as? EncryptionAtRestProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionAtRestProperty):
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty
    }
  }

  /**
   * The settings for encrypting data in transit.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * EncryptionInTransitProperty encryptionInTransitProperty = EncryptionInTransitProperty.builder()
   * .clientBroker("clientBroker")
   * .inCluster(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html)
   */
  public interface EncryptionInTransitProperty {
    /**
     * Indicates the encryption setting for data in transit between clients and brokers.
     *
     * You must set it to one of the following values.
     *
     * `TLS` means that client-broker communication is enabled with TLS only.
     *
     * `TLS_PLAINTEXT` means that client-broker communication is enabled for both TLS-encrypted, as
     * well as plaintext data.
     *
     * `PLAINTEXT` means that client-broker communication is enabled in plaintext only.
     *
     * The default value is `TLS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-clientbroker)
     */
    public fun clientBroker(): String? = unwrap(this).getClientBroker()

    /**
     * When set to true, it indicates that data communication among the broker nodes of the cluster
     * is encrypted.
     *
     * When set to false, the communication happens in plaintext.
     *
     * The default value is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-incluster)
     */
    public fun inCluster(): Any? = unwrap(this).getInCluster()

    /**
     * A builder for [EncryptionInTransitProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientBroker Indicates the encryption setting for data in transit between clients
       * and brokers.
       * You must set it to one of the following values.
       *
       * `TLS` means that client-broker communication is enabled with TLS only.
       *
       * `TLS_PLAINTEXT` means that client-broker communication is enabled for both TLS-encrypted,
       * as well as plaintext data.
       *
       * `PLAINTEXT` means that client-broker communication is enabled in plaintext only.
       *
       * The default value is `TLS` .
       */
      public fun clientBroker(clientBroker: String)

      /**
       * @param inCluster When set to true, it indicates that data communication among the broker
       * nodes of the cluster is encrypted.
       * When set to false, the communication happens in plaintext.
       *
       * The default value is true.
       */
      public fun inCluster(inCluster: Boolean)

      /**
       * @param inCluster When set to true, it indicates that data communication among the broker
       * nodes of the cluster is encrypted.
       * When set to false, the communication happens in plaintext.
       *
       * The default value is true.
       */
      public fun inCluster(inCluster: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty.builder()

      /**
       * @param clientBroker Indicates the encryption setting for data in transit between clients
       * and brokers.
       * You must set it to one of the following values.
       *
       * `TLS` means that client-broker communication is enabled with TLS only.
       *
       * `TLS_PLAINTEXT` means that client-broker communication is enabled for both TLS-encrypted,
       * as well as plaintext data.
       *
       * `PLAINTEXT` means that client-broker communication is enabled in plaintext only.
       *
       * The default value is `TLS` .
       */
      override fun clientBroker(clientBroker: String) {
        cdkBuilder.clientBroker(clientBroker)
      }

      /**
       * @param inCluster When set to true, it indicates that data communication among the broker
       * nodes of the cluster is encrypted.
       * When set to false, the communication happens in plaintext.
       *
       * The default value is true.
       */
      override fun inCluster(inCluster: Boolean) {
        cdkBuilder.inCluster(inCluster)
      }

      /**
       * @param inCluster When set to true, it indicates that data communication among the broker
       * nodes of the cluster is encrypted.
       * When set to false, the communication happens in plaintext.
       *
       * The default value is true.
       */
      override fun inCluster(inCluster: IResolvable) {
        cdkBuilder.inCluster(inCluster.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty,
    ) : CdkObject(cdkObject), EncryptionInTransitProperty {
      /**
       * Indicates the encryption setting for data in transit between clients and brokers.
       *
       * You must set it to one of the following values.
       *
       * `TLS` means that client-broker communication is enabled with TLS only.
       *
       * `TLS_PLAINTEXT` means that client-broker communication is enabled for both TLS-encrypted,
       * as well as plaintext data.
       *
       * `PLAINTEXT` means that client-broker communication is enabled in plaintext only.
       *
       * The default value is `TLS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-clientbroker)
       */
      override fun clientBroker(): String? = unwrap(this).getClientBroker()

      /**
       * When set to true, it indicates that data communication among the broker nodes of the
       * cluster is encrypted.
       *
       * When set to false, the communication happens in plaintext.
       *
       * The default value is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-incluster)
       */
      override fun inCluster(): Any? = unwrap(this).getInCluster()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionInTransitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty):
          EncryptionInTransitProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionInTransitProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionInTransitProperty):
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty
    }
  }

  /**
   * Includes encryption-related information, such as the Amazon KMS key used for encrypting data at
   * rest and whether you want MSK to encrypt your data in transit.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * EncryptionInfoProperty encryptionInfoProperty = EncryptionInfoProperty.builder()
   * .encryptionAtRest(EncryptionAtRestProperty.builder()
   * .dataVolumeKmsKeyId("dataVolumeKmsKeyId")
   * .build())
   * .encryptionInTransit(EncryptionInTransitProperty.builder()
   * .clientBroker("clientBroker")
   * .inCluster(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html)
   */
  public interface EncryptionInfoProperty {
    /**
     * The data-volume encryption details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html#cfn-msk-cluster-encryptioninfo-encryptionatrest)
     */
    public fun encryptionAtRest(): Any? = unwrap(this).getEncryptionAtRest()

    /**
     * The details for encryption in transit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html#cfn-msk-cluster-encryptioninfo-encryptionintransit)
     */
    public fun encryptionInTransit(): Any? = unwrap(this).getEncryptionInTransit()

    /**
     * A builder for [EncryptionInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionAtRest The data-volume encryption details.
       */
      public fun encryptionAtRest(encryptionAtRest: IResolvable)

      /**
       * @param encryptionAtRest The data-volume encryption details.
       */
      public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty)

      /**
       * @param encryptionAtRest The data-volume encryption details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0431872660d1897cf457bbc58733002e4b48ea325f74f75724c99e921f0e6e8")
      public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty.Builder.() -> Unit)

      /**
       * @param encryptionInTransit The details for encryption in transit.
       */
      public fun encryptionInTransit(encryptionInTransit: IResolvable)

      /**
       * @param encryptionInTransit The details for encryption in transit.
       */
      public fun encryptionInTransit(encryptionInTransit: EncryptionInTransitProperty)

      /**
       * @param encryptionInTransit The details for encryption in transit.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39a78f0d61fc52ce561187da89d622589f184acb6bbdb8065391a2ede2823020")
      public
          fun encryptionInTransit(encryptionInTransit: EncryptionInTransitProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty.builder()

      /**
       * @param encryptionAtRest The data-volume encryption details.
       */
      override fun encryptionAtRest(encryptionAtRest: IResolvable) {
        cdkBuilder.encryptionAtRest(encryptionAtRest.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionAtRest The data-volume encryption details.
       */
      override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty) {
        cdkBuilder.encryptionAtRest(encryptionAtRest.let(EncryptionAtRestProperty::unwrap))
      }

      /**
       * @param encryptionAtRest The data-volume encryption details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0431872660d1897cf457bbc58733002e4b48ea325f74f75724c99e921f0e6e8")
      override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty.Builder.() -> Unit):
          Unit = encryptionAtRest(EncryptionAtRestProperty(encryptionAtRest))

      /**
       * @param encryptionInTransit The details for encryption in transit.
       */
      override fun encryptionInTransit(encryptionInTransit: IResolvable) {
        cdkBuilder.encryptionInTransit(encryptionInTransit.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionInTransit The details for encryption in transit.
       */
      override fun encryptionInTransit(encryptionInTransit: EncryptionInTransitProperty) {
        cdkBuilder.encryptionInTransit(encryptionInTransit.let(EncryptionInTransitProperty::unwrap))
      }

      /**
       * @param encryptionInTransit The details for encryption in transit.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39a78f0d61fc52ce561187da89d622589f184acb6bbdb8065391a2ede2823020")
      override
          fun encryptionInTransit(encryptionInTransit: EncryptionInTransitProperty.Builder.() -> Unit):
          Unit = encryptionInTransit(EncryptionInTransitProperty(encryptionInTransit))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty,
    ) : CdkObject(cdkObject), EncryptionInfoProperty {
      /**
       * The data-volume encryption details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html#cfn-msk-cluster-encryptioninfo-encryptionatrest)
       */
      override fun encryptionAtRest(): Any? = unwrap(this).getEncryptionAtRest()

      /**
       * The details for encryption in transit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html#cfn-msk-cluster-encryptioninfo-encryptionintransit)
       */
      override fun encryptionInTransit(): Any? = unwrap(this).getEncryptionInTransit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty):
          EncryptionInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? EncryptionInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty
    }
  }

  /**
   * Firehose details for BrokerLogs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * FirehoseProperty firehoseProperty = FirehoseProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .deliveryStream("deliveryStream")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html)
   */
  public interface FirehoseProperty {
    /**
     * The Kinesis Data Firehose delivery stream that is the destination for broker logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html#cfn-msk-cluster-firehose-deliverystream)
     */
    public fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

    /**
     * Specifies whether broker logs get sent to the specified Kinesis Data Firehose delivery
     * stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html#cfn-msk-cluster-firehose-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [FirehoseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryStream The Kinesis Data Firehose delivery stream that is the destination for
       * broker logs.
       */
      public fun deliveryStream(deliveryStream: String)

      /**
       * @param enabled Specifies whether broker logs get sent to the specified Kinesis Data
       * Firehose delivery stream. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether broker logs get sent to the specified Kinesis Data
       * Firehose delivery stream. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty.builder()

      /**
       * @param deliveryStream The Kinesis Data Firehose delivery stream that is the destination for
       * broker logs.
       */
      override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      /**
       * @param enabled Specifies whether broker logs get sent to the specified Kinesis Data
       * Firehose delivery stream. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether broker logs get sent to the specified Kinesis Data
       * Firehose delivery stream. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty,
    ) : CdkObject(cdkObject), FirehoseProperty {
      /**
       * The Kinesis Data Firehose delivery stream that is the destination for broker logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html#cfn-msk-cluster-firehose-deliverystream)
       */
      override fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

      /**
       * Specifies whether broker logs get sent to the specified Kinesis Data Firehose delivery
       * stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html#cfn-msk-cluster-firehose-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty):
          FirehoseProperty = CdkObjectWrappers.wrap(cdkObject) as? FirehoseProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseProperty):
          software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty
    }
  }

  /**
   * Details for SASL/IAM client authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * IamProperty iamProperty = IamProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-iam.html)
   */
  public interface IamProperty {
    /**
     * SASL/IAM authentication is enabled or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-iam.html#cfn-msk-cluster-iam-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [IamProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled SASL/IAM authentication is enabled or not. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled SASL/IAM authentication is enabled or not. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.IamProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.IamProperty.builder()

      /**
       * @param enabled SASL/IAM authentication is enabled or not. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled SASL/IAM authentication is enabled or not. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.IamProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.IamProperty,
    ) : CdkObject(cdkObject), IamProperty {
      /**
       * SASL/IAM authentication is enabled or not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-iam.html#cfn-msk-cluster-iam-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IamProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.IamProperty):
          IamProperty = CdkObjectWrappers.wrap(cdkObject) as? IamProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamProperty):
          software.amazon.awscdk.services.msk.CfnCluster.IamProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnCluster.IamProperty
    }
  }

  /**
   * Indicates whether you want to enable or disable the JMX Exporter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * JmxExporterProperty jmxExporterProperty = JmxExporterProperty.builder()
   * .enabledInBroker(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-jmxexporter.html)
   */
  public interface JmxExporterProperty {
    /**
     * Indicates whether you want to enable or disable the JMX Exporter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-jmxexporter.html#cfn-msk-cluster-jmxexporter-enabledinbroker)
     */
    public fun enabledInBroker(): Any

    /**
     * A builder for [JmxExporterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabledInBroker Indicates whether you want to enable or disable the JMX Exporter. 
       */
      public fun enabledInBroker(enabledInBroker: Boolean)

      /**
       * @param enabledInBroker Indicates whether you want to enable or disable the JMX Exporter. 
       */
      public fun enabledInBroker(enabledInBroker: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty.builder()

      /**
       * @param enabledInBroker Indicates whether you want to enable or disable the JMX Exporter. 
       */
      override fun enabledInBroker(enabledInBroker: Boolean) {
        cdkBuilder.enabledInBroker(enabledInBroker)
      }

      /**
       * @param enabledInBroker Indicates whether you want to enable or disable the JMX Exporter. 
       */
      override fun enabledInBroker(enabledInBroker: IResolvable) {
        cdkBuilder.enabledInBroker(enabledInBroker.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty,
    ) : CdkObject(cdkObject), JmxExporterProperty {
      /**
       * Indicates whether you want to enable or disable the JMX Exporter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-jmxexporter.html#cfn-msk-cluster-jmxexporter-enabledinbroker)
       */
      override fun enabledInBroker(): Any = unwrap(this).getEnabledInBroker()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JmxExporterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty):
          JmxExporterProperty = CdkObjectWrappers.wrap(cdkObject) as? JmxExporterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: JmxExporterProperty):
          software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty
    }
  }

  /**
   * You can configure your MSK cluster to send broker logs to different destination types.
   *
   * This is a container for the configuration details related to broker logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * LoggingInfoProperty loggingInfoProperty = LoggingInfoProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-logginginfo.html)
   */
  public interface LoggingInfoProperty {
    /**
     * You can configure your MSK cluster to send broker logs to different destination types.
     *
     * This configuration specifies the details of these destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-logginginfo.html#cfn-msk-cluster-logginginfo-brokerlogs)
     */
    public fun brokerLogs(): Any

    /**
     * A builder for [LoggingInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param brokerLogs You can configure your MSK cluster to send broker logs to different
       * destination types. 
       * This configuration specifies the details of these destinations.
       */
      public fun brokerLogs(brokerLogs: IResolvable)

      /**
       * @param brokerLogs You can configure your MSK cluster to send broker logs to different
       * destination types. 
       * This configuration specifies the details of these destinations.
       */
      public fun brokerLogs(brokerLogs: BrokerLogsProperty)

      /**
       * @param brokerLogs You can configure your MSK cluster to send broker logs to different
       * destination types. 
       * This configuration specifies the details of these destinations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c29521d2378f142b0ba7241645e3c09b895ca33c68ee2f252e46c960056d932")
      public fun brokerLogs(brokerLogs: BrokerLogsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty.builder()

      /**
       * @param brokerLogs You can configure your MSK cluster to send broker logs to different
       * destination types. 
       * This configuration specifies the details of these destinations.
       */
      override fun brokerLogs(brokerLogs: IResolvable) {
        cdkBuilder.brokerLogs(brokerLogs.let(IResolvable::unwrap))
      }

      /**
       * @param brokerLogs You can configure your MSK cluster to send broker logs to different
       * destination types. 
       * This configuration specifies the details of these destinations.
       */
      override fun brokerLogs(brokerLogs: BrokerLogsProperty) {
        cdkBuilder.brokerLogs(brokerLogs.let(BrokerLogsProperty::unwrap))
      }

      /**
       * @param brokerLogs You can configure your MSK cluster to send broker logs to different
       * destination types. 
       * This configuration specifies the details of these destinations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c29521d2378f142b0ba7241645e3c09b895ca33c68ee2f252e46c960056d932")
      override fun brokerLogs(brokerLogs: BrokerLogsProperty.Builder.() -> Unit): Unit =
          brokerLogs(BrokerLogsProperty(brokerLogs))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty,
    ) : CdkObject(cdkObject), LoggingInfoProperty {
      /**
       * You can configure your MSK cluster to send broker logs to different destination types.
       *
       * This configuration specifies the details of these destinations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-logginginfo.html#cfn-msk-cluster-logginginfo-brokerlogs)
       */
      override fun brokerLogs(): Any = unwrap(this).getBrokerLogs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty):
          LoggingInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? LoggingInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty
    }
  }

  /**
   * Indicates whether you want to enable or disable the Node Exporter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * NodeExporterProperty nodeExporterProperty = NodeExporterProperty.builder()
   * .enabledInBroker(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html)
   */
  public interface NodeExporterProperty {
    /**
     * Indicates whether you want to enable or disable the Node Exporter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html#cfn-msk-cluster-nodeexporter-enabledinbroker)
     */
    public fun enabledInBroker(): Any

    /**
     * A builder for [NodeExporterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabledInBroker Indicates whether you want to enable or disable the Node Exporter. 
       */
      public fun enabledInBroker(enabledInBroker: Boolean)

      /**
       * @param enabledInBroker Indicates whether you want to enable or disable the Node Exporter. 
       */
      public fun enabledInBroker(enabledInBroker: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty.builder()

      /**
       * @param enabledInBroker Indicates whether you want to enable or disable the Node Exporter. 
       */
      override fun enabledInBroker(enabledInBroker: Boolean) {
        cdkBuilder.enabledInBroker(enabledInBroker)
      }

      /**
       * @param enabledInBroker Indicates whether you want to enable or disable the Node Exporter. 
       */
      override fun enabledInBroker(enabledInBroker: IResolvable) {
        cdkBuilder.enabledInBroker(enabledInBroker.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty,
    ) : CdkObject(cdkObject), NodeExporterProperty {
      /**
       * Indicates whether you want to enable or disable the Node Exporter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html#cfn-msk-cluster-nodeexporter-enabledinbroker)
       */
      override fun enabledInBroker(): Any = unwrap(this).getEnabledInBroker()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NodeExporterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty):
          NodeExporterProperty = CdkObjectWrappers.wrap(cdkObject) as? NodeExporterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeExporterProperty):
          software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty
    }
  }

  /**
   * JMX and Node monitoring for the MSK cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * OpenMonitoringProperty openMonitoringProperty = OpenMonitoringProperty.builder()
   * .prometheus(PrometheusProperty.builder()
   * .jmxExporter(JmxExporterProperty.builder()
   * .enabledInBroker(false)
   * .build())
   * .nodeExporter(NodeExporterProperty.builder()
   * .enabledInBroker(false)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-openmonitoring.html)
   */
  public interface OpenMonitoringProperty {
    /**
     * Prometheus exporter settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-openmonitoring.html#cfn-msk-cluster-openmonitoring-prometheus)
     */
    public fun prometheus(): Any

    /**
     * A builder for [OpenMonitoringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param prometheus Prometheus exporter settings. 
       */
      public fun prometheus(prometheus: IResolvable)

      /**
       * @param prometheus Prometheus exporter settings. 
       */
      public fun prometheus(prometheus: PrometheusProperty)

      /**
       * @param prometheus Prometheus exporter settings. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b1fd3217fbf6dea260ad8c5ca9624e05154513aa617f9ebd7e2383296dc1e1f")
      public fun prometheus(prometheus: PrometheusProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty.builder()

      /**
       * @param prometheus Prometheus exporter settings. 
       */
      override fun prometheus(prometheus: IResolvable) {
        cdkBuilder.prometheus(prometheus.let(IResolvable::unwrap))
      }

      /**
       * @param prometheus Prometheus exporter settings. 
       */
      override fun prometheus(prometheus: PrometheusProperty) {
        cdkBuilder.prometheus(prometheus.let(PrometheusProperty::unwrap))
      }

      /**
       * @param prometheus Prometheus exporter settings. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b1fd3217fbf6dea260ad8c5ca9624e05154513aa617f9ebd7e2383296dc1e1f")
      override fun prometheus(prometheus: PrometheusProperty.Builder.() -> Unit): Unit =
          prometheus(PrometheusProperty(prometheus))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty,
    ) : CdkObject(cdkObject), OpenMonitoringProperty {
      /**
       * Prometheus exporter settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-openmonitoring.html#cfn-msk-cluster-openmonitoring-prometheus)
       */
      override fun prometheus(): Any = unwrap(this).getPrometheus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenMonitoringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty):
          OpenMonitoringProperty = CdkObjectWrappers.wrap(cdkObject) as? OpenMonitoringProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenMonitoringProperty):
          software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty
    }
  }

  /**
   * Prometheus settings for open monitoring.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * PrometheusProperty prometheusProperty = PrometheusProperty.builder()
   * .jmxExporter(JmxExporterProperty.builder()
   * .enabledInBroker(false)
   * .build())
   * .nodeExporter(NodeExporterProperty.builder()
   * .enabledInBroker(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html)
   */
  public interface PrometheusProperty {
    /**
     * Indicates whether you want to enable or disable the JMX Exporter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html#cfn-msk-cluster-prometheus-jmxexporter)
     */
    public fun jmxExporter(): Any? = unwrap(this).getJmxExporter()

    /**
     * Indicates whether you want to enable or disable the Node Exporter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html#cfn-msk-cluster-prometheus-nodeexporter)
     */
    public fun nodeExporter(): Any? = unwrap(this).getNodeExporter()

    /**
     * A builder for [PrometheusProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jmxExporter Indicates whether you want to enable or disable the JMX Exporter.
       */
      public fun jmxExporter(jmxExporter: IResolvable)

      /**
       * @param jmxExporter Indicates whether you want to enable or disable the JMX Exporter.
       */
      public fun jmxExporter(jmxExporter: JmxExporterProperty)

      /**
       * @param jmxExporter Indicates whether you want to enable or disable the JMX Exporter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c30b92803d3124701f31d0600afd646d59feb335c96fb4db5bfef705850dfa09")
      public fun jmxExporter(jmxExporter: JmxExporterProperty.Builder.() -> Unit)

      /**
       * @param nodeExporter Indicates whether you want to enable or disable the Node Exporter.
       */
      public fun nodeExporter(nodeExporter: IResolvable)

      /**
       * @param nodeExporter Indicates whether you want to enable or disable the Node Exporter.
       */
      public fun nodeExporter(nodeExporter: NodeExporterProperty)

      /**
       * @param nodeExporter Indicates whether you want to enable or disable the Node Exporter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4a041baf53642bd4142802093fd00a5c404a8200f91bc8d760ca5a660138ebc")
      public fun nodeExporter(nodeExporter: NodeExporterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty.builder()

      /**
       * @param jmxExporter Indicates whether you want to enable or disable the JMX Exporter.
       */
      override fun jmxExporter(jmxExporter: IResolvable) {
        cdkBuilder.jmxExporter(jmxExporter.let(IResolvable::unwrap))
      }

      /**
       * @param jmxExporter Indicates whether you want to enable or disable the JMX Exporter.
       */
      override fun jmxExporter(jmxExporter: JmxExporterProperty) {
        cdkBuilder.jmxExporter(jmxExporter.let(JmxExporterProperty::unwrap))
      }

      /**
       * @param jmxExporter Indicates whether you want to enable or disable the JMX Exporter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c30b92803d3124701f31d0600afd646d59feb335c96fb4db5bfef705850dfa09")
      override fun jmxExporter(jmxExporter: JmxExporterProperty.Builder.() -> Unit): Unit =
          jmxExporter(JmxExporterProperty(jmxExporter))

      /**
       * @param nodeExporter Indicates whether you want to enable or disable the Node Exporter.
       */
      override fun nodeExporter(nodeExporter: IResolvable) {
        cdkBuilder.nodeExporter(nodeExporter.let(IResolvable::unwrap))
      }

      /**
       * @param nodeExporter Indicates whether you want to enable or disable the Node Exporter.
       */
      override fun nodeExporter(nodeExporter: NodeExporterProperty) {
        cdkBuilder.nodeExporter(nodeExporter.let(NodeExporterProperty::unwrap))
      }

      /**
       * @param nodeExporter Indicates whether you want to enable or disable the Node Exporter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4a041baf53642bd4142802093fd00a5c404a8200f91bc8d760ca5a660138ebc")
      override fun nodeExporter(nodeExporter: NodeExporterProperty.Builder.() -> Unit): Unit =
          nodeExporter(NodeExporterProperty(nodeExporter))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty,
    ) : CdkObject(cdkObject), PrometheusProperty {
      /**
       * Indicates whether you want to enable or disable the JMX Exporter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html#cfn-msk-cluster-prometheus-jmxexporter)
       */
      override fun jmxExporter(): Any? = unwrap(this).getJmxExporter()

      /**
       * Indicates whether you want to enable or disable the Node Exporter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html#cfn-msk-cluster-prometheus-nodeexporter)
       */
      override fun nodeExporter(): Any? = unwrap(this).getNodeExporter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrometheusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty):
          PrometheusProperty = CdkObjectWrappers.wrap(cdkObject) as? PrometheusProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrometheusProperty):
          software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty
    }
  }

  /**
   * Contains information about provisioned throughput for EBS storage volumes attached to kafka
   * broker nodes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * ProvisionedThroughputProperty provisionedThroughputProperty =
   * ProvisionedThroughputProperty.builder()
   * .enabled(false)
   * .volumeThroughput(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-provisionedthroughput.html)
   */
  public interface ProvisionedThroughputProperty {
    /**
     * Provisioned throughput is enabled or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-provisionedthroughput.html#cfn-msk-cluster-provisionedthroughput-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Throughput value of the EBS volumes for the data drive on each kafka broker node in MiB per
     * second.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-provisionedthroughput.html#cfn-msk-cluster-provisionedthroughput-volumethroughput)
     */
    public fun volumeThroughput(): Number? = unwrap(this).getVolumeThroughput()

    /**
     * A builder for [ProvisionedThroughputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Provisioned throughput is enabled or not.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Provisioned throughput is enabled or not.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param volumeThroughput Throughput value of the EBS volumes for the data drive on each
       * kafka broker node in MiB per second.
       */
      public fun volumeThroughput(volumeThroughput: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty.builder()

      /**
       * @param enabled Provisioned throughput is enabled or not.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Provisioned throughput is enabled or not.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param volumeThroughput Throughput value of the EBS volumes for the data drive on each
       * kafka broker node in MiB per second.
       */
      override fun volumeThroughput(volumeThroughput: Number) {
        cdkBuilder.volumeThroughput(volumeThroughput)
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty,
    ) : CdkObject(cdkObject), ProvisionedThroughputProperty {
      /**
       * Provisioned throughput is enabled or not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-provisionedthroughput.html#cfn-msk-cluster-provisionedthroughput-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * Throughput value of the EBS volumes for the data drive on each kafka broker node in MiB per
       * second.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-provisionedthroughput.html#cfn-msk-cluster-provisionedthroughput-volumethroughput)
       */
      override fun volumeThroughput(): Number? = unwrap(this).getVolumeThroughput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedThroughputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty):
          ProvisionedThroughputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProvisionedThroughputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedThroughputProperty):
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty
    }
  }

  /**
   * Broker access controls.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * PublicAccessProperty publicAccessProperty = PublicAccessProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-publicaccess.html)
   */
  public interface PublicAccessProperty {
    /**
     * DISABLED means that public access is turned off.
     *
     * SERVICE_PROVIDED_EIPS means that public access is turned on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-publicaccess.html#cfn-msk-cluster-publicaccess-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [PublicAccessProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type DISABLED means that public access is turned off.
       * SERVICE_PROVIDED_EIPS means that public access is turned on.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty.builder()

      /**
       * @param type DISABLED means that public access is turned off.
       * SERVICE_PROVIDED_EIPS means that public access is turned on.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty,
    ) : CdkObject(cdkObject), PublicAccessProperty {
      /**
       * DISABLED means that public access is turned off.
       *
       * SERVICE_PROVIDED_EIPS means that public access is turned on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-publicaccess.html#cfn-msk-cluster-publicaccess-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PublicAccessProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty):
          PublicAccessProperty = CdkObjectWrappers.wrap(cdkObject) as? PublicAccessProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicAccessProperty):
          software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty
    }
  }

  /**
   * The details of the Amazon S3 destination for broker logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * S3Property s3Property = S3Property.builder()
   * .enabled(false)
   * // the properties below are optional
   * .bucket("bucket")
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html)
   */
  public interface S3Property {
    /**
     * The name of the S3 bucket that is the destination for broker logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html#cfn-msk-cluster-s3-bucket)
     */
    public fun bucket(): String? = unwrap(this).getBucket()

    /**
     * Specifies whether broker logs get sent to the specified Amazon S3 destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html#cfn-msk-cluster-s3-enabled)
     */
    public fun enabled(): Any

    /**
     * The S3 prefix that is the destination for broker logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html#cfn-msk-cluster-s3-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [S3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the S3 bucket that is the destination for broker logs.
       */
      public fun bucket(bucket: String)

      /**
       * @param enabled Specifies whether broker logs get sent to the specified Amazon S3
       * destination. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether broker logs get sent to the specified Amazon S3
       * destination. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param prefix The S3 prefix that is the destination for broker logs.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.S3Property.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.S3Property.builder()

      /**
       * @param bucket The name of the S3 bucket that is the destination for broker logs.
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param enabled Specifies whether broker logs get sent to the specified Amazon S3
       * destination. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether broker logs get sent to the specified Amazon S3
       * destination. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param prefix The S3 prefix that is the destination for broker logs.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.S3Property,
    ) : CdkObject(cdkObject), S3Property {
      /**
       * The name of the S3 bucket that is the destination for broker logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html#cfn-msk-cluster-s3-bucket)
       */
      override fun bucket(): String? = unwrap(this).getBucket()

      /**
       * Specifies whether broker logs get sent to the specified Amazon S3 destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html#cfn-msk-cluster-s3-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The S3 prefix that is the destination for broker logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html#cfn-msk-cluster-s3-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.S3Property):
          S3Property = CdkObjectWrappers.wrap(cdkObject) as? S3Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.msk.CfnCluster.S3Property = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnCluster.S3Property
    }
  }

  /**
   * Details for client authentication using SASL.
   *
   * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to true.
   * You must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose `TLS_PLAINTEXT` ,
   * then you must also set `unauthenticated` to true.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * SaslProperty saslProperty = SaslProperty.builder()
   * .iam(IamProperty.builder()
   * .enabled(false)
   * .build())
   * .scram(ScramProperty.builder()
   * .enabled(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-sasl.html)
   */
  public interface SaslProperty {
    /**
     * Details for ClientAuthentication using IAM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-sasl.html#cfn-msk-cluster-sasl-iam)
     */
    public fun iam(): Any? = unwrap(this).getIam()

    /**
     * Details for SASL/SCRAM client authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-sasl.html#cfn-msk-cluster-sasl-scram)
     */
    public fun scram(): Any? = unwrap(this).getScram()

    /**
     * A builder for [SaslProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iam Details for ClientAuthentication using IAM.
       */
      public fun iam(iam: IResolvable)

      /**
       * @param iam Details for ClientAuthentication using IAM.
       */
      public fun iam(iam: IamProperty)

      /**
       * @param iam Details for ClientAuthentication using IAM.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbf95f659e99557816579ce940d287daa47a8439569f98ce4b6d4ce0d04ab427")
      public fun iam(iam: IamProperty.Builder.() -> Unit)

      /**
       * @param scram Details for SASL/SCRAM client authentication.
       */
      public fun scram(scram: IResolvable)

      /**
       * @param scram Details for SASL/SCRAM client authentication.
       */
      public fun scram(scram: ScramProperty)

      /**
       * @param scram Details for SASL/SCRAM client authentication.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12c4d4e4080061c1e1751882cb23f1a55dd61dc3aec40f44ddb5a1b221da548b")
      public fun scram(scram: ScramProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.SaslProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.SaslProperty.builder()

      /**
       * @param iam Details for ClientAuthentication using IAM.
       */
      override fun iam(iam: IResolvable) {
        cdkBuilder.iam(iam.let(IResolvable::unwrap))
      }

      /**
       * @param iam Details for ClientAuthentication using IAM.
       */
      override fun iam(iam: IamProperty) {
        cdkBuilder.iam(iam.let(IamProperty::unwrap))
      }

      /**
       * @param iam Details for ClientAuthentication using IAM.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbf95f659e99557816579ce940d287daa47a8439569f98ce4b6d4ce0d04ab427")
      override fun iam(iam: IamProperty.Builder.() -> Unit): Unit = iam(IamProperty(iam))

      /**
       * @param scram Details for SASL/SCRAM client authentication.
       */
      override fun scram(scram: IResolvable) {
        cdkBuilder.scram(scram.let(IResolvable::unwrap))
      }

      /**
       * @param scram Details for SASL/SCRAM client authentication.
       */
      override fun scram(scram: ScramProperty) {
        cdkBuilder.scram(scram.let(ScramProperty::unwrap))
      }

      /**
       * @param scram Details for SASL/SCRAM client authentication.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12c4d4e4080061c1e1751882cb23f1a55dd61dc3aec40f44ddb5a1b221da548b")
      override fun scram(scram: ScramProperty.Builder.() -> Unit): Unit =
          scram(ScramProperty(scram))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.SaslProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.SaslProperty,
    ) : CdkObject(cdkObject), SaslProperty {
      /**
       * Details for ClientAuthentication using IAM.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-sasl.html#cfn-msk-cluster-sasl-iam)
       */
      override fun iam(): Any? = unwrap(this).getIam()

      /**
       * Details for SASL/SCRAM client authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-sasl.html#cfn-msk-cluster-sasl-scram)
       */
      override fun scram(): Any? = unwrap(this).getScram()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SaslProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.SaslProperty):
          SaslProperty = CdkObjectWrappers.wrap(cdkObject) as? SaslProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SaslProperty):
          software.amazon.awscdk.services.msk.CfnCluster.SaslProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnCluster.SaslProperty
    }
  }

  /**
   * Details for SASL/SCRAM client authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * ScramProperty scramProperty = ScramProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-scram.html)
   */
  public interface ScramProperty {
    /**
     * SASL/SCRAM authentication is enabled or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-scram.html#cfn-msk-cluster-scram-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [ScramProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled SASL/SCRAM authentication is enabled or not. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled SASL/SCRAM authentication is enabled or not. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.ScramProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ScramProperty.builder()

      /**
       * @param enabled SASL/SCRAM authentication is enabled or not. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled SASL/SCRAM authentication is enabled or not. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.ScramProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ScramProperty,
    ) : CdkObject(cdkObject), ScramProperty {
      /**
       * SASL/SCRAM authentication is enabled or not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-scram.html#cfn-msk-cluster-scram-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScramProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ScramProperty):
          ScramProperty = CdkObjectWrappers.wrap(cdkObject) as? ScramProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScramProperty):
          software.amazon.awscdk.services.msk.CfnCluster.ScramProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnCluster.ScramProperty
    }
  }

  /**
   * Contains information about storage volumes attached to Amazon MSK broker nodes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * StorageInfoProperty storageInfoProperty = StorageInfoProperty.builder()
   * .ebsStorageInfo(EBSStorageInfoProperty.builder()
   * .provisionedThroughput(ProvisionedThroughputProperty.builder()
   * .enabled(false)
   * .volumeThroughput(123)
   * .build())
   * .volumeSize(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-storageinfo.html)
   */
  public interface StorageInfoProperty {
    /**
     * EBS volume information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-storageinfo.html#cfn-msk-cluster-storageinfo-ebsstorageinfo)
     */
    public fun ebsStorageInfo(): Any? = unwrap(this).getEbsStorageInfo()

    /**
     * A builder for [StorageInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ebsStorageInfo EBS volume information.
       */
      public fun ebsStorageInfo(ebsStorageInfo: IResolvable)

      /**
       * @param ebsStorageInfo EBS volume information.
       */
      public fun ebsStorageInfo(ebsStorageInfo: EBSStorageInfoProperty)

      /**
       * @param ebsStorageInfo EBS volume information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c96fc46257901e7b2884edaa78a13e0c177649c7d2f5b7f0f04366e35a31b3f")
      public fun ebsStorageInfo(ebsStorageInfo: EBSStorageInfoProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty.builder()

      /**
       * @param ebsStorageInfo EBS volume information.
       */
      override fun ebsStorageInfo(ebsStorageInfo: IResolvable) {
        cdkBuilder.ebsStorageInfo(ebsStorageInfo.let(IResolvable::unwrap))
      }

      /**
       * @param ebsStorageInfo EBS volume information.
       */
      override fun ebsStorageInfo(ebsStorageInfo: EBSStorageInfoProperty) {
        cdkBuilder.ebsStorageInfo(ebsStorageInfo.let(EBSStorageInfoProperty::unwrap))
      }

      /**
       * @param ebsStorageInfo EBS volume information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c96fc46257901e7b2884edaa78a13e0c177649c7d2f5b7f0f04366e35a31b3f")
      override fun ebsStorageInfo(ebsStorageInfo: EBSStorageInfoProperty.Builder.() -> Unit): Unit =
          ebsStorageInfo(EBSStorageInfoProperty(ebsStorageInfo))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty,
    ) : CdkObject(cdkObject), StorageInfoProperty {
      /**
       * EBS volume information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-storageinfo.html#cfn-msk-cluster-storageinfo-ebsstorageinfo)
       */
      override fun ebsStorageInfo(): Any? = unwrap(this).getEbsStorageInfo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty):
          StorageInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? StorageInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty
    }
  }

  /**
   * Details for client authentication using TLS.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * TlsProperty tlsProperty = TlsProperty.builder()
   * .certificateAuthorityArnList(List.of("certificateAuthorityArnList"))
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html)
   */
  public interface TlsProperty {
    /**
     * List of AWS Private CA Amazon Resource Name (ARN)s.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html#cfn-msk-cluster-tls-certificateauthorityarnlist)
     */
    public fun certificateAuthorityArnList(): List<String> =
        unwrap(this).getCertificateAuthorityArnList() ?: emptyList()

    /**
     * TLS authentication is enabled or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html#cfn-msk-cluster-tls-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [TlsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateAuthorityArnList List of AWS Private CA Amazon Resource Name (ARN)s.
       */
      public fun certificateAuthorityArnList(certificateAuthorityArnList: List<String>)

      /**
       * @param certificateAuthorityArnList List of AWS Private CA Amazon Resource Name (ARN)s.
       */
      public fun certificateAuthorityArnList(vararg certificateAuthorityArnList: String)

      /**
       * @param enabled TLS authentication is enabled or not.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled TLS authentication is enabled or not.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.TlsProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.TlsProperty.builder()

      /**
       * @param certificateAuthorityArnList List of AWS Private CA Amazon Resource Name (ARN)s.
       */
      override fun certificateAuthorityArnList(certificateAuthorityArnList: List<String>) {
        cdkBuilder.certificateAuthorityArnList(certificateAuthorityArnList)
      }

      /**
       * @param certificateAuthorityArnList List of AWS Private CA Amazon Resource Name (ARN)s.
       */
      override fun certificateAuthorityArnList(vararg certificateAuthorityArnList: String): Unit =
          certificateAuthorityArnList(certificateAuthorityArnList.toList())

      /**
       * @param enabled TLS authentication is enabled or not.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled TLS authentication is enabled or not.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.TlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.TlsProperty,
    ) : CdkObject(cdkObject), TlsProperty {
      /**
       * List of AWS Private CA Amazon Resource Name (ARN)s.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html#cfn-msk-cluster-tls-certificateauthorityarnlist)
       */
      override fun certificateAuthorityArnList(): List<String> =
          unwrap(this).getCertificateAuthorityArnList() ?: emptyList()

      /**
       * TLS authentication is enabled or not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html#cfn-msk-cluster-tls-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.TlsProperty):
          TlsProperty = CdkObjectWrappers.wrap(cdkObject) as? TlsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsProperty):
          software.amazon.awscdk.services.msk.CfnCluster.TlsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnCluster.TlsProperty
    }
  }

  /**
   * Details for allowing no client authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * UnauthenticatedProperty unauthenticatedProperty = UnauthenticatedProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-unauthenticated.html)
   */
  public interface UnauthenticatedProperty {
    /**
     * Unauthenticated is enabled or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-unauthenticated.html#cfn-msk-cluster-unauthenticated-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [UnauthenticatedProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Unauthenticated is enabled or not. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Unauthenticated is enabled or not. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty.builder()

      /**
       * @param enabled Unauthenticated is enabled or not. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Unauthenticated is enabled or not. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty,
    ) : CdkObject(cdkObject), UnauthenticatedProperty {
      /**
       * Unauthenticated is enabled or not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-unauthenticated.html#cfn-msk-cluster-unauthenticated-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UnauthenticatedProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty):
          UnauthenticatedProperty = CdkObjectWrappers.wrap(cdkObject) as? UnauthenticatedProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UnauthenticatedProperty):
          software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty
    }
  }

  /**
   * Includes all client authentication information for VpcConnectivity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * VpcConnectivityClientAuthenticationProperty vpcConnectivityClientAuthenticationProperty =
   * VpcConnectivityClientAuthenticationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityclientauthentication.html)
   */
  public interface VpcConnectivityClientAuthenticationProperty {
    /**
     * Details for VpcConnectivity ClientAuthentication using SASL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityclientauthentication.html#cfn-msk-cluster-vpcconnectivityclientauthentication-sasl)
     */
    public fun sasl(): Any? = unwrap(this).getSasl()

    /**
     * Details for VpcConnectivity ClientAuthentication using TLS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityclientauthentication.html#cfn-msk-cluster-vpcconnectivityclientauthentication-tls)
     */
    public fun tls(): Any? = unwrap(this).getTls()

    /**
     * A builder for [VpcConnectivityClientAuthenticationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sasl Details for VpcConnectivity ClientAuthentication using SASL.
       */
      public fun sasl(sasl: IResolvable)

      /**
       * @param sasl Details for VpcConnectivity ClientAuthentication using SASL.
       */
      public fun sasl(sasl: VpcConnectivitySaslProperty)

      /**
       * @param sasl Details for VpcConnectivity ClientAuthentication using SASL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5387f17a62bf9d0b9b81a0d524d341a67df88146a1d7a9fe5c56eeed0489f35a")
      public fun sasl(sasl: VpcConnectivitySaslProperty.Builder.() -> Unit)

      /**
       * @param tls Details for VpcConnectivity ClientAuthentication using TLS.
       */
      public fun tls(tls: IResolvable)

      /**
       * @param tls Details for VpcConnectivity ClientAuthentication using TLS.
       */
      public fun tls(tls: VpcConnectivityTlsProperty)

      /**
       * @param tls Details for VpcConnectivity ClientAuthentication using TLS.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec42fa21090bdeddd2087441fe661f6f7174abadd6cb22eb88506b050b7d6a49")
      public fun tls(tls: VpcConnectivityTlsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty.builder()

      /**
       * @param sasl Details for VpcConnectivity ClientAuthentication using SASL.
       */
      override fun sasl(sasl: IResolvable) {
        cdkBuilder.sasl(sasl.let(IResolvable::unwrap))
      }

      /**
       * @param sasl Details for VpcConnectivity ClientAuthentication using SASL.
       */
      override fun sasl(sasl: VpcConnectivitySaslProperty) {
        cdkBuilder.sasl(sasl.let(VpcConnectivitySaslProperty::unwrap))
      }

      /**
       * @param sasl Details for VpcConnectivity ClientAuthentication using SASL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5387f17a62bf9d0b9b81a0d524d341a67df88146a1d7a9fe5c56eeed0489f35a")
      override fun sasl(sasl: VpcConnectivitySaslProperty.Builder.() -> Unit): Unit =
          sasl(VpcConnectivitySaslProperty(sasl))

      /**
       * @param tls Details for VpcConnectivity ClientAuthentication using TLS.
       */
      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable::unwrap))
      }

      /**
       * @param tls Details for VpcConnectivity ClientAuthentication using TLS.
       */
      override fun tls(tls: VpcConnectivityTlsProperty) {
        cdkBuilder.tls(tls.let(VpcConnectivityTlsProperty::unwrap))
      }

      /**
       * @param tls Details for VpcConnectivity ClientAuthentication using TLS.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec42fa21090bdeddd2087441fe661f6f7174abadd6cb22eb88506b050b7d6a49")
      override fun tls(tls: VpcConnectivityTlsProperty.Builder.() -> Unit): Unit =
          tls(VpcConnectivityTlsProperty(tls))

      public fun build():
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty,
    ) : CdkObject(cdkObject), VpcConnectivityClientAuthenticationProperty {
      /**
       * Details for VpcConnectivity ClientAuthentication using SASL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityclientauthentication.html#cfn-msk-cluster-vpcconnectivityclientauthentication-sasl)
       */
      override fun sasl(): Any? = unwrap(this).getSasl()

      /**
       * Details for VpcConnectivity ClientAuthentication using TLS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityclientauthentication.html#cfn-msk-cluster-vpcconnectivityclientauthentication-tls)
       */
      override fun tls(): Any? = unwrap(this).getTls()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VpcConnectivityClientAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty):
          VpcConnectivityClientAuthenticationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcConnectivityClientAuthenticationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivityClientAuthenticationProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty
    }
  }

  /**
   * Details for SASL/IAM client authentication for VpcConnectivity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * VpcConnectivityIamProperty vpcConnectivityIamProperty = VpcConnectivityIamProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityiam.html)
   */
  public interface VpcConnectivityIamProperty {
    /**
     * SASL/IAM authentication is enabled or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityiam.html#cfn-msk-cluster-vpcconnectivityiam-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [VpcConnectivityIamProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled SASL/IAM authentication is enabled or not. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled SASL/IAM authentication is enabled or not. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty.builder()

      /**
       * @param enabled SASL/IAM authentication is enabled or not. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled SASL/IAM authentication is enabled or not. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty,
    ) : CdkObject(cdkObject), VpcConnectivityIamProperty {
      /**
       * SASL/IAM authentication is enabled or not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityiam.html#cfn-msk-cluster-vpcconnectivityiam-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectivityIamProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty):
          VpcConnectivityIamProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcConnectivityIamProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivityIamProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty
    }
  }

  /**
   * VPC connection control settings for brokers.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * VpcConnectivityProperty vpcConnectivityProperty = VpcConnectivityProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivity.html)
   */
  public interface VpcConnectivityProperty {
    /**
     * VPC connection control settings for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivity.html#cfn-msk-cluster-vpcconnectivity-clientauthentication)
     */
    public fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

    /**
     * A builder for [VpcConnectivityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientAuthentication VPC connection control settings for brokers.
       */
      public fun clientAuthentication(clientAuthentication: IResolvable)

      /**
       * @param clientAuthentication VPC connection control settings for brokers.
       */
      public
          fun clientAuthentication(clientAuthentication: VpcConnectivityClientAuthenticationProperty)

      /**
       * @param clientAuthentication VPC connection control settings for brokers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6fb37dc85da8bc52baf39269baf079d2b693a15e8032e2f62783d18b6e6b7aa4")
      public
          fun clientAuthentication(clientAuthentication: VpcConnectivityClientAuthenticationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty.builder()

      /**
       * @param clientAuthentication VPC connection control settings for brokers.
       */
      override fun clientAuthentication(clientAuthentication: IResolvable) {
        cdkBuilder.clientAuthentication(clientAuthentication.let(IResolvable::unwrap))
      }

      /**
       * @param clientAuthentication VPC connection control settings for brokers.
       */
      override
          fun clientAuthentication(clientAuthentication: VpcConnectivityClientAuthenticationProperty) {
        cdkBuilder.clientAuthentication(clientAuthentication.let(VpcConnectivityClientAuthenticationProperty::unwrap))
      }

      /**
       * @param clientAuthentication VPC connection control settings for brokers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6fb37dc85da8bc52baf39269baf079d2b693a15e8032e2f62783d18b6e6b7aa4")
      override
          fun clientAuthentication(clientAuthentication: VpcConnectivityClientAuthenticationProperty.Builder.() -> Unit):
          Unit =
          clientAuthentication(VpcConnectivityClientAuthenticationProperty(clientAuthentication))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty,
    ) : CdkObject(cdkObject), VpcConnectivityProperty {
      /**
       * VPC connection control settings for brokers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivity.html#cfn-msk-cluster-vpcconnectivity-clientauthentication)
       */
      override fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectivityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty):
          VpcConnectivityProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConnectivityProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivityProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty
    }
  }

  /**
   * Details for client authentication using SASL for VpcConnectivity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * VpcConnectivitySaslProperty vpcConnectivitySaslProperty = VpcConnectivitySaslProperty.builder()
   * .iam(VpcConnectivityIamProperty.builder()
   * .enabled(false)
   * .build())
   * .scram(VpcConnectivityScramProperty.builder()
   * .enabled(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitysasl.html)
   */
  public interface VpcConnectivitySaslProperty {
    /**
     * Details for ClientAuthentication using IAM for VpcConnectivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitysasl.html#cfn-msk-cluster-vpcconnectivitysasl-iam)
     */
    public fun iam(): Any? = unwrap(this).getIam()

    /**
     * Details for SASL/SCRAM client authentication for VpcConnectivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitysasl.html#cfn-msk-cluster-vpcconnectivitysasl-scram)
     */
    public fun scram(): Any? = unwrap(this).getScram()

    /**
     * A builder for [VpcConnectivitySaslProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iam Details for ClientAuthentication using IAM for VpcConnectivity.
       */
      public fun iam(iam: IResolvable)

      /**
       * @param iam Details for ClientAuthentication using IAM for VpcConnectivity.
       */
      public fun iam(iam: VpcConnectivityIamProperty)

      /**
       * @param iam Details for ClientAuthentication using IAM for VpcConnectivity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5621bce12a0e505b9c8d557d0b6ace9e313dc6cbaaa017252f34e9657f38c9e8")
      public fun iam(iam: VpcConnectivityIamProperty.Builder.() -> Unit)

      /**
       * @param scram Details for SASL/SCRAM client authentication for VpcConnectivity.
       */
      public fun scram(scram: IResolvable)

      /**
       * @param scram Details for SASL/SCRAM client authentication for VpcConnectivity.
       */
      public fun scram(scram: VpcConnectivityScramProperty)

      /**
       * @param scram Details for SASL/SCRAM client authentication for VpcConnectivity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("088db7309cb5cf6c24524bd4671cd61da505e50c992b3b57f2ec71d1d5f94a90")
      public fun scram(scram: VpcConnectivityScramProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty.builder()

      /**
       * @param iam Details for ClientAuthentication using IAM for VpcConnectivity.
       */
      override fun iam(iam: IResolvable) {
        cdkBuilder.iam(iam.let(IResolvable::unwrap))
      }

      /**
       * @param iam Details for ClientAuthentication using IAM for VpcConnectivity.
       */
      override fun iam(iam: VpcConnectivityIamProperty) {
        cdkBuilder.iam(iam.let(VpcConnectivityIamProperty::unwrap))
      }

      /**
       * @param iam Details for ClientAuthentication using IAM for VpcConnectivity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5621bce12a0e505b9c8d557d0b6ace9e313dc6cbaaa017252f34e9657f38c9e8")
      override fun iam(iam: VpcConnectivityIamProperty.Builder.() -> Unit): Unit =
          iam(VpcConnectivityIamProperty(iam))

      /**
       * @param scram Details for SASL/SCRAM client authentication for VpcConnectivity.
       */
      override fun scram(scram: IResolvable) {
        cdkBuilder.scram(scram.let(IResolvable::unwrap))
      }

      /**
       * @param scram Details for SASL/SCRAM client authentication for VpcConnectivity.
       */
      override fun scram(scram: VpcConnectivityScramProperty) {
        cdkBuilder.scram(scram.let(VpcConnectivityScramProperty::unwrap))
      }

      /**
       * @param scram Details for SASL/SCRAM client authentication for VpcConnectivity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("088db7309cb5cf6c24524bd4671cd61da505e50c992b3b57f2ec71d1d5f94a90")
      override fun scram(scram: VpcConnectivityScramProperty.Builder.() -> Unit): Unit =
          scram(VpcConnectivityScramProperty(scram))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty,
    ) : CdkObject(cdkObject), VpcConnectivitySaslProperty {
      /**
       * Details for ClientAuthentication using IAM for VpcConnectivity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitysasl.html#cfn-msk-cluster-vpcconnectivitysasl-iam)
       */
      override fun iam(): Any? = unwrap(this).getIam()

      /**
       * Details for SASL/SCRAM client authentication for VpcConnectivity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitysasl.html#cfn-msk-cluster-vpcconnectivitysasl-scram)
       */
      override fun scram(): Any? = unwrap(this).getScram()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectivitySaslProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty):
          VpcConnectivitySaslProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcConnectivitySaslProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivitySaslProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty
    }
  }

  /**
   * Details for SASL/SCRAM client authentication for vpcConnectivity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * VpcConnectivityScramProperty vpcConnectivityScramProperty =
   * VpcConnectivityScramProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityscram.html)
   */
  public interface VpcConnectivityScramProperty {
    /**
     * SASL/SCRAM authentication is enabled or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityscram.html#cfn-msk-cluster-vpcconnectivityscram-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [VpcConnectivityScramProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled SASL/SCRAM authentication is enabled or not. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled SASL/SCRAM authentication is enabled or not. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty.builder()

      /**
       * @param enabled SASL/SCRAM authentication is enabled or not. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled SASL/SCRAM authentication is enabled or not. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty,
    ) : CdkObject(cdkObject), VpcConnectivityScramProperty {
      /**
       * SASL/SCRAM authentication is enabled or not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityscram.html#cfn-msk-cluster-vpcconnectivityscram-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectivityScramProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty):
          VpcConnectivityScramProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcConnectivityScramProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivityScramProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty
    }
  }

  /**
   * Details for client authentication using TLS for vpcConnectivity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * VpcConnectivityTlsProperty vpcConnectivityTlsProperty = VpcConnectivityTlsProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitytls.html)
   */
  public interface VpcConnectivityTlsProperty {
    /**
     * TLS authentication is enabled or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitytls.html#cfn-msk-cluster-vpcconnectivitytls-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [VpcConnectivityTlsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled TLS authentication is enabled or not. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled TLS authentication is enabled or not. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty.builder()

      /**
       * @param enabled TLS authentication is enabled or not. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled TLS authentication is enabled or not. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty,
    ) : CdkObject(cdkObject), VpcConnectivityTlsProperty {
      /**
       * TLS authentication is enabled or not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitytls.html#cfn-msk-cluster-vpcconnectivitytls-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectivityTlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty):
          VpcConnectivityTlsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcConnectivityTlsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivityTlsProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty
    }
  }
}
