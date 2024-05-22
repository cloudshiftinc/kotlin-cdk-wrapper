@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `HttpNamespace` resource is an AWS Cloud Map resource type that contains information about an
 * HTTP namespace.
 *
 * Service instances that you register using an HTTP namespace can be discovered using a
 * `DiscoverInstances` request but can't be discovered using DNS.
 *
 * For the current quota on the number of namespaces that you can create using the same AWS account,
 * see [AWS Cloud Map quotas](https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html) in
 * the ** .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * CfnHttpNamespace cfnHttpNamespace = CfnHttpNamespace.Builder.create(this, "MyCfnHttpNamespace")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html)
 */
public open class CfnHttpNamespace(
  cdkObject: software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHttpNamespaceProps,
  ) :
      this(software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnHttpNamespaceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHttpNamespaceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnHttpNamespaceProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the namespace, such as
   * `arn:aws:service-discovery:us-east-1:123456789012:http-namespace/http-namespace-a1bzhi` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the namespace.
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.CfnHttpNamespace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-description)
     * @param description A description for the namespace. 
     */
    public fun description(description: String)

    /**
     * The name that you want to assign to this namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-name)
     * @param name The name that you want to assign to this namespace. 
     */
    public fun name(name: String)

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-tags)
     * @param tags The tags for the namespace. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace.Builder.create(scope, id)

    /**
     * A description for the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-description)
     * @param description A description for the namespace. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name that you want to assign to this namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-name)
     * @param name The name that you want to assign to this namespace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-tags)
     * @param tags The tags for the namespace. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHttpNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHttpNamespace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace):
        CfnHttpNamespace = CfnHttpNamespace(cdkObject)

    internal fun unwrap(wrapped: CfnHttpNamespace):
        software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace = wrapped.cdkObject as
        software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace
  }
}
