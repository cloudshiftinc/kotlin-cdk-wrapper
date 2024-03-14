package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnService internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun dnsConfig(): Any? = unwrap(this).getDnsConfig()

  public open fun dnsConfig(`value`: IResolvable) {
    unwrap(this).setDnsConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun dnsConfig(`value`: DnsConfigProperty) {
    unwrap(this).setDnsConfig(`value`.let(DnsConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("18314d422d4a9654e04853b7932e775e25918085c7c8ce87b40e5df71164bd82")
  public open fun dnsConfig(`value`: DnsConfigProperty.Builder.() -> Unit): Unit =
      dnsConfig(DnsConfigProperty(`value`))

  public open fun healthCheckConfig(): Any? = unwrap(this).getHealthCheckConfig()

  public open fun healthCheckConfig(`value`: IResolvable) {
    unwrap(this).setHealthCheckConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun healthCheckConfig(`value`: HealthCheckConfigProperty) {
    unwrap(this).setHealthCheckConfig(`value`.let(HealthCheckConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b9f80b31b418a5edf6b039586791ef720c9c0e790cfbe487910c6472d9e81629")
  public open fun healthCheckConfig(`value`: HealthCheckConfigProperty.Builder.() -> Unit): Unit =
      healthCheckConfig(HealthCheckConfigProperty(`value`))

  public open fun healthCheckCustomConfig(): Any? = unwrap(this).getHealthCheckCustomConfig()

  public open fun healthCheckCustomConfig(`value`: IResolvable) {
    unwrap(this).setHealthCheckCustomConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun healthCheckCustomConfig(`value`: HealthCheckCustomConfigProperty) {
    unwrap(this).setHealthCheckCustomConfig(`value`.let(HealthCheckCustomConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd5ecf02a06f848a4c7b772a60bf2f9c860dd243a78b0ee5e77c6ec72f54362b")
  public open
      fun healthCheckCustomConfig(`value`: HealthCheckCustomConfigProperty.Builder.() -> Unit): Unit
      = healthCheckCustomConfig(HealthCheckCustomConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun namespaceId(): String? = unwrap(this).getNamespaceId()

  public open fun namespaceId(`value`: String) {
    unwrap(this).setNamespaceId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun dnsConfig(dnsConfig: IResolvable) {
    }

    public fun dnsConfig(dnsConfig: DnsConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f002efabd7962ee41501b0c21d1e615b899fe64a0ca2daa0e852ee50a84649fc")
    public fun dnsConfig(dnsConfig: DnsConfigProperty.Builder.() -> Unit) {
    }

    public fun healthCheckConfig(healthCheckConfig: IResolvable) {
    }

    public fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac2156a60e1455cc9620b2bd69d1ab3f2693489a2361975f1b938fe49bf58071")
    public fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty.Builder.() -> Unit) {
    }

    public fun healthCheckCustomConfig(healthCheckCustomConfig: IResolvable) {
    }

    public fun healthCheckCustomConfig(healthCheckCustomConfig: HealthCheckCustomConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f6de31d733a25e3ecf040986ecff0a18b4ad9a6ba8cbd452732d3e1e91b76ab")
    public
        fun healthCheckCustomConfig(healthCheckCustomConfig: HealthCheckCustomConfigProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun namespaceId(namespaceId: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun type(type: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.CfnService.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnService.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun dnsConfig(dnsConfig: IResolvable) {
      cdkBuilder.dnsConfig(dnsConfig.let(IResolvable::unwrap))
    }

    public override fun dnsConfig(dnsConfig: DnsConfigProperty) {
      cdkBuilder.dnsConfig(dnsConfig.let(DnsConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f002efabd7962ee41501b0c21d1e615b899fe64a0ca2daa0e852ee50a84649fc")
    public override fun dnsConfig(dnsConfig: DnsConfigProperty.Builder.() -> Unit): Unit =
        dnsConfig(DnsConfigProperty(dnsConfig))

    public override fun healthCheckConfig(healthCheckConfig: IResolvable) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(IResolvable::unwrap))
    }

    public override fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(HealthCheckConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac2156a60e1455cc9620b2bd69d1ab3f2693489a2361975f1b938fe49bf58071")
    public override
        fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty.Builder.() -> Unit): Unit
        = healthCheckConfig(HealthCheckConfigProperty(healthCheckConfig))

    public override fun healthCheckCustomConfig(healthCheckCustomConfig: IResolvable) {
      cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig.let(IResolvable::unwrap))
    }

    public override
        fun healthCheckCustomConfig(healthCheckCustomConfig: HealthCheckCustomConfigProperty) {
      cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig.let(HealthCheckCustomConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f6de31d733a25e3ecf040986ecff0a18b4ad9a6ba8cbd452732d3e1e91b76ab")
    public override
        fun healthCheckCustomConfig(healthCheckCustomConfig: HealthCheckCustomConfigProperty.Builder.() -> Unit):
        Unit = healthCheckCustomConfig(HealthCheckCustomConfigProperty(healthCheckCustomConfig))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun namespaceId(namespaceId: String) {
      cdkBuilder.namespaceId(namespaceId)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnService =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService):
        CfnService = CfnService(cdkObject)

    internal fun unwrap(wrapped: CfnService):
        software.amazon.awscdk.services.servicediscovery.CfnService = wrapped.cdkObject
  }

  public interface HealthCheckConfigProperty {
    public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    public fun resourcePath(): String? = unwrap(this).getResourcePath()

    public fun type(): String

    public interface Builder {
      public fun failureThreshold(failureThreshold: Number) {
      }

      public fun resourcePath(resourcePath: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty.builder()

      public override fun failureThreshold(failureThreshold: Number) {
        cdkBuilder.failureThreshold(failureThreshold)
      }

      public override fun resourcePath(resourcePath: String) {
        cdkBuilder.resourcePath(resourcePath)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty,
    ) : HealthCheckConfigProperty {
      public override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

      public override fun resourcePath(): String? = unwrap(this).getResourcePath()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty):
          HealthCheckConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckConfigProperty):
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DnsConfigProperty {
    public fun dnsRecords(): Any

    public fun namespaceId(): String? = unwrap(this).getNamespaceId()

    public fun routingPolicy(): String? = unwrap(this).getRoutingPolicy()

    public interface Builder {
      public fun dnsRecords(dnsRecords: IResolvable) {
      }

      public fun dnsRecords(dnsRecords: List<Any>) {
      }

      public fun namespaceId(namespaceId: String) {
      }

      public fun routingPolicy(routingPolicy: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty.Builder =
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty.builder()

      public override fun dnsRecords(dnsRecords: IResolvable) {
        cdkBuilder.dnsRecords(dnsRecords.let(IResolvable::unwrap))
      }

      public override fun dnsRecords(dnsRecords: List<Any>) {
        cdkBuilder.dnsRecords(dnsRecords)
      }

      public override fun namespaceId(namespaceId: String) {
        cdkBuilder.namespaceId(namespaceId)
      }

      public override fun routingPolicy(routingPolicy: String) {
        cdkBuilder.routingPolicy(routingPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty,
    ) : DnsConfigProperty {
      public override fun dnsRecords(): Any = unwrap(this).getDnsRecords()

      public override fun namespaceId(): String? = unwrap(this).getNamespaceId()

      public override fun routingPolicy(): String? = unwrap(this).getRoutingPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DnsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty):
          DnsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DnsConfigProperty):
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface HealthCheckCustomConfigProperty {
    public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    public interface Builder {
      public fun failureThreshold(failureThreshold: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty.builder()

      public override fun failureThreshold(failureThreshold: Number) {
        cdkBuilder.failureThreshold(failureThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty,
    ) : HealthCheckCustomConfigProperty {
      public override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckCustomConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty):
          HealthCheckCustomConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckCustomConfigProperty):
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DnsRecordProperty {
    public fun ttl(): Number

    public fun type(): String

    public interface Builder {
      public fun ttl(ttl: Number) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty.Builder =
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty.builder()

      public override fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty,
    ) : DnsRecordProperty {
      public override fun ttl(): Number = unwrap(this).getTtl()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DnsRecordProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty):
          DnsRecordProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DnsRecordProperty):
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
