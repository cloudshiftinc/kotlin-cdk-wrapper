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
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import kotlin.String

@CdkDslMarker
public class CfnEndpointConfigClarifyExplainerConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ClarifyExplainerConfigProperty.Builder =
        CfnEndpointConfig.ClarifyExplainerConfigProperty.builder()

    public fun enableExplanations(enableExplanations: String) {
        cdkBuilder.enableExplanations(enableExplanations)
    }

    public fun inferenceConfig(inferenceConfig: IResolvable) {
        cdkBuilder.inferenceConfig(inferenceConfig)
    }

    public fun inferenceConfig(inferenceConfig: CfnEndpointConfig.ClarifyInferenceConfigProperty) {
        cdkBuilder.inferenceConfig(inferenceConfig)
    }

    public fun shapConfig(shapConfig: IResolvable) {
        cdkBuilder.shapConfig(shapConfig)
    }

    public fun shapConfig(shapConfig: CfnEndpointConfig.ClarifyShapConfigProperty) {
        cdkBuilder.shapConfig(shapConfig)
    }

    public fun build(): CfnEndpointConfig.ClarifyExplainerConfigProperty = cdkBuilder.build()
}
