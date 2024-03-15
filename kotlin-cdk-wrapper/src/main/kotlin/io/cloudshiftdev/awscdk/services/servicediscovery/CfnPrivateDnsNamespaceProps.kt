@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPrivateDnsNamespace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * CfnPrivateDnsNamespaceProps cfnPrivateDnsNamespaceProps = CfnPrivateDnsNamespaceProps.builder()
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
public interface CfnPrivateDnsNamespaceProps {
  /**
   * A description for the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name that you want to assign to this namespace.
   *
   * When you create a private DNS namespace, AWS Cloud Map automatically creates an Amazon Route 53
   * private hosted zone that has the same name as the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-name)
   */
  public fun name(): String

  /**
   * Properties for the private DNS namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-properties)
   */
  public fun properties(): Any? = unwrap(this).getProperties()

  /**
   * The tags for the namespace.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the Amazon VPC that you want to associate the namespace with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-vpc)
   */
  public fun vpc(): String

  /**
   * A builder for [CfnPrivateDnsNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the namespace.
     */
    public fun description(description: String)

    /**
     * @param name The name that you want to assign to this namespace. 
     * When you create a private DNS namespace, AWS Cloud Map automatically creates an Amazon
     * Route 53 private hosted zone that has the same name as the namespace.
     */
    public fun name(name: String)

    /**
     * @param properties Properties for the private DNS namespace.
     */
    public fun properties(properties: IResolvable)

    /**
     * @param properties Properties for the private DNS namespace.
     */
    public fun properties(properties: CfnPrivateDnsNamespace.PropertiesProperty)

    /**
     * @param properties Properties for the private DNS namespace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b8744b5d0664d6548bb00c62ea9f8b0ee22b089a86783a9d4973be07766e7a7")
    public fun properties(properties: CfnPrivateDnsNamespace.PropertiesProperty.Builder.() -> Unit)

    /**
     * @param tags The tags for the namespace.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the namespace.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpc The ID of the Amazon VPC that you want to associate the namespace with. 
     */
    public fun vpc(vpc: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps.builder()

    /**
     * @param description A description for the namespace.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name that you want to assign to this namespace. 
     * When you create a private DNS namespace, AWS Cloud Map automatically creates an Amazon
     * Route 53 private hosted zone that has the same name as the namespace.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param properties Properties for the private DNS namespace.
     */
    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    /**
     * @param properties Properties for the private DNS namespace.
     */
    override fun properties(properties: CfnPrivateDnsNamespace.PropertiesProperty) {
      cdkBuilder.properties(properties.let(CfnPrivateDnsNamespace.PropertiesProperty::unwrap))
    }

    /**
     * @param properties Properties for the private DNS namespace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b8744b5d0664d6548bb00c62ea9f8b0ee22b089a86783a9d4973be07766e7a7")
    override
        fun properties(properties: CfnPrivateDnsNamespace.PropertiesProperty.Builder.() -> Unit):
        Unit = properties(CfnPrivateDnsNamespace.PropertiesProperty(properties))

    /**
     * @param tags The tags for the namespace.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the namespace.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpc The ID of the Amazon VPC that you want to associate the namespace with. 
     */
    override fun vpc(vpc: String) {
      cdkBuilder.vpc(vpc)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps,
  ) : CdkObject(cdkObject), CfnPrivateDnsNamespaceProps {
    /**
     * A description for the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name that you want to assign to this namespace.
     *
     * When you create a private DNS namespace, AWS Cloud Map automatically creates an Amazon
     * Route 53 private hosted zone that has the same name as the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Properties for the private DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-properties)
     */
    override fun properties(): Any? = unwrap(this).getProperties()

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the Amazon VPC that you want to associate the namespace with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-vpc)
     */
    override fun vpc(): String = unwrap(this).getVpc()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPrivateDnsNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps):
        CfnPrivateDnsNamespaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPrivateDnsNamespaceProps):
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps
  }
}
