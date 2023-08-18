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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * A map containing a priority as a key, and recovery method name as a value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * RecoveryOptionProperty recoveryOptionProperty = RecoveryOptionProperty.builder()
 * .name("name")
 * .priority(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-recoveryoption.html)
 */
@CdkDslMarker
public class CfnUserPoolRecoveryOptionPropertyDsl {
    private val cdkBuilder: CfnUserPool.RecoveryOptionProperty.Builder =
        CfnUserPool.RecoveryOptionProperty.builder()

    /** @param name Specifies the recovery method for a user. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param priority A positive integer specifying priority of a method with 1 being the highest
     *   priority.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun build(): CfnUserPool.RecoveryOptionProperty = cdkBuilder.build()
}
