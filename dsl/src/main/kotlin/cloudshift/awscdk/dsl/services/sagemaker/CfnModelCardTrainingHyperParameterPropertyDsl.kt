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
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import kotlin.String

@CdkDslMarker
public class CfnModelCardTrainingHyperParameterPropertyDsl {
    private val cdkBuilder: CfnModelCard.TrainingHyperParameterProperty.Builder =
        CfnModelCard.TrainingHyperParameterProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnModelCard.TrainingHyperParameterProperty = cdkBuilder.build()
}
