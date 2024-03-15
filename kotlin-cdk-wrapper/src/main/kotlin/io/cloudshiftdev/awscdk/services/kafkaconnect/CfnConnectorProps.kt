@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kafkaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnConnectorProps {
  public fun capacity(): Any

  public fun connectorConfiguration(): Any

  public fun connectorDescription(): String? = unwrap(this).getConnectorDescription()

  public fun connectorName(): String

  public fun kafkaCluster(): Any

  public fun kafkaClusterClientAuthentication(): Any

  public fun kafkaClusterEncryptionInTransit(): Any

  public fun kafkaConnectVersion(): String

  public fun logDelivery(): Any? = unwrap(this).getLogDelivery()

  public fun plugins(): Any

  public fun serviceExecutionRoleArn(): String

  public fun workerConfiguration(): Any? = unwrap(this).getWorkerConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun capacity(capacity: IResolvable)

    public fun capacity(capacity: CfnConnector.CapacityProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8b2479a80263b65c2fcbd5ce8331689fde62b2dfd36a9f48d5982e9851c2f03")
    public fun capacity(capacity: CfnConnector.CapacityProperty.Builder.() -> Unit)

    public fun connectorConfiguration(connectorConfiguration: IResolvable)

    public fun connectorConfiguration(connectorConfiguration: Map<String, String>)

    public fun connectorDescription(connectorDescription: String)

    public fun connectorName(connectorName: String)

    public fun kafkaCluster(kafkaCluster: IResolvable)

    public fun kafkaCluster(kafkaCluster: CfnConnector.KafkaClusterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdba5b4d307c8c1b332e87c30ea7c51e2986281f630f731826c9a2bd8b4f0f95")
    public fun kafkaCluster(kafkaCluster: CfnConnector.KafkaClusterProperty.Builder.() -> Unit)

    public fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: IResolvable)

    public
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: CfnConnector.KafkaClusterClientAuthenticationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea4a628ca5d52f12a25b0cf83ba2aab7d075d6ee72fbe7bcaf4b2dcef26da605")
    public
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: CfnConnector.KafkaClusterClientAuthenticationProperty.Builder.() -> Unit)

    public fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: IResolvable)

    public
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: CfnConnector.KafkaClusterEncryptionInTransitProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94067a03a06d3ea822ab00733e544d45cbf4661b94bf5c1cc044ea3465488449")
    public
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: CfnConnector.KafkaClusterEncryptionInTransitProperty.Builder.() -> Unit)

    public fun kafkaConnectVersion(kafkaConnectVersion: String)

    public fun logDelivery(logDelivery: IResolvable)

    public fun logDelivery(logDelivery: CfnConnector.LogDeliveryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd3b926248f58f68b73d7fbf57f6879c44df865b55422e3fff5e97429ff3ceb4")
    public fun logDelivery(logDelivery: CfnConnector.LogDeliveryProperty.Builder.() -> Unit)

    public fun plugins(plugins: IResolvable)

    public fun plugins(plugins: List<Any>)

    public fun plugins(vararg plugins: Any)

    public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String)

    public fun workerConfiguration(workerConfiguration: IResolvable)

    public fun workerConfiguration(workerConfiguration: CfnConnector.WorkerConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54796cd539cae1f3ff008337ebc187a07d7bd6236baa88aed258f060927167c9")
    public
        fun workerConfiguration(workerConfiguration: CfnConnector.WorkerConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps.Builder =
        software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps.builder()

    override fun capacity(capacity: IResolvable) {
      cdkBuilder.capacity(capacity.let(IResolvable::unwrap))
    }

    override fun capacity(capacity: CfnConnector.CapacityProperty) {
      cdkBuilder.capacity(capacity.let(CfnConnector.CapacityProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8b2479a80263b65c2fcbd5ce8331689fde62b2dfd36a9f48d5982e9851c2f03")
    override fun capacity(capacity: CfnConnector.CapacityProperty.Builder.() -> Unit): Unit =
        capacity(CfnConnector.CapacityProperty(capacity))

    override fun connectorConfiguration(connectorConfiguration: IResolvable) {
      cdkBuilder.connectorConfiguration(connectorConfiguration.let(IResolvable::unwrap))
    }

    override fun connectorConfiguration(connectorConfiguration: Map<String, String>) {
      cdkBuilder.connectorConfiguration(connectorConfiguration)
    }

    override fun connectorDescription(connectorDescription: String) {
      cdkBuilder.connectorDescription(connectorDescription)
    }

    override fun connectorName(connectorName: String) {
      cdkBuilder.connectorName(connectorName)
    }

    override fun kafkaCluster(kafkaCluster: IResolvable) {
      cdkBuilder.kafkaCluster(kafkaCluster.let(IResolvable::unwrap))
    }

    override fun kafkaCluster(kafkaCluster: CfnConnector.KafkaClusterProperty) {
      cdkBuilder.kafkaCluster(kafkaCluster.let(CfnConnector.KafkaClusterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdba5b4d307c8c1b332e87c30ea7c51e2986281f630f731826c9a2bd8b4f0f95")
    override fun kafkaCluster(kafkaCluster: CfnConnector.KafkaClusterProperty.Builder.() -> Unit):
        Unit = kafkaCluster(CfnConnector.KafkaClusterProperty(kafkaCluster))

    override fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: IResolvable) {
      cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication.let(IResolvable::unwrap))
    }

    override
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: CfnConnector.KafkaClusterClientAuthenticationProperty) {
      cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication.let(CfnConnector.KafkaClusterClientAuthenticationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea4a628ca5d52f12a25b0cf83ba2aab7d075d6ee72fbe7bcaf4b2dcef26da605")
    override
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: CfnConnector.KafkaClusterClientAuthenticationProperty.Builder.() -> Unit):
        Unit =
        kafkaClusterClientAuthentication(CfnConnector.KafkaClusterClientAuthenticationProperty(kafkaClusterClientAuthentication))

    override fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: IResolvable) {
      cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit.let(IResolvable::unwrap))
    }

    override
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: CfnConnector.KafkaClusterEncryptionInTransitProperty) {
      cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit.let(CfnConnector.KafkaClusterEncryptionInTransitProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94067a03a06d3ea822ab00733e544d45cbf4661b94bf5c1cc044ea3465488449")
    override
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: CfnConnector.KafkaClusterEncryptionInTransitProperty.Builder.() -> Unit):
        Unit =
        kafkaClusterEncryptionInTransit(CfnConnector.KafkaClusterEncryptionInTransitProperty(kafkaClusterEncryptionInTransit))

    override fun kafkaConnectVersion(kafkaConnectVersion: String) {
      cdkBuilder.kafkaConnectVersion(kafkaConnectVersion)
    }

    override fun logDelivery(logDelivery: IResolvable) {
      cdkBuilder.logDelivery(logDelivery.let(IResolvable::unwrap))
    }

    override fun logDelivery(logDelivery: CfnConnector.LogDeliveryProperty) {
      cdkBuilder.logDelivery(logDelivery.let(CfnConnector.LogDeliveryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd3b926248f58f68b73d7fbf57f6879c44df865b55422e3fff5e97429ff3ceb4")
    override fun logDelivery(logDelivery: CfnConnector.LogDeliveryProperty.Builder.() -> Unit): Unit
        = logDelivery(CfnConnector.LogDeliveryProperty(logDelivery))

    override fun plugins(plugins: IResolvable) {
      cdkBuilder.plugins(plugins.let(IResolvable::unwrap))
    }

    override fun plugins(plugins: List<Any>) {
      cdkBuilder.plugins(plugins)
    }

    override fun plugins(vararg plugins: Any): Unit = plugins(plugins.toList())

    override fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
      cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
    }

    override fun workerConfiguration(workerConfiguration: IResolvable) {
      cdkBuilder.workerConfiguration(workerConfiguration.let(IResolvable::unwrap))
    }

    override
        fun workerConfiguration(workerConfiguration: CfnConnector.WorkerConfigurationProperty) {
      cdkBuilder.workerConfiguration(workerConfiguration.let(CfnConnector.WorkerConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54796cd539cae1f3ff008337ebc187a07d7bd6236baa88aed258f060927167c9")
    override
        fun workerConfiguration(workerConfiguration: CfnConnector.WorkerConfigurationProperty.Builder.() -> Unit):
        Unit = workerConfiguration(CfnConnector.WorkerConfigurationProperty(workerConfiguration))

    public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps,
  ) : CdkObject(cdkObject), CfnConnectorProps {
    override fun capacity(): Any = unwrap(this).getCapacity()

    override fun connectorConfiguration(): Any = unwrap(this).getConnectorConfiguration()

    override fun connectorDescription(): String? = unwrap(this).getConnectorDescription()

    override fun connectorName(): String = unwrap(this).getConnectorName()

    override fun kafkaCluster(): Any = unwrap(this).getKafkaCluster()

    override fun kafkaClusterClientAuthentication(): Any =
        unwrap(this).getKafkaClusterClientAuthentication()

    override fun kafkaClusterEncryptionInTransit(): Any =
        unwrap(this).getKafkaClusterEncryptionInTransit()

    override fun kafkaConnectVersion(): String = unwrap(this).getKafkaConnectVersion()

    override fun logDelivery(): Any? = unwrap(this).getLogDelivery()

    override fun plugins(): Any = unwrap(this).getPlugins()

    override fun serviceExecutionRoleArn(): String = unwrap(this).getServiceExecutionRoleArn()

    override fun workerConfiguration(): Any? = unwrap(this).getWorkerConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps):
        CfnConnectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProps):
        software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps
  }
}
