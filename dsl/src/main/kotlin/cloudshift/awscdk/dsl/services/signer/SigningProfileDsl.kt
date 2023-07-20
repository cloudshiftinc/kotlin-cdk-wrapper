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

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.signer.Platform
import software.amazon.awscdk.services.signer.SigningProfile
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class SigningProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: SigningProfile.Builder = SigningProfile.Builder.create(scope, id)

    public fun platform(platform: Platform) {
        cdkBuilder.platform(platform)
    }

    public fun signatureValidity(signatureValidity: Duration) {
        cdkBuilder.signatureValidity(signatureValidity)
    }

    public fun signingProfileName(signingProfileName: String) {
        cdkBuilder.signingProfileName(signingProfileName)
    }

    public fun build(): SigningProfile = cdkBuilder.build()
}
