@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnSolution

@CdkDslMarker
public class CfnSolutionContinuousHyperParameterRangePropertyDsl {
  private val cdkBuilder: CfnSolution.ContinuousHyperParameterRangeProperty.Builder =
      CfnSolution.ContinuousHyperParameterRangeProperty.builder()

  public fun maxValue(maxValue: Number) {
    cdkBuilder.maxValue(maxValue)
  }

  public fun minValue(minValue: Number) {
    cdkBuilder.minValue(minValue)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnSolution.ContinuousHyperParameterRangeProperty = cdkBuilder.build()
}
