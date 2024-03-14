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
    @JvmName("a97b43ad5b4e1d1d5faa8207303136779196583c1ebf427576252fade48a21b2")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit) {
    }

    public fun cmd(cmd: List<String>) {
    }

    public fun entrypoint(entrypoint: List<String>) {
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
    @JvmName("2777d99f3c4e7178ce7d98822a9431b13ba33b7e14ebd29ce0cd2232b6da18f1")
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

    public fun workingDirectory(workingDirectory: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AssetImageCodeProps.Builder =
        software.amazon.awscdk.services.lambda.AssetImageCodeProps.builder()

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
    @JvmName("a97b43ad5b4e1d1d5faa8207303136779196583c1ebf427576252fade48a21b2")
    public override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    public override fun cmd(cmd: List<String>) {
      cdkBuilder.cmd(cmd)
    }

    public override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
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
    @JvmName("2777d99f3c4e7178ce7d98822a9431b13ba33b7e14ebd29ce0cd2232b6da18f1")
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

    public override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.AssetImageCodeProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.AssetImageCodeProps,
  ) : AssetImageCodeProps {
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

    public override fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

    public override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

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

    public override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
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
