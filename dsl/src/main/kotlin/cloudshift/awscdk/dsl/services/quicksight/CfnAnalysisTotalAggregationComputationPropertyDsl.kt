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

  /**
   * @param computationId The ID for a computation. 
   */
  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  /**
   * @param name The name of a computation.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value field that is used in a computation. 
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value The value field that is used in a computation. 
   */
  public fun `value`(`value`: CfnAnalysis.MeasureFieldProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnalysis.TotalAggregationComputationProperty = cdkBuilder.build()
}
