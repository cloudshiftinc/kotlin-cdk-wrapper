package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerCacheOption
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
import io.cloudshiftdev.awscdk.services.ecr.assets.NetworkMode
import io.cloudshiftdev.awscdk.services.ecr.assets.Platform
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class AssetImageCode internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.AssetImageCode,
) : Code(cdkObject) {
  public override fun bind(scope: Construct): CodeConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  public override fun bindToResource(resource: CfnResource) {
    unwrap(this).bindToResource(resource.let(CfnResource::unwrap))
  }

  public override fun bindToResource(resource: CfnResource, options: ResourceBindOptions) {
    unwrap(this).bindToResource(resource.let(CfnResource::unwrap),
        options.let(ResourceBindOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83fd80fe1e3901a0f5645c4dd596ca04d5fabc7f1c05c24fc53008c232b144f1")
  public override fun bindToResource(resource: CfnResource,
      options: ResourceBindOptions.Builder.() -> Unit): Unit = bindToResource(resource,
      ResourceBindOptions(options))

  public open fun isInline(): Boolean = unwrap(this).getIsInline()

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
    @JvmName("33e765f9e12f761150dd83e9d93c32b1113ef18c4ee97195167a9b7f0763e1cc")
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
    @JvmName("ffd3625fc2b98ea71649fadf5499954ca10571581ab23be46f12ccb86f79940b")
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

  private class BuilderImpl(
    directory: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AssetImageCode.Builder =
        software.amazon.awscdk.services.lambda.AssetImageCode.Builder.create(directory)

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
    @JvmName("33e765f9e12f761150dd83e9d93c32b1113ef18c4ee97195167a9b7f0763e1cc")
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
    @JvmName("ffd3625fc2b98ea71649fadf5499954ca10571581ab23be46f12ccb86f79940b")
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

    public fun build(): software.amazon.awscdk.services.lambda.AssetImageCode = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(directory: String, block: Builder.() -> Unit = {}): AssetImageCode {
      val builderImpl = BuilderImpl(directory)
      return AssetImageCode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AssetImageCode):
        AssetImageCode = AssetImageCode(cdkObject)

    internal fun unwrap(wrapped: AssetImageCode):
        software.amazon.awscdk.services.lambda.AssetImageCode = wrapped.cdkObject
  }
}
