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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnFunction

/**
 * Contains configuration information about a CloudFront function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * FunctionConfigProperty functionConfigProperty = FunctionConfigProperty.builder()
 * .comment("comment")
 * .runtime("runtime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionconfig.html)
 */
@CdkDslMarker
public class CfnFunctionFunctionConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.FunctionConfigProperty.Builder =
        CfnFunction.FunctionConfigProperty.builder()

    /** @param comment A comment to describe the function. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param runtime The function's runtime environment. The only valid value is
     *   `cloudfront-js-1.0` .
     */
    public fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
    }

    public fun build(): CfnFunction.FunctionConfigProperty = cdkBuilder.build()
}
