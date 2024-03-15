@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kafkaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

public open class CfnConnector internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrConnectorArn(): String = unwrap(this).getAttrConnectorArn()

  public open fun capacity(): Any = unwrap(this).getCapacity()

  public open fun capacity(`value`: IResolvable) {
    unwrap(this).setCapacity(`value`.let(IResolvable::unwrap))
  }

  public open fun capacity(`value`: CapacityProperty) {
    unwrap(this).setCapacity(`value`.let(CapacityProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f7e37a8165fad58bd8ca4dadf760ea39c593867ba513098dc0a5b1b868bcda0e")
  public open fun capacity(`value`: CapacityProperty.Builder.() -> Unit): Unit =
      capacity(CapacityProperty(`value`))

  public open fun connectorConfiguration(): Any = unwrap(this).getConnectorConfiguration()

  public open fun connectorConfiguration(`value`: IResolvable) {
    unwrap(this).setConnectorConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun connectorConfiguration(`value`: Map<String, String>) {
    unwrap(this).setConnectorConfiguration(`value`)
  }

  public open fun connectorDescription(): String? = unwrap(this).getConnectorDescription()

  public open fun connectorDescription(`value`: String) {
    unwrap(this).setConnectorDescription(`value`)
  }

  public open fun connectorName(): String = unwrap(this).getConnectorName()

  public open fun connectorName(`value`: String) {
    unwrap(this).setConnectorName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kafkaCluster(): Any = unwrap(this).getKafkaCluster()

  public open fun kafkaCluster(`value`: IResolvable) {
    unwrap(this).setKafkaCluster(`value`.let(IResolvable::unwrap))
  }

  public open fun kafkaCluster(`value`: KafkaClusterProperty) {
    unwrap(this).setKafkaCluster(`value`.let(KafkaClusterProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c0e47e22de36a4f98192c47657ee6c8dd1b1f1de05174f172ee3a41e097a737")
  public open fun kafkaCluster(`value`: KafkaClusterProperty.Builder.() -> Unit): Unit =
      kafkaCluster(KafkaClusterProperty(`value`))

  public open fun kafkaClusterClientAuthentication(): Any =
      unwrap(this).getKafkaClusterClientAuthentication()

  public open fun kafkaClusterClientAuthentication(`value`: IResolvable) {
    unwrap(this).setKafkaClusterClientAuthentication(`value`.let(IResolvable::unwrap))
  }

  public open
      fun kafkaClusterClientAuthentication(`value`: KafkaClusterClientAuthenticationProperty) {
    unwrap(this).setKafkaClusterClientAuthentication(`value`.let(KafkaClusterClientAuthenticationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79f285b1768271cd3be075cb630d67e839424702cf6975ad35304c87853810be")
  public open
      fun kafkaClusterClientAuthentication(`value`: KafkaClusterClientAuthenticationProperty.Builder.() -> Unit):
      Unit = kafkaClusterClientAuthentication(KafkaClusterClientAuthenticationProperty(`value`))

  public open fun kafkaClusterEncryptionInTransit(): Any =
      unwrap(this).getKafkaClusterEncryptionInTransit()

  public open fun kafkaClusterEncryptionInTransit(`value`: IResolvable) {
    unwrap(this).setKafkaClusterEncryptionInTransit(`value`.let(IResolvable::unwrap))
  }

  public open
      fun kafkaClusterEncryptionInTransit(`value`: KafkaClusterEncryptionInTransitProperty) {
    unwrap(this).setKafkaClusterEncryptionInTransit(`value`.let(KafkaClusterEncryptionInTransitProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c2af4dc530628fa4bf04a3253299a8e6a7e8f88d647158f48e9e6ff39085da0f")
  public open
      fun kafkaClusterEncryptionInTransit(`value`: KafkaClusterEncryptionInTransitProperty.Builder.() -> Unit):
      Unit = kafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransitProperty(`value`))

  public open fun kafkaConnectVersion(): String = unwrap(this).getKafkaConnectVersion()

  public open fun kafkaConnectVersion(`value`: String) {
    unwrap(this).setKafkaConnectVersion(`value`)
  }

  public open fun logDelivery(): Any? = unwrap(this).getLogDelivery()

  public open fun logDelivery(`value`: IResolvable) {
    unwrap(this).setLogDelivery(`value`.let(IResolvable::unwrap))
  }

  public open fun logDelivery(`value`: LogDeliveryProperty) {
    unwrap(this).setLogDelivery(`value`.let(LogDeliveryProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ba8063ca6ae1282c0cc30eebc46c9f7dba7cf41362886298daadff631ddcba43")
  public open fun logDelivery(`value`: LogDeliveryProperty.Builder.() -> Unit): Unit =
      logDelivery(LogDeliveryProperty(`value`))

  public open fun plugins(): Any = unwrap(this).getPlugins()

  public open fun plugins(`value`: IResolvable) {
    unwrap(this).setPlugins(`value`.let(IResolvable::unwrap))
  }

  public open fun plugins(__idx_ac66f0: List<Any>) {
    unwrap(this).setPlugins(__idx_ac66f0)
  }

  public open fun plugins(vararg __idx_ac66f0: Any): Unit = plugins(__idx_ac66f0.toList())

  public open fun serviceExecutionRoleArn(): String = unwrap(this).getServiceExecutionRoleArn()

  public open fun serviceExecutionRoleArn(`value`: String) {
    unwrap(this).setServiceExecutionRoleArn(`value`)
  }

  public open fun workerConfiguration(): Any? = unwrap(this).getWorkerConfiguration()

  public open fun workerConfiguration(`value`: IResolvable) {
    unwrap(this).setWorkerConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun workerConfiguration(`value`: WorkerConfigurationProperty) {
    unwrap(this).setWorkerConfiguration(`value`.let(WorkerConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("14acaf9e89d56cd6383140fdebf7fa0f87dfbbd537fedc5b2a349c3141c89c27")
  public open fun workerConfiguration(`value`: WorkerConfigurationProperty.Builder.() -> Unit): Unit
      = workerConfiguration(WorkerConfigurationProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun capacity(capacity: IResolvable)

    public fun capacity(capacity: CapacityProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a28e3fe727ebac0ff0a0c39d565ebe0ca4f8d289a499b54b7ce74470c870616e")
    public fun capacity(capacity: CapacityProperty.Builder.() -> Unit)

    public fun connectorConfiguration(connectorConfiguration: IResolvable)

    public fun connectorConfiguration(connectorConfiguration: Map<String, String>)

    public fun connectorDescription(connectorDescription: String)

    public fun connectorName(connectorName: String)

    public fun kafkaCluster(kafkaCluster: IResolvable)

    public fun kafkaCluster(kafkaCluster: KafkaClusterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6dd773d181ed0aac254e294d037bc872f93ed1faa5933c0b07a1fbe36bab8323")
    public fun kafkaCluster(kafkaCluster: KafkaClusterProperty.Builder.() -> Unit)

    public fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: IResolvable)

    public
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: KafkaClusterClientAuthenticationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4386cc0e7a881c7a4d570341e558095b4cb16641d63304fb27cc11b2df26947c")
    public
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: KafkaClusterClientAuthenticationProperty.Builder.() -> Unit)

    public fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: IResolvable)

    public
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransitProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8474bab3c67b6e75611f207f74ca61ff26cd36b858d794c209bce165ff793796")
    public
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransitProperty.Builder.() -> Unit)

    public fun kafkaConnectVersion(kafkaConnectVersion: String)

    public fun logDelivery(logDelivery: IResolvable)

    public fun logDelivery(logDelivery: LogDeliveryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("438bb8f4ab1ca2fd3d0c88e2fcc1da1690c4f7d73960a884e35fc6a0f2bd182a")
    public fun logDelivery(logDelivery: LogDeliveryProperty.Builder.() -> Unit)

    public fun plugins(plugins: IResolvable)

    public fun plugins(plugins: List<Any>)

    public fun plugins(vararg plugins: Any)

    public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String)

    public fun workerConfiguration(workerConfiguration: IResolvable)

    public fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty)

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

    override fun capacity(capacity: IResolvable) {
      cdkBuilder.capacity(capacity.let(IResolvable::unwrap))
    }

    override fun capacity(capacity: CapacityProperty) {
      cdkBuilder.capacity(capacity.let(CapacityProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a28e3fe727ebac0ff0a0c39d565ebe0ca4f8d289a499b54b7ce74470c870616e")
    override fun capacity(capacity: CapacityProperty.Builder.() -> Unit): Unit =
        capacity(CapacityProperty(capacity))

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

    override fun kafkaCluster(kafkaCluster: KafkaClusterProperty) {
      cdkBuilder.kafkaCluster(kafkaCluster.let(KafkaClusterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6dd773d181ed0aac254e294d037bc872f93ed1faa5933c0b07a1fbe36bab8323")
    override fun kafkaCluster(kafkaCluster: KafkaClusterProperty.Builder.() -> Unit): Unit =
        kafkaCluster(KafkaClusterProperty(kafkaCluster))

    override fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: IResolvable) {
      cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication.let(IResolvable::unwrap))
    }

    override
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: KafkaClusterClientAuthenticationProperty) {
      cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication.let(KafkaClusterClientAuthenticationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4386cc0e7a881c7a4d570341e558095b4cb16641d63304fb27cc11b2df26947c")
    override
        fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: KafkaClusterClientAuthenticationProperty.Builder.() -> Unit):
        Unit =
        kafkaClusterClientAuthentication(KafkaClusterClientAuthenticationProperty(kafkaClusterClientAuthentication))

    override fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: IResolvable) {
      cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit.let(IResolvable::unwrap))
    }

    override
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransitProperty) {
      cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit.let(KafkaClusterEncryptionInTransitProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8474bab3c67b6e75611f207f74ca61ff26cd36b858d794c209bce165ff793796")
    override
        fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransitProperty.Builder.() -> Unit):
        Unit =
        kafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransitProperty(kafkaClusterEncryptionInTransit))

    override fun kafkaConnectVersion(kafkaConnectVersion: String) {
      cdkBuilder.kafkaConnectVersion(kafkaConnectVersion)
    }

    override fun logDelivery(logDelivery: IResolvable) {
      cdkBuilder.logDelivery(logDelivery.let(IResolvable::unwrap))
    }

    override fun logDelivery(logDelivery: LogDeliveryProperty) {
      cdkBuilder.logDelivery(logDelivery.let(LogDeliveryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("438bb8f4ab1ca2fd3d0c88e2fcc1da1690c4f7d73960a884e35fc6a0f2bd182a")
    override fun logDelivery(logDelivery: LogDeliveryProperty.Builder.() -> Unit): Unit =
        logDelivery(LogDeliveryProperty(logDelivery))

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

    override fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty) {
      cdkBuilder.workerConfiguration(workerConfiguration.let(WorkerConfigurationProperty::unwrap))
    }

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
        software.amazon.awscdk.services.kafkaconnect.CfnConnector = wrapped.cdkObject
  }

  public interface ApacheKafkaClusterProperty {
    public fun bootstrapServers(): String

    public fun vpc(): Any

    @CdkDslMarker
    public interface Builder {
      public fun bootstrapServers(bootstrapServers: String)

      public fun vpc(vpc: IResolvable)

      public fun vpc(vpc: VpcProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("602b2768e2d8a0ee2730ffc3a7f4675e941ffc462200b0277abcfb952548c75a")
      public fun vpc(vpc: VpcProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty.builder()

      override fun bootstrapServers(bootstrapServers: String) {
        cdkBuilder.bootstrapServers(bootstrapServers)
      }

      override fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
      }

      override fun vpc(vpc: VpcProperty) {
        cdkBuilder.vpc(vpc.let(VpcProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("602b2768e2d8a0ee2730ffc3a7f4675e941ffc462200b0277abcfb952548c75a")
      override fun vpc(vpc: VpcProperty.Builder.() -> Unit): Unit = vpc(VpcProperty(vpc))

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty,
    ) : CdkObject(cdkObject), ApacheKafkaClusterProperty {
      override fun bootstrapServers(): String = unwrap(this).getBootstrapServers()

      override fun vpc(): Any = unwrap(this).getVpc()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApacheKafkaClusterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty):
          ApacheKafkaClusterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApacheKafkaClusterProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ApacheKafkaClusterProperty
    }
  }

  public interface CloudWatchLogsLogDeliveryProperty {
    public fun enabled(): Any

    public fun logGroup(): String? = unwrap(this).getLogGroup()

    @CdkDslMarker
    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun logGroup(logGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsLogDeliveryProperty {
      override fun enabled(): Any = unwrap(this).getEnabled()

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
          CloudWatchLogsLogDeliveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsLogDeliveryProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CloudWatchLogsLogDeliveryProperty
    }
  }

  public interface S3LogDeliveryProperty {
    public fun bucket(): String? = unwrap(this).getBucket()

    public fun enabled(): Any

    public fun prefix(): String? = unwrap(this).getPrefix()

    @CdkDslMarker
    public interface Builder {
      public fun bucket(bucket: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty,
    ) : CdkObject(cdkObject), S3LogDeliveryProperty {
      override fun bucket(): String? = unwrap(this).getBucket()

      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty):
          S3LogDeliveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LogDeliveryProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.S3LogDeliveryProperty
    }
  }

  public interface KafkaClusterEncryptionInTransitProperty {
    public fun encryptionType(): String

    @CdkDslMarker
    public interface Builder {
      public fun encryptionType(encryptionType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty.builder()

      override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty,
    ) : CdkObject(cdkObject), KafkaClusterEncryptionInTransitProperty {
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
          KafkaClusterEncryptionInTransitProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaClusterEncryptionInTransitProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterEncryptionInTransitProperty
    }
  }

  public interface CapacityProperty {
    public fun autoScaling(): Any? = unwrap(this).getAutoScaling()

    public fun provisionedCapacity(): Any? = unwrap(this).getProvisionedCapacity()

    @CdkDslMarker
    public interface Builder {
      public fun autoScaling(autoScaling: IResolvable)

      public fun autoScaling(autoScaling: AutoScalingProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7a412176b38c29ebe46783b201a03503cbcb42a74b83bfee7be5fe0b678eb0e")
      public fun autoScaling(autoScaling: AutoScalingProperty.Builder.() -> Unit)

      public fun provisionedCapacity(provisionedCapacity: IResolvable)

      public fun provisionedCapacity(provisionedCapacity: ProvisionedCapacityProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fec1ae0c9c7d700bf06aac993e71e814c415279d482e34eb01cc0d31840896a")
      public
          fun provisionedCapacity(provisionedCapacity: ProvisionedCapacityProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty.builder()

      override fun autoScaling(autoScaling: IResolvable) {
        cdkBuilder.autoScaling(autoScaling.let(IResolvable::unwrap))
      }

      override fun autoScaling(autoScaling: AutoScalingProperty) {
        cdkBuilder.autoScaling(autoScaling.let(AutoScalingProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7a412176b38c29ebe46783b201a03503cbcb42a74b83bfee7be5fe0b678eb0e")
      override fun autoScaling(autoScaling: AutoScalingProperty.Builder.() -> Unit): Unit =
          autoScaling(AutoScalingProperty(autoScaling))

      override fun provisionedCapacity(provisionedCapacity: IResolvable) {
        cdkBuilder.provisionedCapacity(provisionedCapacity.let(IResolvable::unwrap))
      }

      override fun provisionedCapacity(provisionedCapacity: ProvisionedCapacityProperty) {
        cdkBuilder.provisionedCapacity(provisionedCapacity.let(ProvisionedCapacityProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fec1ae0c9c7d700bf06aac993e71e814c415279d482e34eb01cc0d31840896a")
      override
          fun provisionedCapacity(provisionedCapacity: ProvisionedCapacityProperty.Builder.() -> Unit):
          Unit = provisionedCapacity(ProvisionedCapacityProperty(provisionedCapacity))

      public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty,
    ) : CdkObject(cdkObject), CapacityProperty {
      override fun autoScaling(): Any? = unwrap(this).getAutoScaling()

      override fun provisionedCapacity(): Any? = unwrap(this).getProvisionedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapacityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty):
          CapacityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CapacityProperty
    }
  }

  public interface WorkerConfigurationProperty {
    public fun revision(): Number

    public fun workerConfigurationArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun revision(revision: Number)

      public fun workerConfigurationArn(workerConfigurationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty.builder()

      override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      override fun workerConfigurationArn(workerConfigurationArn: String) {
        cdkBuilder.workerConfigurationArn(workerConfigurationArn)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty,
    ) : CdkObject(cdkObject), WorkerConfigurationProperty {
      override fun revision(): Number = unwrap(this).getRevision()

      override fun workerConfigurationArn(): String = unwrap(this).getWorkerConfigurationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty):
          WorkerConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkerConfigurationProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerConfigurationProperty
    }
  }

  public interface VpcProperty {
    public fun securityGroups(): List<String>

    public fun subnets(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun securityGroups(securityGroups: List<String>)

      public fun securityGroups(vararg securityGroups: String)

      public fun subnets(subnets: List<String>)

      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty.builder()

      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty,
    ) : CdkObject(cdkObject), VpcProperty {
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty):
          VpcProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.VpcProperty
    }
  }

  public interface ScaleOutPolicyProperty {
    public fun cpuUtilizationPercentage(): Number

    @CdkDslMarker
    public interface Builder {
      public fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty.builder()

      override fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number) {
        cdkBuilder.cpuUtilizationPercentage(cpuUtilizationPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty,
    ) : CdkObject(cdkObject), ScaleOutPolicyProperty {
      override fun cpuUtilizationPercentage(): Number = unwrap(this).getCpuUtilizationPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScaleOutPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty):
          ScaleOutPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScaleOutPolicyProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleOutPolicyProperty
    }
  }

  public interface ScaleInPolicyProperty {
    public fun cpuUtilizationPercentage(): Number

    @CdkDslMarker
    public interface Builder {
      public fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty.builder()

      override fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number) {
        cdkBuilder.cpuUtilizationPercentage(cpuUtilizationPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty,
    ) : CdkObject(cdkObject), ScaleInPolicyProperty {
      override fun cpuUtilizationPercentage(): Number = unwrap(this).getCpuUtilizationPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScaleInPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty):
          ScaleInPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScaleInPolicyProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ScaleInPolicyProperty
    }
  }

  public interface ProvisionedCapacityProperty {
    public fun mcuCount(): Number? = unwrap(this).getMcuCount()

    public fun workerCount(): Number

    @CdkDslMarker
    public interface Builder {
      public fun mcuCount(mcuCount: Number)

      public fun workerCount(workerCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty.builder()

      override fun mcuCount(mcuCount: Number) {
        cdkBuilder.mcuCount(mcuCount)
      }

      override fun workerCount(workerCount: Number) {
        cdkBuilder.workerCount(workerCount)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty,
    ) : CdkObject(cdkObject), ProvisionedCapacityProperty {
      override fun mcuCount(): Number? = unwrap(this).getMcuCount()

      override fun workerCount(): Number = unwrap(this).getWorkerCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedCapacityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty):
          ProvisionedCapacityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedCapacityProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.ProvisionedCapacityProperty
    }
  }

  public interface CustomPluginProperty {
    public fun customPluginArn(): String

    public fun revision(): Number

    @CdkDslMarker
    public interface Builder {
      public fun customPluginArn(customPluginArn: String)

      public fun revision(revision: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty.builder()

      override fun customPluginArn(customPluginArn: String) {
        cdkBuilder.customPluginArn(customPluginArn)
      }

      override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty,
    ) : CdkObject(cdkObject), CustomPluginProperty {
      override fun customPluginArn(): String = unwrap(this).getCustomPluginArn()

      override fun revision(): Number = unwrap(this).getRevision()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomPluginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty):
          CustomPluginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPluginProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.CustomPluginProperty
    }
  }

  public interface FirehoseLogDeliveryProperty {
    public fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

    public fun enabled(): Any

    @CdkDslMarker
    public interface Builder {
      public fun deliveryStream(deliveryStream: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty.builder()

      override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty,
    ) : CdkObject(cdkObject), FirehoseLogDeliveryProperty {
      override fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseLogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty):
          FirehoseLogDeliveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseLogDeliveryProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.FirehoseLogDeliveryProperty
    }
  }

  public interface KafkaClusterClientAuthenticationProperty {
    public fun authenticationType(): String

    @CdkDslMarker
    public interface Builder {
      public fun authenticationType(authenticationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty.builder()

      override fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty,
    ) : CdkObject(cdkObject), KafkaClusterClientAuthenticationProperty {
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
          KafkaClusterClientAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaClusterClientAuthenticationProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterClientAuthenticationProperty
    }
  }

  public interface KafkaClusterProperty {
    public fun apacheKafkaCluster(): Any

    @CdkDslMarker
    public interface Builder {
      public fun apacheKafkaCluster(apacheKafkaCluster: IResolvable)

      public fun apacheKafkaCluster(apacheKafkaCluster: ApacheKafkaClusterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d733d131c117c3d594dc55c27b1ce3ba06a34359fe5f405a937694015bf92eda")
      public
          fun apacheKafkaCluster(apacheKafkaCluster: ApacheKafkaClusterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty.builder()

      override fun apacheKafkaCluster(apacheKafkaCluster: IResolvable) {
        cdkBuilder.apacheKafkaCluster(apacheKafkaCluster.let(IResolvable::unwrap))
      }

      override fun apacheKafkaCluster(apacheKafkaCluster: ApacheKafkaClusterProperty) {
        cdkBuilder.apacheKafkaCluster(apacheKafkaCluster.let(ApacheKafkaClusterProperty::unwrap))
      }

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
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty,
    ) : CdkObject(cdkObject), KafkaClusterProperty {
      override fun apacheKafkaCluster(): Any = unwrap(this).getApacheKafkaCluster()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaClusterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty):
          KafkaClusterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaClusterProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.KafkaClusterProperty
    }
  }

  public interface WorkerLogDeliveryProperty {
    public fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

    public fun firehose(): Any? = unwrap(this).getFirehose()

    public fun s3(): Any? = unwrap(this).getS3()

    @CdkDslMarker
    public interface Builder {
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable)

      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsLogDeliveryProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b34ed067daf3cee6b27e33033b603aa3c961ea9fe7de81813ea3812eddb8208")
      public
          fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsLogDeliveryProperty.Builder.() -> Unit)

      public fun firehose(firehose: IResolvable)

      public fun firehose(firehose: FirehoseLogDeliveryProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2116faf9d5c1f153da9b6f426df7784b11b55d98d47ba0945959d2465615a8af")
      public fun firehose(firehose: FirehoseLogDeliveryProperty.Builder.() -> Unit)

      public fun s3(s3: IResolvable)

      public fun s3(s3: S3LogDeliveryProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("833142e3bf8e8d5d48d244d2bbd4a8143694542994e5182c29c48d9a84385376")
      public fun s3(s3: S3LogDeliveryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty.builder()

      override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable::unwrap))
      }

      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsLogDeliveryProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogsLogDeliveryProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b34ed067daf3cee6b27e33033b603aa3c961ea9fe7de81813ea3812eddb8208")
      override
          fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsLogDeliveryProperty.Builder.() -> Unit):
          Unit = cloudWatchLogs(CloudWatchLogsLogDeliveryProperty(cloudWatchLogs))

      override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      override fun firehose(firehose: FirehoseLogDeliveryProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseLogDeliveryProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2116faf9d5c1f153da9b6f426df7784b11b55d98d47ba0945959d2465615a8af")
      override fun firehose(firehose: FirehoseLogDeliveryProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseLogDeliveryProperty(firehose))

      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      override fun s3(s3: S3LogDeliveryProperty) {
        cdkBuilder.s3(s3.let(S3LogDeliveryProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("833142e3bf8e8d5d48d244d2bbd4a8143694542994e5182c29c48d9a84385376")
      override fun s3(s3: S3LogDeliveryProperty.Builder.() -> Unit): Unit =
          s3(S3LogDeliveryProperty(s3))

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty,
    ) : CdkObject(cdkObject), WorkerLogDeliveryProperty {
      override fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

      override fun firehose(): Any? = unwrap(this).getFirehose()

      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkerLogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty):
          WorkerLogDeliveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkerLogDeliveryProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.WorkerLogDeliveryProperty
    }
  }

  public interface LogDeliveryProperty {
    public fun workerLogDelivery(): Any

    @CdkDslMarker
    public interface Builder {
      public fun workerLogDelivery(workerLogDelivery: IResolvable)

      public fun workerLogDelivery(workerLogDelivery: WorkerLogDeliveryProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a798e2587e298cbcf87002ac2e8daf944a99c15ed912f790fac86650d746959f")
      public fun workerLogDelivery(workerLogDelivery: WorkerLogDeliveryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty.builder()

      override fun workerLogDelivery(workerLogDelivery: IResolvable) {
        cdkBuilder.workerLogDelivery(workerLogDelivery.let(IResolvable::unwrap))
      }

      override fun workerLogDelivery(workerLogDelivery: WorkerLogDeliveryProperty) {
        cdkBuilder.workerLogDelivery(workerLogDelivery.let(WorkerLogDeliveryProperty::unwrap))
      }

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
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty,
    ) : CdkObject(cdkObject), LogDeliveryProperty {
      override fun workerLogDelivery(): Any = unwrap(this).getWorkerLogDelivery()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty):
          LogDeliveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDeliveryProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.LogDeliveryProperty
    }
  }

  public interface PluginProperty {
    public fun customPlugin(): Any

    @CdkDslMarker
    public interface Builder {
      public fun customPlugin(customPlugin: IResolvable)

      public fun customPlugin(customPlugin: CustomPluginProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e427c8ea1a5ed4344fd8f1dc9fe49f76a4bbb12bb04b172cb9cd064b3e2c082")
      public fun customPlugin(customPlugin: CustomPluginProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty.builder()

      override fun customPlugin(customPlugin: IResolvable) {
        cdkBuilder.customPlugin(customPlugin.let(IResolvable::unwrap))
      }

      override fun customPlugin(customPlugin: CustomPluginProperty) {
        cdkBuilder.customPlugin(customPlugin.let(CustomPluginProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e427c8ea1a5ed4344fd8f1dc9fe49f76a4bbb12bb04b172cb9cd064b3e2c082")
      override fun customPlugin(customPlugin: CustomPluginProperty.Builder.() -> Unit): Unit =
          customPlugin(CustomPluginProperty(customPlugin))

      public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty,
    ) : CdkObject(cdkObject), PluginProperty {
      override fun customPlugin(): Any = unwrap(this).getCustomPlugin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PluginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty):
          PluginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PluginProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.PluginProperty
    }
  }

  public interface AutoScalingProperty {
    public fun maxWorkerCount(): Number

    public fun mcuCount(): Number

    public fun minWorkerCount(): Number

    public fun scaleInPolicy(): Any

    public fun scaleOutPolicy(): Any

    @CdkDslMarker
    public interface Builder {
      public fun maxWorkerCount(maxWorkerCount: Number)

      public fun mcuCount(mcuCount: Number)

      public fun minWorkerCount(minWorkerCount: Number)

      public fun scaleInPolicy(scaleInPolicy: IResolvable)

      public fun scaleInPolicy(scaleInPolicy: ScaleInPolicyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("924a00c92bc533726be73cecf82968cb4d0833bcbd4018288d92d9c5250bc720")
      public fun scaleInPolicy(scaleInPolicy: ScaleInPolicyProperty.Builder.() -> Unit)

      public fun scaleOutPolicy(scaleOutPolicy: IResolvable)

      public fun scaleOutPolicy(scaleOutPolicy: ScaleOutPolicyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("758b465f5bd575830bc6a5bd3795c00ca401ed930331d39366b2312db08cbbf3")
      public fun scaleOutPolicy(scaleOutPolicy: ScaleOutPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty.builder()

      override fun maxWorkerCount(maxWorkerCount: Number) {
        cdkBuilder.maxWorkerCount(maxWorkerCount)
      }

      override fun mcuCount(mcuCount: Number) {
        cdkBuilder.mcuCount(mcuCount)
      }

      override fun minWorkerCount(minWorkerCount: Number) {
        cdkBuilder.minWorkerCount(minWorkerCount)
      }

      override fun scaleInPolicy(scaleInPolicy: IResolvable) {
        cdkBuilder.scaleInPolicy(scaleInPolicy.let(IResolvable::unwrap))
      }

      override fun scaleInPolicy(scaleInPolicy: ScaleInPolicyProperty) {
        cdkBuilder.scaleInPolicy(scaleInPolicy.let(ScaleInPolicyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("924a00c92bc533726be73cecf82968cb4d0833bcbd4018288d92d9c5250bc720")
      override fun scaleInPolicy(scaleInPolicy: ScaleInPolicyProperty.Builder.() -> Unit): Unit =
          scaleInPolicy(ScaleInPolicyProperty(scaleInPolicy))

      override fun scaleOutPolicy(scaleOutPolicy: IResolvable) {
        cdkBuilder.scaleOutPolicy(scaleOutPolicy.let(IResolvable::unwrap))
      }

      override fun scaleOutPolicy(scaleOutPolicy: ScaleOutPolicyProperty) {
        cdkBuilder.scaleOutPolicy(scaleOutPolicy.let(ScaleOutPolicyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("758b465f5bd575830bc6a5bd3795c00ca401ed930331d39366b2312db08cbbf3")
      override fun scaleOutPolicy(scaleOutPolicy: ScaleOutPolicyProperty.Builder.() -> Unit): Unit =
          scaleOutPolicy(ScaleOutPolicyProperty(scaleOutPolicy))

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty,
    ) : CdkObject(cdkObject), AutoScalingProperty {
      override fun maxWorkerCount(): Number = unwrap(this).getMaxWorkerCount()

      override fun mcuCount(): Number = unwrap(this).getMcuCount()

      override fun minWorkerCount(): Number = unwrap(this).getMinWorkerCount()

      override fun scaleInPolicy(): Any = unwrap(this).getScaleInPolicy()

      override fun scaleOutPolicy(): Any = unwrap(this).getScaleOutPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty):
          AutoScalingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnConnector.AutoScalingProperty
    }
  }
}
