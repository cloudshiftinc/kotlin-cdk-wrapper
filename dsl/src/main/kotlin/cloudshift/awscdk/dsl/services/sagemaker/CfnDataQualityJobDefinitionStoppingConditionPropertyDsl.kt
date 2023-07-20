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
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import kotlin.Number

@CdkDslMarker
public class CfnDataQualityJobDefinitionStoppingConditionPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.StoppingConditionProperty.Builder =
        CfnDataQualityJobDefinition.StoppingConditionProperty.builder()

    public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
        cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
    }

    public fun build(): CfnDataQualityJobDefinition.StoppingConditionProperty = cdkBuilder.build()
}
