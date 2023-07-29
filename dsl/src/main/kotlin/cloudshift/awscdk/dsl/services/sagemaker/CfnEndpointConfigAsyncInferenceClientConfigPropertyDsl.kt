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
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Configures the behavior of the client used by SageMaker to interact with the model container
 * during asynchronous inference.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * AsyncInferenceClientConfigProperty asyncInferenceClientConfigProperty =
 * AsyncInferenceClientConfigProperty.builder()
 * .maxConcurrentInvocationsPerInstance(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceclientconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigAsyncInferenceClientConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.AsyncInferenceClientConfigProperty.Builder =
        CfnEndpointConfig.AsyncInferenceClientConfigProperty.builder()

    /**
     * @param maxConcurrentInvocationsPerInstance The maximum number of concurrent requests sent by
     *   the SageMaker client to the model container. If no value is provided, SageMaker will choose
     *   an optimal value for you.
     */
    public fun maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance: Number) {
        cdkBuilder.maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance)
    }

    public fun build(): CfnEndpointConfig.AsyncInferenceClientConfigProperty = cdkBuilder.build()
}
