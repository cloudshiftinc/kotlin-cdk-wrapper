@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFieldSortPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FieldSortProperty.Builder =
      CfnAnalysis.FieldSortProperty.builder()

  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnAnalysis.FieldSortProperty = cdkBuilder.build()
}
