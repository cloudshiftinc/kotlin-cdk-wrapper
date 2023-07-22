@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFieldSortOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FieldSortOptionsProperty.Builder =
      CfnAnalysis.FieldSortOptionsProperty.builder()

  /**
   * @param columnSort The sort configuration for a column that is not used in a field well.
   */
  public fun columnSort(columnSort: IResolvable) {
    cdkBuilder.columnSort(columnSort)
  }

  /**
   * @param columnSort The sort configuration for a column that is not used in a field well.
   */
  public fun columnSort(columnSort: CfnAnalysis.ColumnSortProperty) {
    cdkBuilder.columnSort(columnSort)
  }

  /**
   * @param fieldSort The sort configuration for a field in a field well.
   */
  public fun fieldSort(fieldSort: IResolvable) {
    cdkBuilder.fieldSort(fieldSort)
  }

  /**
   * @param fieldSort The sort configuration for a field in a field well.
   */
  public fun fieldSort(fieldSort: CfnAnalysis.FieldSortProperty) {
    cdkBuilder.fieldSort(fieldSort)
  }

  public fun build(): CfnAnalysis.FieldSortOptionsProperty = cdkBuilder.build()
}
