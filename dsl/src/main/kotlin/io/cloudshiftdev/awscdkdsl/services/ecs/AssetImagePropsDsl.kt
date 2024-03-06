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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ecr.assets.DockerCacheOptionDsl
import io.cloudshiftdev.awscdkdsl.services.ecr.assets.DockerImageAssetInvalidationOptionsDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode
import software.amazon.awscdk.services.ecr.assets.DockerCacheOption
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
import software.amazon.awscdk.services.ecr.assets.NetworkMode
import software.amazon.awscdk.services.ecr.assets.Platform
import software.amazon.awscdk.services.ecs.AssetImageProps

/**
 * The properties for building an AssetImage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ecr.assets.*;
 * import software.amazon.awscdk.services.ecs.*;
 * NetworkMode networkMode;
 * Platform platform;
 * AssetImageProps assetImageProps = AssetImageProps.builder()
 * .assetName("assetName")
 * .buildArgs(Map.of(
 * "buildArgsKey", "buildArgs"))
 * .buildSecrets(Map.of(
 * "buildSecretsKey", "buildSecrets"))
 * .buildSsh("buildSsh")
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
 * .exclude(List.of("exclude"))
 * .extraHash("extraHash")
 * .file("file")
 * .followSymlinks(SymlinkFollowMode.NEVER)
 * .ignoreMode(IgnoreMode.GLOB)
 * .invalidation(DockerImageAssetInvalidationOptions.builder()
 * .buildArgs(false)
 * .buildSecrets(false)
 * .buildSsh(false)
 * .extraHash(false)
 * .file(false)
 * .networkMode(false)
 * .outputs(false)
 * .platform(false)
 * .repositoryName(false)
 * .target(false)
 * .build())
 * .networkMode(networkMode)
 * .outputs(List.of("outputs"))
 * .platform(platform)
 * .target("target")
 * .build();
 * ```
 */
@CdkDslMarker
public class AssetImagePropsDsl {
    private val cdkBuilder: AssetImageProps.Builder = AssetImageProps.builder()

    private val _cacheFrom: MutableList<DockerCacheOption> = mutableListOf()

    private val _exclude: MutableList<String> = mutableListOf()

    private val _outputs: MutableList<String> = mutableListOf()

    /**
     * @param assetName Unique identifier of the docker image asset and its potential revisions.
     *   Required if using AppScopedStagingSynthesizer.
     */
    public fun assetName(assetName: String) {
        cdkBuilder.assetName(assetName)
    }

    /**
     * @param buildArgs Build args to pass to the `docker build` command. Since Docker build
     *   arguments are resolved before deployment, keys and values cannot refer to unresolved tokens
     *   (such as `lambda.functionArn` or `queue.queueUrl`).
     */
    public fun buildArgs(buildArgs: Map<String, String>) {
        cdkBuilder.buildArgs(buildArgs)
    }

    /** @param buildSecrets Build secrets. Docker BuildKit must be enabled to use build secrets. */
    public fun buildSecrets(buildSecrets: Map<String, String>) {
        cdkBuilder.buildSecrets(buildSecrets)
    }

    /**
     * @param buildSsh SSH agent socket or keys to pass to the `docker build` command. Docker
     *   BuildKit must be enabled to use the ssh flag
     */
    public fun buildSsh(buildSsh: String) {
        cdkBuilder.buildSsh(buildSsh)
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

    /**
     * @param exclude File paths matching the patterns will be excluded. See `ignoreMode` to set the
     *   matching behavior. Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    /**
     * @param exclude File paths matching the patterns will be excluded. See `ignoreMode` to set the
     *   matching behavior. Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    /**
     * @param extraHash Extra information to encode into the fingerprint (e.g. build instructions
     *   and other inputs).
     */
    public fun extraHash(extraHash: String) {
        cdkBuilder.extraHash(extraHash)
    }

    /** @param file Path to the Dockerfile (relative to the directory). */
    public fun `file`(`file`: String) {
        cdkBuilder.`file`(`file`)
    }

    /** @param followSymlinks A strategy for how to handle symlinks. */
    public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
        cdkBuilder.followSymlinks(followSymlinks)
    }

    /** @param ignoreMode The ignore behavior to use for `exclude` patterns. */
    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    /**
     * @param invalidation Options to control which parameters are used to invalidate the asset
     *   hash.
     */
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptionsDsl.() -> Unit = {}) {
        val builder = DockerImageAssetInvalidationOptionsDsl()
        builder.apply(invalidation)
        cdkBuilder.invalidation(builder.build())
    }

    /**
     * @param invalidation Options to control which parameters are used to invalidate the asset
     *   hash.
     */
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
        cdkBuilder.invalidation(invalidation)
    }

    /**
     * @param networkMode Networking mode for the RUN commands during build. Support docker API
     *   1.25+.
     */
    public fun networkMode(networkMode: NetworkMode) {
        cdkBuilder.networkMode(networkMode)
    }

    /** @param outputs Outputs to pass to the `docker build` command. */
    public fun outputs(vararg outputs: String) {
        _outputs.addAll(listOf(*outputs))
    }

    /** @param outputs Outputs to pass to the `docker build` command. */
    public fun outputs(outputs: Collection<String>) {
        _outputs.addAll(outputs)
    }

    /** @param platform Platform to build for. *Requires Docker Buildx*. */
    public fun platform(platform: Platform) {
        cdkBuilder.platform(platform)
    }

    /** @param target Docker target to build to. */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): AssetImageProps {
        if (_cacheFrom.isNotEmpty()) cdkBuilder.cacheFrom(_cacheFrom)
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
