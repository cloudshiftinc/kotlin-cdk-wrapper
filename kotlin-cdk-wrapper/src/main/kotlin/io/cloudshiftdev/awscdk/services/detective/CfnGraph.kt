@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Detective::Graph` resource is an Amazon Detective resource type that creates a
 * Detective behavior graph.
 *
 * The requesting account becomes the administrator account for the behavior graph.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.detective.*;
 * CfnGraph cfnGraph = CfnGraph.Builder.create(this, "MyCfnGraph")
 * .autoEnableMembers(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html)
 */
public open class CfnGraph(
  cdkObject: software.amazon.awscdk.services.detective.CfnGraph,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.detective.CfnGraph(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGraphProps,
  ) :
      this(software.amazon.awscdk.services.detective.CfnGraph(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnGraphProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGraphProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGraphProps(props)
  )

  /**
   * The ARN of the new behavior graph.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Indicates whether to automatically enable new organization accounts as member accounts in the
   * organization behavior graph.
   */
  public open fun autoEnableMembers(): Any? = unwrap(this).getAutoEnableMembers()

  /**
   * Indicates whether to automatically enable new organization accounts as member accounts in the
   * organization behavior graph.
   */
  public open fun autoEnableMembers(`value`: Boolean) {
    unwrap(this).setAutoEnableMembers(`value`)
  }

  /**
   * Indicates whether to automatically enable new organization accounts as member accounts in the
   * organization behavior graph.
   */
  public open fun autoEnableMembers(`value`: IResolvable) {
    unwrap(this).setAutoEnableMembers(`value`.let(IResolvable.Companion::unwrap))
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
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tag values to assign to the new behavior graph.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tag values to assign to the new behavior graph.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tag values to assign to the new behavior graph.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.detective.CfnGraph].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether to automatically enable new organization accounts as member accounts in the
     * organization behavior graph.
     *
     * By default, this property is set to `false` . If you want to change the value of this
     * property, you must be the Detective administrator for the organization. For more information on
     * setting a Detective administrator account, see
     * [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-autoenablemembers)
     * @param autoEnableMembers Indicates whether to automatically enable new organization accounts
     * as member accounts in the organization behavior graph. 
     */
    public fun autoEnableMembers(autoEnableMembers: Boolean)

    /**
     * Indicates whether to automatically enable new organization accounts as member accounts in the
     * organization behavior graph.
     *
     * By default, this property is set to `false` . If you want to change the value of this
     * property, you must be the Detective administrator for the organization. For more information on
     * setting a Detective administrator account, see
     * [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-autoenablemembers)
     * @param autoEnableMembers Indicates whether to automatically enable new organization accounts
     * as member accounts in the organization behavior graph. 
     */
    public fun autoEnableMembers(autoEnableMembers: IResolvable)

    /**
     * The tag values to assign to the new behavior graph.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-tags)
     * @param tags The tag values to assign to the new behavior graph. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tag values to assign to the new behavior graph.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-tags)
     * @param tags The tag values to assign to the new behavior graph. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.detective.CfnGraph.Builder =
        software.amazon.awscdk.services.detective.CfnGraph.Builder.create(scope, id)

    /**
     * Indicates whether to automatically enable new organization accounts as member accounts in the
     * organization behavior graph.
     *
     * By default, this property is set to `false` . If you want to change the value of this
     * property, you must be the Detective administrator for the organization. For more information on
     * setting a Detective administrator account, see
     * [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-autoenablemembers)
     * @param autoEnableMembers Indicates whether to automatically enable new organization accounts
     * as member accounts in the organization behavior graph. 
     */
    override fun autoEnableMembers(autoEnableMembers: Boolean) {
      cdkBuilder.autoEnableMembers(autoEnableMembers)
    }

    /**
     * Indicates whether to automatically enable new organization accounts as member accounts in the
     * organization behavior graph.
     *
     * By default, this property is set to `false` . If you want to change the value of this
     * property, you must be the Detective administrator for the organization. For more information on
     * setting a Detective administrator account, see
     * [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-autoenablemembers)
     * @param autoEnableMembers Indicates whether to automatically enable new organization accounts
     * as member accounts in the organization behavior graph. 
     */
    override fun autoEnableMembers(autoEnableMembers: IResolvable) {
      cdkBuilder.autoEnableMembers(autoEnableMembers.let(IResolvable.Companion::unwrap))
    }

    /**
     * The tag values to assign to the new behavior graph.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-tags)
     * @param tags The tag values to assign to the new behavior graph. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tag values to assign to the new behavior graph.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-tags)
     * @param tags The tag values to assign to the new behavior graph. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.detective.CfnGraph = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.detective.CfnGraph.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGraph {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGraph(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnGraph): CfnGraph =
        CfnGraph(cdkObject)

    internal fun unwrap(wrapped: CfnGraph): software.amazon.awscdk.services.detective.CfnGraph =
        wrapped.cdkObject as software.amazon.awscdk.services.detective.CfnGraph
  }
}
