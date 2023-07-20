@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionStoppingConditionPropertyDsl {
  private val cdkBuilder: CfnModelExplainabilityJobDefinition.StoppingConditionProperty.Builder =
      CfnModelExplainabilityJobDefinition.StoppingConditionProperty.builder()

  public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
    cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.StoppingConditionProperty =
      cdkBuilder.build()
}
