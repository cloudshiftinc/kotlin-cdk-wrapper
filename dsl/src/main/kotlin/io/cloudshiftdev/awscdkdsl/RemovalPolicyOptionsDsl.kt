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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.RemovalPolicyOptions

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * RemovalPolicyOptions removalPolicyOptions = RemovalPolicyOptions.builder()
 * .applyToUpdateReplacePolicy(false)
 * .default(RemovalPolicy.DESTROY)
 * .build();
 * ```
 */
@CdkDslMarker
public class RemovalPolicyOptionsDsl {
    private val cdkBuilder: RemovalPolicyOptions.Builder = RemovalPolicyOptions.builder()

    /**
     * @param applyToUpdateReplacePolicy Apply the same deletion policy to the resource's
     *   "UpdateReplacePolicy".
     */
    public fun applyToUpdateReplacePolicy(applyToUpdateReplacePolicy: Boolean) {
        cdkBuilder.applyToUpdateReplacePolicy(applyToUpdateReplacePolicy)
    }

    /**
     * @param defaultValue The default policy to apply in case the removal policy is not defined.
     */
    public fun defaultValue(defaultValue: RemovalPolicy) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun build(): RemovalPolicyOptions = cdkBuilder.build()
}
