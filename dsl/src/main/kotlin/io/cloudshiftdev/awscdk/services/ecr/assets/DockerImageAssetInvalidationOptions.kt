package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface DockerImageAssetInvalidationOptions {
  /**
   * Use `buildArgs` while calculating the asset hash.
   *
   * Default: true
   */
  public fun buildArgs(): Boolean? = unwrap(this).getBuildArgs()

  /**
   * Use `buildSecrets` while calculating the asset hash.
   *
   * Default: true
   */
  public fun buildSecrets(): Boolean? = unwrap(this).getBuildSecrets()

  /**
   * Use `buildSsh` while calculating the asset hash.
   *
   * Default: true
   */
  public fun buildSsh(): Boolean? = unwrap(this).getBuildSsh()

  /**
   * Use `extraHash` while calculating the asset hash.
   *
   * Default: true
   */
  public fun extraHash(): Boolean? = unwrap(this).getExtraHash()

  /**
   * Use `file` while calculating the asset hash.
   *
   * Default: true
   */
  public fun `file`(): Boolean? = unwrap(this).getFile()

  /**
   * Use `networkMode` while calculating the asset hash.
   *
   * Default: true
   */
  public fun networkMode(): Boolean? = unwrap(this).getNetworkMode()

  /**
   * Use `outputs` while calculating the asset hash.
   *
   * Default: true
   */
  public fun outputs(): Boolean? = unwrap(this).getOutputs()

  /**
   * Use `platform` while calculating the asset hash.
   *
   * Default: true
   */
  public fun platform(): Boolean? = unwrap(this).getPlatform()

  /**
   * Use `repositoryName` while calculating the asset hash.
   *
   * Default: true
   */
  public fun repositoryName(): Boolean? = unwrap(this).getRepositoryName()

  /**
   * Use `target` while calculating the asset hash.
   *
   * Default: true
   */
  public fun target(): Boolean? = unwrap(this).getTarget()

  /**
   * A builder for [DockerImageAssetInvalidationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param buildArgs Use `buildArgs` while calculating the asset hash.
     */
    public fun buildArgs(buildArgs: Boolean)

    /**
     * @param buildSecrets Use `buildSecrets` while calculating the asset hash.
     */
    public fun buildSecrets(buildSecrets: Boolean)

    /**
     * @param buildSsh Use `buildSsh` while calculating the asset hash.
     */
    public fun buildSsh(buildSsh: Boolean)

    /**
     * @param extraHash Use `extraHash` while calculating the asset hash.
     */
    public fun extraHash(extraHash: Boolean)

    /**
     * @param file Use `file` while calculating the asset hash.
     */
    public fun `file`(`file`: Boolean)

    /**
     * @param networkMode Use `networkMode` while calculating the asset hash.
     */
    public fun networkMode(networkMode: Boolean)

    /**
     * @param outputs Use `outputs` while calculating the asset hash.
     */
    public fun outputs(outputs: Boolean)

    /**
     * @param platform Use `platform` while calculating the asset hash.
     */
    public fun platform(platform: Boolean)

    /**
     * @param repositoryName Use `repositoryName` while calculating the asset hash.
     */
    public fun repositoryName(repositoryName: Boolean)

    /**
     * @param target Use `target` while calculating the asset hash.
     */
    public fun target(target: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions.Builder =
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions.builder()

    /**
     * @param buildArgs Use `buildArgs` while calculating the asset hash.
     */
    override fun buildArgs(buildArgs: Boolean) {
      cdkBuilder.buildArgs(buildArgs)
    }

    /**
     * @param buildSecrets Use `buildSecrets` while calculating the asset hash.
     */
    override fun buildSecrets(buildSecrets: Boolean) {
      cdkBuilder.buildSecrets(buildSecrets)
    }

    /**
     * @param buildSsh Use `buildSsh` while calculating the asset hash.
     */
    override fun buildSsh(buildSsh: Boolean) {
      cdkBuilder.buildSsh(buildSsh)
    }

    /**
     * @param extraHash Use `extraHash` while calculating the asset hash.
     */
    override fun extraHash(extraHash: Boolean) {
      cdkBuilder.extraHash(extraHash)
    }

    /**
     * @param file Use `file` while calculating the asset hash.
     */
    override fun `file`(`file`: Boolean) {
      cdkBuilder.`file`(`file`)
    }

    /**
     * @param networkMode Use `networkMode` while calculating the asset hash.
     */
    override fun networkMode(networkMode: Boolean) {
      cdkBuilder.networkMode(networkMode)
    }

    /**
     * @param outputs Use `outputs` while calculating the asset hash.
     */
    override fun outputs(outputs: Boolean) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * @param platform Use `platform` while calculating the asset hash.
     */
    override fun platform(platform: Boolean) {
      cdkBuilder.platform(platform)
    }

    /**
     * @param repositoryName Use `repositoryName` while calculating the asset hash.
     */
    override fun repositoryName(repositoryName: Boolean) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param target Use `target` while calculating the asset hash.
     */
    override fun target(target: Boolean) {
      cdkBuilder.target(target)
    }

    public fun build():
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions,
  ) : CdkObject(cdkObject), DockerImageAssetInvalidationOptions {
    /**
     * Use `buildArgs` while calculating the asset hash.
     *
     * Default: true
     */
    override fun buildArgs(): Boolean? = unwrap(this).getBuildArgs()

    /**
     * Use `buildSecrets` while calculating the asset hash.
     *
     * Default: true
     */
    override fun buildSecrets(): Boolean? = unwrap(this).getBuildSecrets()

    /**
     * Use `buildSsh` while calculating the asset hash.
     *
     * Default: true
     */
    override fun buildSsh(): Boolean? = unwrap(this).getBuildSsh()

    /**
     * Use `extraHash` while calculating the asset hash.
     *
     * Default: true
     */
    override fun extraHash(): Boolean? = unwrap(this).getExtraHash()

    /**
     * Use `file` while calculating the asset hash.
     *
     * Default: true
     */
    override fun `file`(): Boolean? = unwrap(this).getFile()

    /**
     * Use `networkMode` while calculating the asset hash.
     *
     * Default: true
     */
    override fun networkMode(): Boolean? = unwrap(this).getNetworkMode()

    /**
     * Use `outputs` while calculating the asset hash.
     *
     * Default: true
     */
    override fun outputs(): Boolean? = unwrap(this).getOutputs()

    /**
     * Use `platform` while calculating the asset hash.
     *
     * Default: true
     */
    override fun platform(): Boolean? = unwrap(this).getPlatform()

    /**
     * Use `repositoryName` while calculating the asset hash.
     *
     * Default: true
     */
    override fun repositoryName(): Boolean? = unwrap(this).getRepositoryName()

    /**
     * Use `target` while calculating the asset hash.
     *
     * Default: true
     */
    override fun target(): Boolean? = unwrap(this).getTarget()
  }

  public companion object {
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
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
  }
}
