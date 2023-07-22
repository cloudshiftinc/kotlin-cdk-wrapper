@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnSolution

@CdkDslMarker
public class CfnSolutionHpoConfigPropertyDsl {
  private val cdkBuilder: CfnSolution.HpoConfigProperty.Builder =
      CfnSolution.HpoConfigProperty.builder()

  /**
   * @param algorithmHyperParameterRanges The hyperparameters and their allowable ranges.
   */
  public fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: IResolvable) {
    cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges)
  }

  /**
   * @param algorithmHyperParameterRanges The hyperparameters and their allowable ranges.
   */
  public
      fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: CfnSolution.AlgorithmHyperParameterRangesProperty) {
    cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges)
  }

  /**
   * @param hpoObjective The metric to optimize during HPO.
   */
  public fun hpoObjective(hpoObjective: IResolvable) {
    cdkBuilder.hpoObjective(hpoObjective)
  }

  /**
   * @param hpoObjective The metric to optimize during HPO.
   */
  public fun hpoObjective(hpoObjective: CfnSolution.HpoObjectiveProperty) {
    cdkBuilder.hpoObjective(hpoObjective)
  }

  /**
   * @param hpoResourceConfig Describes the resource configuration for hyperparameter optimization
   * (HPO).
   */
  public fun hpoResourceConfig(hpoResourceConfig: IResolvable) {
    cdkBuilder.hpoResourceConfig(hpoResourceConfig)
  }

  /**
   * @param hpoResourceConfig Describes the resource configuration for hyperparameter optimization
   * (HPO).
   */
  public fun hpoResourceConfig(hpoResourceConfig: CfnSolution.HpoResourceConfigProperty) {
    cdkBuilder.hpoResourceConfig(hpoResourceConfig)
  }

  public fun build(): CfnSolution.HpoConfigProperty = cdkBuilder.build()
}
