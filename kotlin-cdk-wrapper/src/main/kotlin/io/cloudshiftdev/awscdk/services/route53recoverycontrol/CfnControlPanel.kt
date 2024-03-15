@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new control panel in Amazon Route 53 Application Recovery Controller.
 *
 * A control panel represents a group of routing controls that can be changed together in a single
 * transaction. You can use a control panel to centrally view the operational status of applications
 * across your organization, and trigger multi-app failovers in a single transaction, for example, to
 * fail over from one AWS Region (cell) to another.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53recoverycontrol.*;
 * CfnControlPanel cfnControlPanel = CfnControlPanel.Builder.create(this, "MyCfnControlPanel")
 * .name("name")
 * // the properties below are optional
 * .clusterArn("clusterArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html)
 */
public open class CfnControlPanel internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the control panel.
   */
  public open fun attrControlPanelArn(): String = unwrap(this).getAttrControlPanelArn()

  /**
   * The boolean flag that is set to true for the default control panel in the cluster.
   */
  public open fun attrDefaultControlPanel(): IResolvable =
      unwrap(this).getAttrDefaultControlPanel().let(IResolvable::wrap)

  /**
   * The number of routing controls in the control panel.
   */
  public open fun attrRoutingControlCount(): Number = unwrap(this).getAttrRoutingControlCount()

  /**
   * The deployment status of control panel.
   *
   * Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon Resource Name (ARN) of the cluster for the control panel.
   */
  public open fun clusterArn(): String? = unwrap(this).getClusterArn()

  /**
   * The Amazon Resource Name (ARN) of the cluster for the control panel.
   */
  public open fun clusterArn(`value`: String) {
    unwrap(this).setClusterArn(`value`)
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
   * The name of the control panel.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the control panel.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags associated with the control panel.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags associated with the control panel.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags associated with the control panel.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53recoverycontrol.CfnControlPanel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the cluster for the control panel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-clusterarn)
     * @param clusterArn The Amazon Resource Name (ARN) of the cluster for the control panel. 
     */
    public fun clusterArn(clusterArn: String)

    /**
     * The name of the control panel.
     *
     * You can use any non-white space character in the name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-name)
     * @param name The name of the control panel. 
     */
    public fun name(name: String)

    /**
     * The tags associated with the control panel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-tags)
     * @param tags The tags associated with the control panel. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags associated with the control panel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-tags)
     * @param tags The tags associated with the control panel. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel.Builder.create(scope,
        id)

    /**
     * The Amazon Resource Name (ARN) of the cluster for the control panel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-clusterarn)
     * @param clusterArn The Amazon Resource Name (ARN) of the cluster for the control panel. 
     */
    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * The name of the control panel.
     *
     * You can use any non-white space character in the name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-name)
     * @param name The name of the control panel. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags associated with the control panel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-tags)
     * @param tags The tags associated with the control panel. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags associated with the control panel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-tags)
     * @param tags The tags associated with the control panel. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnControlPanel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnControlPanel(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel):
        CfnControlPanel = CfnControlPanel(cdkObject)

    internal fun unwrap(wrapped: CfnControlPanel):
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel = wrapped.cdkObject
  }
}
