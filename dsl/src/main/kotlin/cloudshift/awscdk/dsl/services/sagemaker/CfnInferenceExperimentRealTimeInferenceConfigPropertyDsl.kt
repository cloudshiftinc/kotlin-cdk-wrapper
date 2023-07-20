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
public class CfnInferenceExperimentRealTimeInferenceConfigPropertyDsl {
    private val cdkBuilder: CfnInferenceExperiment.RealTimeInferenceConfigProperty.Builder =
        CfnInferenceExperiment.RealTimeInferenceConfigProperty.builder()

    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun build(): CfnInferenceExperiment.RealTimeInferenceConfigProperty = cdkBuilder.build()
}
