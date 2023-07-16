@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTotalAggregationComputationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TotalAggregationComputationProperty.Builder =
      CfnAnalysis.TotalAggregationComputationProperty.builder()

  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnAnalysis.MeasureFieldProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnalysis.TotalAggregationComputationProperty = cdkBuilder.build()
}
