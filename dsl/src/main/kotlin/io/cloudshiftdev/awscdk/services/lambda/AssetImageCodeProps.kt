package io.cloudshiftdev.awscdk.services.lambda

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

public interface AssetImageCodeProps : DockerImageAssetOptions {
  public fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

  public fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

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
    @JvmName("a97b43ad5b4e1d1d5faa8207303136779196583c1ebf427576252fade48a21b2")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    public fun cmd(cmd: List<String>)

    public fun cmd(vararg cmd: String)

    public fun entrypoint(entrypoint: List<String>)

    public fun entrypoint(vararg entrypoint: String)

    public fun exclude(exclude: List<String>)

    public fun exclude(vararg exclude: String)

    public fun extraHash(extraHash: String)

    public fun `file`(`file`: String)

    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)

    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2777d99f3c4e7178ce7d98822a9431b13ba33b7e14ebd29ce0cd2232b6da18f1")
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit)

    public fun networkMode(networkMode: NetworkMode)

    public fun outputs(outputs: List<String>)

    public fun outputs(vararg outputs: String)

    public fun platform(platform: Platform)

    public fun target(target: String)

    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AssetImageCodeProps.Builder =
        software.amazon.awscdk.services.lambda.AssetImageCodeProps.builder()

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
    @JvmName("a97b43ad5b4e1d1d5faa8207303136779196583c1ebf427576252fade48a21b2")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    override fun cmd(cmd: List<String>) {
      cdkBuilder.cmd(cmd)
    }

    override fun cmd(vararg cmd: String): Unit = cmd(cmd.toList())

    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    override fun entrypoint(vararg entrypoint: String): Unit = entrypoint(entrypoint.toList())

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
    @JvmName("2777d99f3c4e7178ce7d98822a9431b13ba33b7e14ebd29ce0cd2232b6da18f1")
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

    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.AssetImageCodeProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.AssetImageCodeProps,
  ) : AssetImageCodeProps {
    override fun assetName(): String? = unwrap(this).getAssetName()

    override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    override fun buildSecrets(): Map<String, String> = unwrap(this).getBuildSecrets() ?: emptyMap()

    override fun buildSsh(): String? = unwrap(this).getBuildSsh()

    override fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

    override fun cacheFrom(): List<DockerCacheOption> =
        unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

    override fun cacheTo(): DockerCacheOption? =
        unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

    override fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

    override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

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

    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AssetImageCodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AssetImageCodeProps):
        AssetImageCodeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetImageCodeProps):
        software.amazon.awscdk.services.lambda.AssetImageCodeProps = (wrapped as Wrapper).cdkObject
  }
}
