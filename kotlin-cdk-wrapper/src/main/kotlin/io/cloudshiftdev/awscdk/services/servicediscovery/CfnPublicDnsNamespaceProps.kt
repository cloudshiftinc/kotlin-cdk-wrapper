@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPublicDnsNamespace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * CfnPublicDnsNamespaceProps cfnPublicDnsNamespaceProps = CfnPublicDnsNamespaceProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .properties(PropertiesProperty.builder()
 * .dnsProperties(PublicDnsPropertiesMutableProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html)
 */
public interface CfnPublicDnsNamespaceProps {
  /**
   * A description for the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name that you want to assign to this namespace.
   *
   *
   * Do not include sensitive information in the name. The name is publicly available using DNS
   * queries.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-name)
   */
  public fun name(): String

  /**
   * Properties for the public DNS namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-properties)
   */
  public fun properties(): Any? = unwrap(this).getProperties()

  /**
   * The tags for the namespace.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPublicDnsNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the namespace.
     */
    public fun description(description: String)

    /**
     * @param name The name that you want to assign to this namespace. 
     *
     * Do not include sensitive information in the name. The name is publicly available using DNS
     * queries.
     */
    public fun name(name: String)

    /**
     * @param properties Properties for the public DNS namespace.
     */
    public fun properties(properties: IResolvable)

    /**
     * @param properties Properties for the public DNS namespace.
     */
    public fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty)

    /**
     * @param properties Properties for the public DNS namespace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c478bcb7470b1df94da8365888b982b64591c69a2cc230a276c7fdde2643e38")
    public fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty.Builder.() -> Unit)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps.builder()

    /**
     * @param description A description for the namespace.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name that you want to assign to this namespace. 
     *
     * Do not include sensitive information in the name. The name is publicly available using DNS
     * queries.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param properties Properties for the public DNS namespace.
     */
    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    /**
     * @param properties Properties for the public DNS namespace.
     */
    override fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty) {
      cdkBuilder.properties(properties.let(CfnPublicDnsNamespace.PropertiesProperty::unwrap))
    }

    /**
     * @param properties Properties for the public DNS namespace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c478bcb7470b1df94da8365888b982b64591c69a2cc230a276c7fdde2643e38")
    override
        fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty.Builder.() -> Unit):
        Unit = properties(CfnPublicDnsNamespace.PropertiesProperty(properties))

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

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps,
  ) : CdkObject(cdkObject), CfnPublicDnsNamespaceProps {
    /**
     * A description for the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name that you want to assign to this namespace.
     *
     *
     * Do not include sensitive information in the name. The name is publicly available using DNS
     * queries.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Properties for the public DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-properties)
     */
    override fun properties(): Any? = unwrap(this).getProperties()

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublicDnsNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps):
        CfnPublicDnsNamespaceProps = CdkObjectWrappers.wrap(cdkObject) as CfnPublicDnsNamespaceProps

    internal fun unwrap(wrapped: CfnPublicDnsNamespaceProps):
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps
  }
}
