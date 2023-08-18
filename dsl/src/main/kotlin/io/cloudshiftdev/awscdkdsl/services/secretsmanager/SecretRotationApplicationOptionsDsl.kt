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

package io.cloudshiftdev.awscdkdsl.services.secretsmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions

/**
 * Options for a SecretRotationApplication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * SecretRotationApplicationOptions secretRotationApplicationOptions =
 * SecretRotationApplicationOptions.builder()
 * .isMultiUser(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class SecretRotationApplicationOptionsDsl {
    private val cdkBuilder: SecretRotationApplicationOptions.Builder =
        SecretRotationApplicationOptions.builder()

    /** @param isMultiUser Whether the rotation application uses the mutli user scheme. */
    public fun isMultiUser(isMultiUser: Boolean) {
        cdkBuilder.isMultiUser(isMultiUser)
    }

    public fun build(): SecretRotationApplicationOptions = cdkBuilder.build()
}
