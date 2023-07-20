@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition
import kotlin.Number

@CdkDslMarker
public class CfnModelQualityJobDefinitionStoppingConditionPropertyDsl {
    private val cdkBuilder: CfnModelQualityJobDefinition.StoppingConditionProperty.Builder =
        CfnModelQualityJobDefinition.StoppingConditionProperty.builder()

    public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
        cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
    }

    public fun build(): CfnModelQualityJobDefinition.StoppingConditionProperty = cdkBuilder.build()
}
