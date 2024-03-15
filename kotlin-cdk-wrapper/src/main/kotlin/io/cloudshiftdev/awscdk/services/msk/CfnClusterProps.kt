@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnClusterProps {
  public fun brokerNodeGroupInfo(): Any

  public fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

  public fun clusterName(): String

  public fun configurationInfo(): Any? = unwrap(this).getConfigurationInfo()

  public fun currentVersion(): String? = unwrap(this).getCurrentVersion()

  public fun encryptionInfo(): Any? = unwrap(this).getEncryptionInfo()

  public fun enhancedMonitoring(): String? = unwrap(this).getEnhancedMonitoring()

  public fun kafkaVersion(): String

  public fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

  public fun numberOfBrokerNodes(): Number

  public fun openMonitoring(): Any? = unwrap(this).getOpenMonitoring()

  public fun storageMode(): String? = unwrap(this).getStorageMode()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable)

    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("204f829ea9396538d0e09bd0a89c725737b462f05c328c5e5180d1dccd1444eb")
    public
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty.Builder.() -> Unit)

    public fun clientAuthentication(clientAuthentication: IResolvable)

    public fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f493431925d32fcc1eecfaeb56dee04b7880fe9fe2bafa8755ff181c7f566e84")
    public
        fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty.Builder.() -> Unit)

    public fun clusterName(clusterName: String)

    public fun configurationInfo(configurationInfo: IResolvable)

    public fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d11771e5b61f02f304d91070170187c21cd4797b41c6dc2bc2c4667f68aa376")
    public
        fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty.Builder.() -> Unit)

    public fun currentVersion(currentVersion: String)

    public fun encryptionInfo(encryptionInfo: IResolvable)

    public fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25465acbe89e8d7d87c968bd7b150bcb98e76ae89a1f15554f17c0363bdd6059")
    public fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty.Builder.() -> Unit)

    public fun enhancedMonitoring(enhancedMonitoring: String)

    public fun kafkaVersion(kafkaVersion: String)

    public fun loggingInfo(loggingInfo: IResolvable)

    public fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61a9726c7caf1c5bf39cf0cd83968a213f130c1d526b26022dccc622d106aa46")
    public fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty.Builder.() -> Unit)

    public fun numberOfBrokerNodes(numberOfBrokerNodes: Number)

    public fun openMonitoring(openMonitoring: IResolvable)

    public fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f684fbbe73fa03faab9edc8ca6debc3749e4a3a492b69540a099e0ee9d85152")
    public fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty.Builder.() -> Unit)

    public fun storageMode(storageMode: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnClusterProps.Builder =
        software.amazon.awscdk.services.msk.CfnClusterProps.builder()

    override fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(IResolvable::unwrap))
    }

    override fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(CfnCluster.BrokerNodeGroupInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("204f829ea9396538d0e09bd0a89c725737b462f05c328c5e5180d1dccd1444eb")
    override
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty.Builder.() -> Unit):
        Unit = brokerNodeGroupInfo(CfnCluster.BrokerNodeGroupInfoProperty(brokerNodeGroupInfo))

    override fun clientAuthentication(clientAuthentication: IResolvable) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(IResolvable::unwrap))
    }

    override
        fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(CfnCluster.ClientAuthenticationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f493431925d32fcc1eecfaeb56dee04b7880fe9fe2bafa8755ff181c7f566e84")
    override
        fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty.Builder.() -> Unit):
        Unit = clientAuthentication(CfnCluster.ClientAuthenticationProperty(clientAuthentication))

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun configurationInfo(configurationInfo: IResolvable) {
      cdkBuilder.configurationInfo(configurationInfo.let(IResolvable::unwrap))
    }

    override fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty) {
      cdkBuilder.configurationInfo(configurationInfo.let(CfnCluster.ConfigurationInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d11771e5b61f02f304d91070170187c21cd4797b41c6dc2bc2c4667f68aa376")
    override
        fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty.Builder.() -> Unit):
        Unit = configurationInfo(CfnCluster.ConfigurationInfoProperty(configurationInfo))

    override fun currentVersion(currentVersion: String) {
      cdkBuilder.currentVersion(currentVersion)
    }

    override fun encryptionInfo(encryptionInfo: IResolvable) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(IResolvable::unwrap))
    }

    override fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(CfnCluster.EncryptionInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25465acbe89e8d7d87c968bd7b150bcb98e76ae89a1f15554f17c0363bdd6059")
    override
        fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty.Builder.() -> Unit):
        Unit = encryptionInfo(CfnCluster.EncryptionInfoProperty(encryptionInfo))

    override fun enhancedMonitoring(enhancedMonitoring: String) {
      cdkBuilder.enhancedMonitoring(enhancedMonitoring)
    }

    override fun kafkaVersion(kafkaVersion: String) {
      cdkBuilder.kafkaVersion(kafkaVersion)
    }

    override fun loggingInfo(loggingInfo: IResolvable) {
      cdkBuilder.loggingInfo(loggingInfo.let(IResolvable::unwrap))
    }

    override fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty) {
      cdkBuilder.loggingInfo(loggingInfo.let(CfnCluster.LoggingInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61a9726c7caf1c5bf39cf0cd83968a213f130c1d526b26022dccc622d106aa46")
    override fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty.Builder.() -> Unit): Unit =
        loggingInfo(CfnCluster.LoggingInfoProperty(loggingInfo))

    override fun numberOfBrokerNodes(numberOfBrokerNodes: Number) {
      cdkBuilder.numberOfBrokerNodes(numberOfBrokerNodes)
    }

    override fun openMonitoring(openMonitoring: IResolvable) {
      cdkBuilder.openMonitoring(openMonitoring.let(IResolvable::unwrap))
    }

    override fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty) {
      cdkBuilder.openMonitoring(openMonitoring.let(CfnCluster.OpenMonitoringProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f684fbbe73fa03faab9edc8ca6debc3749e4a3a492b69540a099e0ee9d85152")
    override
        fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty.Builder.() -> Unit):
        Unit = openMonitoring(CfnCluster.OpenMonitoringProperty(openMonitoring))

    override fun storageMode(storageMode: String) {
      cdkBuilder.storageMode(storageMode)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.msk.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    override fun brokerNodeGroupInfo(): Any = unwrap(this).getBrokerNodeGroupInfo()

    override fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun configurationInfo(): Any? = unwrap(this).getConfigurationInfo()

    override fun currentVersion(): String? = unwrap(this).getCurrentVersion()

    override fun encryptionInfo(): Any? = unwrap(this).getEncryptionInfo()

    override fun enhancedMonitoring(): String? = unwrap(this).getEnhancedMonitoring()

    override fun kafkaVersion(): String = unwrap(this).getKafkaVersion()

    override fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

    override fun numberOfBrokerNodes(): Number = unwrap(this).getNumberOfBrokerNodes()

    override fun openMonitoring(): Any? = unwrap(this).getOpenMonitoring()

    override fun storageMode(): String? = unwrap(this).getStorageMode()

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
