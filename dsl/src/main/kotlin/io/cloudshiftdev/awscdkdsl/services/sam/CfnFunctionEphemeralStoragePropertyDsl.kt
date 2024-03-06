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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * EphemeralStorageProperty ephemeralStorageProperty = EphemeralStorageProperty.builder()
 * .size(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-ephemeralstorage.html)
 */
@CdkDslMarker
public class CfnFunctionEphemeralStoragePropertyDsl {
    private val cdkBuilder: CfnFunction.EphemeralStorageProperty.Builder =
        CfnFunction.EphemeralStorageProperty.builder()

    /** @param size the value to be set. */
    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun build(): CfnFunction.EphemeralStorageProperty = cdkBuilder.build()
}
