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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions

/**
 * Options for creating a Transfer Acceleration URL.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * TransferAccelerationUrlOptions transferAccelerationUrlOptions =
 * TransferAccelerationUrlOptions.builder()
 * .dualStack(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class TransferAccelerationUrlOptionsDsl {
    private val cdkBuilder: TransferAccelerationUrlOptions.Builder =
        TransferAccelerationUrlOptions.builder()

    /** @param dualStack Dual-stack support to connect to the bucket over IPv6. */
    public fun dualStack(dualStack: Boolean) {
        cdkBuilder.dualStack(dualStack)
    }

    public fun build(): TransferAccelerationUrlOptions = cdkBuilder.build()
}
