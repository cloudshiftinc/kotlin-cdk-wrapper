@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnSolution

@CdkDslMarker
public class CfnSolutionHpoObjectivePropertyDsl {
  private val cdkBuilder: CfnSolution.HpoObjectiveProperty.Builder =
      CfnSolution.HpoObjectiveProperty.builder()

  /**
   * @param metricName The name of the metric.
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param metricRegex A regular expression for finding the metric in the training job logs.
   */
  public fun metricRegex(metricRegex: String) {
    cdkBuilder.metricRegex(metricRegex)
  }

  /**
   * @param type The type of the metric.
   * Valid values are Maximize and Minimize.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSolution.HpoObjectiveProperty = cdkBuilder.build()
}
