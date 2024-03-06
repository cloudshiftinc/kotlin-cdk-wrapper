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
import software.amazon.awscdk.services.sagemaker.CfnInferenceComponent

/**
 * Runtime settings for a model that is deployed with an inference component.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * InferenceComponentRuntimeConfigProperty inferenceComponentRuntimeConfigProperty =
 * InferenceComponentRuntimeConfigProperty.builder()
 * .copyCount(123)
 * .currentCopyCount(123)
 * .desiredCopyCount(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentruntimeconfig.html)
 */
@CdkDslMarker
public class CfnInferenceComponentInferenceComponentRuntimeConfigPropertyDsl {
    private val cdkBuilder: CfnInferenceComponent.InferenceComponentRuntimeConfigProperty.Builder =
        CfnInferenceComponent.InferenceComponentRuntimeConfigProperty.builder()

    /**
     * @param copyCount The number of runtime copies of the model container to deploy with the
     *   inference component. Each copy can serve inference requests.
     */
    public fun copyCount(copyCount: Number) {
        cdkBuilder.copyCount(copyCount)
    }

    /**
     * @param currentCopyCount The number of runtime copies of the model container that are
     *   currently deployed.
     */
    public fun currentCopyCount(currentCopyCount: Number) {
        cdkBuilder.currentCopyCount(currentCopyCount)
    }

    /**
     * @param desiredCopyCount The number of runtime copies of the model container that you
     *   requested to deploy with the inference component.
     */
    public fun desiredCopyCount(desiredCopyCount: Number) {
        cdkBuilder.desiredCopyCount(desiredCopyCount)
    }

    public fun build(): CfnInferenceComponent.InferenceComponentRuntimeConfigProperty =
        cdkBuilder.build()
}
