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
import software.amazon.awscdk.services.signer.SigningProfileAttributes
import kotlin.String

@CdkDslMarker
public class SigningProfileAttributesDsl {
    private val cdkBuilder: SigningProfileAttributes.Builder = SigningProfileAttributes.builder()

    public fun signingProfileName(signingProfileName: String) {
        cdkBuilder.signingProfileName(signingProfileName)
    }

    public fun signingProfileVersion(signingProfileVersion: String) {
        cdkBuilder.signingProfileVersion(signingProfileVersion)
    }

    public fun build(): SigningProfileAttributes = cdkBuilder.build()
}
