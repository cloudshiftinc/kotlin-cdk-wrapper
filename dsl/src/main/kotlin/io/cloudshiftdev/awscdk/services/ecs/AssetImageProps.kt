package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerCacheOption
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAssetOptions
import io.cloudshiftdev.awscdk.services.ecr.assets.NetworkMode
import io.cloudshiftdev.awscdk.services.ecr.assets.Platform
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface AssetImageProps : DockerImageAssetOptions {
  public interface Builder {
    public fun assetName(assetName: String) {
    }

    public fun buildArgs(buildArgs: Map<String, String>) {
    }

    public fun buildSecrets(buildSecrets: Map<String, String>) {
    }

    public fun buildSsh(buildSsh: String) {
    }

    public fun cacheDisabled(cacheDisabled: Boolean) {
    }

    public fun cacheFrom(cacheFrom: List<DockerCacheOption>) {
    }

    public fun cacheTo(cacheTo: DockerCacheOption) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeaf5ea062a04f299f8dde614c90be82f5f5aaf47645f24010168d0fdee80d5f")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit) {
    }

    public fun exclude(exclude: List<String>) {
    }

    public fun extraHash(extraHash: String) {
    }

    public fun `file`(`file`: String) {
    }

    public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
    }

    public fun ignoreMode(ignoreMode: IgnoreMode) {
    }

    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cdc371501744480e4bb1346d1efa6fdba371fbd8e0113f315fd5299ffebf5f1")
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit) {
    }

    public fun networkMode(networkMode: NetworkMode) {
    }

    public fun outputs(outputs: List<String>) {
    }

    public fun platform(platform: Platform) {
    }

    public fun target(target: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AssetImageProps.Builder =
        software.amazon.awscdk.services.ecs.AssetImageProps.builder()

    public override fun assetName(assetName: String) {
      cdkBuilder.assetName(assetName)
    }

    public override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
    }

    public override fun buildSecrets(buildSecrets: Map<String, String>) {
      cdkBuilder.buildSecrets(buildSecrets)
    }

    public override fun buildSsh(buildSsh: String) {
      cdkBuilder.buildSsh(buildSsh)
    }

    public override fun cacheDisabled(cacheDisabled: Boolean) {
      cdkBuilder.cacheDisabled(cacheDisabled)
    }

    public override fun cacheFrom(cacheFrom: List<DockerCacheOption>) {
      cdkBuilder.cacheFrom(cacheFrom.map(DockerCacheOption::unwrap))
    }

    public override fun cacheTo(cacheTo: DockerCacheOption) {
      cdkBuilder.cacheTo(cacheTo.let(DockerCacheOption::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeaf5ea062a04f299f8dde614c90be82f5f5aaf47645f24010168d0fdee80d5f")
    public override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    public override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    public override fun extraHash(extraHash: String) {
      cdkBuilder.extraHash(extraHash)
    }

    public override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    public override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    public override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    public override fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
      cdkBuilder.invalidation(invalidation.let(DockerImageAssetInvalidationOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cdc371501744480e4bb1346d1efa6fdba371fbd8e0113f315fd5299ffebf5f1")
    public override
        fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit): Unit
        = invalidation(DockerImageAssetInvalidationOptions(invalidation))

    public override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    public override fun outputs(outputs: List<String>) {
      cdkBuilder.outputs(outputs)
    }

    public override fun platform(platform: Platform) {
      cdkBuilder.platform(platform.let(Platform::unwrap))
    }

    public override fun target(target: String) {
      cdkBuilder.target(target)
    }

    public fun build(): software.amazon.awscdk.services.ecs.AssetImageProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.AssetImageProps,
  ) : AssetImageProps {
    public override fun assetName(): String? = unwrap(this).getAssetName()

    public override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    public override fun buildSecrets(): Map<String, String> = unwrap(this).getBuildSecrets() ?:
        emptyMap()

    public override fun buildSsh(): String? = unwrap(this).getBuildSsh()

    public override fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

    public override fun cacheFrom(): List<DockerCacheOption> =
        unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

    public override fun cacheTo(): DockerCacheOption? =
        unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

    public override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    public override fun extraHash(): String? = unwrap(this).getExtraHash()

    public override fun `file`(): String? = unwrap(this).getFile()

    public override fun followSymlinks(): SymlinkFollowMode? =
        unwrap(this).getFollowSymlinks()?.let(SymlinkFollowMode::wrap)

    public override fun ignoreMode(): IgnoreMode? =
        unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)

    public override fun invalidation(): DockerImageAssetInvalidationOptions? =
        unwrap(this).getInvalidation()?.let(DockerImageAssetInvalidationOptions::wrap)

    public override fun networkMode(): NetworkMode? =
        unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

    public override fun outputs(): List<String> = unwrap(this).getOutputs() ?: emptyList()

    public override fun platform(): Platform? = unwrap(this).getPlatform()?.let(Platform::wrap)

    public override fun target(): String? = unwrap(this).getTarget()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AssetImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AssetImageProps):
        AssetImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetImageProps):
        software.amazon.awscdk.services.ecs.AssetImageProps = (wrapped as Wrapper).cdkObject
  }
}
