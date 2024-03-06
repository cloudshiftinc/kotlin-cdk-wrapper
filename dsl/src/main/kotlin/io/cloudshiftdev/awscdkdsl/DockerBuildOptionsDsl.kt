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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.DockerBuildOptions
import software.amazon.awscdk.DockerCacheOption

/**
 * Docker build options.
 *
 * Example:
 * ```
 * Function.Builder.create(this, "Function")
 * .code(Code.fromAsset("/path/to/handler", AssetOptions.builder()
 * .bundling(BundlingOptions.builder()
 * .image(DockerImage.fromBuild("/path/to/dir/with/DockerFile", DockerBuildOptions.builder()
 * .buildArgs(Map.of(
 * "ARG1", "value1"))
 * .build()))
 * .command(List.of("my", "cool", "command"))
 * .build())
 * .build()))
 * .runtime(Runtime.PYTHON_3_9)
 * .handler("index.handler")
 * .build();
 * ```
 */
@CdkDslMarker
public class DockerBuildOptionsDsl {
    private val cdkBuilder: DockerBuildOptions.Builder = DockerBuildOptions.builder()

    private val _cacheFrom: MutableList<DockerCacheOption> = mutableListOf()

    /** @param buildArgs Build args. */
    public fun buildArgs(buildArgs: Map<String, String>) {
        cdkBuilder.buildArgs(buildArgs)
    }

    /**
     * @param cacheDisabled Disable the cache and pass `--no-cache` to the `docker build` command.
     */
    public fun cacheDisabled(cacheDisabled: Boolean) {
        cdkBuilder.cacheDisabled(cacheDisabled)
    }

    /** @param cacheFrom Cache from options to pass to the `docker build` command. */
    public fun cacheFrom(cacheFrom: DockerCacheOptionDsl.() -> Unit) {
        _cacheFrom.add(DockerCacheOptionDsl().apply(cacheFrom).build())
    }

    /** @param cacheFrom Cache from options to pass to the `docker build` command. */
    public fun cacheFrom(cacheFrom: Collection<DockerCacheOption>) {
        _cacheFrom.addAll(cacheFrom)
    }

    /** @param cacheTo Cache to options to pass to the `docker build` command. */
    public fun cacheTo(cacheTo: DockerCacheOptionDsl.() -> Unit = {}) {
        val builder = DockerCacheOptionDsl()
        builder.apply(cacheTo)
        cdkBuilder.cacheTo(builder.build())
    }

    /** @param cacheTo Cache to options to pass to the `docker build` command. */
    public fun cacheTo(cacheTo: DockerCacheOption) {
        cdkBuilder.cacheTo(cacheTo)
    }

    /** @param file Name of the Dockerfile, must relative to the docker build path. */
    public fun `file`(`file`: String) {
        cdkBuilder.`file`(`file`)
    }

    /**
     * @param platform Set platform if server is multi-platform capable. *Requires Docker Engine API
     *   v1.38+*. Example value: `linux/amd64`
     */
    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    /**
     * @param targetStage Set build target for multi-stage container builds. Any stage defined
     *   afterwards will be ignored. Example value: `build-env`
     */
    public fun targetStage(targetStage: String) {
        cdkBuilder.targetStage(targetStage)
    }

    public fun build(): DockerBuildOptions {
        if (_cacheFrom.isNotEmpty()) cdkBuilder.cacheFrom(_cacheFrom)
        return cdkBuilder.build()
    }
}
