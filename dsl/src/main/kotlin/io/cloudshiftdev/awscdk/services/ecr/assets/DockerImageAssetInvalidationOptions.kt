package io.cloudshiftdev.awscdk.services.ecr.assets

import kotlin.Boolean
import kotlin.Unit

public interface DockerImageAssetInvalidationOptions {
  public fun buildArgs(): Boolean? = unwrap(this).getBuildArgs()

  public fun buildSecrets(): Boolean? = unwrap(this).getBuildSecrets()

  public fun buildSsh(): Boolean? = unwrap(this).getBuildSsh()

  public fun extraHash(): Boolean? = unwrap(this).getExtraHash()

  public fun `file`(): Boolean? = unwrap(this).getFile()

  public fun networkMode(): Boolean? = unwrap(this).getNetworkMode()

  public fun outputs(): Boolean? = unwrap(this).getOutputs()

  public fun platform(): Boolean? = unwrap(this).getPlatform()

  public fun repositoryName(): Boolean? = unwrap(this).getRepositoryName()

  public fun target(): Boolean? = unwrap(this).getTarget()

  public interface Builder {
    public fun buildArgs(buildArgs: Boolean) {
    }

    public fun buildSecrets(buildSecrets: Boolean) {
    }

    public fun buildSsh(buildSsh: Boolean) {
    }

    public fun extraHash(extraHash: Boolean) {
    }

    public fun `file`(`file`: Boolean) {
    }

    public fun networkMode(networkMode: Boolean) {
    }

    public fun outputs(outputs: Boolean) {
    }

    public fun platform(platform: Boolean) {
    }

    public fun repositoryName(repositoryName: Boolean) {
    }

    public fun target(target: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions.Builder =
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions.builder()

    public override fun buildArgs(buildArgs: Boolean) {
      cdkBuilder.buildArgs(buildArgs)
    }

    public override fun buildSecrets(buildSecrets: Boolean) {
      cdkBuilder.buildSecrets(buildSecrets)
    }

    public override fun buildSsh(buildSsh: Boolean) {
      cdkBuilder.buildSsh(buildSsh)
    }

    public override fun extraHash(extraHash: Boolean) {
      cdkBuilder.extraHash(extraHash)
    }

    public override fun `file`(`file`: Boolean) {
      cdkBuilder.`file`(`file`)
    }

    public override fun networkMode(networkMode: Boolean) {
      cdkBuilder.networkMode(networkMode)
    }

    public override fun outputs(outputs: Boolean) {
      cdkBuilder.outputs(outputs)
    }

    public override fun platform(platform: Boolean) {
      cdkBuilder.platform(platform)
    }

    public override fun repositoryName(repositoryName: Boolean) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public override fun target(target: Boolean) {
      cdkBuilder.target(target)
    }

    public fun build():
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions,
  ) : DockerImageAssetInvalidationOptions {
    public override fun buildArgs(): Boolean? = unwrap(this).getBuildArgs()

    public override fun buildSecrets(): Boolean? = unwrap(this).getBuildSecrets()

    public override fun buildSsh(): Boolean? = unwrap(this).getBuildSsh()

    public override fun extraHash(): Boolean? = unwrap(this).getExtraHash()

    public override fun `file`(): Boolean? = unwrap(this).getFile()

    public override fun networkMode(): Boolean? = unwrap(this).getNetworkMode()

    public override fun outputs(): Boolean? = unwrap(this).getOutputs()

    public override fun platform(): Boolean? = unwrap(this).getPlatform()

    public override fun repositoryName(): Boolean? = unwrap(this).getRepositoryName()

    public override fun target(): Boolean? = unwrap(this).getTarget()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        DockerImageAssetInvalidationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions):
        DockerImageAssetInvalidationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageAssetInvalidationOptions):
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions = (wrapped as
        Wrapper).cdkObject
  }
}
