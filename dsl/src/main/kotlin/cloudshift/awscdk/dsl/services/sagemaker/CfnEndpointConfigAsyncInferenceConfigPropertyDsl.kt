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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Specifies configuration for how an endpoint performs asynchronous inference.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * AsyncInferenceConfigProperty asyncInferenceConfigProperty =
 * AsyncInferenceConfigProperty.builder()
 * .outputConfig(AsyncInferenceOutputConfigProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .notificationConfig(AsyncInferenceNotificationConfigProperty.builder()
 * .errorTopic("errorTopic")
 * .includeInferenceResponseIn(List.of("includeInferenceResponseIn"))
 * .successTopic("successTopic")
 * .build())
 * .s3FailurePath("s3FailurePath")
 * .s3OutputPath("s3OutputPath")
 * .build())
 * // the properties below are optional
 * .clientConfig(AsyncInferenceClientConfigProperty.builder()
 * .maxConcurrentInvocationsPerInstance(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigAsyncInferenceConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.AsyncInferenceConfigProperty.Builder =
        CfnEndpointConfig.AsyncInferenceConfigProperty.builder()

    /**
     * @param clientConfig Configures the behavior of the client used by SageMaker to interact with
     *   the model container during asynchronous inference.
     */
    public fun clientConfig(clientConfig: IResolvable) {
        cdkBuilder.clientConfig(clientConfig)
    }

    /**
     * @param clientConfig Configures the behavior of the client used by SageMaker to interact with
     *   the model container during asynchronous inference.
     */
    public fun clientConfig(clientConfig: CfnEndpointConfig.AsyncInferenceClientConfigProperty) {
        cdkBuilder.clientConfig(clientConfig)
    }

    /**
     * @param outputConfig Specifies the configuration for asynchronous inference invocation
     *   outputs.
     */
    public fun outputConfig(outputConfig: IResolvable) {
        cdkBuilder.outputConfig(outputConfig)
    }

    /**
     * @param outputConfig Specifies the configuration for asynchronous inference invocation
     *   outputs.
     */
    public fun outputConfig(outputConfig: CfnEndpointConfig.AsyncInferenceOutputConfigProperty) {
        cdkBuilder.outputConfig(outputConfig)
    }

    public fun build(): CfnEndpointConfig.AsyncInferenceConfigProperty = cdkBuilder.build()
}
