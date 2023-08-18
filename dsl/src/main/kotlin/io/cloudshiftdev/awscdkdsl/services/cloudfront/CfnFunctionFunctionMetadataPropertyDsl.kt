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
 * Contains metadata about a CloudFront function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * FunctionMetadataProperty functionMetadataProperty = FunctionMetadataProperty.builder()
 * .functionArn("functionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionmetadata.html)
 */
@CdkDslMarker
public class CfnFunctionFunctionMetadataPropertyDsl {
    private val cdkBuilder: CfnFunction.FunctionMetadataProperty.Builder =
        CfnFunction.FunctionMetadataProperty.builder()

    /**
     * @param functionArn The Amazon Resource Name (ARN) of the function. The ARN uniquely
     *   identifies the function.
     */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    public fun build(): CfnFunction.FunctionMetadataProperty = cdkBuilder.build()
}
