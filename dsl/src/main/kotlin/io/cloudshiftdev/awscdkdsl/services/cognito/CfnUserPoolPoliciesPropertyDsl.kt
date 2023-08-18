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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * The policy associated with a user pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * PoliciesProperty policiesProperty = PoliciesProperty.builder()
 * .passwordPolicy(PasswordPolicyProperty.builder()
 * .minimumLength(123)
 * .requireLowercase(false)
 * .requireNumbers(false)
 * .requireSymbols(false)
 * .requireUppercase(false)
 * .temporaryPasswordValidityDays(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html)
 */
@CdkDslMarker
public class CfnUserPoolPoliciesPropertyDsl {
    private val cdkBuilder: CfnUserPool.PoliciesProperty.Builder =
        CfnUserPool.PoliciesProperty.builder()

    /** @param passwordPolicy The password policy. */
    public fun passwordPolicy(passwordPolicy: IResolvable) {
        cdkBuilder.passwordPolicy(passwordPolicy)
    }

    /** @param passwordPolicy The password policy. */
    public fun passwordPolicy(passwordPolicy: CfnUserPool.PasswordPolicyProperty) {
        cdkBuilder.passwordPolicy(passwordPolicy)
    }

    public fun build(): CfnUserPool.PoliciesProperty = cdkBuilder.build()
}
