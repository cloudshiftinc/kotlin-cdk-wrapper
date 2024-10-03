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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html.
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
public open class CfnCluster(
  cdkObject: software.amazon.awscdk.services.msk.CfnCluster,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps,
  ) :
      this(software.amazon.awscdk.services.msk.CfnCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnClusterProps.Companion::unwrap))
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
   *
   */
  public open fun brokerNodeGroupInfo(): Any = unwrap(this).getBrokerNodeGroupInfo()

  /**
   *
   */
  public open fun brokerNodeGroupInfo(`value`: IResolvable) {
    unwrap(this).setBrokerNodeGroupInfo(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun brokerNodeGroupInfo(`value`: BrokerNodeGroupInfoProperty) {
    unwrap(this).setBrokerNodeGroupInfo(`value`.let(BrokerNodeGroupInfoProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7e2e5f674f03566fe2694ac2bf0caa871b5f616c2a86cba3276740eb6d90f6c4")
  public open fun brokerNodeGroupInfo(`value`: BrokerNodeGroupInfoProperty.Builder.() -> Unit): Unit
      = brokerNodeGroupInfo(BrokerNodeGroupInfoProperty(`value`))

  /**
   *
   */
  public open fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

  /**
   *
   */
  public open fun clientAuthentication(`value`: IResolvable) {
    unwrap(this).setClientAuthentication(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun clientAuthentication(`value`: ClientAuthenticationProperty) {
    unwrap(this).setClientAuthentication(`value`.let(ClientAuthenticationProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f2cb45484d4623c714814349ac98bb946f3b38ef448433a4148730a1b589e02")
  public open fun clientAuthentication(`value`: ClientAuthenticationProperty.Builder.() -> Unit):
      Unit = clientAuthentication(ClientAuthenticationProperty(`value`))

  /**
   *
   */
  public open fun clusterName(): String = unwrap(this).getClusterName()

  /**
   *
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   *
   */
  public open fun configurationInfo(): Any? = unwrap(this).getConfigurationInfo()

  /**
   *
   */
  public open fun configurationInfo(`value`: IResolvable) {
    unwrap(this).setConfigurationInfo(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun configurationInfo(`value`: ConfigurationInfoProperty) {
    unwrap(this).setConfigurationInfo(`value`.let(ConfigurationInfoProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b24b0584c9fe8c8550ea380a1376a99b68f67fd23a2c4c53ad10e9062d32a311")
  public open fun configurationInfo(`value`: ConfigurationInfoProperty.Builder.() -> Unit): Unit =
      configurationInfo(ConfigurationInfoProperty(`value`))

  /**
   * The current version of the MSK cluster.
   */
  public open fun currentVersion(): String? = unwrap(this).getCurrentVersion()

  /**
   * The current version of the MSK cluster.
   */
  public open fun currentVersion(`value`: String) {
    unwrap(this).setCurrentVersion(`value`)
  }

  /**
   *
   */
  public open fun encryptionInfo(): Any? = unwrap(this).getEncryptionInfo()

  /**
   *
   */
  public open fun encryptionInfo(`value`: IResolvable) {
    unwrap(this).setEncryptionInfo(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun encryptionInfo(`value`: EncryptionInfoProperty) {
    unwrap(this).setEncryptionInfo(`value`.let(EncryptionInfoProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35b70b0321fc20ff434b49d0362c682d8ab55b391d776935f57b7979a5afd93c")
  public open fun encryptionInfo(`value`: EncryptionInfoProperty.Builder.() -> Unit): Unit =
      encryptionInfo(EncryptionInfoProperty(`value`))

  /**
   *
   */
  public open fun enhancedMonitoring(): String? = unwrap(this).getEnhancedMonitoring()

  /**
   *
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun kafkaVersion(): String = unwrap(this).getKafkaVersion()

  /**
   *
   */
  public open fun kafkaVersion(`value`: String) {
    unwrap(this).setKafkaVersion(`value`)
  }

  /**
   *
   */
  public open fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

  /**
   *
   */
  public open fun loggingInfo(`value`: IResolvable) {
    unwrap(this).setLoggingInfo(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun loggingInfo(`value`: LoggingInfoProperty) {
    unwrap(this).setLoggingInfo(`value`.let(LoggingInfoProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a40fee8e3a8755dbb891ff6119b045e98a9f230c7187de2508cf3a490a028b1d")
  public open fun loggingInfo(`value`: LoggingInfoProperty.Builder.() -> Unit): Unit =
      loggingInfo(LoggingInfoProperty(`value`))

  /**
   *
   */
  public open fun numberOfBrokerNodes(): Number = unwrap(this).getNumberOfBrokerNodes()

  /**
   *
   */
  public open fun numberOfBrokerNodes(`value`: Number) {
    unwrap(this).setNumberOfBrokerNodes(`value`)
  }

  /**
   *
   */
  public open fun openMonitoring(): Any? = unwrap(this).getOpenMonitoring()

  /**
   *
   */
  public open fun openMonitoring(`value`: IResolvable) {
    unwrap(this).setOpenMonitoring(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun openMonitoring(`value`: OpenMonitoringProperty) {
    unwrap(this).setOpenMonitoring(`value`.let(OpenMonitoringProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dcc34407947db21f9991c2defb5d60297c42573e7713e8671a7f8ab8236a98c1")
  public open fun openMonitoring(`value`: OpenMonitoringProperty.Builder.() -> Unit): Unit =
      openMonitoring(OpenMonitoringProperty(`value`))

  /**
   *
   */
  public open fun storageMode(): String? = unwrap(this).getStorageMode()

  /**
   *
   */
  public open fun storageMode(`value`: String) {
    unwrap(this).setStorageMode(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A key-value pair to associate with a resource.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * A key-value pair to associate with a resource.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo 
     */
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo 
     */
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61ad7de6319342519a3c1d5709ea2dd2cd0a7ca9f7ee3b5bb8f1e1d709ab7ec7")
    public
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication 
     */
    public fun clientAuthentication(clientAuthentication: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication 
     */
    public fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94990ea4553395f051fbe13922809ed1ab7a187bb46dc003a9cea5fcce16655a")
    public
        fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername)
     * @param clusterName 
     */
    public fun clusterName(clusterName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo 
     */
    public fun configurationInfo(configurationInfo: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo 
     */
    public fun configurationInfo(configurationInfo: ConfigurationInfoProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03a15325d3f00abc56619850e839d374872995e53db76160e9cfd6a13842a014")
    public fun configurationInfo(configurationInfo: ConfigurationInfoProperty.Builder.() -> Unit)

    /**
     * The current version of the MSK cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-currentversion)
     * @param currentVersion The current version of the MSK cluster. 
     */
    public fun currentVersion(currentVersion: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo 
     */
    public fun encryptionInfo(encryptionInfo: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo 
     */
    public fun encryptionInfo(encryptionInfo: EncryptionInfoProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3fdb09acff026972fdfc983e70307d7b654758bf6624a536e6fc64e6bd49810")
    public fun encryptionInfo(encryptionInfo: EncryptionInfoProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring)
     * @param enhancedMonitoring 
     */
    public fun enhancedMonitoring(enhancedMonitoring: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion)
     * @param kafkaVersion 
     */
    public fun kafkaVersion(kafkaVersion: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo 
     */
    public fun loggingInfo(loggingInfo: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo 
     */
    public fun loggingInfo(loggingInfo: LoggingInfoProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c5ffd2c1ffe53f697e777a19dc8afa8e9b2aae871e686ca438912c09b5ccff3")
    public fun loggingInfo(loggingInfo: LoggingInfoProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes)
     * @param numberOfBrokerNodes 
     */
    public fun numberOfBrokerNodes(numberOfBrokerNodes: Number)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring 
     */
    public fun openMonitoring(openMonitoring: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring 
     */
    public fun openMonitoring(openMonitoring: OpenMonitoringProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfb8e468253cc86a8dbad997c1624bae69c363d28d7aeb6903324f1029add53e")
    public fun openMonitoring(openMonitoring: OpenMonitoringProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-storagemode)
     * @param storageMode 
     */
    public fun storageMode(storageMode: String)

    /**
     * A key-value pair to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-tags)
     * @param tags A key-value pair to associate with a resource. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo 
     */
    override fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo 
     */
    override fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(BrokerNodeGroupInfoProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     * @param brokerNodeGroupInfo 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61ad7de6319342519a3c1d5709ea2dd2cd0a7ca9f7ee3b5bb8f1e1d709ab7ec7")
    override
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty.Builder.() -> Unit):
        Unit = brokerNodeGroupInfo(BrokerNodeGroupInfoProperty(brokerNodeGroupInfo))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication 
     */
    override fun clientAuthentication(clientAuthentication: IResolvable) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication 
     */
    override fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(ClientAuthenticationProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     * @param clientAuthentication 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94990ea4553395f051fbe13922809ed1ab7a187bb46dc003a9cea5fcce16655a")
    override
        fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty.Builder.() -> Unit):
        Unit = clientAuthentication(ClientAuthenticationProperty(clientAuthentication))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername)
     * @param clusterName 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo 
     */
    override fun configurationInfo(configurationInfo: IResolvable) {
      cdkBuilder.configurationInfo(configurationInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo 
     */
    override fun configurationInfo(configurationInfo: ConfigurationInfoProperty) {
      cdkBuilder.configurationInfo(configurationInfo.let(ConfigurationInfoProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     * @param configurationInfo 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03a15325d3f00abc56619850e839d374872995e53db76160e9cfd6a13842a014")
    override fun configurationInfo(configurationInfo: ConfigurationInfoProperty.Builder.() -> Unit):
        Unit = configurationInfo(ConfigurationInfoProperty(configurationInfo))

    /**
     * The current version of the MSK cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-currentversion)
     * @param currentVersion The current version of the MSK cluster. 
     */
    override fun currentVersion(currentVersion: String) {
      cdkBuilder.currentVersion(currentVersion)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo 
     */
    override fun encryptionInfo(encryptionInfo: IResolvable) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo 
     */
    override fun encryptionInfo(encryptionInfo: EncryptionInfoProperty) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(EncryptionInfoProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     * @param encryptionInfo 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3fdb09acff026972fdfc983e70307d7b654758bf6624a536e6fc64e6bd49810")
    override fun encryptionInfo(encryptionInfo: EncryptionInfoProperty.Builder.() -> Unit): Unit =
        encryptionInfo(EncryptionInfoProperty(encryptionInfo))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring)
     * @param enhancedMonitoring 
     */
    override fun enhancedMonitoring(enhancedMonitoring: String) {
      cdkBuilder.enhancedMonitoring(enhancedMonitoring)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion)
     * @param kafkaVersion 
     */
    override fun kafkaVersion(kafkaVersion: String) {
      cdkBuilder.kafkaVersion(kafkaVersion)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo 
     */
    override fun loggingInfo(loggingInfo: IResolvable) {
      cdkBuilder.loggingInfo(loggingInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo 
     */
    override fun loggingInfo(loggingInfo: LoggingInfoProperty) {
      cdkBuilder.loggingInfo(loggingInfo.let(LoggingInfoProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     * @param loggingInfo 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c5ffd2c1ffe53f697e777a19dc8afa8e9b2aae871e686ca438912c09b5ccff3")
    override fun loggingInfo(loggingInfo: LoggingInfoProperty.Builder.() -> Unit): Unit =
        loggingInfo(LoggingInfoProperty(loggingInfo))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes)
     * @param numberOfBrokerNodes 
     */
    override fun numberOfBrokerNodes(numberOfBrokerNodes: Number) {
      cdkBuilder.numberOfBrokerNodes(numberOfBrokerNodes)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring 
     */
    override fun openMonitoring(openMonitoring: IResolvable) {
      cdkBuilder.openMonitoring(openMonitoring.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring 
     */
    override fun openMonitoring(openMonitoring: OpenMonitoringProperty) {
      cdkBuilder.openMonitoring(openMonitoring.let(OpenMonitoringProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     * @param openMonitoring 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfb8e468253cc86a8dbad997c1624bae69c363d28d7aeb6903324f1029add53e")
    override fun openMonitoring(openMonitoring: OpenMonitoringProperty.Builder.() -> Unit): Unit =
        openMonitoring(OpenMonitoringProperty(openMonitoring))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-storagemode)
     * @param storageMode 
     */
    override fun storageMode(storageMode: String) {
      cdkBuilder.storageMode(storageMode)
    }

    /**
     * A key-value pair to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-tags)
     * @param tags A key-value pair to associate with a resource. 
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
        wrapped.cdkObject as software.amazon.awscdk.services.msk.CfnCluster
  }

  /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html#cfn-msk-cluster-brokerlogs-cloudwatchlogs)
     */
    public fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html#cfn-msk-cluster-brokerlogs-firehose)
     */
    public fun firehose(): Any? = unwrap(this).getFirehose()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html#cfn-msk-cluster-brokerlogs-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [BrokerLogsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogs the value to be set.
       */
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable)

      /**
       * @param cloudWatchLogs the value to be set.
       */
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty)

      /**
       * @param cloudWatchLogs the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00173fc901fc925154645a69e02e48c96b0e6dac33fb9043bebccb842ae75583")
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty.Builder.() -> Unit)

      /**
       * @param firehose the value to be set.
       */
      public fun firehose(firehose: IResolvable)

      /**
       * @param firehose the value to be set.
       */
      public fun firehose(firehose: FirehoseProperty)

      /**
       * @param firehose the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82c8164ccd7edc7f38961bf3b9efe2458c79026290d580bf7b2a72c33348744d")
      public fun firehose(firehose: FirehoseProperty.Builder.() -> Unit)

      /**
       * @param s3 the value to be set.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 the value to be set.
       */
      public fun s3(s3: S3Property)

      /**
       * @param s3 the value to be set.
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
       * @param cloudWatchLogs the value to be set.
       */
      override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogs the value to be set.
       */
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogsProperty.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogs the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00173fc901fc925154645a69e02e48c96b0e6dac33fb9043bebccb842ae75583")
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty.Builder.() -> Unit): Unit =
          cloudWatchLogs(CloudWatchLogsProperty(cloudWatchLogs))

      /**
       * @param firehose the value to be set.
       */
      override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param firehose the value to be set.
       */
      override fun firehose(firehose: FirehoseProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseProperty.Companion::unwrap))
      }

      /**
       * @param firehose the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82c8164ccd7edc7f38961bf3b9efe2458c79026290d580bf7b2a72c33348744d")
      override fun firehose(firehose: FirehoseProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseProperty(firehose))

      /**
       * @param s3 the value to be set.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 the value to be set.
       */
      override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property.Companion::unwrap))
      }

      /**
       * @param s3 the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a20013b1bb05fba1ee7c0fa50447d6a12e6e9abc5d45e51ff716e5a1c196cd9d")
      override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty,
    ) : CdkObject(cdkObject),
        BrokerLogsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html#cfn-msk-cluster-brokerlogs-cloudwatchlogs)
       */
      override fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html#cfn-msk-cluster-brokerlogs-firehose)
       */
      override fun firehose(): Any? = unwrap(this).getFirehose()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-brokerazdistribution)
     */
    public fun brokerAzDistribution(): String? = unwrap(this).getBrokerAzDistribution()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-clientsubnets)
     */
    public fun clientSubnets(): List<String>

    /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-storageinfo)
     */
    public fun storageInfo(): Any? = unwrap(this).getStorageInfo()

    /**
     * A builder for [BrokerNodeGroupInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param brokerAzDistribution the value to be set.
       */
      public fun brokerAzDistribution(brokerAzDistribution: String)

      /**
       * @param clientSubnets the value to be set. 
       */
      public fun clientSubnets(clientSubnets: List<String>)

      /**
       * @param clientSubnets the value to be set. 
       */
      public fun clientSubnets(vararg clientSubnets: String)

      /**
       * @param connectivityInfo the value to be set.
       */
      public fun connectivityInfo(connectivityInfo: IResolvable)

      /**
       * @param connectivityInfo the value to be set.
       */
      public fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty)

      /**
       * @param connectivityInfo the value to be set.
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
       * @param securityGroups the value to be set.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups the value to be set.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param storageInfo the value to be set.
       */
      public fun storageInfo(storageInfo: IResolvable)

      /**
       * @param storageInfo the value to be set.
       */
      public fun storageInfo(storageInfo: StorageInfoProperty)

      /**
       * @param storageInfo the value to be set.
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
       * @param brokerAzDistribution the value to be set.
       */
      override fun brokerAzDistribution(brokerAzDistribution: String) {
        cdkBuilder.brokerAzDistribution(brokerAzDistribution)
      }

      /**
       * @param clientSubnets the value to be set. 
       */
      override fun clientSubnets(clientSubnets: List<String>) {
        cdkBuilder.clientSubnets(clientSubnets)
      }

      /**
       * @param clientSubnets the value to be set. 
       */
      override fun clientSubnets(vararg clientSubnets: String): Unit =
          clientSubnets(clientSubnets.toList())

      /**
       * @param connectivityInfo the value to be set.
       */
      override fun connectivityInfo(connectivityInfo: IResolvable) {
        cdkBuilder.connectivityInfo(connectivityInfo.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param connectivityInfo the value to be set.
       */
      override fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty) {
        cdkBuilder.connectivityInfo(connectivityInfo.let(ConnectivityInfoProperty.Companion::unwrap))
      }

      /**
       * @param connectivityInfo the value to be set.
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
       * @param securityGroups the value to be set.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups the value to be set.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param storageInfo the value to be set.
       */
      override fun storageInfo(storageInfo: IResolvable) {
        cdkBuilder.storageInfo(storageInfo.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param storageInfo the value to be set.
       */
      override fun storageInfo(storageInfo: StorageInfoProperty) {
        cdkBuilder.storageInfo(storageInfo.let(StorageInfoProperty.Companion::unwrap))
      }

      /**
       * @param storageInfo the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ad02fa94afddc6233268390a43d23a87a02529e8eb0720bc086f03e699c7e4b")
      override fun storageInfo(storageInfo: StorageInfoProperty.Builder.() -> Unit): Unit =
          storageInfo(StorageInfoProperty(storageInfo))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty,
    ) : CdkObject(cdkObject),
        BrokerNodeGroupInfoProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-brokerazdistribution)
       */
      override fun brokerAzDistribution(): String? = unwrap(this).getBrokerAzDistribution()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-clientsubnets)
       */
      override fun clientSubnets(): List<String> = unwrap(this).getClientSubnets()

      /**
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html#cfn-msk-cluster-clientauthentication-sasl)
     */
    public fun sasl(): Any? = unwrap(this).getSasl()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html#cfn-msk-cluster-clientauthentication-tls)
     */
    public fun tls(): Any? = unwrap(this).getTls()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html#cfn-msk-cluster-clientauthentication-unauthenticated)
     */
    public fun unauthenticated(): Any? = unwrap(this).getUnauthenticated()

    /**
     * A builder for [ClientAuthenticationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sasl the value to be set.
       */
      public fun sasl(sasl: IResolvable)

      /**
       * @param sasl the value to be set.
       */
      public fun sasl(sasl: SaslProperty)

      /**
       * @param sasl the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("713c425e8307846c7f9d89f7971c7cab5fd866d3111c9ded45af6da17f6b2b36")
      public fun sasl(sasl: SaslProperty.Builder.() -> Unit)

      /**
       * @param tls the value to be set.
       */
      public fun tls(tls: IResolvable)

      /**
       * @param tls the value to be set.
       */
      public fun tls(tls: TlsProperty)

      /**
       * @param tls the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5404832d90b1ea5c7ea1ebc1ff6128e87f9402511c0cd0dc499441dd0a223dd0")
      public fun tls(tls: TlsProperty.Builder.() -> Unit)

      /**
       * @param unauthenticated the value to be set.
       */
      public fun unauthenticated(unauthenticated: IResolvable)

      /**
       * @param unauthenticated the value to be set.
       */
      public fun unauthenticated(unauthenticated: UnauthenticatedProperty)

      /**
       * @param unauthenticated the value to be set.
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
       * @param sasl the value to be set.
       */
      override fun sasl(sasl: IResolvable) {
        cdkBuilder.sasl(sasl.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sasl the value to be set.
       */
      override fun sasl(sasl: SaslProperty) {
        cdkBuilder.sasl(sasl.let(SaslProperty.Companion::unwrap))
      }

      /**
       * @param sasl the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("713c425e8307846c7f9d89f7971c7cab5fd866d3111c9ded45af6da17f6b2b36")
      override fun sasl(sasl: SaslProperty.Builder.() -> Unit): Unit = sasl(SaslProperty(sasl))

      /**
       * @param tls the value to be set.
       */
      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tls the value to be set.
       */
      override fun tls(tls: TlsProperty) {
        cdkBuilder.tls(tls.let(TlsProperty.Companion::unwrap))
      }

      /**
       * @param tls the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5404832d90b1ea5c7ea1ebc1ff6128e87f9402511c0cd0dc499441dd0a223dd0")
      override fun tls(tls: TlsProperty.Builder.() -> Unit): Unit = tls(TlsProperty(tls))

      /**
       * @param unauthenticated the value to be set.
       */
      override fun unauthenticated(unauthenticated: IResolvable) {
        cdkBuilder.unauthenticated(unauthenticated.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param unauthenticated the value to be set.
       */
      override fun unauthenticated(unauthenticated: UnauthenticatedProperty) {
        cdkBuilder.unauthenticated(unauthenticated.let(UnauthenticatedProperty.Companion::unwrap))
      }

      /**
       * @param unauthenticated the value to be set.
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
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty,
    ) : CdkObject(cdkObject),
        ClientAuthenticationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html#cfn-msk-cluster-clientauthentication-sasl)
       */
      override fun sasl(): Any? = unwrap(this).getSasl()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html#cfn-msk-cluster-clientauthentication-tls)
       */
      override fun tls(): Any? = unwrap(this).getTls()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html#cfn-msk-cluster-cloudwatchlogs-enabled)
     */
    public fun enabled(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html#cfn-msk-cluster-cloudwatchlogs-loggroup)
     */
    public fun logGroup(): String? = unwrap(this).getLogGroup()

    /**
     * A builder for [CloudWatchLogsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param logGroup the value to be set.
       */
      public fun logGroup(logGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty.builder()

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logGroup the value to be set.
       */
      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty,
    ) : CdkObject(cdkObject),
        CloudWatchLogsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html#cfn-msk-cluster-cloudwatchlogs-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html#cfn-msk-cluster-configurationinfo-arn)
     */
    public fun arn(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html#cfn-msk-cluster-configurationinfo-revision)
     */
    public fun revision(): Number

    /**
     * A builder for [ConfigurationInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn the value to be set. 
       */
      public fun arn(arn: String)

      /**
       * @param revision the value to be set. 
       */
      public fun revision(revision: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty.builder()

      /**
       * @param arn the value to be set. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param revision the value to be set. 
       */
      override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty,
    ) : CdkObject(cdkObject),
        ConfigurationInfoProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html#cfn-msk-cluster-configurationinfo-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-connectivityinfo.html#cfn-msk-cluster-connectivityinfo-publicaccess)
     */
    public fun publicAccess(): Any? = unwrap(this).getPublicAccess()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-connectivityinfo.html#cfn-msk-cluster-connectivityinfo-vpcconnectivity)
     */
    public fun vpcConnectivity(): Any? = unwrap(this).getVpcConnectivity()

    /**
     * A builder for [ConnectivityInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param publicAccess the value to be set.
       */
      public fun publicAccess(publicAccess: IResolvable)

      /**
       * @param publicAccess the value to be set.
       */
      public fun publicAccess(publicAccess: PublicAccessProperty)

      /**
       * @param publicAccess the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a7888d4955b3315da4a19ed9554bec66f86fb723efe1814ec8149ab6ece268e")
      public fun publicAccess(publicAccess: PublicAccessProperty.Builder.() -> Unit)

      /**
       * @param vpcConnectivity the value to be set.
       */
      public fun vpcConnectivity(vpcConnectivity: IResolvable)

      /**
       * @param vpcConnectivity the value to be set.
       */
      public fun vpcConnectivity(vpcConnectivity: VpcConnectivityProperty)

      /**
       * @param vpcConnectivity the value to be set.
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
       * @param publicAccess the value to be set.
       */
      override fun publicAccess(publicAccess: IResolvable) {
        cdkBuilder.publicAccess(publicAccess.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param publicAccess the value to be set.
       */
      override fun publicAccess(publicAccess: PublicAccessProperty) {
        cdkBuilder.publicAccess(publicAccess.let(PublicAccessProperty.Companion::unwrap))
      }

      /**
       * @param publicAccess the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a7888d4955b3315da4a19ed9554bec66f86fb723efe1814ec8149ab6ece268e")
      override fun publicAccess(publicAccess: PublicAccessProperty.Builder.() -> Unit): Unit =
          publicAccess(PublicAccessProperty(publicAccess))

      /**
       * @param vpcConnectivity the value to be set.
       */
      override fun vpcConnectivity(vpcConnectivity: IResolvable) {
        cdkBuilder.vpcConnectivity(vpcConnectivity.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpcConnectivity the value to be set.
       */
      override fun vpcConnectivity(vpcConnectivity: VpcConnectivityProperty) {
        cdkBuilder.vpcConnectivity(vpcConnectivity.let(VpcConnectivityProperty.Companion::unwrap))
      }

      /**
       * @param vpcConnectivity the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ca41c7a838de77bd0fa0a604512e42a1b2e929eec389c095805c30bf57f92ae")
      override fun vpcConnectivity(vpcConnectivity: VpcConnectivityProperty.Builder.() -> Unit):
          Unit = vpcConnectivity(VpcConnectivityProperty(vpcConnectivity))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty,
    ) : CdkObject(cdkObject),
        ConnectivityInfoProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-connectivityinfo.html#cfn-msk-cluster-connectivityinfo-publicaccess)
       */
      override fun publicAccess(): Any? = unwrap(this).getPublicAccess()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html#cfn-msk-cluster-ebsstorageinfo-provisionedthroughput)
     */
    public fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html#cfn-msk-cluster-ebsstorageinfo-volumesize)
     */
    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * A builder for [EBSStorageInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param provisionedThroughput the value to be set.
       */
      public fun provisionedThroughput(provisionedThroughput: IResolvable)

      /**
       * @param provisionedThroughput the value to be set.
       */
      public fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty)

      /**
       * @param provisionedThroughput the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("becd042847a0cda11c380a0be5e18fc2c67b234230e0f9a0119385cca50f9349")
      public
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit)

      /**
       * @param volumeSize the value to be set.
       */
      public fun volumeSize(volumeSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty.builder()

      /**
       * @param provisionedThroughput the value to be set.
       */
      override fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param provisionedThroughput the value to be set.
       */
      override fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(ProvisionedThroughputProperty.Companion::unwrap))
      }

      /**
       * @param provisionedThroughput the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("becd042847a0cda11c380a0be5e18fc2c67b234230e0f9a0119385cca50f9349")
      override
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit):
          Unit = provisionedThroughput(ProvisionedThroughputProperty(provisionedThroughput))

      /**
       * @param volumeSize the value to be set.
       */
      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty,
    ) : CdkObject(cdkObject),
        EBSStorageInfoProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html#cfn-msk-cluster-ebsstorageinfo-provisionedthroughput)
       */
      override fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html#cfn-msk-cluster-encryptionatrest-datavolumekmskeyid)
     */
    public fun dataVolumeKmsKeyId(): String

    /**
     * A builder for [EncryptionAtRestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataVolumeKmsKeyId the value to be set. 
       */
      public fun dataVolumeKmsKeyId(dataVolumeKmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty.builder()

      /**
       * @param dataVolumeKmsKeyId the value to be set. 
       */
      override fun dataVolumeKmsKeyId(dataVolumeKmsKeyId: String) {
        cdkBuilder.dataVolumeKmsKeyId(dataVolumeKmsKeyId)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty,
    ) : CdkObject(cdkObject),
        EncryptionAtRestProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-clientbroker)
     */
    public fun clientBroker(): String? = unwrap(this).getClientBroker()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-incluster)
     */
    public fun inCluster(): Any? = unwrap(this).getInCluster()

    /**
     * A builder for [EncryptionInTransitProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientBroker the value to be set.
       */
      public fun clientBroker(clientBroker: String)

      /**
       * @param inCluster the value to be set.
       */
      public fun inCluster(inCluster: Boolean)

      /**
       * @param inCluster the value to be set.
       */
      public fun inCluster(inCluster: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty.builder()

      /**
       * @param clientBroker the value to be set.
       */
      override fun clientBroker(clientBroker: String) {
        cdkBuilder.clientBroker(clientBroker)
      }

      /**
       * @param inCluster the value to be set.
       */
      override fun inCluster(inCluster: Boolean) {
        cdkBuilder.inCluster(inCluster)
      }

      /**
       * @param inCluster the value to be set.
       */
      override fun inCluster(inCluster: IResolvable) {
        cdkBuilder.inCluster(inCluster.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty,
    ) : CdkObject(cdkObject),
        EncryptionInTransitProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-clientbroker)
       */
      override fun clientBroker(): String? = unwrap(this).getClientBroker()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html#cfn-msk-cluster-encryptioninfo-encryptionatrest)
     */
    public fun encryptionAtRest(): Any? = unwrap(this).getEncryptionAtRest()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html#cfn-msk-cluster-encryptioninfo-encryptionintransit)
     */
    public fun encryptionInTransit(): Any? = unwrap(this).getEncryptionInTransit()

    /**
     * A builder for [EncryptionInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionAtRest the value to be set.
       */
      public fun encryptionAtRest(encryptionAtRest: IResolvable)

      /**
       * @param encryptionAtRest the value to be set.
       */
      public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty)

      /**
       * @param encryptionAtRest the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0431872660d1897cf457bbc58733002e4b48ea325f74f75724c99e921f0e6e8")
      public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty.Builder.() -> Unit)

      /**
       * @param encryptionInTransit the value to be set.
       */
      public fun encryptionInTransit(encryptionInTransit: IResolvable)

      /**
       * @param encryptionInTransit the value to be set.
       */
      public fun encryptionInTransit(encryptionInTransit: EncryptionInTransitProperty)

      /**
       * @param encryptionInTransit the value to be set.
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
       * @param encryptionAtRest the value to be set.
       */
      override fun encryptionAtRest(encryptionAtRest: IResolvable) {
        cdkBuilder.encryptionAtRest(encryptionAtRest.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encryptionAtRest the value to be set.
       */
      override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty) {
        cdkBuilder.encryptionAtRest(encryptionAtRest.let(EncryptionAtRestProperty.Companion::unwrap))
      }

      /**
       * @param encryptionAtRest the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0431872660d1897cf457bbc58733002e4b48ea325f74f75724c99e921f0e6e8")
      override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty.Builder.() -> Unit):
          Unit = encryptionAtRest(EncryptionAtRestProperty(encryptionAtRest))

      /**
       * @param encryptionInTransit the value to be set.
       */
      override fun encryptionInTransit(encryptionInTransit: IResolvable) {
        cdkBuilder.encryptionInTransit(encryptionInTransit.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encryptionInTransit the value to be set.
       */
      override fun encryptionInTransit(encryptionInTransit: EncryptionInTransitProperty) {
        cdkBuilder.encryptionInTransit(encryptionInTransit.let(EncryptionInTransitProperty.Companion::unwrap))
      }

      /**
       * @param encryptionInTransit the value to be set.
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
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty,
    ) : CdkObject(cdkObject),
        EncryptionInfoProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html#cfn-msk-cluster-encryptioninfo-encryptionatrest)
       */
      override fun encryptionAtRest(): Any? = unwrap(this).getEncryptionAtRest()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html#cfn-msk-cluster-firehose-deliverystream)
     */
    public fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html#cfn-msk-cluster-firehose-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [FirehoseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryStream the value to be set.
       */
      public fun deliveryStream(deliveryStream: String)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty.builder()

      /**
       * @param deliveryStream the value to be set.
       */
      override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty,
    ) : CdkObject(cdkObject),
        FirehoseProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html#cfn-msk-cluster-firehose-deliverystream)
       */
      override fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-iam.html#cfn-msk-cluster-iam-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [IamProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.IamProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.IamProperty.builder()

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.IamProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.IamProperty,
    ) : CdkObject(cdkObject),
        IamProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-jmxexporter.html#cfn-msk-cluster-jmxexporter-enabledinbroker)
     */
    public fun enabledInBroker(): Any

    /**
     * A builder for [JmxExporterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabledInBroker the value to be set. 
       */
      public fun enabledInBroker(enabledInBroker: Boolean)

      /**
       * @param enabledInBroker the value to be set. 
       */
      public fun enabledInBroker(enabledInBroker: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty.builder()

      /**
       * @param enabledInBroker the value to be set. 
       */
      override fun enabledInBroker(enabledInBroker: Boolean) {
        cdkBuilder.enabledInBroker(enabledInBroker)
      }

      /**
       * @param enabledInBroker the value to be set. 
       */
      override fun enabledInBroker(enabledInBroker: IResolvable) {
        cdkBuilder.enabledInBroker(enabledInBroker.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty,
    ) : CdkObject(cdkObject),
        JmxExporterProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-logginginfo.html#cfn-msk-cluster-logginginfo-brokerlogs)
     */
    public fun brokerLogs(): Any

    /**
     * A builder for [LoggingInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param brokerLogs the value to be set. 
       */
      public fun brokerLogs(brokerLogs: IResolvable)

      /**
       * @param brokerLogs the value to be set. 
       */
      public fun brokerLogs(brokerLogs: BrokerLogsProperty)

      /**
       * @param brokerLogs the value to be set. 
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
       * @param brokerLogs the value to be set. 
       */
      override fun brokerLogs(brokerLogs: IResolvable) {
        cdkBuilder.brokerLogs(brokerLogs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param brokerLogs the value to be set. 
       */
      override fun brokerLogs(brokerLogs: BrokerLogsProperty) {
        cdkBuilder.brokerLogs(brokerLogs.let(BrokerLogsProperty.Companion::unwrap))
      }

      /**
       * @param brokerLogs the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c29521d2378f142b0ba7241645e3c09b895ca33c68ee2f252e46c960056d932")
      override fun brokerLogs(brokerLogs: BrokerLogsProperty.Builder.() -> Unit): Unit =
          brokerLogs(BrokerLogsProperty(brokerLogs))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty,
    ) : CdkObject(cdkObject),
        LoggingInfoProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html#cfn-msk-cluster-nodeexporter-enabledinbroker)
     */
    public fun enabledInBroker(): Any

    /**
     * A builder for [NodeExporterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabledInBroker the value to be set. 
       */
      public fun enabledInBroker(enabledInBroker: Boolean)

      /**
       * @param enabledInBroker the value to be set. 
       */
      public fun enabledInBroker(enabledInBroker: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty.builder()

      /**
       * @param enabledInBroker the value to be set. 
       */
      override fun enabledInBroker(enabledInBroker: Boolean) {
        cdkBuilder.enabledInBroker(enabledInBroker)
      }

      /**
       * @param enabledInBroker the value to be set. 
       */
      override fun enabledInBroker(enabledInBroker: IResolvable) {
        cdkBuilder.enabledInBroker(enabledInBroker.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty,
    ) : CdkObject(cdkObject),
        NodeExporterProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-openmonitoring.html#cfn-msk-cluster-openmonitoring-prometheus)
     */
    public fun prometheus(): Any

    /**
     * A builder for [OpenMonitoringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param prometheus the value to be set. 
       */
      public fun prometheus(prometheus: IResolvable)

      /**
       * @param prometheus the value to be set. 
       */
      public fun prometheus(prometheus: PrometheusProperty)

      /**
       * @param prometheus the value to be set. 
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
       * @param prometheus the value to be set. 
       */
      override fun prometheus(prometheus: IResolvable) {
        cdkBuilder.prometheus(prometheus.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param prometheus the value to be set. 
       */
      override fun prometheus(prometheus: PrometheusProperty) {
        cdkBuilder.prometheus(prometheus.let(PrometheusProperty.Companion::unwrap))
      }

      /**
       * @param prometheus the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b1fd3217fbf6dea260ad8c5ca9624e05154513aa617f9ebd7e2383296dc1e1f")
      override fun prometheus(prometheus: PrometheusProperty.Builder.() -> Unit): Unit =
          prometheus(PrometheusProperty(prometheus))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty,
    ) : CdkObject(cdkObject),
        OpenMonitoringProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html#cfn-msk-cluster-prometheus-jmxexporter)
     */
    public fun jmxExporter(): Any? = unwrap(this).getJmxExporter()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html#cfn-msk-cluster-prometheus-nodeexporter)
     */
    public fun nodeExporter(): Any? = unwrap(this).getNodeExporter()

    /**
     * A builder for [PrometheusProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jmxExporter the value to be set.
       */
      public fun jmxExporter(jmxExporter: IResolvable)

      /**
       * @param jmxExporter the value to be set.
       */
      public fun jmxExporter(jmxExporter: JmxExporterProperty)

      /**
       * @param jmxExporter the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c30b92803d3124701f31d0600afd646d59feb335c96fb4db5bfef705850dfa09")
      public fun jmxExporter(jmxExporter: JmxExporterProperty.Builder.() -> Unit)

      /**
       * @param nodeExporter the value to be set.
       */
      public fun nodeExporter(nodeExporter: IResolvable)

      /**
       * @param nodeExporter the value to be set.
       */
      public fun nodeExporter(nodeExporter: NodeExporterProperty)

      /**
       * @param nodeExporter the value to be set.
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
       * @param jmxExporter the value to be set.
       */
      override fun jmxExporter(jmxExporter: IResolvable) {
        cdkBuilder.jmxExporter(jmxExporter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param jmxExporter the value to be set.
       */
      override fun jmxExporter(jmxExporter: JmxExporterProperty) {
        cdkBuilder.jmxExporter(jmxExporter.let(JmxExporterProperty.Companion::unwrap))
      }

      /**
       * @param jmxExporter the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c30b92803d3124701f31d0600afd646d59feb335c96fb4db5bfef705850dfa09")
      override fun jmxExporter(jmxExporter: JmxExporterProperty.Builder.() -> Unit): Unit =
          jmxExporter(JmxExporterProperty(jmxExporter))

      /**
       * @param nodeExporter the value to be set.
       */
      override fun nodeExporter(nodeExporter: IResolvable) {
        cdkBuilder.nodeExporter(nodeExporter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nodeExporter the value to be set.
       */
      override fun nodeExporter(nodeExporter: NodeExporterProperty) {
        cdkBuilder.nodeExporter(nodeExporter.let(NodeExporterProperty.Companion::unwrap))
      }

      /**
       * @param nodeExporter the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4a041baf53642bd4142802093fd00a5c404a8200f91bc8d760ca5a660138ebc")
      override fun nodeExporter(nodeExporter: NodeExporterProperty.Builder.() -> Unit): Unit =
          nodeExporter(NodeExporterProperty(nodeExporter))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty,
    ) : CdkObject(cdkObject),
        PrometheusProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html#cfn-msk-cluster-prometheus-jmxexporter)
       */
      override fun jmxExporter(): Any? = unwrap(this).getJmxExporter()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-provisionedthroughput.html#cfn-msk-cluster-provisionedthroughput-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-provisionedthroughput.html#cfn-msk-cluster-provisionedthroughput-volumethroughput)
     */
    public fun volumeThroughput(): Number? = unwrap(this).getVolumeThroughput()

    /**
     * A builder for [ProvisionedThroughputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param volumeThroughput the value to be set.
       */
      public fun volumeThroughput(volumeThroughput: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty.builder()

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param volumeThroughput the value to be set.
       */
      override fun volumeThroughput(volumeThroughput: Number) {
        cdkBuilder.volumeThroughput(volumeThroughput)
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty,
    ) : CdkObject(cdkObject),
        ProvisionedThroughputProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-provisionedthroughput.html#cfn-msk-cluster-provisionedthroughput-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-publicaccess.html#cfn-msk-cluster-publicaccess-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [PublicAccessProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type the value to be set.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty.builder()

      /**
       * @param type the value to be set.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty,
    ) : CdkObject(cdkObject),
        PublicAccessProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html#cfn-msk-cluster-s3-bucket)
     */
    public fun bucket(): String? = unwrap(this).getBucket()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html#cfn-msk-cluster-s3-enabled)
     */
    public fun enabled(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html#cfn-msk-cluster-s3-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [S3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket the value to be set.
       */
      public fun bucket(bucket: String)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param prefix the value to be set.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.S3Property.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.S3Property.builder()

      /**
       * @param bucket the value to be set.
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param prefix the value to be set.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.S3Property,
    ) : CdkObject(cdkObject),
        S3Property {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html#cfn-msk-cluster-s3-bucket)
       */
      override fun bucket(): String? = unwrap(this).getBucket()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html#cfn-msk-cluster-s3-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-sasl.html#cfn-msk-cluster-sasl-iam)
     */
    public fun iam(): Any? = unwrap(this).getIam()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-sasl.html#cfn-msk-cluster-sasl-scram)
     */
    public fun scram(): Any? = unwrap(this).getScram()

    /**
     * A builder for [SaslProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iam the value to be set.
       */
      public fun iam(iam: IResolvable)

      /**
       * @param iam the value to be set.
       */
      public fun iam(iam: IamProperty)

      /**
       * @param iam the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbf95f659e99557816579ce940d287daa47a8439569f98ce4b6d4ce0d04ab427")
      public fun iam(iam: IamProperty.Builder.() -> Unit)

      /**
       * @param scram the value to be set.
       */
      public fun scram(scram: IResolvable)

      /**
       * @param scram the value to be set.
       */
      public fun scram(scram: ScramProperty)

      /**
       * @param scram the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12c4d4e4080061c1e1751882cb23f1a55dd61dc3aec40f44ddb5a1b221da548b")
      public fun scram(scram: ScramProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.SaslProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.SaslProperty.builder()

      /**
       * @param iam the value to be set.
       */
      override fun iam(iam: IResolvable) {
        cdkBuilder.iam(iam.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iam the value to be set.
       */
      override fun iam(iam: IamProperty) {
        cdkBuilder.iam(iam.let(IamProperty.Companion::unwrap))
      }

      /**
       * @param iam the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbf95f659e99557816579ce940d287daa47a8439569f98ce4b6d4ce0d04ab427")
      override fun iam(iam: IamProperty.Builder.() -> Unit): Unit = iam(IamProperty(iam))

      /**
       * @param scram the value to be set.
       */
      override fun scram(scram: IResolvable) {
        cdkBuilder.scram(scram.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scram the value to be set.
       */
      override fun scram(scram: ScramProperty) {
        cdkBuilder.scram(scram.let(ScramProperty.Companion::unwrap))
      }

      /**
       * @param scram the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12c4d4e4080061c1e1751882cb23f1a55dd61dc3aec40f44ddb5a1b221da548b")
      override fun scram(scram: ScramProperty.Builder.() -> Unit): Unit =
          scram(ScramProperty(scram))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.SaslProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.SaslProperty,
    ) : CdkObject(cdkObject),
        SaslProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-sasl.html#cfn-msk-cluster-sasl-iam)
       */
      override fun iam(): Any? = unwrap(this).getIam()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-scram.html#cfn-msk-cluster-scram-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [ScramProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.ScramProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ScramProperty.builder()

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.ScramProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ScramProperty,
    ) : CdkObject(cdkObject),
        ScramProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-storageinfo.html#cfn-msk-cluster-storageinfo-ebsstorageinfo)
     */
    public fun ebsStorageInfo(): Any? = unwrap(this).getEbsStorageInfo()

    /**
     * A builder for [StorageInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ebsStorageInfo the value to be set.
       */
      public fun ebsStorageInfo(ebsStorageInfo: IResolvable)

      /**
       * @param ebsStorageInfo the value to be set.
       */
      public fun ebsStorageInfo(ebsStorageInfo: EBSStorageInfoProperty)

      /**
       * @param ebsStorageInfo the value to be set.
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
       * @param ebsStorageInfo the value to be set.
       */
      override fun ebsStorageInfo(ebsStorageInfo: IResolvable) {
        cdkBuilder.ebsStorageInfo(ebsStorageInfo.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ebsStorageInfo the value to be set.
       */
      override fun ebsStorageInfo(ebsStorageInfo: EBSStorageInfoProperty) {
        cdkBuilder.ebsStorageInfo(ebsStorageInfo.let(EBSStorageInfoProperty.Companion::unwrap))
      }

      /**
       * @param ebsStorageInfo the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c96fc46257901e7b2884edaa78a13e0c177649c7d2f5b7f0f04366e35a31b3f")
      override fun ebsStorageInfo(ebsStorageInfo: EBSStorageInfoProperty.Builder.() -> Unit): Unit =
          ebsStorageInfo(EBSStorageInfoProperty(ebsStorageInfo))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty,
    ) : CdkObject(cdkObject),
        StorageInfoProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html#cfn-msk-cluster-tls-certificateauthorityarnlist)
     */
    public fun certificateAuthorityArnList(): List<String> =
        unwrap(this).getCertificateAuthorityArnList() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html#cfn-msk-cluster-tls-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [TlsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateAuthorityArnList the value to be set.
       */
      public fun certificateAuthorityArnList(certificateAuthorityArnList: List<String>)

      /**
       * @param certificateAuthorityArnList the value to be set.
       */
      public fun certificateAuthorityArnList(vararg certificateAuthorityArnList: String)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.TlsProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.TlsProperty.builder()

      /**
       * @param certificateAuthorityArnList the value to be set.
       */
      override fun certificateAuthorityArnList(certificateAuthorityArnList: List<String>) {
        cdkBuilder.certificateAuthorityArnList(certificateAuthorityArnList)
      }

      /**
       * @param certificateAuthorityArnList the value to be set.
       */
      override fun certificateAuthorityArnList(vararg certificateAuthorityArnList: String): Unit =
          certificateAuthorityArnList(certificateAuthorityArnList.toList())

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.TlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.TlsProperty,
    ) : CdkObject(cdkObject),
        TlsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html#cfn-msk-cluster-tls-certificateauthorityarnlist)
       */
      override fun certificateAuthorityArnList(): List<String> =
          unwrap(this).getCertificateAuthorityArnList() ?: emptyList()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-unauthenticated.html#cfn-msk-cluster-unauthenticated-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [UnauthenticatedProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty.builder()

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty,
    ) : CdkObject(cdkObject),
        UnauthenticatedProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityclientauthentication.html#cfn-msk-cluster-vpcconnectivityclientauthentication-sasl)
     */
    public fun sasl(): Any? = unwrap(this).getSasl()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityclientauthentication.html#cfn-msk-cluster-vpcconnectivityclientauthentication-tls)
     */
    public fun tls(): Any? = unwrap(this).getTls()

    /**
     * A builder for [VpcConnectivityClientAuthenticationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sasl the value to be set.
       */
      public fun sasl(sasl: IResolvable)

      /**
       * @param sasl the value to be set.
       */
      public fun sasl(sasl: VpcConnectivitySaslProperty)

      /**
       * @param sasl the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5387f17a62bf9d0b9b81a0d524d341a67df88146a1d7a9fe5c56eeed0489f35a")
      public fun sasl(sasl: VpcConnectivitySaslProperty.Builder.() -> Unit)

      /**
       * @param tls the value to be set.
       */
      public fun tls(tls: IResolvable)

      /**
       * @param tls the value to be set.
       */
      public fun tls(tls: VpcConnectivityTlsProperty)

      /**
       * @param tls the value to be set.
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
       * @param sasl the value to be set.
       */
      override fun sasl(sasl: IResolvable) {
        cdkBuilder.sasl(sasl.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sasl the value to be set.
       */
      override fun sasl(sasl: VpcConnectivitySaslProperty) {
        cdkBuilder.sasl(sasl.let(VpcConnectivitySaslProperty.Companion::unwrap))
      }

      /**
       * @param sasl the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5387f17a62bf9d0b9b81a0d524d341a67df88146a1d7a9fe5c56eeed0489f35a")
      override fun sasl(sasl: VpcConnectivitySaslProperty.Builder.() -> Unit): Unit =
          sasl(VpcConnectivitySaslProperty(sasl))

      /**
       * @param tls the value to be set.
       */
      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tls the value to be set.
       */
      override fun tls(tls: VpcConnectivityTlsProperty) {
        cdkBuilder.tls(tls.let(VpcConnectivityTlsProperty.Companion::unwrap))
      }

      /**
       * @param tls the value to be set.
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
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty,
    ) : CdkObject(cdkObject),
        VpcConnectivityClientAuthenticationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityclientauthentication.html#cfn-msk-cluster-vpcconnectivityclientauthentication-sasl)
       */
      override fun sasl(): Any? = unwrap(this).getSasl()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityiam.html#cfn-msk-cluster-vpcconnectivityiam-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [VpcConnectivityIamProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty.builder()

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty,
    ) : CdkObject(cdkObject),
        VpcConnectivityIamProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivity.html#cfn-msk-cluster-vpcconnectivity-clientauthentication)
     */
    public fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

    /**
     * A builder for [VpcConnectivityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientAuthentication the value to be set.
       */
      public fun clientAuthentication(clientAuthentication: IResolvable)

      /**
       * @param clientAuthentication the value to be set.
       */
      public
          fun clientAuthentication(clientAuthentication: VpcConnectivityClientAuthenticationProperty)

      /**
       * @param clientAuthentication the value to be set.
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
       * @param clientAuthentication the value to be set.
       */
      override fun clientAuthentication(clientAuthentication: IResolvable) {
        cdkBuilder.clientAuthentication(clientAuthentication.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param clientAuthentication the value to be set.
       */
      override
          fun clientAuthentication(clientAuthentication: VpcConnectivityClientAuthenticationProperty) {
        cdkBuilder.clientAuthentication(clientAuthentication.let(VpcConnectivityClientAuthenticationProperty.Companion::unwrap))
      }

      /**
       * @param clientAuthentication the value to be set.
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
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty,
    ) : CdkObject(cdkObject),
        VpcConnectivityProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitysasl.html#cfn-msk-cluster-vpcconnectivitysasl-iam)
     */
    public fun iam(): Any? = unwrap(this).getIam()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitysasl.html#cfn-msk-cluster-vpcconnectivitysasl-scram)
     */
    public fun scram(): Any? = unwrap(this).getScram()

    /**
     * A builder for [VpcConnectivitySaslProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iam the value to be set.
       */
      public fun iam(iam: IResolvable)

      /**
       * @param iam the value to be set.
       */
      public fun iam(iam: VpcConnectivityIamProperty)

      /**
       * @param iam the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5621bce12a0e505b9c8d557d0b6ace9e313dc6cbaaa017252f34e9657f38c9e8")
      public fun iam(iam: VpcConnectivityIamProperty.Builder.() -> Unit)

      /**
       * @param scram the value to be set.
       */
      public fun scram(scram: IResolvable)

      /**
       * @param scram the value to be set.
       */
      public fun scram(scram: VpcConnectivityScramProperty)

      /**
       * @param scram the value to be set.
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
       * @param iam the value to be set.
       */
      override fun iam(iam: IResolvable) {
        cdkBuilder.iam(iam.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iam the value to be set.
       */
      override fun iam(iam: VpcConnectivityIamProperty) {
        cdkBuilder.iam(iam.let(VpcConnectivityIamProperty.Companion::unwrap))
      }

      /**
       * @param iam the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5621bce12a0e505b9c8d557d0b6ace9e313dc6cbaaa017252f34e9657f38c9e8")
      override fun iam(iam: VpcConnectivityIamProperty.Builder.() -> Unit): Unit =
          iam(VpcConnectivityIamProperty(iam))

      /**
       * @param scram the value to be set.
       */
      override fun scram(scram: IResolvable) {
        cdkBuilder.scram(scram.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scram the value to be set.
       */
      override fun scram(scram: VpcConnectivityScramProperty) {
        cdkBuilder.scram(scram.let(VpcConnectivityScramProperty.Companion::unwrap))
      }

      /**
       * @param scram the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("088db7309cb5cf6c24524bd4671cd61da505e50c992b3b57f2ec71d1d5f94a90")
      override fun scram(scram: VpcConnectivityScramProperty.Builder.() -> Unit): Unit =
          scram(VpcConnectivityScramProperty(scram))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty,
    ) : CdkObject(cdkObject),
        VpcConnectivitySaslProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitysasl.html#cfn-msk-cluster-vpcconnectivitysasl-iam)
       */
      override fun iam(): Any? = unwrap(this).getIam()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityscram.html#cfn-msk-cluster-vpcconnectivityscram-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [VpcConnectivityScramProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty.builder()

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty,
    ) : CdkObject(cdkObject),
        VpcConnectivityScramProperty {
      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitytls.html#cfn-msk-cluster-vpcconnectivitytls-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [VpcConnectivityTlsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty.builder()

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty,
    ) : CdkObject(cdkObject),
        VpcConnectivityTlsProperty {
      /**
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
