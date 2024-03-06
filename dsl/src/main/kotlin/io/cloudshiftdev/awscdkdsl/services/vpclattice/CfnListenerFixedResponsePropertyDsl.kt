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

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.vpclattice.CfnListener

/**
 * Describes an action that returns a custom HTTP response.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * FixedResponseProperty fixedResponseProperty = FixedResponseProperty.builder()
 * .statusCode(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-fixedresponse.html)
 */
@CdkDslMarker
public class CfnListenerFixedResponsePropertyDsl {
    private val cdkBuilder: CfnListener.FixedResponseProperty.Builder =
        CfnListener.FixedResponseProperty.builder()

    /** @param statusCode The HTTP response code. */
    public fun statusCode(statusCode: Number) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnListener.FixedResponseProperty = cdkBuilder.build()
}
