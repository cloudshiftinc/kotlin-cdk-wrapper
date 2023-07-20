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
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnInferenceExperimentShadowModelVariantConfigPropertyDsl {
    private val cdkBuilder: CfnInferenceExperiment.ShadowModelVariantConfigProperty.Builder =
        CfnInferenceExperiment.ShadowModelVariantConfigProperty.builder()

    public fun samplingPercentage(samplingPercentage: Number) {
        cdkBuilder.samplingPercentage(samplingPercentage)
    }

    public fun shadowModelVariantName(shadowModelVariantName: String) {
        cdkBuilder.shadowModelVariantName(shadowModelVariantName)
    }

    public fun build(): CfnInferenceExperiment.ShadowModelVariantConfigProperty = cdkBuilder.build()
}
