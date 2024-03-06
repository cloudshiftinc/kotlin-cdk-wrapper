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

import io.cloudshiftdev.awscdkdsl.DockerCacheOptionDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.DockerCacheOption
import software.amazon.awscdk.services.lambda.DockerBuildAssetOptions

/**
 * Options when creating an asset from a Docker build.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * DockerBuildAssetOptions dockerBuildAssetOptions = DockerBuildAssetOptions.builder()
 * .buildArgs(Map.of(
 * "buildArgsKey", "buildArgs"))
 * .cacheDisabled(false)
 * .cacheFrom(List.of(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build()))
 * .cacheTo(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build())
 * .file("file")
 * .imagePath("imagePath")
 * .outputPath("outputPath")
 * .platform("platform")
 * .targetStage("targetStage")
 * .build();
 * ```
 */
@CdkDslMarker
public class DockerBuildAssetOptionsDsl {
    private val cdkBuilder: DockerBuildAssetOptions.Builder = DockerBuildAssetOptions.builder()

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
     * @param imagePath The path in the Docker image where the asset is located after the build
     *   operation.
     */
    public fun imagePath(imagePath: String) {
        cdkBuilder.imagePath(imagePath)
    }

    /**
     * @param outputPath The path on the local filesystem where the asset will be copied using
     *   `docker cp`.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
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

    public fun build(): DockerBuildAssetOptions {
        if (_cacheFrom.isNotEmpty()) cdkBuilder.cacheFrom(_cacheFrom)
        return cdkBuilder.build()
    }
}
