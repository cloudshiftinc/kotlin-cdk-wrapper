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

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import kotlin.String

@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateStopConditionPropertyDsl {
    private val cdkBuilder: CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.Builder =
        CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.builder()

    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnExperimentTemplate.ExperimentTemplateStopConditionProperty =
        cdkBuilder.build()
}
