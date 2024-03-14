package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DockerImageAssetProps : DockerImageAssetOptions {
  public fun directory(): String

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
    @JvmName("eff72b9e2693449e1c755fda93aaf9f0f4ec6260991b3263dce576f4c5dd4050")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit) {
    }

    public fun directory(directory: String) {
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
    @JvmName("d3482f99ca60fc0e4b765bd6fddcc5f8290bfe9159b443438ab1038fab7634db")
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
    private val cdkBuilder: software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps.Builder
        = software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps.builder()

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
    @JvmName("eff72b9e2693449e1c755fda93aaf9f0f4ec6260991b3263dce576f4c5dd4050")
    public override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    public override fun directory(directory: String) {
      cdkBuilder.directory(directory)
    }

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
    @JvmName("d3482f99ca60fc0e4b765bd6fddcc5f8290bfe9159b443438ab1038fab7634db")
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

    public fun build(): software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps,
  ) : DockerImageAssetProps {
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

    public override fun directory(): String = unwrap(this).getDirectory()

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

    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageAssetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps):
        DockerImageAssetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageAssetProps):
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps = (wrapped as
        Wrapper).cdkObject
  }
}
