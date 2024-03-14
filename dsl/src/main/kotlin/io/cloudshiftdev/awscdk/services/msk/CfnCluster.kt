package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.msk.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun brokerNodeGroupInfo(): Any = unwrap(this).getBrokerNodeGroupInfo()

  public open fun brokerNodeGroupInfo(`value`: IResolvable) {
    unwrap(this).setBrokerNodeGroupInfo(`value`.let(IResolvable::unwrap))
  }

  public open fun brokerNodeGroupInfo(`value`: BrokerNodeGroupInfoProperty) {
    unwrap(this).setBrokerNodeGroupInfo(`value`.let(BrokerNodeGroupInfoProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7e2e5f674f03566fe2694ac2bf0caa871b5f616c2a86cba3276740eb6d90f6c4")
  public open fun brokerNodeGroupInfo(`value`: BrokerNodeGroupInfoProperty.Builder.() -> Unit): Unit
      = brokerNodeGroupInfo(BrokerNodeGroupInfoProperty(`value`))

  public open fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

  public open fun clientAuthentication(`value`: IResolvable) {
    unwrap(this).setClientAuthentication(`value`.let(IResolvable::unwrap))
  }

  public open fun clientAuthentication(`value`: ClientAuthenticationProperty) {
    unwrap(this).setClientAuthentication(`value`.let(ClientAuthenticationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f2cb45484d4623c714814349ac98bb946f3b38ef448433a4148730a1b589e02")
  public open fun clientAuthentication(`value`: ClientAuthenticationProperty.Builder.() -> Unit):
      Unit = clientAuthentication(ClientAuthenticationProperty(`value`))

  public open fun clusterName(): String = unwrap(this).getClusterName()

  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  public open fun configurationInfo(): Any? = unwrap(this).getConfigurationInfo()

  public open fun configurationInfo(`value`: IResolvable) {
    unwrap(this).setConfigurationInfo(`value`.let(IResolvable::unwrap))
  }

  public open fun configurationInfo(`value`: ConfigurationInfoProperty) {
    unwrap(this).setConfigurationInfo(`value`.let(ConfigurationInfoProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b24b0584c9fe8c8550ea380a1376a99b68f67fd23a2c4c53ad10e9062d32a311")
  public open fun configurationInfo(`value`: ConfigurationInfoProperty.Builder.() -> Unit): Unit =
      configurationInfo(ConfigurationInfoProperty(`value`))

  public open fun currentVersion(): String? = unwrap(this).getCurrentVersion()

  public open fun currentVersion(`value`: String) {
    unwrap(this).setCurrentVersion(`value`)
  }

  public open fun encryptionInfo(): Any? = unwrap(this).getEncryptionInfo()

  public open fun encryptionInfo(`value`: IResolvable) {
    unwrap(this).setEncryptionInfo(`value`.let(IResolvable::unwrap))
  }

  public open fun encryptionInfo(`value`: EncryptionInfoProperty) {
    unwrap(this).setEncryptionInfo(`value`.let(EncryptionInfoProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35b70b0321fc20ff434b49d0362c682d8ab55b391d776935f57b7979a5afd93c")
  public open fun encryptionInfo(`value`: EncryptionInfoProperty.Builder.() -> Unit): Unit =
      encryptionInfo(EncryptionInfoProperty(`value`))

  public open fun enhancedMonitoring(): String? = unwrap(this).getEnhancedMonitoring()

  public open fun enhancedMonitoring(`value`: String) {
    unwrap(this).setEnhancedMonitoring(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kafkaVersion(): String = unwrap(this).getKafkaVersion()

  public open fun kafkaVersion(`value`: String) {
    unwrap(this).setKafkaVersion(`value`)
  }

  public open fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

  public open fun loggingInfo(`value`: IResolvable) {
    unwrap(this).setLoggingInfo(`value`.let(IResolvable::unwrap))
  }

  public open fun loggingInfo(`value`: LoggingInfoProperty) {
    unwrap(this).setLoggingInfo(`value`.let(LoggingInfoProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a40fee8e3a8755dbb891ff6119b045e98a9f230c7187de2508cf3a490a028b1d")
  public open fun loggingInfo(`value`: LoggingInfoProperty.Builder.() -> Unit): Unit =
      loggingInfo(LoggingInfoProperty(`value`))

  public open fun numberOfBrokerNodes(): Number = unwrap(this).getNumberOfBrokerNodes()

  public open fun numberOfBrokerNodes(`value`: Number) {
    unwrap(this).setNumberOfBrokerNodes(`value`)
  }

  public open fun openMonitoring(): Any? = unwrap(this).getOpenMonitoring()

  public open fun openMonitoring(`value`: IResolvable) {
    unwrap(this).setOpenMonitoring(`value`.let(IResolvable::unwrap))
  }

  public open fun openMonitoring(`value`: OpenMonitoringProperty) {
    unwrap(this).setOpenMonitoring(`value`.let(OpenMonitoringProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dcc34407947db21f9991c2defb5d60297c42573e7713e8671a7f8ab8236a98c1")
  public open fun openMonitoring(`value`: OpenMonitoringProperty.Builder.() -> Unit): Unit =
      openMonitoring(OpenMonitoringProperty(`value`))

  public open fun storageMode(): String? = unwrap(this).getStorageMode()

  public open fun storageMode(`value`: String) {
    unwrap(this).setStorageMode(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable) {
    }

    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61ad7de6319342519a3c1d5709ea2dd2cd0a7ca9f7ee3b5bb8f1e1d709ab7ec7")
    public
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty.Builder.() -> Unit) {
    }

    public fun clientAuthentication(clientAuthentication: IResolvable) {
    }

    public fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94990ea4553395f051fbe13922809ed1ab7a187bb46dc003a9cea5fcce16655a")
    public
        fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty.Builder.() -> Unit) {
    }

    public fun clusterName(clusterName: String) {
    }

    public fun configurationInfo(configurationInfo: IResolvable) {
    }

    public fun configurationInfo(configurationInfo: ConfigurationInfoProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03a15325d3f00abc56619850e839d374872995e53db76160e9cfd6a13842a014")
    public fun configurationInfo(configurationInfo: ConfigurationInfoProperty.Builder.() -> Unit) {
    }

    public fun currentVersion(currentVersion: String) {
    }

    public fun encryptionInfo(encryptionInfo: IResolvable) {
    }

    public fun encryptionInfo(encryptionInfo: EncryptionInfoProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3fdb09acff026972fdfc983e70307d7b654758bf6624a536e6fc64e6bd49810")
    public fun encryptionInfo(encryptionInfo: EncryptionInfoProperty.Builder.() -> Unit) {
    }

    public fun enhancedMonitoring(enhancedMonitoring: String) {
    }

    public fun kafkaVersion(kafkaVersion: String) {
    }

    public fun loggingInfo(loggingInfo: IResolvable) {
    }

    public fun loggingInfo(loggingInfo: LoggingInfoProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c5ffd2c1ffe53f697e777a19dc8afa8e9b2aae871e686ca438912c09b5ccff3")
    public fun loggingInfo(loggingInfo: LoggingInfoProperty.Builder.() -> Unit) {
    }

    public fun numberOfBrokerNodes(numberOfBrokerNodes: Number) {
    }

    public fun openMonitoring(openMonitoring: IResolvable) {
    }

    public fun openMonitoring(openMonitoring: OpenMonitoringProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfb8e468253cc86a8dbad997c1624bae69c363d28d7aeb6903324f1029add53e")
    public fun openMonitoring(openMonitoring: OpenMonitoringProperty.Builder.() -> Unit) {
    }

    public fun storageMode(storageMode: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.Builder =
        software.amazon.awscdk.services.msk.CfnCluster.Builder.create(scope, id)

    public override fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(IResolvable::unwrap))
    }

    public override fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty) {
      cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo.let(BrokerNodeGroupInfoProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61ad7de6319342519a3c1d5709ea2dd2cd0a7ca9f7ee3b5bb8f1e1d709ab7ec7")
    public override
        fun brokerNodeGroupInfo(brokerNodeGroupInfo: BrokerNodeGroupInfoProperty.Builder.() -> Unit):
        Unit = brokerNodeGroupInfo(BrokerNodeGroupInfoProperty(brokerNodeGroupInfo))

    public override fun clientAuthentication(clientAuthentication: IResolvable) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(IResolvable::unwrap))
    }

    public override fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(ClientAuthenticationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94990ea4553395f051fbe13922809ed1ab7a187bb46dc003a9cea5fcce16655a")
    public override
        fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty.Builder.() -> Unit):
        Unit = clientAuthentication(ClientAuthenticationProperty(clientAuthentication))

    public override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    public override fun configurationInfo(configurationInfo: IResolvable) {
      cdkBuilder.configurationInfo(configurationInfo.let(IResolvable::unwrap))
    }

    public override fun configurationInfo(configurationInfo: ConfigurationInfoProperty) {
      cdkBuilder.configurationInfo(configurationInfo.let(ConfigurationInfoProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03a15325d3f00abc56619850e839d374872995e53db76160e9cfd6a13842a014")
    public override
        fun configurationInfo(configurationInfo: ConfigurationInfoProperty.Builder.() -> Unit): Unit
        = configurationInfo(ConfigurationInfoProperty(configurationInfo))

    public override fun currentVersion(currentVersion: String) {
      cdkBuilder.currentVersion(currentVersion)
    }

    public override fun encryptionInfo(encryptionInfo: IResolvable) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(IResolvable::unwrap))
    }

    public override fun encryptionInfo(encryptionInfo: EncryptionInfoProperty) {
      cdkBuilder.encryptionInfo(encryptionInfo.let(EncryptionInfoProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3fdb09acff026972fdfc983e70307d7b654758bf6624a536e6fc64e6bd49810")
    public override fun encryptionInfo(encryptionInfo: EncryptionInfoProperty.Builder.() -> Unit):
        Unit = encryptionInfo(EncryptionInfoProperty(encryptionInfo))

    public override fun enhancedMonitoring(enhancedMonitoring: String) {
      cdkBuilder.enhancedMonitoring(enhancedMonitoring)
    }

    public override fun kafkaVersion(kafkaVersion: String) {
      cdkBuilder.kafkaVersion(kafkaVersion)
    }

    public override fun loggingInfo(loggingInfo: IResolvable) {
      cdkBuilder.loggingInfo(loggingInfo.let(IResolvable::unwrap))
    }

    public override fun loggingInfo(loggingInfo: LoggingInfoProperty) {
      cdkBuilder.loggingInfo(loggingInfo.let(LoggingInfoProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c5ffd2c1ffe53f697e777a19dc8afa8e9b2aae871e686ca438912c09b5ccff3")
    public override fun loggingInfo(loggingInfo: LoggingInfoProperty.Builder.() -> Unit): Unit =
        loggingInfo(LoggingInfoProperty(loggingInfo))

    public override fun numberOfBrokerNodes(numberOfBrokerNodes: Number) {
      cdkBuilder.numberOfBrokerNodes(numberOfBrokerNodes)
    }

    public override fun openMonitoring(openMonitoring: IResolvable) {
      cdkBuilder.openMonitoring(openMonitoring.let(IResolvable::unwrap))
    }

    public override fun openMonitoring(openMonitoring: OpenMonitoringProperty) {
      cdkBuilder.openMonitoring(openMonitoring.let(OpenMonitoringProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfb8e468253cc86a8dbad997c1624bae69c363d28d7aeb6903324f1029add53e")
    public override fun openMonitoring(openMonitoring: OpenMonitoringProperty.Builder.() -> Unit):
        Unit = openMonitoring(OpenMonitoringProperty(openMonitoring))

    public override fun storageMode(storageMode: String) {
      cdkBuilder.storageMode(storageMode)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

  public interface EncryptionInTransitProperty {
    public fun clientBroker(): String? = unwrap(this).getClientBroker()

    public fun inCluster(): Any? = unwrap(this).getInCluster()

    public interface Builder {
      public fun clientBroker(clientBroker: String) {
      }

      public fun inCluster(inCluster: Boolean) {
      }

      public fun inCluster(inCluster: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty.builder()

      public override fun clientBroker(clientBroker: String) {
        cdkBuilder.clientBroker(clientBroker)
      }

      public override fun inCluster(inCluster: Boolean) {
        cdkBuilder.inCluster(inCluster)
      }

      public override fun inCluster(inCluster: IResolvable) {
        cdkBuilder.inCluster(inCluster.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty,
    ) : EncryptionInTransitProperty {
      public override fun clientBroker(): String? = unwrap(this).getClientBroker()

      public override fun inCluster(): Any? = unwrap(this).getInCluster()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionInTransitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty):
          EncryptionInTransitProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionInTransitProperty):
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PublicAccessProperty {
    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty,
    ) : PublicAccessProperty {
      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PublicAccessProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty):
          PublicAccessProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicAccessProperty):
          software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LoggingInfoProperty {
    public fun brokerLogs(): Any

    public interface Builder {
      public fun brokerLogs(brokerLogs: IResolvable) {
      }

      public fun brokerLogs(brokerLogs: BrokerLogsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c29521d2378f142b0ba7241645e3c09b895ca33c68ee2f252e46c960056d932")
      public fun brokerLogs(brokerLogs: BrokerLogsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty.builder()

      public override fun brokerLogs(brokerLogs: IResolvable) {
        cdkBuilder.brokerLogs(brokerLogs.let(IResolvable::unwrap))
      }

      public override fun brokerLogs(brokerLogs: BrokerLogsProperty) {
        cdkBuilder.brokerLogs(brokerLogs.let(BrokerLogsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c29521d2378f142b0ba7241645e3c09b895ca33c68ee2f252e46c960056d932")
      public override fun brokerLogs(brokerLogs: BrokerLogsProperty.Builder.() -> Unit): Unit =
          brokerLogs(BrokerLogsProperty(brokerLogs))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty,
    ) : LoggingInfoProperty {
      public override fun brokerLogs(): Any = unwrap(this).getBrokerLogs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty):
          LoggingInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConnectivityProperty {
    public fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()

    public interface Builder {
      public fun clientAuthentication(clientAuthentication: IResolvable) {
      }

      public
          fun clientAuthentication(clientAuthentication: VpcConnectivityClientAuthenticationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6fb37dc85da8bc52baf39269baf079d2b693a15e8032e2f62783d18b6e6b7aa4")
      public
          fun clientAuthentication(clientAuthentication: VpcConnectivityClientAuthenticationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty.builder()

      public override fun clientAuthentication(clientAuthentication: IResolvable) {
        cdkBuilder.clientAuthentication(clientAuthentication.let(IResolvable::unwrap))
      }

      public override
          fun clientAuthentication(clientAuthentication: VpcConnectivityClientAuthenticationProperty) {
        cdkBuilder.clientAuthentication(clientAuthentication.let(VpcConnectivityClientAuthenticationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6fb37dc85da8bc52baf39269baf079d2b693a15e8032e2f62783d18b6e6b7aa4")
      public override
          fun clientAuthentication(clientAuthentication: VpcConnectivityClientAuthenticationProperty.Builder.() -> Unit):
          Unit =
          clientAuthentication(VpcConnectivityClientAuthenticationProperty(clientAuthentication))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty,
    ) : VpcConnectivityProperty {
      public override fun clientAuthentication(): Any? = unwrap(this).getClientAuthentication()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectivityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty):
          VpcConnectivityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivityProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConnectivityClientAuthenticationProperty {
    public fun sasl(): Any? = unwrap(this).getSasl()

    public fun tls(): Any? = unwrap(this).getTls()

    public interface Builder {
      public fun sasl(sasl: IResolvable) {
      }

      public fun sasl(sasl: VpcConnectivitySaslProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5387f17a62bf9d0b9b81a0d524d341a67df88146a1d7a9fe5c56eeed0489f35a")
      public fun sasl(sasl: VpcConnectivitySaslProperty.Builder.() -> Unit) {
      }

      public fun tls(tls: IResolvable) {
      }

      public fun tls(tls: VpcConnectivityTlsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec42fa21090bdeddd2087441fe661f6f7174abadd6cb22eb88506b050b7d6a49")
      public fun tls(tls: VpcConnectivityTlsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty.builder()

      public override fun sasl(sasl: IResolvable) {
        cdkBuilder.sasl(sasl.let(IResolvable::unwrap))
      }

      public override fun sasl(sasl: VpcConnectivitySaslProperty) {
        cdkBuilder.sasl(sasl.let(VpcConnectivitySaslProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5387f17a62bf9d0b9b81a0d524d341a67df88146a1d7a9fe5c56eeed0489f35a")
      public override fun sasl(sasl: VpcConnectivitySaslProperty.Builder.() -> Unit): Unit =
          sasl(VpcConnectivitySaslProperty(sasl))

      public override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable::unwrap))
      }

      public override fun tls(tls: VpcConnectivityTlsProperty) {
        cdkBuilder.tls(tls.let(VpcConnectivityTlsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec42fa21090bdeddd2087441fe661f6f7174abadd6cb22eb88506b050b7d6a49")
      public override fun tls(tls: VpcConnectivityTlsProperty.Builder.() -> Unit): Unit =
          tls(VpcConnectivityTlsProperty(tls))

      public fun build():
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty,
    ) : VpcConnectivityClientAuthenticationProperty {
      public override fun sasl(): Any? = unwrap(this).getSasl()

      public override fun tls(): Any? = unwrap(this).getTls()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VpcConnectivityClientAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty):
          VpcConnectivityClientAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivityClientAuthenticationProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityClientAuthenticationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IamProperty {
    public fun enabled(): Any

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.IamProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.IamProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.IamProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.IamProperty,
    ) : IamProperty {
      public override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IamProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.IamProperty):
          IamProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamProperty):
          software.amazon.awscdk.services.msk.CfnCluster.IamProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PrometheusProperty {
    public fun jmxExporter(): Any? = unwrap(this).getJmxExporter()

    public fun nodeExporter(): Any? = unwrap(this).getNodeExporter()

    public interface Builder {
      public fun jmxExporter(jmxExporter: IResolvable) {
      }

      public fun jmxExporter(jmxExporter: JmxExporterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c30b92803d3124701f31d0600afd646d59feb335c96fb4db5bfef705850dfa09")
      public fun jmxExporter(jmxExporter: JmxExporterProperty.Builder.() -> Unit) {
      }

      public fun nodeExporter(nodeExporter: IResolvable) {
      }

      public fun nodeExporter(nodeExporter: NodeExporterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4a041baf53642bd4142802093fd00a5c404a8200f91bc8d760ca5a660138ebc")
      public fun nodeExporter(nodeExporter: NodeExporterProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty.builder()

      public override fun jmxExporter(jmxExporter: IResolvable) {
        cdkBuilder.jmxExporter(jmxExporter.let(IResolvable::unwrap))
      }

      public override fun jmxExporter(jmxExporter: JmxExporterProperty) {
        cdkBuilder.jmxExporter(jmxExporter.let(JmxExporterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c30b92803d3124701f31d0600afd646d59feb335c96fb4db5bfef705850dfa09")
      public override fun jmxExporter(jmxExporter: JmxExporterProperty.Builder.() -> Unit): Unit =
          jmxExporter(JmxExporterProperty(jmxExporter))

      public override fun nodeExporter(nodeExporter: IResolvable) {
        cdkBuilder.nodeExporter(nodeExporter.let(IResolvable::unwrap))
      }

      public override fun nodeExporter(nodeExporter: NodeExporterProperty) {
        cdkBuilder.nodeExporter(nodeExporter.let(NodeExporterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4a041baf53642bd4142802093fd00a5c404a8200f91bc8d760ca5a660138ebc")
      public override fun nodeExporter(nodeExporter: NodeExporterProperty.Builder.() -> Unit): Unit
          = nodeExporter(NodeExporterProperty(nodeExporter))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty,
    ) : PrometheusProperty {
      public override fun jmxExporter(): Any? = unwrap(this).getJmxExporter()

      public override fun nodeExporter(): Any? = unwrap(this).getNodeExporter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrometheusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty):
          PrometheusProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrometheusProperty):
          software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConnectivityInfoProperty {
    public fun publicAccess(): Any? = unwrap(this).getPublicAccess()

    public fun vpcConnectivity(): Any? = unwrap(this).getVpcConnectivity()

    public interface Builder {
      public fun publicAccess(publicAccess: IResolvable) {
      }

      public fun publicAccess(publicAccess: PublicAccessProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a7888d4955b3315da4a19ed9554bec66f86fb723efe1814ec8149ab6ece268e")
      public fun publicAccess(publicAccess: PublicAccessProperty.Builder.() -> Unit) {
      }

      public fun vpcConnectivity(vpcConnectivity: IResolvable) {
      }

      public fun vpcConnectivity(vpcConnectivity: VpcConnectivityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ca41c7a838de77bd0fa0a604512e42a1b2e929eec389c095805c30bf57f92ae")
      public fun vpcConnectivity(vpcConnectivity: VpcConnectivityProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty.builder()

      public override fun publicAccess(publicAccess: IResolvable) {
        cdkBuilder.publicAccess(publicAccess.let(IResolvable::unwrap))
      }

      public override fun publicAccess(publicAccess: PublicAccessProperty) {
        cdkBuilder.publicAccess(publicAccess.let(PublicAccessProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a7888d4955b3315da4a19ed9554bec66f86fb723efe1814ec8149ab6ece268e")
      public override fun publicAccess(publicAccess: PublicAccessProperty.Builder.() -> Unit): Unit
          = publicAccess(PublicAccessProperty(publicAccess))

      public override fun vpcConnectivity(vpcConnectivity: IResolvable) {
        cdkBuilder.vpcConnectivity(vpcConnectivity.let(IResolvable::unwrap))
      }

      public override fun vpcConnectivity(vpcConnectivity: VpcConnectivityProperty) {
        cdkBuilder.vpcConnectivity(vpcConnectivity.let(VpcConnectivityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ca41c7a838de77bd0fa0a604512e42a1b2e929eec389c095805c30bf57f92ae")
      public override
          fun vpcConnectivity(vpcConnectivity: VpcConnectivityProperty.Builder.() -> Unit): Unit =
          vpcConnectivity(VpcConnectivityProperty(vpcConnectivity))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty,
    ) : ConnectivityInfoProperty {
      public override fun publicAccess(): Any? = unwrap(this).getPublicAccess()

      public override fun vpcConnectivity(): Any? = unwrap(this).getVpcConnectivity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectivityInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty):
          ConnectivityInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectivityInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EncryptionAtRestProperty {
    public fun dataVolumeKmsKeyId(): String

    public interface Builder {
      public fun dataVolumeKmsKeyId(dataVolumeKmsKeyId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty.builder()

      public override fun dataVolumeKmsKeyId(dataVolumeKmsKeyId: String) {
        cdkBuilder.dataVolumeKmsKeyId(dataVolumeKmsKeyId)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty,
    ) : EncryptionAtRestProperty {
      public override fun dataVolumeKmsKeyId(): String = unwrap(this).getDataVolumeKmsKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty):
          EncryptionAtRestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionAtRestProperty):
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EncryptionInfoProperty {
    public fun encryptionAtRest(): Any? = unwrap(this).getEncryptionAtRest()

    public fun encryptionInTransit(): Any? = unwrap(this).getEncryptionInTransit()

    public interface Builder {
      public fun encryptionAtRest(encryptionAtRest: IResolvable) {
      }

      public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0431872660d1897cf457bbc58733002e4b48ea325f74f75724c99e921f0e6e8")
      public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty.Builder.() -> Unit) {
      }

      public fun encryptionInTransit(encryptionInTransit: IResolvable) {
      }

      public fun encryptionInTransit(encryptionInTransit: EncryptionInTransitProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39a78f0d61fc52ce561187da89d622589f184acb6bbdb8065391a2ede2823020")
      public
          fun encryptionInTransit(encryptionInTransit: EncryptionInTransitProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty.builder()

      public override fun encryptionAtRest(encryptionAtRest: IResolvable) {
        cdkBuilder.encryptionAtRest(encryptionAtRest.let(IResolvable::unwrap))
      }

      public override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty) {
        cdkBuilder.encryptionAtRest(encryptionAtRest.let(EncryptionAtRestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0431872660d1897cf457bbc58733002e4b48ea325f74f75724c99e921f0e6e8")
      public override
          fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty.Builder.() -> Unit): Unit
          = encryptionAtRest(EncryptionAtRestProperty(encryptionAtRest))

      public override fun encryptionInTransit(encryptionInTransit: IResolvable) {
        cdkBuilder.encryptionInTransit(encryptionInTransit.let(IResolvable::unwrap))
      }

      public override fun encryptionInTransit(encryptionInTransit: EncryptionInTransitProperty) {
        cdkBuilder.encryptionInTransit(encryptionInTransit.let(EncryptionInTransitProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39a78f0d61fc52ce561187da89d622589f184acb6bbdb8065391a2ede2823020")
      public override
          fun encryptionInTransit(encryptionInTransit: EncryptionInTransitProperty.Builder.() -> Unit):
          Unit = encryptionInTransit(EncryptionInTransitProperty(encryptionInTransit))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty,
    ) : EncryptionInfoProperty {
      public override fun encryptionAtRest(): Any? = unwrap(this).getEncryptionAtRest()

      public override fun encryptionInTransit(): Any? = unwrap(this).getEncryptionInTransit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty):
          EncryptionInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OpenMonitoringProperty {
    public fun prometheus(): Any

    public interface Builder {
      public fun prometheus(prometheus: IResolvable) {
      }

      public fun prometheus(prometheus: PrometheusProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b1fd3217fbf6dea260ad8c5ca9624e05154513aa617f9ebd7e2383296dc1e1f")
      public fun prometheus(prometheus: PrometheusProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty.builder()

      public override fun prometheus(prometheus: IResolvable) {
        cdkBuilder.prometheus(prometheus.let(IResolvable::unwrap))
      }

      public override fun prometheus(prometheus: PrometheusProperty) {
        cdkBuilder.prometheus(prometheus.let(PrometheusProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b1fd3217fbf6dea260ad8c5ca9624e05154513aa617f9ebd7e2383296dc1e1f")
      public override fun prometheus(prometheus: PrometheusProperty.Builder.() -> Unit): Unit =
          prometheus(PrometheusProperty(prometheus))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty,
    ) : OpenMonitoringProperty {
      public override fun prometheus(): Any = unwrap(this).getPrometheus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OpenMonitoringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty):
          OpenMonitoringProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenMonitoringProperty):
          software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FirehoseProperty {
    public fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

    public fun enabled(): Any

    public interface Builder {
      public fun deliveryStream(deliveryStream: String) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty.builder()

      public override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty,
    ) : FirehoseProperty {
      public override fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

      public override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty):
          FirehoseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseProperty):
          software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConnectivitySaslProperty {
    public fun iam(): Any? = unwrap(this).getIam()

    public fun scram(): Any? = unwrap(this).getScram()

    public interface Builder {
      public fun iam(iam: IResolvable) {
      }

      public fun iam(iam: VpcConnectivityIamProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5621bce12a0e505b9c8d557d0b6ace9e313dc6cbaaa017252f34e9657f38c9e8")
      public fun iam(iam: VpcConnectivityIamProperty.Builder.() -> Unit) {
      }

      public fun scram(scram: IResolvable) {
      }

      public fun scram(scram: VpcConnectivityScramProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("088db7309cb5cf6c24524bd4671cd61da505e50c992b3b57f2ec71d1d5f94a90")
      public fun scram(scram: VpcConnectivityScramProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty.builder()

      public override fun iam(iam: IResolvable) {
        cdkBuilder.iam(iam.let(IResolvable::unwrap))
      }

      public override fun iam(iam: VpcConnectivityIamProperty) {
        cdkBuilder.iam(iam.let(VpcConnectivityIamProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5621bce12a0e505b9c8d557d0b6ace9e313dc6cbaaa017252f34e9657f38c9e8")
      public override fun iam(iam: VpcConnectivityIamProperty.Builder.() -> Unit): Unit =
          iam(VpcConnectivityIamProperty(iam))

      public override fun scram(scram: IResolvable) {
        cdkBuilder.scram(scram.let(IResolvable::unwrap))
      }

      public override fun scram(scram: VpcConnectivityScramProperty) {
        cdkBuilder.scram(scram.let(VpcConnectivityScramProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("088db7309cb5cf6c24524bd4671cd61da505e50c992b3b57f2ec71d1d5f94a90")
      public override fun scram(scram: VpcConnectivityScramProperty.Builder.() -> Unit): Unit =
          scram(VpcConnectivityScramProperty(scram))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty,
    ) : VpcConnectivitySaslProperty {
      public override fun iam(): Any? = unwrap(this).getIam()

      public override fun scram(): Any? = unwrap(this).getScram()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectivitySaslProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty):
          VpcConnectivitySaslProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivitySaslProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivitySaslProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CloudWatchLogsProperty {
    public fun enabled(): Any

    public fun logGroup(): String? = unwrap(this).getLogGroup()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun logGroup(logGroup: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty,
    ) : CloudWatchLogsProperty {
      public override fun enabled(): Any = unwrap(this).getEnabled()

      public override fun logGroup(): String? = unwrap(this).getLogGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty):
          CloudWatchLogsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsProperty):
          software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ProvisionedThroughputProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun volumeThroughput(): Number? = unwrap(this).getVolumeThroughput()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun volumeThroughput(volumeThroughput: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun volumeThroughput(volumeThroughput: Number) {
        cdkBuilder.volumeThroughput(volumeThroughput)
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty,
    ) : ProvisionedThroughputProperty {
      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun volumeThroughput(): Number? = unwrap(this).getVolumeThroughput()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedThroughputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty):
          ProvisionedThroughputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedThroughputProperty):
          software.amazon.awscdk.services.msk.CfnCluster.ProvisionedThroughputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ClientAuthenticationProperty {
    public fun sasl(): Any? = unwrap(this).getSasl()

    public fun tls(): Any? = unwrap(this).getTls()

    public fun unauthenticated(): Any? = unwrap(this).getUnauthenticated()

    public interface Builder {
      public fun sasl(sasl: IResolvable) {
      }

      public fun sasl(sasl: SaslProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("713c425e8307846c7f9d89f7971c7cab5fd866d3111c9ded45af6da17f6b2b36")
      public fun sasl(sasl: SaslProperty.Builder.() -> Unit) {
      }

      public fun tls(tls: IResolvable) {
      }

      public fun tls(tls: TlsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5404832d90b1ea5c7ea1ebc1ff6128e87f9402511c0cd0dc499441dd0a223dd0")
      public fun tls(tls: TlsProperty.Builder.() -> Unit) {
      }

      public fun unauthenticated(unauthenticated: IResolvable) {
      }

      public fun unauthenticated(unauthenticated: UnauthenticatedProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a919ef04e218ebd8fb3f81e42bd0dd313075ff02b066e0e3a1218a994857c38d")
      public fun unauthenticated(unauthenticated: UnauthenticatedProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty.builder()

      public override fun sasl(sasl: IResolvable) {
        cdkBuilder.sasl(sasl.let(IResolvable::unwrap))
      }

      public override fun sasl(sasl: SaslProperty) {
        cdkBuilder.sasl(sasl.let(SaslProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("713c425e8307846c7f9d89f7971c7cab5fd866d3111c9ded45af6da17f6b2b36")
      public override fun sasl(sasl: SaslProperty.Builder.() -> Unit): Unit =
          sasl(SaslProperty(sasl))

      public override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable::unwrap))
      }

      public override fun tls(tls: TlsProperty) {
        cdkBuilder.tls(tls.let(TlsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5404832d90b1ea5c7ea1ebc1ff6128e87f9402511c0cd0dc499441dd0a223dd0")
      public override fun tls(tls: TlsProperty.Builder.() -> Unit): Unit = tls(TlsProperty(tls))

      public override fun unauthenticated(unauthenticated: IResolvable) {
        cdkBuilder.unauthenticated(unauthenticated.let(IResolvable::unwrap))
      }

      public override fun unauthenticated(unauthenticated: UnauthenticatedProperty) {
        cdkBuilder.unauthenticated(unauthenticated.let(UnauthenticatedProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a919ef04e218ebd8fb3f81e42bd0dd313075ff02b066e0e3a1218a994857c38d")
      public override
          fun unauthenticated(unauthenticated: UnauthenticatedProperty.Builder.() -> Unit): Unit =
          unauthenticated(UnauthenticatedProperty(unauthenticated))

      public fun build():
          software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty,
    ) : ClientAuthenticationProperty {
      public override fun sasl(): Any? = unwrap(this).getSasl()

      public override fun tls(): Any? = unwrap(this).getTls()

      public override fun unauthenticated(): Any? = unwrap(this).getUnauthenticated()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClientAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty):
          ClientAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientAuthenticationProperty):
          software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NodeExporterProperty {
    public fun enabledInBroker(): Any

    public interface Builder {
      public fun enabledInBroker(enabledInBroker: Boolean) {
      }

      public fun enabledInBroker(enabledInBroker: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty.builder()

      public override fun enabledInBroker(enabledInBroker: Boolean) {
        cdkBuilder.enabledInBroker(enabledInBroker)
      }

      public override fun enabledInBroker(enabledInBroker: IResolvable) {
        cdkBuilder.enabledInBroker(enabledInBroker.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty,
    ) : NodeExporterProperty {
      public override fun enabledInBroker(): Any = unwrap(this).getEnabledInBroker()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NodeExporterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty):
          NodeExporterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeExporterProperty):
          software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConfigurationInfoProperty {
    public fun arn(): String

    public fun revision(): Number

    public interface Builder {
      public fun arn(arn: String) {
      }

      public fun revision(revision: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty,
    ) : ConfigurationInfoProperty {
      public override fun arn(): String = unwrap(this).getArn()

      public override fun revision(): Number = unwrap(this).getRevision()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty):
          ConfigurationInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TlsProperty {
    public fun certificateAuthorityArnList(): List<String> =
        unwrap(this).getCertificateAuthorityArnList() ?: emptyList()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun certificateAuthorityArnList(certificateAuthorityArnList: List<String>) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.TlsProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.TlsProperty.builder()

      public override fun certificateAuthorityArnList(certificateAuthorityArnList: List<String>) {
        cdkBuilder.certificateAuthorityArnList(certificateAuthorityArnList)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.TlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.TlsProperty,
    ) : TlsProperty {
      public override fun certificateAuthorityArnList(): List<String> =
          unwrap(this).getCertificateAuthorityArnList() ?: emptyList()

      public override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.TlsProperty):
          TlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsProperty):
          software.amazon.awscdk.services.msk.CfnCluster.TlsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EBSStorageInfoProperty {
    public fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    public interface Builder {
      public fun provisionedThroughput(provisionedThroughput: IResolvable) {
      }

      public fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("becd042847a0cda11c380a0be5e18fc2c67b234230e0f9a0119385cca50f9349")
      public
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit) {
      }

      public fun volumeSize(volumeSize: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty.builder()

      public override fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
      }

      public override
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(ProvisionedThroughputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("becd042847a0cda11c380a0be5e18fc2c67b234230e0f9a0119385cca50f9349")
      public override
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit):
          Unit = provisionedThroughput(ProvisionedThroughputProperty(provisionedThroughput))

      public override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty,
    ) : EBSStorageInfoProperty {
      public override fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

      public override fun volumeSize(): Number? = unwrap(this).getVolumeSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EBSStorageInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty):
          EBSStorageInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EBSStorageInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SaslProperty {
    public fun iam(): Any? = unwrap(this).getIam()

    public fun scram(): Any? = unwrap(this).getScram()

    public interface Builder {
      public fun iam(iam: IResolvable) {
      }

      public fun iam(iam: IamProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbf95f659e99557816579ce940d287daa47a8439569f98ce4b6d4ce0d04ab427")
      public fun iam(iam: IamProperty.Builder.() -> Unit) {
      }

      public fun scram(scram: IResolvable) {
      }

      public fun scram(scram: ScramProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12c4d4e4080061c1e1751882cb23f1a55dd61dc3aec40f44ddb5a1b221da548b")
      public fun scram(scram: ScramProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.SaslProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.SaslProperty.builder()

      public override fun iam(iam: IResolvable) {
        cdkBuilder.iam(iam.let(IResolvable::unwrap))
      }

      public override fun iam(iam: IamProperty) {
        cdkBuilder.iam(iam.let(IamProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbf95f659e99557816579ce940d287daa47a8439569f98ce4b6d4ce0d04ab427")
      public override fun iam(iam: IamProperty.Builder.() -> Unit): Unit = iam(IamProperty(iam))

      public override fun scram(scram: IResolvable) {
        cdkBuilder.scram(scram.let(IResolvable::unwrap))
      }

      public override fun scram(scram: ScramProperty) {
        cdkBuilder.scram(scram.let(ScramProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12c4d4e4080061c1e1751882cb23f1a55dd61dc3aec40f44ddb5a1b221da548b")
      public override fun scram(scram: ScramProperty.Builder.() -> Unit): Unit =
          scram(ScramProperty(scram))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.SaslProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.SaslProperty,
    ) : SaslProperty {
      public override fun iam(): Any? = unwrap(this).getIam()

      public override fun scram(): Any? = unwrap(this).getScram()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SaslProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.SaslProperty):
          SaslProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SaslProperty):
          software.amazon.awscdk.services.msk.CfnCluster.SaslProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConnectivityIamProperty {
    public fun enabled(): Any

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty,
    ) : VpcConnectivityIamProperty {
      public override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectivityIamProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty):
          VpcConnectivityIamProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivityIamProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityIamProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UnauthenticatedProperty {
    public fun enabled(): Any

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty,
    ) : UnauthenticatedProperty {
      public override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UnauthenticatedProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty):
          UnauthenticatedProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UnauthenticatedProperty):
          software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConnectivityTlsProperty {
    public fun enabled(): Any

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty,
    ) : VpcConnectivityTlsProperty {
      public override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectivityTlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty):
          VpcConnectivityTlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivityTlsProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityTlsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3Property {
    public fun bucket(): String? = unwrap(this).getBucket()

    public fun enabled(): Any

    public fun prefix(): String? = unwrap(this).getPrefix()

    public interface Builder {
      public fun bucket(bucket: String) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun prefix(prefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.S3Property.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.S3Property.builder()

      public override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.S3Property,
    ) : S3Property {
      public override fun bucket(): String? = unwrap(this).getBucket()

      public override fun enabled(): Any = unwrap(this).getEnabled()

      public override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.S3Property):
          S3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.msk.CfnCluster.S3Property = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BrokerNodeGroupInfoProperty {
    public fun brokerAzDistribution(): String? = unwrap(this).getBrokerAzDistribution()

    public fun clientSubnets(): List<String>

    public fun connectivityInfo(): Any? = unwrap(this).getConnectivityInfo()

    public fun instanceType(): String

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun storageInfo(): Any? = unwrap(this).getStorageInfo()

    public interface Builder {
      public fun brokerAzDistribution(brokerAzDistribution: String) {
      }

      public fun clientSubnets(clientSubnets: List<String>) {
      }

      public fun connectivityInfo(connectivityInfo: IResolvable) {
      }

      public fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70eb7530aacae09040edb4b6256d0549719e092e94edac49299c9e785aeddc62")
      public fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty.Builder.() -> Unit) {
      }

      public fun instanceType(instanceType: String) {
      }

      public fun securityGroups(securityGroups: List<String>) {
      }

      public fun storageInfo(storageInfo: IResolvable) {
      }

      public fun storageInfo(storageInfo: StorageInfoProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ad02fa94afddc6233268390a43d23a87a02529e8eb0720bc086f03e699c7e4b")
      public fun storageInfo(storageInfo: StorageInfoProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty.builder()

      public override fun brokerAzDistribution(brokerAzDistribution: String) {
        cdkBuilder.brokerAzDistribution(brokerAzDistribution)
      }

      public override fun clientSubnets(clientSubnets: List<String>) {
        cdkBuilder.clientSubnets(clientSubnets)
      }

      public override fun connectivityInfo(connectivityInfo: IResolvable) {
        cdkBuilder.connectivityInfo(connectivityInfo.let(IResolvable::unwrap))
      }

      public override fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty) {
        cdkBuilder.connectivityInfo(connectivityInfo.let(ConnectivityInfoProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70eb7530aacae09040edb4b6256d0549719e092e94edac49299c9e785aeddc62")
      public override
          fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty.Builder.() -> Unit): Unit
          = connectivityInfo(ConnectivityInfoProperty(connectivityInfo))

      public override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      public override fun storageInfo(storageInfo: IResolvable) {
        cdkBuilder.storageInfo(storageInfo.let(IResolvable::unwrap))
      }

      public override fun storageInfo(storageInfo: StorageInfoProperty) {
        cdkBuilder.storageInfo(storageInfo.let(StorageInfoProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ad02fa94afddc6233268390a43d23a87a02529e8eb0720bc086f03e699c7e4b")
      public override fun storageInfo(storageInfo: StorageInfoProperty.Builder.() -> Unit): Unit =
          storageInfo(StorageInfoProperty(storageInfo))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty,
    ) : BrokerNodeGroupInfoProperty {
      public override fun brokerAzDistribution(): String? = unwrap(this).getBrokerAzDistribution()

      public override fun clientSubnets(): List<String> = unwrap(this).getClientSubnets() ?:
          emptyList()

      public override fun connectivityInfo(): Any? = unwrap(this).getConnectivityInfo()

      public override fun instanceType(): String = unwrap(this).getInstanceType()

      public override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?:
          emptyList()

      public override fun storageInfo(): Any? = unwrap(this).getStorageInfo()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BrokerNodeGroupInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty):
          BrokerNodeGroupInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BrokerNodeGroupInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface JmxExporterProperty {
    public fun enabledInBroker(): Any

    public interface Builder {
      public fun enabledInBroker(enabledInBroker: Boolean) {
      }

      public fun enabledInBroker(enabledInBroker: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty.builder()

      public override fun enabledInBroker(enabledInBroker: Boolean) {
        cdkBuilder.enabledInBroker(enabledInBroker)
      }

      public override fun enabledInBroker(enabledInBroker: IResolvable) {
        cdkBuilder.enabledInBroker(enabledInBroker.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty,
    ) : JmxExporterProperty {
      public override fun enabledInBroker(): Any = unwrap(this).getEnabledInBroker()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JmxExporterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty):
          JmxExporterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JmxExporterProperty):
          software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BrokerLogsProperty {
    public fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

    public fun firehose(): Any? = unwrap(this).getFirehose()

    public fun s3(): Any? = unwrap(this).getS3()

    public interface Builder {
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
      }

      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00173fc901fc925154645a69e02e48c96b0e6dac33fb9043bebccb842ae75583")
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty.Builder.() -> Unit) {
      }

      public fun firehose(firehose: IResolvable) {
      }

      public fun firehose(firehose: FirehoseProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82c8164ccd7edc7f38961bf3b9efe2458c79026290d580bf7b2a72c33348744d")
      public fun firehose(firehose: FirehoseProperty.Builder.() -> Unit) {
      }

      public fun s3(s3: IResolvable) {
      }

      public fun s3(s3: S3Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a20013b1bb05fba1ee7c0fa50447d6a12e6e9abc5d45e51ff716e5a1c196cd9d")
      public fun s3(s3: S3Property.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty.builder()

      public override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable::unwrap))
      }

      public override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00173fc901fc925154645a69e02e48c96b0e6dac33fb9043bebccb842ae75583")
      public override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty.Builder.() -> Unit):
          Unit = cloudWatchLogs(CloudWatchLogsProperty(cloudWatchLogs))

      public override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      public override fun firehose(firehose: FirehoseProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82c8164ccd7edc7f38961bf3b9efe2458c79026290d580bf7b2a72c33348744d")
      public override fun firehose(firehose: FirehoseProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseProperty(firehose))

      public override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      public override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a20013b1bb05fba1ee7c0fa50447d6a12e6e9abc5d45e51ff716e5a1c196cd9d")
      public override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty,
    ) : BrokerLogsProperty {
      public override fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

      public override fun firehose(): Any? = unwrap(this).getFirehose()

      public override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BrokerLogsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty):
          BrokerLogsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BrokerLogsProperty):
          software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StorageInfoProperty {
    public fun ebsStorageInfo(): Any? = unwrap(this).getEbsStorageInfo()

    public interface Builder {
      public fun ebsStorageInfo(ebsStorageInfo: IResolvable) {
      }

      public fun ebsStorageInfo(ebsStorageInfo: EBSStorageInfoProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c96fc46257901e7b2884edaa78a13e0c177649c7d2f5b7f0f04366e35a31b3f")
      public fun ebsStorageInfo(ebsStorageInfo: EBSStorageInfoProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty.builder()

      public override fun ebsStorageInfo(ebsStorageInfo: IResolvable) {
        cdkBuilder.ebsStorageInfo(ebsStorageInfo.let(IResolvable::unwrap))
      }

      public override fun ebsStorageInfo(ebsStorageInfo: EBSStorageInfoProperty) {
        cdkBuilder.ebsStorageInfo(ebsStorageInfo.let(EBSStorageInfoProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c96fc46257901e7b2884edaa78a13e0c177649c7d2f5b7f0f04366e35a31b3f")
      public override fun ebsStorageInfo(ebsStorageInfo: EBSStorageInfoProperty.Builder.() -> Unit):
          Unit = ebsStorageInfo(EBSStorageInfoProperty(ebsStorageInfo))

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty,
    ) : StorageInfoProperty {
      public override fun ebsStorageInfo(): Any? = unwrap(this).getEbsStorageInfo()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StorageInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty):
          StorageInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageInfoProperty):
          software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScramProperty {
    public fun enabled(): Any

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.msk.CfnCluster.ScramProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.ScramProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnCluster.ScramProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ScramProperty,
    ) : ScramProperty {
      public override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScramProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.ScramProperty):
          ScramProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScramProperty):
          software.amazon.awscdk.services.msk.CfnCluster.ScramProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConnectivityScramProperty {
    public fun enabled(): Any

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty.Builder =
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty,
    ) : VpcConnectivityScramProperty {
      public override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectivityScramProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty):
          VpcConnectivityScramProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectivityScramProperty):
          software.amazon.awscdk.services.msk.CfnCluster.VpcConnectivityScramProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
