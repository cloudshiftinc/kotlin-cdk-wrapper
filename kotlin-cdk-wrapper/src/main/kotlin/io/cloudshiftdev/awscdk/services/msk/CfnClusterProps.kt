@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
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
public interface CfnClusterProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
   */
  public fun brokerNodeGroupInfo(): Any

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
   */
  public fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername)
   */
  public fun clusterName(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
   */
  public fun configurationInfo(): Any? = unwrap(this).getConfigurationInfo()

  /**
   * The current version of the MSK cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-currentversion)
   */
  public fun currentVersion(): String? = unwrap(this).getCurrentVersion()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
   */
  public fun encryptionInfo(): Any? = unwrap(this).getEncryptionInfo()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring)
   */
  public fun enhancedMonitoring(): String? = unwrap(this).getEnhancedMonitoring()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion)
   */
  public fun kafkaVersion(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
   */
  public fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes)
   */
  public fun numberOfBrokerNodes(): Number

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
   */
  public fun openMonitoring(): Any? = unwrap(this).getOpenMonitoring()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-storagemode)
   */
  public fun storageMode(): String? = unwrap(this).getStorageMode()

  /**
   * A key-value pair to associate with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param brokerNodeGroupInfo the value to be set. 
     */
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable)

    /**
     * @param brokerNodeGroupInfo the value to be set. 
     */
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty)

    /**
     * @param brokerNodeGroupInfo the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("204f829ea9396538d0e09bd0a89c725737b462f05c328c5e5180d1dccd1444eb")
    public
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty.Builder.() -> Unit)

    /**
     * @param clientAuthentication the value to be set.
     */
    public fun clientAuthentication(clientAuthentication: IResolvable)

    /**
     * @param clientAuthentication the value to be set.
     */
    public fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty)

    /**
     * @param clientAuthentication the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f493431925d32fcc1eecfaeb56dee04b7880fe9fe2bafa8755ff181c7f566e84")
    public
        fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty.Builder.() -> Unit)

    /**
     * @param clusterName the value to be set. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param configurationInfo the value to be set.
     */
    public fun configurationInfo(configurationInfo: IResolvable)

    /**
     * @param configurationInfo the value to be set.
     */
    public fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty)

    /**
     * @param configurationInfo the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d11771e5b61f02f304d91070170187c21cd4797b41c6dc2bc2c4667f68aa376")
    public
        fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty.Builder.() -> Unit)

    /**
     * @param currentVersion The current version of the MSK cluster.
     */
    public fun currentVersion(currentVersion: String)

    /**
     * @param encryptionInfo the value to be set.
     */
    public fun encryptionInfo(encryptionInfo: IResolvable)

    /**
     * @param encryptionInfo the value to be set.
     */
    public fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty)

    /**
     * @param encryptionInfo the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25465acbe89e8d7d87c968bd7b150bcb98e76ae89a1f15554f17c0363bdd6059")
    public fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty.Builder.() -> Unit)

    /**
     * @param enhancedMonitoring the value to be set.
     */
    public fun enhancedMonitoring(enhancedMonitoring: String)

    /**
     * @param kafkaVersion the value to be set. 
     */
    public fun kafkaVersion(kafkaVersion: String)

    /**
     * @param loggingInfo the value to be set.
     */
    public fun loggingInfo(loggingInfo: IResolvable)

    /**
     * @param loggingInfo the value to be set.
     */
    public fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty)

    /**
     * @param loggingInfo the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61a9726c7caf1c5bf39cf0cd83968a213f130c1d526b26022dccc622d106aa46")
    public fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty.Builder.() -> Unit)

    /**
     * @param numberOfBrokerNodes the value to be set. 
     */
    public fun numberOfBrokerNodes(numberOfBrokerNodes: Number)

    /**
     * @param openMonitoring the value to be set.
     */
    public fun openMonitoring(openMonitoring: IResolvable)

    /**
     * @param openMonitoring the value to be set.
     */
    public fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty)

    /**
     * @param openMonitoring the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f684fbbe73fa03faab9edc8ca6debc3749e4a3a492b69540a099e0ee9d85152")
    public fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty.Builder.() -> Unit)

    /**
     * @param storageMode the value to be set.
     */
    public fun storageMode(storageMode: String)

    /**
     * @param tags A key-value pair to associate with a resource.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnClusterProps.Builder =
        software.amazon.awscdk.services.msk.CfnClusterProps.builder()

    /**
     * @param brokerNodeGroupInfo the value to be set. 
     */
    override fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param brokerNodeGroupInfo the value to be set. 
     */
    override fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(CfnCluster.BrokerNodeGroupInfoProperty.Companion::unwrap))
    }

    /**
     * @param brokerNodeGroupInfo the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("204f829ea9396538d0e09bd0a89c725737b462f05c328c5e5180d1dccd1444eb")
    override
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty.Builder.() -> Unit):
        Unit = brokerNodeGroupInfo(CfnCluster.BrokerNodeGroupInfoProperty(brokerNodeGroupInfo))

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
        fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(CfnCluster.ClientAuthenticationProperty.Companion::unwrap))
    }

    /**
     * @param clientAuthentication the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f493431925d32fcc1eecfaeb56dee04b7880fe9fe2bafa8755ff181c7f566e84")
    override
        fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty.Builder.() -> Unit):
        Unit = clientAuthentication(CfnCluster.ClientAuthenticationProperty(clientAuthentication))

    /**
     * @param clusterName the value to be set. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param configurationInfo the value to be set.
     */
    override fun configurationInfo(configurationInfo: IResolvable) {
      cdkBuilder.configurationInfo(configurationInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configurationInfo the value to be set.
     */
    override fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty) {
      cdkBuilder.configurationInfo(configurationInfo.let(CfnCluster.ConfigurationInfoProperty.Companion::unwrap))
    }

    /**
     * @param configurationInfo the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d11771e5b61f02f304d91070170187c21cd4797b41c6dc2bc2c4667f68aa376")
    override
        fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty.Builder.() -> Unit):
        Unit = configurationInfo(CfnCluster.ConfigurationInfoProperty(configurationInfo))

    /**
     * @param currentVersion The current version of the MSK cluster.
     */
    override fun currentVersion(currentVersion: String) {
      cdkBuilder.currentVersion(currentVersion)
    }

    /**
     * @param encryptionInfo the value to be set.
     */
    override fun encryptionInfo(encryptionInfo: IResolvable) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encryptionInfo the value to be set.
     */
    override fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(CfnCluster.EncryptionInfoProperty.Companion::unwrap))
    }

    /**
     * @param encryptionInfo the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25465acbe89e8d7d87c968bd7b150bcb98e76ae89a1f15554f17c0363bdd6059")
    override
        fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty.Builder.() -> Unit):
        Unit = encryptionInfo(CfnCluster.EncryptionInfoProperty(encryptionInfo))

    /**
     * @param enhancedMonitoring the value to be set.
     */
    override fun enhancedMonitoring(enhancedMonitoring: String) {
      cdkBuilder.enhancedMonitoring(enhancedMonitoring)
    }

    /**
     * @param kafkaVersion the value to be set. 
     */
    override fun kafkaVersion(kafkaVersion: String) {
      cdkBuilder.kafkaVersion(kafkaVersion)
    }

    /**
     * @param loggingInfo the value to be set.
     */
    override fun loggingInfo(loggingInfo: IResolvable) {
      cdkBuilder.loggingInfo(loggingInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param loggingInfo the value to be set.
     */
    override fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty) {
      cdkBuilder.loggingInfo(loggingInfo.let(CfnCluster.LoggingInfoProperty.Companion::unwrap))
    }

    /**
     * @param loggingInfo the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61a9726c7caf1c5bf39cf0cd83968a213f130c1d526b26022dccc622d106aa46")
    override fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty.Builder.() -> Unit): Unit =
        loggingInfo(CfnCluster.LoggingInfoProperty(loggingInfo))

    /**
     * @param numberOfBrokerNodes the value to be set. 
     */
    override fun numberOfBrokerNodes(numberOfBrokerNodes: Number) {
      cdkBuilder.numberOfBrokerNodes(numberOfBrokerNodes)
    }

    /**
     * @param openMonitoring the value to be set.
     */
    override fun openMonitoring(openMonitoring: IResolvable) {
      cdkBuilder.openMonitoring(openMonitoring.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param openMonitoring the value to be set.
     */
    override fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty) {
      cdkBuilder.openMonitoring(openMonitoring.let(CfnCluster.OpenMonitoringProperty.Companion::unwrap))
    }

    /**
     * @param openMonitoring the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f684fbbe73fa03faab9edc8ca6debc3749e4a3a492b69540a099e0ee9d85152")
    override
        fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty.Builder.() -> Unit):
        Unit = openMonitoring(CfnCluster.OpenMonitoringProperty(openMonitoring))

    /**
     * @param storageMode the value to be set.
     */
    override fun storageMode(storageMode: String) {
      cdkBuilder.storageMode(storageMode)
    }

    /**
     * @param tags A key-value pair to associate with a resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.msk.CfnClusterProps,
  ) : CdkObject(cdkObject),
      CfnClusterProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     */
    override fun brokerNodeGroupInfo(): Any = unwrap(this).getBrokerNodeGroupInfo()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     */
    override fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername)
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     */
    override fun configurationInfo(): Any? = unwrap(this).getConfigurationInfo()

    /**
     * The current version of the MSK cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-currentversion)
     */
    override fun currentVersion(): String? = unwrap(this).getCurrentVersion()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     */
    override fun encryptionInfo(): Any? = unwrap(this).getEncryptionInfo()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring)
     */
    override fun enhancedMonitoring(): String? = unwrap(this).getEnhancedMonitoring()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion)
     */
    override fun kafkaVersion(): String = unwrap(this).getKafkaVersion()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     */
    override fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes)
     */
    override fun numberOfBrokerNodes(): Number = unwrap(this).getNumberOfBrokerNodes()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     */
    override fun openMonitoring(): Any? = unwrap(this).getOpenMonitoring()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-storagemode)
     */
    override fun storageMode(): String? = unwrap(this).getStorageMode()

    /**
     * A key-value pair to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.msk.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.msk.CfnClusterProps
  }
}
