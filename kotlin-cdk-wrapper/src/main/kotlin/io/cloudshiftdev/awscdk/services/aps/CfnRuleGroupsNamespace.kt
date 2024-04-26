@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.aps

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
 * The definition of a rule groups namespace in an Amazon Managed Service for Prometheus workspace.
 *
 * A rule groups namespace is associated with exactly one rules file. A workspace can have multiple
 * rule groups namespaces. For more information about rules files, see [Creating a rules
 * file](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-ruler-rulesfile.html) , in the
 * *Amazon Managed Service for Prometheus User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.aps.*;
 * CfnRuleGroupsNamespace cfnRuleGroupsNamespace = CfnRuleGroupsNamespace.Builder.create(this,
 * "MyCfnRuleGroupsNamespace")
 * .data("data")
 * .name("name")
 * .workspace("workspace")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html)
 */
public open class CfnRuleGroupsNamespace(
  cdkObject: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleGroupsNamespaceProps,
  ) :
      this(software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRuleGroupsNamespaceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleGroupsNamespaceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRuleGroupsNamespaceProps(props)
  )

  /**
   * The ARN of the rule groups namespace.
   *
   * For example,
   * `arn:aws:aps:&lt;region&gt;:123456789012:rulegroupsnamespace/ws-example1-1234-abcd-5678-ef90abcd1234/rulesfile1`
   * .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The rules file used in the namespace.
   */
  public open fun `data`(): String = unwrap(this).getData()

  /**
   * The rules file used in the namespace.
   */
  public open fun `data`(`value`: String) {
    unwrap(this).setData(`value`)
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
   * The name of the rule groups namespace.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the rule groups namespace.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of tag keys and values that are associated with the rule groups namespace.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The list of tag keys and values that are associated with the rule groups namespace.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The list of tag keys and values that are associated with the rule groups namespace.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the workspace to add the rule groups namespace.
   */
  public open fun workspace(): String = unwrap(this).getWorkspace()

  /**
   * The ID of the workspace to add the rule groups namespace.
   */
  public open fun workspace(`value`: String) {
    unwrap(this).setWorkspace(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.aps.CfnRuleGroupsNamespace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The rules file used in the namespace.
     *
     * For more details about the rules file, see [Creating a rules
     * file](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-ruler-rulesfile.html) in the
     * *Amazon Managed Service for Prometheus User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-data)
     * @param data The rules file used in the namespace. 
     */
    public fun `data`(`data`: String)

    /**
     * The name of the rule groups namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-name)
     * @param name The name of the rule groups namespace. 
     */
    public fun name(name: String)

    /**
     * The list of tag keys and values that are associated with the rule groups namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-tags)
     * @param tags The list of tag keys and values that are associated with the rule groups
     * namespace. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of tag keys and values that are associated with the rule groups namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-tags)
     * @param tags The list of tag keys and values that are associated with the rule groups
     * namespace. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the workspace to add the rule groups namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-workspace)
     * @param workspace The ID of the workspace to add the rule groups namespace. 
     */
    public fun workspace(workspace: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace.Builder =
        software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace.Builder.create(scope, id)

    /**
     * The rules file used in the namespace.
     *
     * For more details about the rules file, see [Creating a rules
     * file](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-ruler-rulesfile.html) in the
     * *Amazon Managed Service for Prometheus User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-data)
     * @param data The rules file used in the namespace. 
     */
    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    /**
     * The name of the rule groups namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-name)
     * @param name The name of the rule groups namespace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The list of tag keys and values that are associated with the rule groups namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-tags)
     * @param tags The list of tag keys and values that are associated with the rule groups
     * namespace. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The list of tag keys and values that are associated with the rule groups namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-tags)
     * @param tags The list of tag keys and values that are associated with the rule groups
     * namespace. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the workspace to add the rule groups namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-workspace)
     * @param workspace The ID of the workspace to add the rule groups namespace. 
     */
    override fun workspace(workspace: String) {
      cdkBuilder.workspace(workspace)
    }

    public fun build(): software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRuleGroupsNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRuleGroupsNamespace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace):
        CfnRuleGroupsNamespace = CfnRuleGroupsNamespace(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroupsNamespace):
        software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace = wrapped.cdkObject as
        software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace
  }
}
