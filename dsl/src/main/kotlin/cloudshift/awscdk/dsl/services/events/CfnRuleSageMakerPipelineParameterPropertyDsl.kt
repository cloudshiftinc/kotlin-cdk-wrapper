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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.CfnRule
import kotlin.String

@CdkDslMarker
public class CfnRuleSageMakerPipelineParameterPropertyDsl {
    private val cdkBuilder: CfnRule.SageMakerPipelineParameterProperty.Builder =
        CfnRule.SageMakerPipelineParameterProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnRule.SageMakerPipelineParameterProperty = cdkBuilder.build()
}
