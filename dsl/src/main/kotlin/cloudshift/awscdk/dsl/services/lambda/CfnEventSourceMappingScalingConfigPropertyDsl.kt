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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

/**
 * (Amazon SQS only) The scaling configuration for the event source.
 *
 * To remove the configuration, pass an empty value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * ScalingConfigProperty scalingConfigProperty = ScalingConfigProperty.builder()
 * .maximumConcurrency(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-scalingconfig.html)
 */
@CdkDslMarker
public class CfnEventSourceMappingScalingConfigPropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.ScalingConfigProperty.Builder =
        CfnEventSourceMapping.ScalingConfigProperty.builder()

    /**
     * @param maximumConcurrency Limits the number of concurrent instances that the Amazon SQS event
     *   source can invoke.
     */
    public fun maximumConcurrency(maximumConcurrency: Number) {
        cdkBuilder.maximumConcurrency(maximumConcurrency)
    }

    public fun build(): CfnEventSourceMapping.ScalingConfigProperty = cdkBuilder.build()
}
