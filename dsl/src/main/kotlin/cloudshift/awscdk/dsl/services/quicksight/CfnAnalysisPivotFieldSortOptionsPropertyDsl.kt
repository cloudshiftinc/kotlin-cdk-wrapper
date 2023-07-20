@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotFieldSortOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotFieldSortOptionsProperty.Builder =
      CfnAnalysis.PivotFieldSortOptionsProperty.builder()

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun sortBy(sortBy: IResolvable) {
    cdkBuilder.sortBy(sortBy)
  }

  public fun sortBy(sortBy: CfnAnalysis.PivotTableSortByProperty) {
    cdkBuilder.sortBy(sortBy)
  }

  public fun build(): CfnAnalysis.PivotFieldSortOptionsProperty = cdkBuilder.build()
}
