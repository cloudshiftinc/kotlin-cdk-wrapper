@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

/**
 * Creates a cell in recovery group in Amazon Route 53 Application Recovery Controller.
 *
 * A cell in Route 53 ARC represents replicas or independent units of failover in your application.
 * It groups within it all the AWS resources that are necessary for your application to run
 * independently. Typically, you would have define one set of resources in a primary cell and another
 * set in a standby cell in your recovery group.
 *
 * After you set up the cells for your application, you can create readiness checks in Route 53 ARC
 * to continually audit readiness for AWS resource quotas, capacity, network routing policies, and
 * other predefined rules.
 *
 * You can set up notifications about changes that would affect your ability to fail over to a
 * replica and recover. However, you should make decisions about whether to fail away from or to a
 * replica based on your monitoring and health check systems. You should consider readiness checks as a
 * complementary service to those systems.
 *
 * Route 53 ARC Readiness supports us-east-1 and us-west-2 AWS Regions only.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53recoveryreadiness.*;
 * CfnCell cfnCell = CfnCell.Builder.create(this, "MyCfnCell")
 * .cellName("cellName")
 * .cells(List.of("cells"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html)
 */
public open class CfnCell(
  cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnCell,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.route53recoveryreadiness.CfnCell(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCellProps,
  ) :
      this(software.amazon.awscdk.services.route53recoveryreadiness.CfnCell(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCellProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCellProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCellProps(props)
  )

  /**
   * The ARN of the cell.
   */
  public open fun attrCellArn(): String = unwrap(this).getAttrCellArn()

  /**
   * The readiness scope for the cell, which can be the Amazon Resource Name (ARN) of a cell or the
   * ARN of a recovery group.
   *
   * Although this is a list, it can currently have only one element.
   */
  public open fun attrParentReadinessScopes(): List<String> =
      unwrap(this).getAttrParentReadinessScopes()

  /**
   * The name of the cell to create.
   */
  public open fun cellName(): String? = unwrap(this).getCellName()

  /**
   * The name of the cell to create.
   */
  public open fun cellName(`value`: String) {
    unwrap(this).setCellName(`value`)
  }

  /**
   * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested
   * cells.
   */
  public open fun cells(): List<String> = unwrap(this).getCells() ?: emptyList()

  /**
   * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested
   * cells.
   */
  public open fun cells(`value`: List<String>) {
    unwrap(this).setCells(`value`)
  }

  /**
   * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested
   * cells.
   */
  public open fun cells(vararg `value`: String): Unit = cells(`value`.toList())

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
   * A collection of tags associated with a resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53recoveryreadiness.CfnCell].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the cell to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cellname)
     * @param cellName The name of the cell to create. 
     */
    public fun cellName(cellName: String)

    /**
     * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested
     * cells.
     *
     * For example, Availability Zones within specific AWS Regions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cells)
     * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use
     * in nested cells. 
     */
    public fun cells(cells: List<String>)

    /**
     * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested
     * cells.
     *
     * For example, Availability Zones within specific AWS Regions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cells)
     * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use
     * in nested cells. 
     */
    public fun cells(vararg cells: String)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53recoveryreadiness.CfnCell.Builder
        = software.amazon.awscdk.services.route53recoveryreadiness.CfnCell.Builder.create(scope, id)

    /**
     * The name of the cell to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cellname)
     * @param cellName The name of the cell to create. 
     */
    override fun cellName(cellName: String) {
      cdkBuilder.cellName(cellName)
    }

    /**
     * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested
     * cells.
     *
     * For example, Availability Zones within specific AWS Regions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cells)
     * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use
     * in nested cells. 
     */
    override fun cells(cells: List<String>) {
      cdkBuilder.cells(cells)
    }

    /**
     * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested
     * cells.
     *
     * For example, Availability Zones within specific AWS Regions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cells)
     * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use
     * in nested cells. 
     */
    override fun cells(vararg cells: String): Unit = cells(cells.toList())

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoveryreadiness.CfnCell =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnCell.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCell {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCell(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnCell):
        CfnCell = CfnCell(cdkObject)

    internal fun unwrap(wrapped: CfnCell):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnCell = wrapped.cdkObject as
        software.amazon.awscdk.services.route53recoveryreadiness.CfnCell
  }
}
