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
 * Settings that take effect while the model container starts up.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * InferenceComponentStartupParametersProperty inferenceComponentStartupParametersProperty =
 * InferenceComponentStartupParametersProperty.builder()
 * .containerStartupHealthCheckTimeoutInSeconds(123)
 * .modelDataDownloadTimeoutInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentstartupparameters.html)
 */
@CdkDslMarker
public class CfnInferenceComponentInferenceComponentStartupParametersPropertyDsl {
    private val cdkBuilder:
        CfnInferenceComponent.InferenceComponentStartupParametersProperty.Builder =
        CfnInferenceComponent.InferenceComponentStartupParametersProperty.builder()

    /**
     * @param containerStartupHealthCheckTimeoutInSeconds The timeout value, in seconds, for your
     *   inference container to pass health check by Amazon S3 Hosting. For more information about
     *   health check, see
     *   [How Your Container Should Respond to Health Check (Ping) Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests)
     *   .
     */
    public fun containerStartupHealthCheckTimeoutInSeconds(
        containerStartupHealthCheckTimeoutInSeconds: Number
    ) {
        cdkBuilder.containerStartupHealthCheckTimeoutInSeconds(
            containerStartupHealthCheckTimeoutInSeconds
        )
    }

    /**
     * @param modelDataDownloadTimeoutInSeconds The timeout value, in seconds, to download and
     *   extract the model that you want to host from Amazon S3 to the individual inference instance
     *   associated with this inference component.
     */
    public fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number) {
        cdkBuilder.modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds)
    }

    public fun build(): CfnInferenceComponent.InferenceComponentStartupParametersProperty =
        cdkBuilder.build()
}
