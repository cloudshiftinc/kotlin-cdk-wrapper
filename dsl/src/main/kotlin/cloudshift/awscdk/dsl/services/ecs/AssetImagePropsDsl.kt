@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ecr.assets.DockerCacheOptionDsl
import cloudshift.awscdk.dsl.services.ecr.assets.DockerImageAssetInvalidationOptionsDsl
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode
import software.amazon.awscdk.services.ecr.assets.DockerCacheOption
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
import software.amazon.awscdk.services.ecr.assets.NetworkMode
import software.amazon.awscdk.services.ecr.assets.Platform
import software.amazon.awscdk.services.ecs.AssetImageProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class AssetImagePropsDsl {
    private val cdkBuilder: AssetImageProps.Builder = AssetImageProps.builder()

    private val _cacheFrom: MutableList<DockerCacheOption> = mutableListOf()

    private val _exclude: MutableList<String> = mutableListOf()

    private val _outputs: MutableList<String> = mutableListOf()

    public fun assetName(assetName: String) {
        cdkBuilder.assetName(assetName)
    }

    public fun buildArgs(buildArgs: Map<String, String>) {
        cdkBuilder.buildArgs(buildArgs)
    }

    public fun buildSecrets(buildSecrets: Map<String, String>) {
        cdkBuilder.buildSecrets(buildSecrets)
    }

    public fun cacheFrom(cacheFrom: DockerCacheOptionDsl.() -> Unit) {
        _cacheFrom.add(DockerCacheOptionDsl().apply(cacheFrom).build())
    }

    public fun cacheFrom(cacheFrom: Collection<DockerCacheOption>) {
        _cacheFrom.addAll(cacheFrom)
    }

    public fun cacheTo(block: DockerCacheOptionDsl.() -> Unit = {}) {
        val builder = DockerCacheOptionDsl()
        builder.apply(block)
        cdkBuilder.cacheTo(builder.build())
    }

    public fun cacheTo(cacheTo: DockerCacheOption) {
        cdkBuilder.cacheTo(cacheTo)
    }

    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    public fun extraHash(extraHash: String) {
        cdkBuilder.extraHash(extraHash)
    }

    public fun `file`(`file`: String) {
        cdkBuilder.`file`(`file`)
    }

    public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
        cdkBuilder.followSymlinks(followSymlinks)
    }

    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    public fun invalidation(block: DockerImageAssetInvalidationOptionsDsl.() -> Unit = {}) {
        val builder = DockerImageAssetInvalidationOptionsDsl()
        builder.apply(block)
        cdkBuilder.invalidation(builder.build())
    }

    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
        cdkBuilder.invalidation(invalidation)
    }

    public fun networkMode(networkMode: NetworkMode) {
        cdkBuilder.networkMode(networkMode)
    }

    public fun outputs(vararg outputs: String) {
        _outputs.addAll(listOf(*outputs))
    }

    public fun outputs(outputs: Collection<String>) {
        _outputs.addAll(outputs)
    }

    public fun platform(platform: Platform) {
        cdkBuilder.platform(platform)
    }

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
