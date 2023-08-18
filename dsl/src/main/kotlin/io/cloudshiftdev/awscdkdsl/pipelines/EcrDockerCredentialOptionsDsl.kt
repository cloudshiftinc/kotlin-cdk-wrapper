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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.pipelines.DockerCredentialUsage
import software.amazon.awscdk.pipelines.EcrDockerCredentialOptions
import software.amazon.awscdk.services.iam.IRole

/**
 * Options for defining access for a Docker Credential composed of ECR repos.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.pipelines.*;
 * Role role;
 * EcrDockerCredentialOptions ecrDockerCredentialOptions = EcrDockerCredentialOptions.builder()
 * .assumeRole(role)
 * .usages(List.of(DockerCredentialUsage.SYNTH))
 * .build();
 * ```
 */
@CdkDslMarker
public class EcrDockerCredentialOptionsDsl {
    private val cdkBuilder: EcrDockerCredentialOptions.Builder =
        EcrDockerCredentialOptions.builder()

    private val _usages: MutableList<DockerCredentialUsage> = mutableListOf()

    /** @param assumeRole An IAM role to assume prior to accessing the secret. */
    public fun assumeRole(assumeRole: IRole) {
        cdkBuilder.assumeRole(assumeRole)
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

    public fun build(): EcrDockerCredentialOptions {
        if (_usages.isNotEmpty()) cdkBuilder.usages(_usages)
        return cdkBuilder.build()
    }
}
