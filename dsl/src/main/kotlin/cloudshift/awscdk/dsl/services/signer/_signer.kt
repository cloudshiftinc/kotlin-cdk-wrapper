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

package cloudshift.awscdk.dsl.services.signer

import software.amazon.awscdk.services.signer.CfnProfilePermission
import software.amazon.awscdk.services.signer.CfnProfilePermissionProps
import software.amazon.awscdk.services.signer.CfnSigningProfile
import software.amazon.awscdk.services.signer.CfnSigningProfileProps
import software.amazon.awscdk.services.signer.SigningProfile
import software.amazon.awscdk.services.signer.SigningProfileAttributes
import software.amazon.awscdk.services.signer.SigningProfileProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object signer {
    public inline fun cfnProfilePermission(
        scope: Construct,
        id: String,
        block: CfnProfilePermissionDsl.() -> Unit = {},
    ): CfnProfilePermission {
        val builder = CfnProfilePermissionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProfilePermissionProps(block: CfnProfilePermissionPropsDsl.() -> Unit = {}): CfnProfilePermissionProps {
        val builder = CfnProfilePermissionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSigningProfile(
        scope: Construct,
        id: String,
        block: CfnSigningProfileDsl.() -> Unit = {},
    ): CfnSigningProfile {
        val builder = CfnSigningProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSigningProfileProps(block: CfnSigningProfilePropsDsl.() -> Unit = {}): CfnSigningProfileProps {
        val builder = CfnSigningProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSigningProfileSignatureValidityPeriodProperty(
        block: CfnSigningProfileSignatureValidityPeriodPropertyDsl.() -> Unit =
            {},
    ): CfnSigningProfile.SignatureValidityPeriodProperty {
        val builder = CfnSigningProfileSignatureValidityPeriodPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun signingProfile(
        scope: Construct,
        id: String,
        block: SigningProfileDsl.() -> Unit = {},
    ): SigningProfile {
        val builder = SigningProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun signingProfileAttributes(block: SigningProfileAttributesDsl.() -> Unit = {}): SigningProfileAttributes {
        val builder = SigningProfileAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun signingProfileProps(block: SigningProfilePropsDsl.() -> Unit = {}): SigningProfileProps {
        val builder = SigningProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
