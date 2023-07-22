@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps

/**
 * Properties for defining a `CfnCell`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoveryreadiness.*;
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
@CdkDslMarker
public class CfnCellPropsDsl {
  private val cdkBuilder: CfnCellProps.Builder = CfnCellProps.builder()

  private val _cells: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param cellName The name of the cell to create.
   */
  public fun cellName(cellName: String) {
    cdkBuilder.cellName(cellName)
  }

  /**
   * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in
   * nested cells.
   * For example, Availability Zones within specific AWS Regions .
   */
  public fun cells(vararg cells: String) {
    _cells.addAll(listOf(*cells))
  }

  /**
   * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in
   * nested cells.
   * For example, Availability Zones within specific AWS Regions .
   */
  public fun cells(cells: Collection<String>) {
    _cells.addAll(cells)
  }

  /**
   * @param tags A collection of tags associated with a resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A collection of tags associated with a resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCellProps {
    if(_cells.isNotEmpty()) cdkBuilder.cells(_cells)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
