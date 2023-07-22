@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigPropertyDsl {
  private val cdkBuilder:
      CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.Builder =
      CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.builder()

  /**
   * @param baseliningJobName The name of the baseline model explainability job.
   */
  public fun baseliningJobName(baseliningJobName: String) {
    cdkBuilder.baseliningJobName(baseliningJobName)
  }

  /**
   * @param constraintsResource The constraints resource for a model explainability job.
   */
  public fun constraintsResource(constraintsResource: IResolvable) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  /**
   * @param constraintsResource The constraints resource for a model explainability job.
   */
  public
      fun constraintsResource(constraintsResource: CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty
      = cdkBuilder.build()
}
