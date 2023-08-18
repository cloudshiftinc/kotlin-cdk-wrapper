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

package io.cloudshiftdev.awscdkdsl.pipelines

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.pipelines.DockerCredentialUsage
import software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions
import software.amazon.awscdk.services.iam.IRole

/**
 * Options for defining credentials for a Docker Credential.
 *
 * Example:
 * ```
 * ISecret dockerHubSecret = Secret.fromSecretCompleteArn(this, "DHSecret", "arn:aws:...");
 * // Only the image asset publishing actions will be granted read access to the secret.
 * DockerCredential creds = DockerCredential.dockerHub(dockerHubSecret,
 * ExternalDockerCredentialOptions.builder().usages(List.of(DockerCredentialUsage.ASSET_PUBLISHING)).build());
 * ```
 */
@CdkDslMarker
public class ExternalDockerCredentialOptionsDsl {
    private val cdkBuilder: ExternalDockerCredentialOptions.Builder =
        ExternalDockerCredentialOptions.builder()

    private val _usages: MutableList<DockerCredentialUsage> = mutableListOf()

    /** @param assumeRole An IAM role to assume prior to accessing the secret. */
    public fun assumeRole(assumeRole: IRole) {
        cdkBuilder.assumeRole(assumeRole)
    }

    /**
     * @param secretPasswordField The name of the JSON field of the secret which contains the
     *   secret/password.
     */
    public fun secretPasswordField(secretPasswordField: String) {
        cdkBuilder.secretPasswordField(secretPasswordField)
    }

    /**
     * @param secretUsernameField The name of the JSON field of the secret which contains the
     *   user/login name.
     */
    public fun secretUsernameField(secretUsernameField: String) {
        cdkBuilder.secretUsernameField(secretUsernameField)
    }

    /**
     * @param usages Defines which stages of the pipeline should be granted access to these
     *   credentials.
     */
    public fun usages(vararg usages: DockerCredentialUsage) {
        _usages.addAll(listOf(*usages))
    }

    /**
     * @param usages Defines which stages of the pipeline should be granted access to these
     *   credentials.
     */
    public fun usages(usages: Collection<DockerCredentialUsage>) {
        _usages.addAll(usages)
    }

    public fun build(): ExternalDockerCredentialOptions {
        if (_usages.isNotEmpty()) cdkBuilder.usages(_usages)
        return cdkBuilder.build()
    }
}
