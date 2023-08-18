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

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps

/**
 * Construction properties of `BitBucketSourceCredentials`.
 *
 * Example:
 * ```
 * BitBucketSourceCredentials.Builder.create(this, "CodeBuildBitBucketCreds")
 * .username(SecretValue.secretsManager("my-bitbucket-creds",
 * SecretsManagerSecretOptions.builder().jsonField("username").build()))
 * .password(SecretValue.secretsManager("my-bitbucket-creds",
 * SecretsManagerSecretOptions.builder().jsonField("password").build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class BitBucketSourceCredentialsPropsDsl {
    private val cdkBuilder: BitBucketSourceCredentialsProps.Builder =
        BitBucketSourceCredentialsProps.builder()

    /** @param password Your BitBucket application password. */
    public fun password(password: SecretValue) {
        cdkBuilder.password(password)
    }

    /** @param username Your BitBucket username. */
    public fun username(username: SecretValue) {
        cdkBuilder.username(username)
    }

    public fun build(): BitBucketSourceCredentialsProps = cdkBuilder.build()
}
