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

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry

/**
 * Metadata Entry spec for container images.
 *
 * Example:
 * ```
 * Map&lt;String, String&gt; entry = Map.of(
 * "packaging", "container-image",
 * "repositoryName", "repository-name",
 * "imageTag", "tag");
 * ```
 */
@CdkDslMarker
public class ContainerImageAssetMetadataEntryDsl {
    private val cdkBuilder: ContainerImageAssetMetadataEntry.Builder =
        ContainerImageAssetMetadataEntry.builder()

    private val _cacheFrom: MutableList<ContainerImageAssetCacheOption> = mutableListOf()

    private val _outputs: MutableList<String> = mutableListOf()

    /** @param buildArgs Build args to pass to the `docker build` command. */
    public fun buildArgs(buildArgs: Map<String, String>) {
        cdkBuilder.buildArgs(buildArgs)
    }

    /** @param buildSecrets Build secrets to pass to the `docker build` command. */
    public fun buildSecrets(buildSecrets: Map<String, String>) {
        cdkBuilder.buildSecrets(buildSecrets)
    }

    /** @param buildSsh SSH agent socket or keys to pass to the `docker build` command. */
    public fun buildSsh(buildSsh: String) {
        cdkBuilder.buildSsh(buildSsh)
    }

    /** @param cacheFrom Cache from options to pass to the `docker build` command. */
    public fun cacheFrom(cacheFrom: ContainerImageAssetCacheOptionDsl.() -> Unit) {
        _cacheFrom.add(ContainerImageAssetCacheOptionDsl().apply(cacheFrom).build())
    }

    /** @param cacheFrom Cache from options to pass to the `docker build` command. */
    public fun cacheFrom(cacheFrom: Collection<ContainerImageAssetCacheOption>) {
        _cacheFrom.addAll(cacheFrom)
    }

    /** @param cacheTo Cache to options to pass to the `docker build` command. */
    public fun cacheTo(cacheTo: ContainerImageAssetCacheOptionDsl.() -> Unit = {}) {
        val builder = ContainerImageAssetCacheOptionDsl()
        builder.apply(cacheTo)
        cdkBuilder.cacheTo(builder.build())
    }

    /** @param cacheTo Cache to options to pass to the `docker build` command. */
    public fun cacheTo(cacheTo: ContainerImageAssetCacheOption) {
        cdkBuilder.cacheTo(cacheTo)
    }

    /** @param file Path to the Dockerfile (relative to the directory). */
    public fun `file`(`file`: String) {
        cdkBuilder.`file`(`file`)
    }

    /** @param id Logical identifier for the asset. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param imageTag The docker image tag to use for tagging pushed images. This field is required
     *   if `imageParameterName` is ommited (otherwise, the app won't be able to find the image).
     */
    public fun imageTag(imageTag: String) {
        cdkBuilder.imageTag(imageTag)
    }

    /** @param networkMode Networking mode for the RUN commands during build. */
    public fun networkMode(networkMode: String) {
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

    /** @param packaging Type of asset. */
    public fun packaging(packaging: String) {
        cdkBuilder.packaging(packaging)
    }

    /** @param path Path on disk to the asset. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /** @param platform Platform to build for. *Requires Docker Buildx*. */
    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    /**
     * @param repositoryName ECR repository name, if omitted a default name based on the asset's ID
     *   is used instead. Specify this property if you need to statically address the image, e.g.
     *   from a Kubernetes Pod. Note, this is only the repository name, without the registry and the
     *   tag parts.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /** @param sourceHash The hash of the asset source. */
    public fun sourceHash(sourceHash: String) {
        cdkBuilder.sourceHash(sourceHash)
    }

    /** @param target Docker target to build to. */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): ContainerImageAssetMetadataEntry {
        if (_cacheFrom.isNotEmpty()) cdkBuilder.cacheFrom(_cacheFrom)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
