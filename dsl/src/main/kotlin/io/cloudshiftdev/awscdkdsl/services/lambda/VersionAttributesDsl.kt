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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.VersionAttributes

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * Function function_;
 * VersionAttributes versionAttributes = VersionAttributes.builder()
 * .lambda(function_)
 * .version("version")
 * .build();
 * ```
 */
@CdkDslMarker
public class VersionAttributesDsl {
    private val cdkBuilder: VersionAttributes.Builder = VersionAttributes.builder()

    /** @param lambda The lambda function. */
    public fun lambda(lambda: IFunction) {
        cdkBuilder.lambda(lambda)
    }

    /** @param version The version. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): VersionAttributes = cdkBuilder.build()
}
