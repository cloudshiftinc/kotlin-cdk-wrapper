@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCell`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53recoveryreadiness.*;
 * CfnCellProps cfnCellProps = CfnCellProps.builder()
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
public interface CfnCellProps {
  /**
   * The name of the cell to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cellname)
   */
  public fun cellName(): String? = unwrap(this).getCellName()

  /**
   * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested
   * cells.
   *
   * For example, Availability Zones within specific AWS Regions .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cells)
   */
  public fun cells(): List<String> = unwrap(this).getCells() ?: emptyList()

  /**
   * A collection of tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCellProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cellName The name of the cell to create.
     */
    public fun cellName(cellName: String)

    /**
     * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use
     * in nested cells.
     * For example, Availability Zones within specific AWS Regions .
     */
    public fun cells(cells: List<String>)

    /**
     * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use
     * in nested cells.
     * For example, Availability Zones within specific AWS Regions .
     */
    public fun cells(vararg cells: String)

    /**
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps.builder()

    /**
     * @param cellName The name of the cell to create.
     */
    override fun cellName(cellName: String) {
      cdkBuilder.cellName(cellName)
    }

    /**
     * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use
     * in nested cells.
     * For example, Availability Zones within specific AWS Regions .
     */
    override fun cells(cells: List<String>) {
      cdkBuilder.cells(cells)
    }

    /**
     * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use
     * in nested cells.
     * For example, Availability Zones within specific AWS Regions .
     */
    override fun cells(vararg cells: String): Unit = cells(cells.toList())

    /**
     * @param tags A collection of tags associated with a resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A collection of tags associated with a resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps,
  ) : CdkObject(cdkObject), CfnCellProps {
    /**
     * The name of the cell to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cellname)
     */
    override fun cellName(): String? = unwrap(this).getCellName()

    /**
     * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested
     * cells.
     *
     * For example, Availability Zones within specific AWS Regions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cells)
     */
    override fun cells(): List<String> = unwrap(this).getCells() ?: emptyList()

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCellProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps):
        CfnCellProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCellProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCellProps):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps
  }
}
