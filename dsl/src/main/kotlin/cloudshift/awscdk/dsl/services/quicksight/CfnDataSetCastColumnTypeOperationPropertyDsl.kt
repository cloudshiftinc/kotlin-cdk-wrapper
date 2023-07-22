@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetCastColumnTypeOperationPropertyDsl {
  private val cdkBuilder: CfnDataSet.CastColumnTypeOperationProperty.Builder =
      CfnDataSet.CastColumnTypeOperationProperty.builder()

  /**
   * @param columnName Column name. 
   */
  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  /**
   * @param format When casting a column from string to datetime type, you can supply a string in a
   * format supported by Amazon QuickSight to denote the source data format.
   */
  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  /**
   * @param newColumnType New column data type. 
   */
  public fun newColumnType(newColumnType: String) {
    cdkBuilder.newColumnType(newColumnType)
  }

  public fun build(): CfnDataSet.CastColumnTypeOperationProperty = cdkBuilder.build()
}
