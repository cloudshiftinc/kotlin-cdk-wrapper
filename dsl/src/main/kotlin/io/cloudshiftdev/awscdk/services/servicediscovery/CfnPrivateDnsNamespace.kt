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

public open class CfnPrivateDnsNamespace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace,
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
  @JvmName("79c031c7cb2cc105f34838304bbfadaab7948c347b5e1d49e27b5a18a79caece")
  public open fun properties(`value`: PropertiesProperty.Builder.() -> Unit): Unit =
      properties(PropertiesProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpc(): String = unwrap(this).getVpc()

  public open fun vpc(`value`: String) {
    unwrap(this).setVpc(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun properties(properties: IResolvable)

    public fun properties(properties: PropertiesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37d20c5908b9330638c1b162884abd671700210e4f48f304bb16afce36f04f35")
    public fun properties(properties: PropertiesProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun vpc(vpc: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.Builder.create(scope,
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
    @JvmName("37d20c5908b9330638c1b162884abd671700210e4f48f304bb16afce36f04f35")
    override fun properties(properties: PropertiesProperty.Builder.() -> Unit): Unit =
        properties(PropertiesProperty(properties))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun vpc(vpc: String) {
      cdkBuilder.vpc(vpc)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPrivateDnsNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPrivateDnsNamespace(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace):
        CfnPrivateDnsNamespace = CfnPrivateDnsNamespace(cdkObject)

    internal fun unwrap(wrapped: CfnPrivateDnsNamespace):
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace = wrapped.cdkObject
  }

  public interface PropertiesProperty {
    public fun dnsProperties(): Any? = unwrap(this).getDnsProperties()

    public interface Builder {
      public fun dnsProperties(dnsProperties: IResolvable)

      public fun dnsProperties(dnsProperties: PrivateDnsPropertiesMutableProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44901fa38784f73d246bb8e19965e43c23ba275fb50754bc62f41212fa96f4ab")
      public
          fun dnsProperties(dnsProperties: PrivateDnsPropertiesMutableProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty.builder()

      override fun dnsProperties(dnsProperties: IResolvable) {
        cdkBuilder.dnsProperties(dnsProperties.let(IResolvable::unwrap))
      }

      override fun dnsProperties(dnsProperties: PrivateDnsPropertiesMutableProperty) {
        cdkBuilder.dnsProperties(dnsProperties.let(PrivateDnsPropertiesMutableProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44901fa38784f73d246bb8e19965e43c23ba275fb50754bc62f41212fa96f4ab")
      override
          fun dnsProperties(dnsProperties: PrivateDnsPropertiesMutableProperty.Builder.() -> Unit):
          Unit = dnsProperties(PrivateDnsPropertiesMutableProperty(dnsProperties))

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty):
          PropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertiesProperty):
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty
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
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty.builder()

      override fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty):
          SOAProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SOAProperty):
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrivateDnsPropertiesMutableProperty {
    public fun soa(): Any? = unwrap(this).getSoa()

    public interface Builder {
      public fun soa(soa: IResolvable)

      public fun soa(soa: SOAProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d750bfb0eabc2c39fac09cbee0c32f9de869433ccafea16034b465febe71fa30")
      public fun soa(soa: SOAProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty.builder()

      override fun soa(soa: IResolvable) {
        cdkBuilder.soa(soa.let(IResolvable::unwrap))
      }

      override fun soa(soa: SOAProperty) {
        cdkBuilder.soa(soa.let(SOAProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d750bfb0eabc2c39fac09cbee0c32f9de869433ccafea16034b465febe71fa30")
      override fun soa(soa: SOAProperty.Builder.() -> Unit): Unit = soa(SOAProperty(soa))

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty,
    ) : PrivateDnsPropertiesMutableProperty {
      override fun soa(): Any? = unwrap(this).getSoa()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateDnsPropertiesMutableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty):
          PrivateDnsPropertiesMutableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateDnsPropertiesMutableProperty):
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
