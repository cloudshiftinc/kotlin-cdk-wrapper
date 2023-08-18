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

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig

/**
 * A key-value pair that describes a required claim in the identity token.
 *
 * If set, each claim is verified to be present in the token with a matching value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * RequiredClaimProperty requiredClaimProperty = RequiredClaimProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-requiredclaim.html)
 */
@CdkDslMarker
public class CfnIdentityProviderConfigRequiredClaimPropertyDsl {
    private val cdkBuilder: CfnIdentityProviderConfig.RequiredClaimProperty.Builder =
        CfnIdentityProviderConfig.RequiredClaimProperty.builder()

    /** @param key The key to match from the token. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value for the key from the token. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnIdentityProviderConfig.RequiredClaimProperty = cdkBuilder.build()
}
