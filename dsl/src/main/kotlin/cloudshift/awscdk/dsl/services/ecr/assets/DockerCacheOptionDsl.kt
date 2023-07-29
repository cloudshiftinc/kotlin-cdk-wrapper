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

package cloudshift.awscdk.dsl.services.ecr.assets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ecr.assets.DockerCacheOption

/**
 * Options for configuring the Docker cache backend.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ecr.assets.DockerImageAsset;
 * import software.amazon.awscdk.services.ecr.assets.Platform;
 * DockerImageAsset asset = DockerImageAsset.Builder.create(this, "MyBuildImage")
 * .directory(join(__dirname, "my-image"))
 * .cacheFrom(List.of(DockerCacheOption.builder().type("registry").params(Map.of("ref",
 * "ghcr.io/myorg/myimage:cache")).build()))
 * .cacheTo(DockerCacheOption.builder().type("registry").params(Map.of("ref",
 * "ghcr.io/myorg/myimage:cache", "mode", "max", "compression", "zstd")).build())
 * .build();
 * ```
 */
@CdkDslMarker
public class DockerCacheOptionDsl {
    private val cdkBuilder: DockerCacheOption.Builder = DockerCacheOption.builder()

    /**
     * @param params Any parameters to pass into the docker cache backend configuration. Refer to
     *   https://docs.docker.com/build/cache/backends/ for cache backend configuration.
     */
    public fun params(params: Map<String, String>) {
        cdkBuilder.params(params)
    }

    /**
     * @param type The type of cache to use. Refer to https://docs.docker.com/build/cache/backends/
     *   for full list of backends.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): DockerCacheOption = cdkBuilder.build()
}
