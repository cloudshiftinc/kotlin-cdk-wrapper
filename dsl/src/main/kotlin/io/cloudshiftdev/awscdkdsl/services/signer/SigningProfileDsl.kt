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

package io.cloudshiftdev.awscdkdsl.services.signer

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.signer.Platform
import software.amazon.awscdk.services.signer.SigningProfile
import software.constructs.Construct

/**
 * Defines a Signing Profile.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.signer.*;
 * SigningProfile signingProfile = SigningProfile.Builder.create(this, "SigningProfile")
 * .platform(Platform.AWS_LAMBDA_SHA384_ECDSA)
 * .build();
 * CodeSigningConfig codeSigningConfig = CodeSigningConfig.Builder.create(this, "CodeSigningConfig")
 * .signingProfiles(List.of(signingProfile))
 * .build();
 * Function.Builder.create(this, "Function")
 * .codeSigningConfig(codeSigningConfig)
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .build();
 * ```
 */
@CdkDslMarker
public class SigningProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: SigningProfile.Builder = SigningProfile.Builder.create(scope, id)

    /**
     * The Signing Platform available for signing profile.
     *
     * [Documentation](https://docs.aws.amazon.com/signer/latest/developerguide/gs-platform.html)
     *
     * @param platform The Signing Platform available for signing profile.
     */
    public fun platform(platform: Platform) {
        cdkBuilder.platform(platform)
    }

    /**
     * The validity period for signatures generated using this signing profile.
     *
     * Default: - 135 months
     *
     * @param signatureValidity The validity period for signatures generated using this signing
     *   profile.
     */
    public fun signatureValidity(signatureValidity: Duration) {
        cdkBuilder.signatureValidity(signatureValidity)
    }

    /**
     * Physical name of this Signing Profile.
     *
     * Default: - Assigned by CloudFormation (recommended).
     *
     * @param signingProfileName Physical name of this Signing Profile.
     */
    public fun signingProfileName(signingProfileName: String) {
        cdkBuilder.signingProfileName(signingProfileName)
    }

    public fun build(): SigningProfile = cdkBuilder.build()
}
