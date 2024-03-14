package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

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

public open class CfnRecoveryGroup internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the recovery group.
   */
  public open fun attrRecoveryGroupArn(): String = unwrap(this).getAttrRecoveryGroupArn()

  /**
   * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
   */
  public open fun cells(): List<String> = unwrap(this).getCells() ?: emptyList()

  /**
   * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
   */
  public open fun cells(`value`: List<String>) {
    unwrap(this).setCells(`value`)
  }

  /**
   * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
   */
  public open fun cells(vararg `value`: String): Unit = cells(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the recovery group to create.
   */
  public open fun recoveryGroupName(): String? = unwrap(this).getRecoveryGroupName()

  /**
   * The name of the recovery group to create.
   */
  public open fun recoveryGroupName(`value`: String) {
    unwrap(this).setRecoveryGroupName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-cells)
     * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group. 
     */
    public fun cells(cells: List<String>)

    /**
     * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-cells)
     * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group. 
     */
    public fun cells(vararg cells: String)

    /**
     * The name of the recovery group to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-recoverygroupname)
     * @param recoveryGroupName The name of the recovery group to create. 
     */
    public fun recoveryGroupName(recoveryGroupName: String)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup.Builder.create(scope,
        id)

    /**
     * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-cells)
     * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group. 
     */
    override fun cells(cells: List<String>) {
      cdkBuilder.cells(cells)
    }

    /**
     * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-cells)
     * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group. 
     */
    override fun cells(vararg cells: String): Unit = cells(cells.toList())

    /**
     * The name of the recovery group to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-recoverygroupname)
     * @param recoveryGroupName The name of the recovery group to create. 
     */
    override fun recoveryGroupName(recoveryGroupName: String) {
      cdkBuilder.recoveryGroupName(recoveryGroupName)
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRecoveryGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRecoveryGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup):
        CfnRecoveryGroup = CfnRecoveryGroup(cdkObject)

    internal fun unwrap(wrapped: CfnRecoveryGroup):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup =
        wrapped.cdkObject
  }
}
