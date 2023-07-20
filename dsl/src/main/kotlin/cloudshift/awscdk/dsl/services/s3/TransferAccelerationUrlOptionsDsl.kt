@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions
import kotlin.Boolean

@CdkDslMarker
public class TransferAccelerationUrlOptionsDsl {
    private val cdkBuilder: TransferAccelerationUrlOptions.Builder =
        TransferAccelerationUrlOptions.builder()

    public fun dualStack(dualStack: Boolean) {
        cdkBuilder.dualStack(dualStack)
    }

    public fun build(): TransferAccelerationUrlOptions = cdkBuilder.build()
}
