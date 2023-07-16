@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnSolution

@CdkDslMarker
public class CfnSolutionHpoObjectivePropertyDsl {
  private val cdkBuilder: CfnSolution.HpoObjectiveProperty.Builder =
      CfnSolution.HpoObjectiveProperty.builder()

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun metricRegex(metricRegex: String) {
    cdkBuilder.metricRegex(metricRegex)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSolution.HpoObjectiveProperty = cdkBuilder.build()
}
