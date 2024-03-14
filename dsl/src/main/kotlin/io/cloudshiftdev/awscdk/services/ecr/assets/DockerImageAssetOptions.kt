package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.FileFingerprintOptions
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DockerImageAssetOptions : FileFingerprintOptions {
  public fun assetName(): String? = unwrap(this).getAssetName()

  public fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

  public fun buildSecrets(): Map<String, String> = unwrap(this).getBuildSecrets() ?: emptyMap()

  public fun buildSsh(): String? = unwrap(this).getBuildSsh()

  public fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

  public fun cacheFrom(): List<DockerCacheOption> =
      unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

  public fun cacheTo(): DockerCacheOption? = unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

  public fun `file`(): String? = unwrap(this).getFile()

  public fun invalidation(): DockerImageAssetInvalidationOptions? =
      unwrap(this).getInvalidation()?.let(DockerImageAssetInvalidationOptions::wrap)

  public fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

  public fun outputs(): List<String> = unwrap(this).getOutputs() ?: emptyList()

  public fun platform(): Platform? = unwrap(this).getPlatform()?.let(Platform::wrap)

  public fun target(): String? = unwrap(this).getTarget()

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
    @JvmName("64d7854d03ecc3fa18081824e0f5421b45b7fa80803d3cbee80c484a2eed8f8c")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    public fun exclude(exclude: List<String>)

    public fun exclude(vararg exclude: String)

    public fun extraHash(extraHash: String)

    public fun `file`(`file`: String)

    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)

    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66b02fe49565a63915a9d2a3d9083ccadac0d363299cdfec23708a9ea4ee6628")
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit)

    public fun networkMode(networkMode: NetworkMode)

    public fun outputs(outputs: List<String>)

    public fun outputs(vararg outputs: String)

    public fun platform(platform: Platform)

    public fun target(target: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetOptions.Builder =
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetOptions.builder()

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
    @JvmName("64d7854d03ecc3fa18081824e0f5421b45b7fa80803d3cbee80c484a2eed8f8c")
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
    @JvmName("66b02fe49565a63915a9d2a3d9083ccadac0d363299cdfec23708a9ea4ee6628")
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

    public fun build(): software.amazon.awscdk.services.ecr.assets.DockerImageAssetOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecr.assets.DockerImageAssetOptions,
  ) : DockerImageAssetOptions {
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

    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageAssetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.DockerImageAssetOptions):
        DockerImageAssetOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageAssetOptions):
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetOptions = (wrapped as
        Wrapper).cdkObject
  }
}
