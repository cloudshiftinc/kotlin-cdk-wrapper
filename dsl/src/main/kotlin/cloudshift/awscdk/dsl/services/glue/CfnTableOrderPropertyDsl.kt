@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.glue.CfnTable

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
