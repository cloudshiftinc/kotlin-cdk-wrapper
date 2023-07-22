@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.glue.CfnTable

/**
 * Specifies the sort order of a sorted column.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * OrderProperty orderProperty = OrderProperty.builder()
 * .column("column")
 * .sortOrder(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html)
 */
@CdkDslMarker
public class CfnTableOrderPropertyDsl {
  private val cdkBuilder: CfnTable.OrderProperty.Builder = CfnTable.OrderProperty.builder()

  /**
   * @param column The name of the column. 
   */
  public fun column(column: String) {
    cdkBuilder.column(column)
  }

  /**
   * @param sortOrder Indicates that the column is sorted in ascending order ( `== 1` ), or in
   * descending order ( `==0` ). 
   */
  public fun sortOrder(sortOrder: Number) {
    cdkBuilder.sortOrder(sortOrder)
  }

  public fun build(): CfnTable.OrderProperty = cdkBuilder.build()
}
