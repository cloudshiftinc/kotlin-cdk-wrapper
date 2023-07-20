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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import kotlin.String

@CdkDslMarker
public class CfnInferenceExperimentModelVariantConfigPropertyDsl {
    private val cdkBuilder: CfnInferenceExperiment.ModelVariantConfigProperty.Builder =
        CfnInferenceExperiment.ModelVariantConfigProperty.builder()

    public fun infrastructureConfig(infrastructureConfig: IResolvable) {
        cdkBuilder.infrastructureConfig(infrastructureConfig)
    }

    public fun infrastructureConfig(infrastructureConfig: CfnInferenceExperiment.ModelInfrastructureConfigProperty) {
        cdkBuilder.infrastructureConfig(infrastructureConfig)
    }

    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    public fun variantName(variantName: String) {
        cdkBuilder.variantName(variantName)
    }

    public fun build(): CfnInferenceExperiment.ModelVariantConfigProperty = cdkBuilder.build()
}
