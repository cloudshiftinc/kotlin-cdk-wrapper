package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
  internal override val cdkObject:
      software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the public namespace.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
   */
  public open fun attrHostedZoneId(): String = unwrap(this).getAttrHostedZoneId()

  /**
   * The ID of the public namespace.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description for the namespace.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the namespace.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name that you want to assign to this namespace.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name that you want to assign to this namespace.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Properties for the public DNS namespace.
   */
  public open fun properties(): Any? = unwrap(this).getProperties()

  /**
   * Properties for the public DNS namespace.
   */
  public open fun properties(`value`: IResolvable) {
    unwrap(this).setProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * Properties for the public DNS namespace.
   */
  public open fun properties(`value`: PropertiesProperty) {
    unwrap(this).setProperties(`value`.let(PropertiesProperty::unwrap))
  }

  /**
   * Properties for the public DNS namespace.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9f10d90a6a8a424f9a52868c9a8528cb61930a2dd90cedacc9edb450fd0dd1c6")
  public open fun properties(`value`: PropertiesProperty.Builder.() -> Unit): Unit =
      properties(PropertiesProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the namespace.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the namespace.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the namespace.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.CfnPublicDnsNamespace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-description)
     * @param description A description for the namespace. 
     */
    public fun description(description: String)

    /**
     * The name that you want to assign to this namespace.
     *
     *
     * Do not include sensitive information in the name. The name is publicly available using DNS
     * queries.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-name)
     * @param name The name that you want to assign to this namespace. 
     */
    public fun name(name: String)

    /**
     * Properties for the public DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-properties)
     * @param properties Properties for the public DNS namespace. 
     */
    public fun properties(properties: IResolvable)

    /**
     * Properties for the public DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-properties)
     * @param properties Properties for the public DNS namespace. 
     */
    public fun properties(properties: PropertiesProperty)

    /**
     * Properties for the public DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-properties)
     * @param properties Properties for the public DNS namespace. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec65c54f9f8faaa58126c9a09c8cc1d8e899fa1563d164d6f9e5bb2b1f0ac8b2")
    public fun properties(properties: PropertiesProperty.Builder.() -> Unit)

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-tags)
     * @param tags The tags for the namespace. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-tags)
     * @param tags The tags for the namespace. 
     */
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

    /**
     * A description for the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-description)
     * @param description A description for the namespace. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name that you want to assign to this namespace.
     *
     *
     * Do not include sensitive information in the name. The name is publicly available using DNS
     * queries.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-name)
     * @param name The name that you want to assign to this namespace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Properties for the public DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-properties)
     * @param properties Properties for the public DNS namespace. 
     */
    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    /**
     * Properties for the public DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-properties)
     * @param properties Properties for the public DNS namespace. 
     */
    override fun properties(properties: PropertiesProperty) {
      cdkBuilder.properties(properties.let(PropertiesProperty::unwrap))
    }

    /**
     * Properties for the public DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-properties)
     * @param properties Properties for the public DNS namespace. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec65c54f9f8faaa58126c9a09c8cc1d8e899fa1563d164d6f9e5bb2b1f0ac8b2")
    override fun properties(properties: PropertiesProperty.Builder.() -> Unit): Unit =
        properties(PropertiesProperty(properties))

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-tags)
     * @param tags The tags for the namespace. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-tags)
     * @param tags The tags for the namespace. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.CFN_RESOURCE_TYPE_NAME

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
    /**
     * Start of Authority (SOA) record for the hosted zone for the public DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-publicdnspropertiesmutable.html#cfn-servicediscovery-publicdnsnamespace-publicdnspropertiesmutable-soa)
     */
    public fun soa(): Any? = unwrap(this).getSoa()

    /**
     * A builder for [PublicDnsPropertiesMutableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param soa Start of Authority (SOA) record for the hosted zone for the public DNS
       * namespace.
       */
      public fun soa(soa: IResolvable)

      /**
       * @param soa Start of Authority (SOA) record for the hosted zone for the public DNS
       * namespace.
       */
      public fun soa(soa: SOAProperty)

      /**
       * @param soa Start of Authority (SOA) record for the hosted zone for the public DNS
       * namespace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03c0db80c8d39476babdae6143d0dbe5590d56cafd6fd9ff6fe00a09291a2798")
      public fun soa(soa: SOAProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty.builder()

      /**
       * @param soa Start of Authority (SOA) record for the hosted zone for the public DNS
       * namespace.
       */
      override fun soa(soa: IResolvable) {
        cdkBuilder.soa(soa.let(IResolvable::unwrap))
      }

      /**
       * @param soa Start of Authority (SOA) record for the hosted zone for the public DNS
       * namespace.
       */
      override fun soa(soa: SOAProperty) {
        cdkBuilder.soa(soa.let(SOAProperty::unwrap))
      }

      /**
       * @param soa Start of Authority (SOA) record for the hosted zone for the public DNS
       * namespace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03c0db80c8d39476babdae6143d0dbe5590d56cafd6fd9ff6fe00a09291a2798")
      override fun soa(soa: SOAProperty.Builder.() -> Unit): Unit = soa(SOAProperty(soa))

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty,
    ) : CdkObject(cdkObject), PublicDnsPropertiesMutableProperty {
      /**
       * Start of Authority (SOA) record for the hosted zone for the public DNS namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-publicdnspropertiesmutable.html#cfn-servicediscovery-publicdnsnamespace-publicdnspropertiesmutable-soa)
       */
      override fun soa(): Any? = unwrap(this).getSoa()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty
    }
  }

  public interface SOAProperty {
    /**
     * The time to live (TTL) for purposes of negative caching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-soa.html#cfn-servicediscovery-publicdnsnamespace-soa-ttl)
     */
    public fun ttl(): Number? = unwrap(this).getTtl()

    /**
     * A builder for [SOAProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ttl The time to live (TTL) for purposes of negative caching.
       */
      public fun ttl(ttl: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty.builder()

      /**
       * @param ttl The time to live (TTL) for purposes of negative caching.
       */
      override fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty,
    ) : CdkObject(cdkObject), SOAProperty {
      /**
       * The time to live (TTL) for purposes of negative caching.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-soa.html#cfn-servicediscovery-publicdnsnamespace-soa-ttl)
       */
      override fun ttl(): Number? = unwrap(this).getTtl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SOAProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty):
          SOAProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SOAProperty):
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty
    }
  }

  public interface PropertiesProperty {
    /**
     * DNS properties for the public DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-properties.html#cfn-servicediscovery-publicdnsnamespace-properties-dnsproperties)
     */
    public fun dnsProperties(): Any? = unwrap(this).getDnsProperties()

    /**
     * A builder for [PropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dnsProperties DNS properties for the public DNS namespace.
       */
      public fun dnsProperties(dnsProperties: IResolvable)

      /**
       * @param dnsProperties DNS properties for the public DNS namespace.
       */
      public fun dnsProperties(dnsProperties: PublicDnsPropertiesMutableProperty)

      /**
       * @param dnsProperties DNS properties for the public DNS namespace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24603897dd76d22da75f2f4b4a992f0dd56b12da7508ba55d2bf27269ca78942")
      public fun dnsProperties(dnsProperties: PublicDnsPropertiesMutableProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty.builder()

      /**
       * @param dnsProperties DNS properties for the public DNS namespace.
       */
      override fun dnsProperties(dnsProperties: IResolvable) {
        cdkBuilder.dnsProperties(dnsProperties.let(IResolvable::unwrap))
      }

      /**
       * @param dnsProperties DNS properties for the public DNS namespace.
       */
      override fun dnsProperties(dnsProperties: PublicDnsPropertiesMutableProperty) {
        cdkBuilder.dnsProperties(dnsProperties.let(PublicDnsPropertiesMutableProperty::unwrap))
      }

      /**
       * @param dnsProperties DNS properties for the public DNS namespace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24603897dd76d22da75f2f4b4a992f0dd56b12da7508ba55d2bf27269ca78942")
      override
          fun dnsProperties(dnsProperties: PublicDnsPropertiesMutableProperty.Builder.() -> Unit):
          Unit = dnsProperties(PublicDnsPropertiesMutableProperty(dnsProperties))

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty,
    ) : CdkObject(cdkObject), PropertiesProperty {
      /**
       * DNS properties for the public DNS namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-properties.html#cfn-servicediscovery-publicdnsnamespace-properties-dnsproperties)
       */
      override fun dnsProperties(): Any? = unwrap(this).getDnsProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty):
          PropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertiesProperty):
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty
    }
  }
}
