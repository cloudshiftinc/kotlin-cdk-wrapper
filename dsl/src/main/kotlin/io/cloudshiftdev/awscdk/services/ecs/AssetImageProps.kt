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
    public fun assetName(assetName: String)

    public fun buildArgs(buildArgs: Map<String, String>)

    public fun buildSecrets(buildSecrets: Map<String, String>)

    public fun buildSsh(buildSsh: String)

    public fun cacheDisabled(cacheDisabled: Boolean)

    public fun cacheFrom(cacheFrom: List<DockerCacheOption>)

    public fun cacheFrom(vararg cacheFrom: DockerCacheOption)

    public fun cacheTo(cacheTo: DockerCacheOption)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeaf5ea062a04f299f8dde614c90be82f5f5aaf47645f24010168d0fdee80d5f")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    public fun exclude(exclude: List<String>)

    public fun exclude(vararg exclude: String)

    public fun extraHash(extraHash: String)

    public fun `file`(`file`: String)

    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)

    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cdc371501744480e4bb1346d1efa6fdba371fbd8e0113f315fd5299ffebf5f1")
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit)

    public fun networkMode(networkMode: NetworkMode)

    public fun outputs(outputs: List<String>)

    public fun outputs(vararg outputs: String)

    public fun platform(platform: Platform)

    public fun target(target: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AssetImageProps.Builder =
        software.amazon.awscdk.services.ecs.AssetImageProps.builder()

    override fun assetName(assetName: String) {
      cdkBuilder.assetName(assetName)
    }

    override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
    }

    override fun buildSecrets(buildSecrets: Map<String, String>) {
      cdkBuilder.buildSecrets(buildSecrets)
    }

    override fun buildSsh(buildSsh: String) {
      cdkBuilder.buildSsh(buildSsh)
    }

    override fun cacheDisabled(cacheDisabled: Boolean) {
      cdkBuilder.cacheDisabled(cacheDisabled)
    }

    override fun cacheFrom(cacheFrom: List<DockerCacheOption>) {
      cdkBuilder.cacheFrom(cacheFrom.map(DockerCacheOption::unwrap))
    }

    override fun cacheFrom(vararg cacheFrom: DockerCacheOption): Unit =
        cacheFrom(cacheFrom.toList())

    override fun cacheTo(cacheTo: DockerCacheOption) {
      cdkBuilder.cacheTo(cacheTo.let(DockerCacheOption::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeaf5ea062a04f299f8dde614c90be82f5f5aaf47645f24010168d0fdee80d5f")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    override fun extraHash(extraHash: String) {
      cdkBuilder.extraHash(extraHash)
    }

    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    override fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
      cdkBuilder.invalidation(invalidation.let(DockerImageAssetInvalidationOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cdc371501744480e4bb1346d1efa6fdba371fbd8e0113f315fd5299ffebf5f1")
    override fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit):
        Unit = invalidation(DockerImageAssetInvalidationOptions(invalidation))

    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    override fun outputs(outputs: List<String>) {
      cdkBuilder.outputs(outputs)
    }

    override fun outputs(vararg outputs: String): Unit = outputs(outputs.toList())

    override fun platform(platform: Platform) {
      cdkBuilder.platform(platform.let(Platform::unwrap))
    }

    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    public fun build(): software.amazon.awscdk.services.ecs.AssetImageProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.AssetImageProps,
  ) : AssetImageProps {
    override fun assetName(): String? = unwrap(this).getAssetName()

    override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    override fun buildSecrets(): Map<String, String> = unwrap(this).getBuildSecrets() ?: emptyMap()

    override fun buildSsh(): String? = unwrap(this).getBuildSsh()

    override fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

    override fun cacheFrom(): List<DockerCacheOption> =
        unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

    override fun cacheTo(): DockerCacheOption? =
        unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

    override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    override fun extraHash(): String? = unwrap(this).getExtraHash()

    override fun `file`(): String? = unwrap(this).getFile()

    override fun followSymlinks(): SymlinkFollowMode? =
        unwrap(this).getFollowSymlinks()?.let(SymlinkFollowMode::wrap)

    override fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)

    override fun invalidation(): DockerImageAssetInvalidationOptions? =
        unwrap(this).getInvalidation()?.let(DockerImageAssetInvalidationOptions::wrap)

    override fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

    override fun outputs(): List<String> = unwrap(this).getOutputs() ?: emptyList()

    override fun platform(): Platform? = unwrap(this).getPlatform()?.let(Platform::wrap)

    override fun target(): String? = unwrap(this).getTarget()
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
