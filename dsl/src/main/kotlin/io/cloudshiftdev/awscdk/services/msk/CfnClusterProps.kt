package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnClusterProps {
  /**
   * Information about the broker nodes in the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
   */
  public fun brokerNodeGroupInfo(): Any

  /**
   * VPC connection control settings for brokers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
   */
  public fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

  /**
   * The name of the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername)
   */
  public fun clusterName(): String

  /**
   * Represents the configuration that you want MSK to use for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
   */
  public fun configurationInfo(): Any? = unwrap(this).getConfigurationInfo()

  /**
   * The version of the cluster that you want to update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-currentversion)
   */
  public fun currentVersion(): String? = unwrap(this).getCurrentVersion()

  /**
   * Includes all encryption-related information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
   */
  public fun encryptionInfo(): Any? = unwrap(this).getEncryptionInfo()

  /**
   * Specifies the level of monitoring for the MSK cluster.
   *
   * The possible values are `DEFAULT` , `PER_BROKER` , and `PER_TOPIC_PER_BROKER` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring)
   */
  public fun enhancedMonitoring(): String? = unwrap(this).getEnhancedMonitoring()

  /**
   * The version of Apache Kafka.
   *
   * You can use Amazon MSK to create clusters that use Apache Kafka versions 1.1.1 and 2.2.1.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion)
   */
  public fun kafkaVersion(): String

  /**
   * Logging Info details.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
   */
  public fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

  /**
   * The number of broker nodes in the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes)
   */
  public fun numberOfBrokerNodes(): Number

  /**
   * The settings for open monitoring.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
   */
  public fun openMonitoring(): Any? = unwrap(this).getOpenMonitoring()

  /**
   * This controls storage mode for supported storage tiers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-storagemode)
   */
  public fun storageMode(): String? = unwrap(this).getStorageMode()

  /**
   * Create tags when creating the cluster.
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
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable)

    /**
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty)

    /**
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("204f829ea9396538d0e09bd0a89c725737b462f05c328c5e5180d1dccd1444eb")
    public
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty.Builder.() -> Unit)

    /**
     * @param clientAuthentication VPC connection control settings for brokers.
     */
    public fun clientAuthentication(clientAuthentication: IResolvable)

    /**
     * @param clientAuthentication VPC connection control settings for brokers.
     */
    public fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty)

    /**
     * @param clientAuthentication VPC connection control settings for brokers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f493431925d32fcc1eecfaeb56dee04b7880fe9fe2bafa8755ff181c7f566e84")
    public
        fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty.Builder.() -> Unit)

    /**
     * @param clusterName The name of the cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster.
     */
    public fun configurationInfo(configurationInfo: IResolvable)

    /**
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster.
     */
    public fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty)

    /**
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d11771e5b61f02f304d91070170187c21cd4797b41c6dc2bc2c4667f68aa376")
    public
        fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty.Builder.() -> Unit)

    /**
     * @param currentVersion The version of the cluster that you want to update.
     */
    public fun currentVersion(currentVersion: String)

    /**
     * @param encryptionInfo Includes all encryption-related information.
     */
    public fun encryptionInfo(encryptionInfo: IResolvable)

    /**
     * @param encryptionInfo Includes all encryption-related information.
     */
    public fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty)

    /**
     * @param encryptionInfo Includes all encryption-related information.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25465acbe89e8d7d87c968bd7b150bcb98e76ae89a1f15554f17c0363bdd6059")
    public fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty.Builder.() -> Unit)

    /**
     * @param enhancedMonitoring Specifies the level of monitoring for the MSK cluster.
     * The possible values are `DEFAULT` , `PER_BROKER` , and `PER_TOPIC_PER_BROKER` .
     */
    public fun enhancedMonitoring(enhancedMonitoring: String)

    /**
     * @param kafkaVersion The version of Apache Kafka. 
     * You can use Amazon MSK to create clusters that use Apache Kafka versions 1.1.1 and 2.2.1.
     */
    public fun kafkaVersion(kafkaVersion: String)

    /**
     * @param loggingInfo Logging Info details.
     */
    public fun loggingInfo(loggingInfo: IResolvable)

    /**
     * @param loggingInfo Logging Info details.
     */
    public fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty)

    /**
     * @param loggingInfo Logging Info details.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61a9726c7caf1c5bf39cf0cd83968a213f130c1d526b26022dccc622d106aa46")
    public fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty.Builder.() -> Unit)

    /**
     * @param numberOfBrokerNodes The number of broker nodes in the cluster. 
     */
    public fun numberOfBrokerNodes(numberOfBrokerNodes: Number)

    /**
     * @param openMonitoring The settings for open monitoring.
     */
    public fun openMonitoring(openMonitoring: IResolvable)

    /**
     * @param openMonitoring The settings for open monitoring.
     */
    public fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty)

    /**
     * @param openMonitoring The settings for open monitoring.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f684fbbe73fa03faab9edc8ca6debc3749e4a3a492b69540a099e0ee9d85152")
    public fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty.Builder.() -> Unit)

    /**
     * @param storageMode This controls storage mode for supported storage tiers.
     */
    public fun storageMode(storageMode: String)

    /**
     * @param tags Create tags when creating the cluster.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnClusterProps.Builder =
        software.amazon.awscdk.services.msk.CfnClusterProps.builder()

    /**
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    override fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(IResolvable::unwrap))
    }

    /**
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    override fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(CfnCluster.BrokerNodeGroupInfoProperty::unwrap))
    }

    /**
     * @param brokerNodeGroupInfo Information about the broker nodes in the cluster. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("204f829ea9396538d0e09bd0a89c725737b462f05c328c5e5180d1dccd1444eb")
    override
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty.Builder.() -> Unit):
        Unit = brokerNodeGroupInfo(CfnCluster.BrokerNodeGroupInfoProperty(brokerNodeGroupInfo))

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
        fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(CfnCluster.ClientAuthenticationProperty::unwrap))
    }

    /**
     * @param clientAuthentication VPC connection control settings for brokers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f493431925d32fcc1eecfaeb56dee04b7880fe9fe2bafa8755ff181c7f566e84")
    override
        fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty.Builder.() -> Unit):
        Unit = clientAuthentication(CfnCluster.ClientAuthenticationProperty(clientAuthentication))

    /**
     * @param clusterName The name of the cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster.
     */
    override fun configurationInfo(configurationInfo: IResolvable) {
      cdkBuilder.configurationInfo(configurationInfo.let(IResolvable::unwrap))
    }

    /**
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster.
     */
    override fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty) {
      cdkBuilder.configurationInfo(configurationInfo.let(CfnCluster.ConfigurationInfoProperty::unwrap))
    }

    /**
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     * cluster.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d11771e5b61f02f304d91070170187c21cd4797b41c6dc2bc2c4667f68aa376")
    override
        fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty.Builder.() -> Unit):
        Unit = configurationInfo(CfnCluster.ConfigurationInfoProperty(configurationInfo))

    /**
     * @param currentVersion The version of the cluster that you want to update.
     */
    override fun currentVersion(currentVersion: String) {
      cdkBuilder.currentVersion(currentVersion)
    }

    /**
     * @param encryptionInfo Includes all encryption-related information.
     */
    override fun encryptionInfo(encryptionInfo: IResolvable) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(IResolvable::unwrap))
    }

    /**
     * @param encryptionInfo Includes all encryption-related information.
     */
    override fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(CfnCluster.EncryptionInfoProperty::unwrap))
    }

    /**
     * @param encryptionInfo Includes all encryption-related information.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25465acbe89e8d7d87c968bd7b150bcb98e76ae89a1f15554f17c0363bdd6059")
    override
        fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty.Builder.() -> Unit):
        Unit = encryptionInfo(CfnCluster.EncryptionInfoProperty(encryptionInfo))

    /**
     * @param enhancedMonitoring Specifies the level of monitoring for the MSK cluster.
     * The possible values are `DEFAULT` , `PER_BROKER` , and `PER_TOPIC_PER_BROKER` .
     */
    override fun enhancedMonitoring(enhancedMonitoring: String) {
      cdkBuilder.enhancedMonitoring(enhancedMonitoring)
    }

    /**
     * @param kafkaVersion The version of Apache Kafka. 
     * You can use Amazon MSK to create clusters that use Apache Kafka versions 1.1.1 and 2.2.1.
     */
    override fun kafkaVersion(kafkaVersion: String) {
      cdkBuilder.kafkaVersion(kafkaVersion)
    }

    /**
     * @param loggingInfo Logging Info details.
     */
    override fun loggingInfo(loggingInfo: IResolvable) {
      cdkBuilder.loggingInfo(loggingInfo.let(IResolvable::unwrap))
    }

    /**
     * @param loggingInfo Logging Info details.
     */
    override fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty) {
      cdkBuilder.loggingInfo(loggingInfo.let(CfnCluster.LoggingInfoProperty::unwrap))
    }

    /**
     * @param loggingInfo Logging Info details.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61a9726c7caf1c5bf39cf0cd83968a213f130c1d526b26022dccc622d106aa46")
    override fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty.Builder.() -> Unit): Unit =
        loggingInfo(CfnCluster.LoggingInfoProperty(loggingInfo))

    /**
     * @param numberOfBrokerNodes The number of broker nodes in the cluster. 
     */
    override fun numberOfBrokerNodes(numberOfBrokerNodes: Number) {
      cdkBuilder.numberOfBrokerNodes(numberOfBrokerNodes)
    }

    /**
     * @param openMonitoring The settings for open monitoring.
     */
    override fun openMonitoring(openMonitoring: IResolvable) {
      cdkBuilder.openMonitoring(openMonitoring.let(IResolvable::unwrap))
    }

    /**
     * @param openMonitoring The settings for open monitoring.
     */
    override fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty) {
      cdkBuilder.openMonitoring(openMonitoring.let(CfnCluster.OpenMonitoringProperty::unwrap))
    }

    /**
     * @param openMonitoring The settings for open monitoring.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f684fbbe73fa03faab9edc8ca6debc3749e4a3a492b69540a099e0ee9d85152")
    override
        fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty.Builder.() -> Unit):
        Unit = openMonitoring(CfnCluster.OpenMonitoringProperty(openMonitoring))

    /**
     * @param storageMode This controls storage mode for supported storage tiers.
     */
    override fun storageMode(storageMode: String) {
      cdkBuilder.storageMode(storageMode)
    }

    /**
     * @param tags Create tags when creating the cluster.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.msk.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    /**
     * Information about the broker nodes in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-brokernodegroupinfo)
     */
    override fun brokerNodeGroupInfo(): Any = unwrap(this).getBrokerNodeGroupInfo()

    /**
     * VPC connection control settings for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clientauthentication)
     */
    override fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

    /**
     * The name of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername)
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * Represents the configuration that you want MSK to use for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-configurationinfo)
     */
    override fun configurationInfo(): Any? = unwrap(this).getConfigurationInfo()

    /**
     * The version of the cluster that you want to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-currentversion)
     */
    override fun currentVersion(): String? = unwrap(this).getCurrentVersion()

    /**
     * Includes all encryption-related information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-encryptioninfo)
     */
    override fun encryptionInfo(): Any? = unwrap(this).getEncryptionInfo()

    /**
     * Specifies the level of monitoring for the MSK cluster.
     *
     * The possible values are `DEFAULT` , `PER_BROKER` , and `PER_TOPIC_PER_BROKER` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring)
     */
    override fun enhancedMonitoring(): String? = unwrap(this).getEnhancedMonitoring()

    /**
     * The version of Apache Kafka.
     *
     * You can use Amazon MSK to create clusters that use Apache Kafka versions 1.1.1 and 2.2.1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion)
     */
    override fun kafkaVersion(): String = unwrap(this).getKafkaVersion()

    /**
     * Logging Info details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-logginginfo)
     */
    override fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

    /**
     * The number of broker nodes in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes)
     */
    override fun numberOfBrokerNodes(): Number = unwrap(this).getNumberOfBrokerNodes()

    /**
     * The settings for open monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-openmonitoring)
     */
    override fun openMonitoring(): Any? = unwrap(this).getOpenMonitoring()

    /**
     * This controls storage mode for supported storage tiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-storagemode)
     */
    override fun storageMode(): String? = unwrap(this).getStorageMode()

    /**
     * Create tags when creating the cluster.
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
        CfnClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.msk.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.msk.CfnClusterProps
  }
}
