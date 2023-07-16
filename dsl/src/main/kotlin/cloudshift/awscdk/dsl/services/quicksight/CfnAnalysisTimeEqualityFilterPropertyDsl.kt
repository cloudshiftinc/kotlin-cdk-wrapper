@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTimeEqualityFilterPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TimeEqualityFilterProperty.Builder =
      CfnAnalysis.TimeEqualityFilterProperty.builder()

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun filterId(filterId: String) {
    cdkBuilder.filterId(filterId)
  }

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnalysis.TimeEqualityFilterProperty = cdkBuilder.build()
}
