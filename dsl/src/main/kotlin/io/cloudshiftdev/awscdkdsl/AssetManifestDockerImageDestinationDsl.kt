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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.AssetManifestDockerImageDestination
import software.amazon.awscdk.RoleOptions

/**
 * The destination for a docker image asset, when it is given to the AssetManifestBuilder.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * AssetManifestDockerImageDestination assetManifestDockerImageDestination =
 * AssetManifestDockerImageDestination.builder()
 * .repositoryName("repositoryName")
 * // the properties below are optional
 * .dockerTagPrefix("dockerTagPrefix")
 * .role(RoleOptions.builder()
 * .assumeRoleArn("assumeRoleArn")
 * // the properties below are optional
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class AssetManifestDockerImageDestinationDsl {
    private val cdkBuilder: AssetManifestDockerImageDestination.Builder =
        AssetManifestDockerImageDestination.builder()

    /** @param dockerTagPrefix Prefix to add to the asset hash to make the Docker image tag. */
    public fun dockerTagPrefix(dockerTagPrefix: String) {
        cdkBuilder.dockerTagPrefix(dockerTagPrefix)
    }

    /** @param repositoryName Repository name where the docker image asset should be written. */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /** @param role Role to use to perform the upload. */
    public fun role(role: RoleOptionsDsl.() -> Unit = {}) {
        val builder = RoleOptionsDsl()
        builder.apply(role)
        cdkBuilder.role(builder.build())
    }

    /** @param role Role to use to perform the upload. */
    public fun role(role: RoleOptions) {
        cdkBuilder.role(role)
    }

    public fun build(): AssetManifestDockerImageDestination = cdkBuilder.build()
}
