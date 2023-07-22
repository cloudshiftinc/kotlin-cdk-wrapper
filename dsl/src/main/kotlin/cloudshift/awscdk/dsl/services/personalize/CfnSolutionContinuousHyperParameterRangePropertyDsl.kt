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

  /**
   * @param maxValue The maximum allowable value for the hyperparameter.
   */
  public fun maxValue(maxValue: Number) {
    cdkBuilder.maxValue(maxValue)
  }

  /**
   * @param minValue The minimum allowable value for the hyperparameter.
   */
  public fun minValue(minValue: Number) {
    cdkBuilder.minValue(minValue)
  }

  /**
   * @param name The name of the hyperparameter.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnSolution.ContinuousHyperParameterRangeProperty = cdkBuilder.build()
}
