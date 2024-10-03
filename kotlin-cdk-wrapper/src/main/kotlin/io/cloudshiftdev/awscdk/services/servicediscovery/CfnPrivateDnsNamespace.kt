@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a private namespace based on DNS, which is visible only inside a specified Amazon VPC.
 *
 * The namespace defines your service naming scheme. For example, if you name your namespace
 * `example.com` and name your service `backend` , the resulting DNS name for the service is
 * `backend.example.com` . Service instances that are registered using a private DNS namespace can be
 * discovered using either a `DiscoverInstances` request or using DNS. For the current quota on the
 * number of namespaces that you can create using the same AWS account , see [AWS Cloud Map
 * quotas](https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html) in the *AWS Cloud Map
 * Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * CfnPrivateDnsNamespace cfnPrivateDnsNamespace = CfnPrivateDnsNamespace.Builder.create(this,
 * "MyCfnPrivateDnsNamespace")
 * .name("name")
 * .vpc("vpc")
 * // the properties below are optional
 * .description("description")
 * .properties(PropertiesProperty.builder()
 * .dnsProperties(PrivateDnsPropertiesMutableProperty.builder()
 * .soa(SOAProperty.builder()
 * .ttl(123)
 * .build())
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html)
 */
public open class CfnPrivateDnsNamespace(
  cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPrivateDnsNamespaceProps,
  ) :
      this(software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPrivateDnsNamespaceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPrivateDnsNamespaceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPrivateDnsNamespaceProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the private namespace.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
   */
  public open fun attrHostedZoneId(): String = unwrap(this).getAttrHostedZoneId()

  /**
   * The ID of the private namespace.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
   * Properties for the private DNS namespace.
   */
  public open fun properties(): Any? = unwrap(this).getProperties()

  /**
   * Properties for the private DNS namespace.
   */
  public open fun properties(`value`: IResolvable) {
    unwrap(this).setProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Properties for the private DNS namespace.
   */
  public open fun properties(`value`: PropertiesProperty) {
    unwrap(this).setProperties(`value`.let(PropertiesProperty.Companion::unwrap))
  }

  /**
   * Properties for the private DNS namespace.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79c031c7cb2cc105f34838304bbfadaab7948c347b5e1d49e27b5a18a79caece")
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags for the namespace.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the Amazon VPC that you want to associate the namespace with.
   */
  public open fun vpc(): String = unwrap(this).getVpc()

  /**
   * The ID of the Amazon VPC that you want to associate the namespace with.
   */
  public open fun vpc(`value`: String) {
    unwrap(this).setVpc(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.servicediscovery.CfnPrivateDnsNamespace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-description)
     * @param description A description for the namespace. 
     */
    public fun description(description: String)

    /**
     * The name that you want to assign to this namespace.
     *
     * When you create a private DNS namespace, AWS Cloud Map automatically creates an Amazon
     * Route 53 private hosted zone that has the same name as the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-name)
     * @param name The name that you want to assign to this namespace. 
     */
    public fun name(name: String)

    /**
     * Properties for the private DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-properties)
     * @param properties Properties for the private DNS namespace. 
     */
    public fun properties(properties: IResolvable)

    /**
     * Properties for the private DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-properties)
     * @param properties Properties for the private DNS namespace. 
     */
    public fun properties(properties: PropertiesProperty)

    /**
     * Properties for the private DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-properties)
     * @param properties Properties for the private DNS namespace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37d20c5908b9330638c1b162884abd671700210e4f48f304bb16afce36f04f35")
    public fun properties(properties: PropertiesProperty.Builder.() -> Unit)

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-tags)
     * @param tags The tags for the namespace. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the Amazon VPC that you want to associate the namespace with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-vpc)
     * @param vpc The ID of the Amazon VPC that you want to associate the namespace with. 
     */
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

    /**
     * A description for the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-description)
     * @param description A description for the namespace. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name that you want to assign to this namespace.
     *
     * When you create a private DNS namespace, AWS Cloud Map automatically creates an Amazon
     * Route 53 private hosted zone that has the same name as the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-name)
     * @param name The name that you want to assign to this namespace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Properties for the private DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-properties)
     * @param properties Properties for the private DNS namespace. 
     */
    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable.Companion::unwrap))
    }

    /**
     * Properties for the private DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-properties)
     * @param properties Properties for the private DNS namespace. 
     */
    override fun properties(properties: PropertiesProperty) {
      cdkBuilder.properties(properties.let(PropertiesProperty.Companion::unwrap))
    }

    /**
     * Properties for the private DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-properties)
     * @param properties Properties for the private DNS namespace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37d20c5908b9330638c1b162884abd671700210e4f48f304bb16afce36f04f35")
    override fun properties(properties: PropertiesProperty.Builder.() -> Unit): Unit =
        properties(PropertiesProperty(properties))

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-tags)
     * @param tags The tags for the namespace. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-tags)
     * @param tags The tags for the namespace. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the Amazon VPC that you want to associate the namespace with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-vpc)
     * @param vpc The ID of the Amazon VPC that you want to associate the namespace with. 
     */
    override fun vpc(vpc: String) {
      cdkBuilder.vpc(vpc)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.CFN_RESOURCE_TYPE_NAME

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
        as software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace
  }

  /**
   * DNS properties for the private DNS namespace.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
   * PrivateDnsPropertiesMutableProperty privateDnsPropertiesMutableProperty =
   * PrivateDnsPropertiesMutableProperty.builder()
   * .soa(SOAProperty.builder()
   * .ttl(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-privatednspropertiesmutable.html)
   */
  public interface PrivateDnsPropertiesMutableProperty {
    /**
     * Fields for the Start of Authority (SOA) record for the hosted zone for the private DNS
     * namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-privatednspropertiesmutable.html#cfn-servicediscovery-privatednsnamespace-privatednspropertiesmutable-soa)
     */
    public fun soa(): Any? = unwrap(this).getSoa()

    /**
     * A builder for [PrivateDnsPropertiesMutableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param soa Fields for the Start of Authority (SOA) record for the hosted zone for the
       * private DNS namespace.
       */
      public fun soa(soa: IResolvable)

      /**
       * @param soa Fields for the Start of Authority (SOA) record for the hosted zone for the
       * private DNS namespace.
       */
      public fun soa(soa: SOAProperty)

      /**
       * @param soa Fields for the Start of Authority (SOA) record for the hosted zone for the
       * private DNS namespace.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d750bfb0eabc2c39fac09cbee0c32f9de869433ccafea16034b465febe71fa30")
      public fun soa(soa: SOAProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty.builder()

      /**
       * @param soa Fields for the Start of Authority (SOA) record for the hosted zone for the
       * private DNS namespace.
       */
      override fun soa(soa: IResolvable) {
        cdkBuilder.soa(soa.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param soa Fields for the Start of Authority (SOA) record for the hosted zone for the
       * private DNS namespace.
       */
      override fun soa(soa: SOAProperty) {
        cdkBuilder.soa(soa.let(SOAProperty.Companion::unwrap))
      }

      /**
       * @param soa Fields for the Start of Authority (SOA) record for the hosted zone for the
       * private DNS namespace.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d750bfb0eabc2c39fac09cbee0c32f9de869433ccafea16034b465febe71fa30")
      override fun soa(soa: SOAProperty.Builder.() -> Unit): Unit = soa(SOAProperty(soa))

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty,
    ) : CdkObject(cdkObject),
        PrivateDnsPropertiesMutableProperty {
      /**
       * Fields for the Start of Authority (SOA) record for the hosted zone for the private DNS
       * namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-privatednspropertiesmutable.html#cfn-servicediscovery-privatednsnamespace-privatednspropertiesmutable-soa)
       */
      override fun soa(): Any? = unwrap(this).getSoa()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateDnsPropertiesMutableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty):
          PrivateDnsPropertiesMutableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PrivateDnsPropertiesMutableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateDnsPropertiesMutableProperty):
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty
    }
  }

  /**
   * Properties for the private DNS namespace.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
   * PropertiesProperty propertiesProperty = PropertiesProperty.builder()
   * .dnsProperties(PrivateDnsPropertiesMutableProperty.builder()
   * .soa(SOAProperty.builder()
   * .ttl(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-properties.html)
   */
  public interface PropertiesProperty {
    /**
     * DNS properties for the private DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-properties.html#cfn-servicediscovery-privatednsnamespace-properties-dnsproperties)
     */
    public fun dnsProperties(): Any? = unwrap(this).getDnsProperties()

    /**
     * A builder for [PropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dnsProperties DNS properties for the private DNS namespace.
       */
      public fun dnsProperties(dnsProperties: IResolvable)

      /**
       * @param dnsProperties DNS properties for the private DNS namespace.
       */
      public fun dnsProperties(dnsProperties: PrivateDnsPropertiesMutableProperty)

      /**
       * @param dnsProperties DNS properties for the private DNS namespace.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44901fa38784f73d246bb8e19965e43c23ba275fb50754bc62f41212fa96f4ab")
      public
          fun dnsProperties(dnsProperties: PrivateDnsPropertiesMutableProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty.builder()

      /**
       * @param dnsProperties DNS properties for the private DNS namespace.
       */
      override fun dnsProperties(dnsProperties: IResolvable) {
        cdkBuilder.dnsProperties(dnsProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dnsProperties DNS properties for the private DNS namespace.
       */
      override fun dnsProperties(dnsProperties: PrivateDnsPropertiesMutableProperty) {
        cdkBuilder.dnsProperties(dnsProperties.let(PrivateDnsPropertiesMutableProperty.Companion::unwrap))
      }

      /**
       * @param dnsProperties DNS properties for the private DNS namespace.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44901fa38784f73d246bb8e19965e43c23ba275fb50754bc62f41212fa96f4ab")
      override
          fun dnsProperties(dnsProperties: PrivateDnsPropertiesMutableProperty.Builder.() -> Unit):
          Unit = dnsProperties(PrivateDnsPropertiesMutableProperty(dnsProperties))

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty,
    ) : CdkObject(cdkObject),
        PropertiesProperty {
      /**
       * DNS properties for the private DNS namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-properties.html#cfn-servicediscovery-privatednsnamespace-properties-dnsproperties)
       */
      override fun dnsProperties(): Any? = unwrap(this).getDnsProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty):
          PropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as? PropertiesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertiesProperty):
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty
    }
  }

  /**
   * Start of Authority (SOA) properties for a public or private DNS namespace.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
   * SOAProperty sOAProperty = SOAProperty.builder()
   * .ttl(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-soa.html)
   */
  public interface SOAProperty {
    /**
     * The time to live (TTL) for purposes of negative caching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-soa.html#cfn-servicediscovery-privatednsnamespace-soa-ttl)
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
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty.builder()

      /**
       * @param ttl The time to live (TTL) for purposes of negative caching.
       */
      override fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty,
    ) : CdkObject(cdkObject),
        SOAProperty {
      /**
       * The time to live (TTL) for purposes of negative caching.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-soa.html#cfn-servicediscovery-privatednsnamespace-soa-ttl)
       */
      override fun ttl(): Number? = unwrap(this).getTtl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SOAProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty):
          SOAProperty = CdkObjectWrappers.wrap(cdkObject) as? SOAProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SOAProperty):
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty
    }
  }
}
