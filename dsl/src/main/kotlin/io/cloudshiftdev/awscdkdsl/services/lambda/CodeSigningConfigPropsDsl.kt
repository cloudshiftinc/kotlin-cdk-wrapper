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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.CodeSigningConfigProps
import software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment
import software.amazon.awscdk.services.signer.ISigningProfile

/**
 * Construction properties for a Code Signing Config object.
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
public class CodeSigningConfigPropsDsl {
    private val cdkBuilder: CodeSigningConfigProps.Builder = CodeSigningConfigProps.builder()

    private val _signingProfiles: MutableList<ISigningProfile> = mutableListOf()

    /** @param description Code signing configuration description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param signingProfiles List of signing profiles that defines a trusted user who can sign a
     *   code package.
     */
    public fun signingProfiles(vararg signingProfiles: ISigningProfile) {
        _signingProfiles.addAll(listOf(*signingProfiles))
    }

    /**
     * @param signingProfiles List of signing profiles that defines a trusted user who can sign a
     *   code package.
     */
    public fun signingProfiles(signingProfiles: Collection<ISigningProfile>) {
        _signingProfiles.addAll(signingProfiles)
    }

    /**
     * @param untrustedArtifactOnDeployment Code signing configuration policy for deployment
     *   validation failure. If you set the policy to Enforce, Lambda blocks the deployment request
     *   if signature validation checks fail. If you set the policy to Warn, Lambda allows the
     *   deployment and creates a CloudWatch log.
     */
    public fun untrustedArtifactOnDeployment(
        untrustedArtifactOnDeployment: UntrustedArtifactOnDeployment
    ) {
        cdkBuilder.untrustedArtifactOnDeployment(untrustedArtifactOnDeployment)
    }

    public fun build(): CodeSigningConfigProps {
        if (_signingProfiles.isNotEmpty()) cdkBuilder.signingProfiles(_signingProfiles)
        return cdkBuilder.build()
    }
}
