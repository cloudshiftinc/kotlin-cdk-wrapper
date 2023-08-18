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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes

/**
 * The attributes for imported AppSync Functions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * AppsyncFunctionAttributes appsyncFunctionAttributes = AppsyncFunctionAttributes.builder()
 * .functionArn("functionArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class AppsyncFunctionAttributesDsl {
    private val cdkBuilder: AppsyncFunctionAttributes.Builder = AppsyncFunctionAttributes.builder()

    /** @param functionArn the ARN of the AppSync function. */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    public fun build(): AppsyncFunctionAttributes = cdkBuilder.build()
}
