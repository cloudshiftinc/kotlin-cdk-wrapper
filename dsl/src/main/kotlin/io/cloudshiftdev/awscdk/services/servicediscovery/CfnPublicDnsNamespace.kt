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

public open class CfnPublicDnsNamespace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrHostedZoneId(): String = unwrap(this).getAttrHostedZoneId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun properties(): Any? = unwrap(this).getProperties()

  public open fun properties(`value`: IResolvable) {
    unwrap(this).setProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun properties(`value`: PropertiesProperty) {
    unwrap(this).setProperties(`value`.let(PropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9f10d90a6a8a424f9a52868c9a8528cb61930a2dd90cedacc9edb450fd0dd1c6")
  public open fun properties(`value`: PropertiesProperty.Builder.() -> Unit): Unit =
      properties(PropertiesProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun properties(properties: IResolvable)

    public fun properties(properties: PropertiesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec65c54f9f8faaa58126c9a09c8cc1d8e899fa1563d164d6f9e5bb2b1f0ac8b2")
    public fun properties(properties: PropertiesProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.Builder.create(scope,
        id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    override fun properties(properties: PropertiesProperty) {
      cdkBuilder.properties(properties.let(PropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec65c54f9f8faaa58126c9a09c8cc1d8e899fa1563d164d6f9e5bb2b1f0ac8b2")
    override fun properties(properties: PropertiesProperty.Builder.() -> Unit): Unit =
        properties(PropertiesProperty(properties))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPublicDnsNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPublicDnsNamespace(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace):
        CfnPublicDnsNamespace = CfnPublicDnsNamespace(cdkObject)

    internal fun unwrap(wrapped: CfnPublicDnsNamespace):
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace = wrapped.cdkObject
  }

  public interface PublicDnsPropertiesMutableProperty {
    public fun soa(): Any? = unwrap(this).getSoa()

    public interface Builder {
      public fun soa(soa: IResolvable)

      public fun soa(soa: SOAProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03c0db80c8d39476babdae6143d0dbe5590d56cafd6fd9ff6fe00a09291a2798")
      public fun soa(soa: SOAProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty.builder()

      override fun soa(soa: IResolvable) {
        cdkBuilder.soa(soa.let(IResolvable::unwrap))
      }

      override fun soa(soa: SOAProperty) {
        cdkBuilder.soa(soa.let(SOAProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03c0db80c8d39476babdae6143d0dbe5590d56cafd6fd9ff6fe00a09291a2798")
      override fun soa(soa: SOAProperty.Builder.() -> Unit): Unit = soa(SOAProperty(soa))

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty,
    ) : PublicDnsPropertiesMutableProperty {
      override fun soa(): Any? = unwrap(this).getSoa()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PublicDnsPropertiesMutableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty):
          PublicDnsPropertiesMutableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicDnsPropertiesMutableProperty):
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SOAProperty {
    public fun ttl(): Number? = unwrap(this).getTtl()

    public interface Builder {
      public fun ttl(ttl: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty.builder()

      override fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty,
    ) : SOAProperty {
      override fun ttl(): Number? = unwrap(this).getTtl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SOAProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty):
          SOAProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SOAProperty):
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PropertiesProperty {
    public fun dnsProperties(): Any? = unwrap(this).getDnsProperties()

    public interface Builder {
      public fun dnsProperties(dnsProperties: IResolvable)

      public fun dnsProperties(dnsProperties: PublicDnsPropertiesMutableProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24603897dd76d22da75f2f4b4a992f0dd56b12da7508ba55d2bf27269ca78942")
      public fun dnsProperties(dnsProperties: PublicDnsPropertiesMutableProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty.builder()

      override fun dnsProperties(dnsProperties: IResolvable) {
        cdkBuilder.dnsProperties(dnsProperties.let(IResolvable::unwrap))
      }

      override fun dnsProperties(dnsProperties: PublicDnsPropertiesMutableProperty) {
        cdkBuilder.dnsProperties(dnsProperties.let(PublicDnsPropertiesMutableProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24603897dd76d22da75f2f4b4a992f0dd56b12da7508ba55d2bf27269ca78942")
      override
          fun dnsProperties(dnsProperties: PublicDnsPropertiesMutableProperty.Builder.() -> Unit):
          Unit = dnsProperties(PublicDnsPropertiesMutableProperty(dnsProperties))

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty,
    ) : PropertiesProperty {
      override fun dnsProperties(): Any? = unwrap(this).getDnsProperties()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty):
          PropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertiesProperty):
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
