@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@CdkDslMarker
public class CfnModelBiasJobDefinitionStoppingConditionPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.StoppingConditionProperty.Builder =
      CfnModelBiasJobDefinition.StoppingConditionProperty.builder()

  public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
    cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
  }

  public fun build(): CfnModelBiasJobDefinition.StoppingConditionProperty = cdkBuilder.build()
}
