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
    public fun buildArgs(buildArgs: Boolean)

    public fun buildSecrets(buildSecrets: Boolean)

    public fun buildSsh(buildSsh: Boolean)

    public fun extraHash(extraHash: Boolean)

    public fun `file`(`file`: Boolean)

    public fun networkMode(networkMode: Boolean)

    public fun outputs(outputs: Boolean)

    public fun platform(platform: Boolean)

    public fun repositoryName(repositoryName: Boolean)

    public fun target(target: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions.Builder =
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions.builder()

    override fun buildArgs(buildArgs: Boolean) {
      cdkBuilder.buildArgs(buildArgs)
    }

    override fun buildSecrets(buildSecrets: Boolean) {
      cdkBuilder.buildSecrets(buildSecrets)
    }

    override fun buildSsh(buildSsh: Boolean) {
      cdkBuilder.buildSsh(buildSsh)
    }

    override fun extraHash(extraHash: Boolean) {
      cdkBuilder.extraHash(extraHash)
    }

    override fun `file`(`file`: Boolean) {
      cdkBuilder.`file`(`file`)
    }

    override fun networkMode(networkMode: Boolean) {
      cdkBuilder.networkMode(networkMode)
    }

    override fun outputs(outputs: Boolean) {
      cdkBuilder.outputs(outputs)
    }

    override fun platform(platform: Boolean) {
      cdkBuilder.platform(platform)
    }

    override fun repositoryName(repositoryName: Boolean) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun target(target: Boolean) {
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
    override fun buildArgs(): Boolean? = unwrap(this).getBuildArgs()

    override fun buildSecrets(): Boolean? = unwrap(this).getBuildSecrets()

    override fun buildSsh(): Boolean? = unwrap(this).getBuildSsh()

    override fun extraHash(): Boolean? = unwrap(this).getExtraHash()

    override fun `file`(): Boolean? = unwrap(this).getFile()

    override fun networkMode(): Boolean? = unwrap(this).getNetworkMode()

    override fun outputs(): Boolean? = unwrap(this).getOutputs()

    override fun platform(): Boolean? = unwrap(this).getPlatform()

    override fun repositoryName(): Boolean? = unwrap(this).getRepositoryName()

    override fun target(): Boolean? = unwrap(this).getTarget()
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
