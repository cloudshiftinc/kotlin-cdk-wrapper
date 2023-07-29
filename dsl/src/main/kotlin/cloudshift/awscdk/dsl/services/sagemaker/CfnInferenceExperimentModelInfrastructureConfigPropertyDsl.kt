@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

/**
 * The configuration for the infrastructure that the model will be deployed to.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelInfrastructureConfigProperty modelInfrastructureConfigProperty =
 * ModelInfrastructureConfigProperty.builder()
 * .infrastructureType("infrastructureType")
 * .realTimeInferenceConfig(RealTimeInferenceConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelinfrastructureconfig.html)
 */
@CdkDslMarker
public class CfnInferenceExperimentModelInfrastructureConfigPropertyDsl {
    private val cdkBuilder: CfnInferenceExperiment.ModelInfrastructureConfigProperty.Builder =
        CfnInferenceExperiment.ModelInfrastructureConfigProperty.builder()

    /**
     * @param infrastructureType The inference option to which to deploy your model. Possible values
     *   are the following:.
     * * `RealTime` : Deploy to real-time inference.
     */
    public fun infrastructureType(infrastructureType: String) {
        cdkBuilder.infrastructureType(infrastructureType)
    }

    /**
     * @param realTimeInferenceConfig The infrastructure configuration for deploying the model to
     *   real-time inference.
     */
    public fun realTimeInferenceConfig(realTimeInferenceConfig: IResolvable) {
        cdkBuilder.realTimeInferenceConfig(realTimeInferenceConfig)
    }

    /**
     * @param realTimeInferenceConfig The infrastructure configuration for deploying the model to
     *   real-time inference.
     */
    public fun realTimeInferenceConfig(
        realTimeInferenceConfig: CfnInferenceExperiment.RealTimeInferenceConfigProperty
    ) {
        cdkBuilder.realTimeInferenceConfig(realTimeInferenceConfig)
    }

    public fun build(): CfnInferenceExperiment.ModelInfrastructureConfigProperty =
        cdkBuilder.build()
}
