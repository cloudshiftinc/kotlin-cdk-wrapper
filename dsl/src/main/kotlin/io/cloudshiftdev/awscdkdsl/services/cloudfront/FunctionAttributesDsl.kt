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
import software.amazon.awscdk.services.cloudfront.FunctionAttributes

/**
 * Attributes of an existing CloudFront Function to import it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * FunctionAttributes functionAttributes = FunctionAttributes.builder()
 * .functionArn("functionArn")
 * .functionName("functionName")
 * .build();
 * ```
 */
@CdkDslMarker
public class FunctionAttributesDsl {
    private val cdkBuilder: FunctionAttributes.Builder = FunctionAttributes.builder()

    /** @param functionArn The ARN of the function. */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    /** @param functionName The name of the function. */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun build(): FunctionAttributes = cdkBuilder.build()
}
