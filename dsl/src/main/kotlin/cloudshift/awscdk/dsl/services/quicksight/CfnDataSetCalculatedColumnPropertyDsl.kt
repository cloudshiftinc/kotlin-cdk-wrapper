@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetCalculatedColumnPropertyDsl {
  private val cdkBuilder: CfnDataSet.CalculatedColumnProperty.Builder =
      CfnDataSet.CalculatedColumnProperty.builder()

  /**
   * @param columnId A unique ID to identify a calculated column. 
   * During a dataset update, if the column ID of a calculated column matches that of an existing
   * calculated column, Amazon QuickSight preserves the existing calculated column.
   */
  public fun columnId(columnId: String) {
    cdkBuilder.columnId(columnId)
  }

  /**
   * @param columnName Column name. 
   */
  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  /**
   * @param expression An expression that defines the calculated column. 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnDataSet.CalculatedColumnProperty = cdkBuilder.build()
}
