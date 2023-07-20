@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnSolution

@CdkDslMarker
public class CfnSolutionHpoResourceConfigPropertyDsl {
  private val cdkBuilder: CfnSolution.HpoResourceConfigProperty.Builder =
      CfnSolution.HpoResourceConfigProperty.builder()

  public fun maxNumberOfTrainingJobs(maxNumberOfTrainingJobs: String) {
    cdkBuilder.maxNumberOfTrainingJobs(maxNumberOfTrainingJobs)
  }

  public fun maxParallelTrainingJobs(maxParallelTrainingJobs: String) {
    cdkBuilder.maxParallelTrainingJobs(maxParallelTrainingJobs)
  }

  public fun build(): CfnSolution.HpoResourceConfigProperty = cdkBuilder.build()
}
