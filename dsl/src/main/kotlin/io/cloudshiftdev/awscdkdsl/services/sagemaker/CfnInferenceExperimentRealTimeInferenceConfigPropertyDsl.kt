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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

/**
 * The infrastructure configuration for deploying the model to a real-time inference endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * RealTimeInferenceConfigProperty realTimeInferenceConfigProperty =
 * RealTimeInferenceConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-realtimeinferenceconfig.html)
 */
@CdkDslMarker
public class CfnInferenceExperimentRealTimeInferenceConfigPropertyDsl {
    private val cdkBuilder: CfnInferenceExperiment.RealTimeInferenceConfigProperty.Builder =
        CfnInferenceExperiment.RealTimeInferenceConfigProperty.builder()

    /** @param instanceCount The number of instances of the type specified by `InstanceType` . */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /** @param instanceType The instance type the model is deployed to. */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun build(): CfnInferenceExperiment.RealTimeInferenceConfigProperty = cdkBuilder.build()
}
