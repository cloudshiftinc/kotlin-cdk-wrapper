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
 * Specifies the serverless configuration for an endpoint variant.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ServerlessConfigProperty serverlessConfigProperty = ServerlessConfigProperty.builder()
 * .maxConcurrency(123)
 * .memorySizeInMb(123)
 * // the properties below are optional
 * .provisionedConcurrency(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-serverlessconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigServerlessConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ServerlessConfigProperty.Builder =
        CfnEndpointConfig.ServerlessConfigProperty.builder()

    /**
     * @param maxConcurrency The maximum number of concurrent invocations your serverless endpoint
     *   can process.
     */
    public fun maxConcurrency(maxConcurrency: Number) {
        cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * @param memorySizeInMb The memory size of your serverless endpoint. Valid values are in 1 GB
     *   increments: 1024 MB, 2048 MB, 3072 MB, 4096 MB, 5120 MB, or 6144 MB.
     */
    public fun memorySizeInMb(memorySizeInMb: Number) {
        cdkBuilder.memorySizeInMb(memorySizeInMb)
    }

    /** @param provisionedConcurrency the value to be set. */
    public fun provisionedConcurrency(provisionedConcurrency: Number) {
        cdkBuilder.provisionedConcurrency(provisionedConcurrency)
    }

    public fun build(): CfnEndpointConfig.ServerlessConfigProperty = cdkBuilder.build()
}
