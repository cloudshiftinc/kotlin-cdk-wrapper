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
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

/**
 * The function's [AWS X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html)
 * tracing configuration. To sample and record incoming requests, set `Mode` to `Active` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * TracingConfigProperty tracingConfigProperty = TracingConfigProperty.builder()
 * .mode("mode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html)
 */
@CdkDslMarker
public class CfnFunctionTracingConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.TracingConfigProperty.Builder =
        CfnFunction.TracingConfigProperty.builder()

    /** @param mode The tracing mode. */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnFunction.TracingConfigProperty = cdkBuilder.build()
}
