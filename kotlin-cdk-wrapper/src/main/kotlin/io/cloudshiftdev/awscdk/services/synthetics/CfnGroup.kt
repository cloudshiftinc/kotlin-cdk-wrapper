@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

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
 * Creates or updates a group which you can use to associate canaries with each other, including
 * cross-Region canaries.
 *
 * Using groups can help you with managing and automating your canaries, and you can also view
 * aggregated run results and statistics for all canaries in a group.
 *
 * Groups are global resources. When you create a group, it is replicated across all AWS Regions,
 * and you can add canaries from any Region to it, and view it in any Region. Although the group ARN
 * format reflects the Region name where it was created, a group is not constrained to any Region. This
 * means that you can put canaries from multiple Regions into the same group, and then use that group
 * to view and manage all of those canaries in a single view.
 *
 * Each group can contain as many as 10 canaries. You can have as many as 20 groups in your account.
 * Any single canary can be a member of up to 10 groups.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.synthetics.*;
 * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
 * .name("name")
 * // the properties below are optional
 * .resourceArns(List.of("resourceArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html)
 */
public open class CfnGroup(
  cdkObject: software.amazon.awscdk.services.synthetics.CfnGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGroupProps,
  ) :
      this(software.amazon.awscdk.services.synthetics.CfnGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGroupProps(props)
  )

  /**
   * The Id of the group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A name for the group.
   *
   * It can include any Unicode characters.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the group.
   *
   * It can include any Unicode characters.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARNs of the canaries that you want to associate with this group.
   */
  public open fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

  /**
   * The ARNs of the canaries that you want to associate with this group.
   */
  public open fun resourceArns(`value`: List<String>) {
    unwrap(this).setResourceArns(`value`)
  }

  /**
   * The ARNs of the canaries that you want to associate with this group.
   */
  public open fun resourceArns(vararg `value`: String): Unit = resourceArns(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of key-value pairs that are associated with the group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The list of key-value pairs that are associated with the group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The list of key-value pairs that are associated with the group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.synthetics.CfnGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the group. It can include any Unicode characters.
     *
     * The names for all groups in your account, across all Regions, must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-name)
     * @param name A name for the group. It can include any Unicode characters. 
     */
    public fun name(name: String)

    /**
     * The ARNs of the canaries that you want to associate with this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
     * @param resourceArns The ARNs of the canaries that you want to associate with this group. 
     */
    public fun resourceArns(resourceArns: List<String>)

    /**
     * The ARNs of the canaries that you want to associate with this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
     * @param resourceArns The ARNs of the canaries that you want to associate with this group. 
     */
    public fun resourceArns(vararg resourceArns: String)

    /**
     * The list of key-value pairs that are associated with the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
     * @param tags The list of key-value pairs that are associated with the group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of key-value pairs that are associated with the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
     * @param tags The list of key-value pairs that are associated with the group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CfnGroup.Builder =
        software.amazon.awscdk.services.synthetics.CfnGroup.Builder.create(scope, id)

    /**
     * A name for the group. It can include any Unicode characters.
     *
     * The names for all groups in your account, across all Regions, must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-name)
     * @param name A name for the group. It can include any Unicode characters. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARNs of the canaries that you want to associate with this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
     * @param resourceArns The ARNs of the canaries that you want to associate with this group. 
     */
    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    /**
     * The ARNs of the canaries that you want to associate with this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
     * @param resourceArns The ARNs of the canaries that you want to associate with this group. 
     */
    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    /**
     * The list of key-value pairs that are associated with the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
     * @param tags The list of key-value pairs that are associated with the group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The list of key-value pairs that are associated with the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
     * @param tags The list of key-value pairs that are associated with the group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.synthetics.CfnGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.synthetics.CfnGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnGroup): CfnGroup =
        CfnGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.synthetics.CfnGroup =
        wrapped.cdkObject as software.amazon.awscdk.services.synthetics.CfnGroup
  }
}
