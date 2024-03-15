@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fms

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
 * A set of resources to include in a policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fms.*;
 * CfnResourceSet cfnResourceSet = CfnResourceSet.Builder.create(this, "MyCfnResourceSet")
 * .name("name")
 * .resourceTypeList(List.of("resourceTypeList"))
 * // the properties below are optional
 * .description("description")
 * .resources(List.of("resources"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html)
 */
public open class CfnResourceSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.fms.CfnResourceSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A Base62 ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description of the resource set.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the resource set.
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
   * The descriptive name of the resource set.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The descriptive name of the resource set.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Determines the resources that can be associated to the resource set.
   */
  public open fun resourceTypeList(): List<String> = unwrap(this).getResourceTypeList()

  /**
   * Determines the resources that can be associated to the resource set.
   */
  public open fun resourceTypeList(`value`: List<String>) {
    unwrap(this).setResourceTypeList(`value`)
  }

  /**
   * Determines the resources that can be associated to the resource set.
   */
  public open fun resourceTypeList(vararg `value`: String): Unit =
      resourceTypeList(`value`.toList())

  /**
   *
   */
  public open fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  /**
   *
   */
  public open fun resources(`value`: List<String>) {
    unwrap(this).setResources(`value`)
  }

  /**
   *
   */
  public open fun resources(vararg `value`: String): Unit = resources(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   *
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   *
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   *
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fms.CfnResourceSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-description)
     * @param description A description of the resource set. 
     */
    public fun description(description: String)

    /**
     * The descriptive name of the resource set.
     *
     * You can't change the name of a resource set after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-name)
     * @param name The descriptive name of the resource set. 
     */
    public fun name(name: String)

    /**
     * Determines the resources that can be associated to the resource set.
     *
     * Depending on your setting for max results and the number of resource sets, a single call
     * might not return the full list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resourcetypelist)
     * @param resourceTypeList Determines the resources that can be associated to the resource set. 
     */
    public fun resourceTypeList(resourceTypeList: List<String>)

    /**
     * Determines the resources that can be associated to the resource set.
     *
     * Depending on your setting for max results and the number of resource sets, a single call
     * might not return the full list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resourcetypelist)
     * @param resourceTypeList Determines the resources that can be associated to the resource set. 
     */
    public fun resourceTypeList(vararg resourceTypeList: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resources)
     * @param resources 
     */
    public fun resources(resources: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resources)
     * @param resources 
     */
    public fun resources(vararg resources: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-tags)
     * @param tags 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fms.CfnResourceSet.Builder =
        software.amazon.awscdk.services.fms.CfnResourceSet.Builder.create(scope, id)

    /**
     * A description of the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-description)
     * @param description A description of the resource set. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The descriptive name of the resource set.
     *
     * You can't change the name of a resource set after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-name)
     * @param name The descriptive name of the resource set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Determines the resources that can be associated to the resource set.
     *
     * Depending on your setting for max results and the number of resource sets, a single call
     * might not return the full list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resourcetypelist)
     * @param resourceTypeList Determines the resources that can be associated to the resource set. 
     */
    override fun resourceTypeList(resourceTypeList: List<String>) {
      cdkBuilder.resourceTypeList(resourceTypeList)
    }

    /**
     * Determines the resources that can be associated to the resource set.
     *
     * Depending on your setting for max results and the number of resource sets, a single call
     * might not return the full list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resourcetypelist)
     * @param resourceTypeList Determines the resources that can be associated to the resource set. 
     */
    override fun resourceTypeList(vararg resourceTypeList: String): Unit =
        resourceTypeList(resourceTypeList.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resources)
     * @param resources 
     */
    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resources)
     * @param resources 
     */
    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-tags)
     * @param tags 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fms.CfnResourceSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.fms.CfnResourceSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnResourceSet): CfnResourceSet
        = CfnResourceSet(cdkObject)

    internal fun unwrap(wrapped: CfnResourceSet): software.amazon.awscdk.services.fms.CfnResourceSet
        = wrapped.cdkObject
  }
}
