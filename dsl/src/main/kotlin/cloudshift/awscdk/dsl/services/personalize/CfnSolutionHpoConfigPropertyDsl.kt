@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnSolution

@CdkDslMarker
public class CfnSolutionHpoConfigPropertyDsl {
  private val cdkBuilder: CfnSolution.HpoConfigProperty.Builder =
      CfnSolution.HpoConfigProperty.builder()

  public fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: IResolvable) {
    cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges)
  }

  public
      fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: CfnSolution.AlgorithmHyperParameterRangesProperty) {
    cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges)
  }

  public fun hpoObjective(hpoObjective: IResolvable) {
    cdkBuilder.hpoObjective(hpoObjective)
  }

  public fun hpoObjective(hpoObjective: CfnSolution.HpoObjectiveProperty) {
    cdkBuilder.hpoObjective(hpoObjective)
  }

  public fun hpoResourceConfig(hpoResourceConfig: IResolvable) {
    cdkBuilder.hpoResourceConfig(hpoResourceConfig)
  }

  public fun hpoResourceConfig(hpoResourceConfig: CfnSolution.HpoResourceConfigProperty) {
    cdkBuilder.hpoResourceConfig(hpoResourceConfig)
  }

  public fun build(): CfnSolution.HpoConfigProperty = cdkBuilder.build()
}
