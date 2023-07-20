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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class CfnUserPoolPasswordPolicyPropertyDsl {
    private val cdkBuilder: CfnUserPool.PasswordPolicyProperty.Builder =
        CfnUserPool.PasswordPolicyProperty.builder()

    public fun minimumLength(minimumLength: Number) {
        cdkBuilder.minimumLength(minimumLength)
    }

    public fun requireLowercase(requireLowercase: Boolean) {
        cdkBuilder.requireLowercase(requireLowercase)
    }

    public fun requireLowercase(requireLowercase: IResolvable) {
        cdkBuilder.requireLowercase(requireLowercase)
    }

    public fun requireNumbers(requireNumbers: Boolean) {
        cdkBuilder.requireNumbers(requireNumbers)
    }

    public fun requireNumbers(requireNumbers: IResolvable) {
        cdkBuilder.requireNumbers(requireNumbers)
    }

    public fun requireSymbols(requireSymbols: Boolean) {
        cdkBuilder.requireSymbols(requireSymbols)
    }

    public fun requireSymbols(requireSymbols: IResolvable) {
        cdkBuilder.requireSymbols(requireSymbols)
    }

    public fun requireUppercase(requireUppercase: Boolean) {
        cdkBuilder.requireUppercase(requireUppercase)
    }

    public fun requireUppercase(requireUppercase: IResolvable) {
        cdkBuilder.requireUppercase(requireUppercase)
    }

    public fun temporaryPasswordValidityDays(temporaryPasswordValidityDays: Number) {
        cdkBuilder.temporaryPasswordValidityDays(temporaryPasswordValidityDays)
    }

    public fun build(): CfnUserPool.PasswordPolicyProperty = cdkBuilder.build()
}
