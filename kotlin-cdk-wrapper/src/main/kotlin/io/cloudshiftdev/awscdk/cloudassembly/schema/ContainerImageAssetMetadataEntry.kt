@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Metadata Entry spec for container images.
 *
 * Example:
 *
 * ```
 * Map&lt;String, String&gt; entry = Map.of(
 * "packaging", "container-image",
 * "repositoryName", "repository-name",
 * "imageTag", "tag");
 * ```
 */
public interface ContainerImageAssetMetadataEntry {
  /**
   * Build args to pass to the `docker build` command.
   *
   * Default: no build args are passed
   */
  public fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

  /**
   * Build secrets to pass to the `docker build` command.
   *
   * Default: no build secrets are passed
   */
  public fun buildSecrets(): Map<String, String> = unwrap(this).getBuildSecrets() ?: emptyMap()

  /**
   * SSH agent socket or keys to pass to the `docker build` command.
   *
   * Default: no ssh arg is passed
   */
  public fun buildSsh(): String? = unwrap(this).getBuildSsh()

  /**
   * Disable the cache and pass `--no-cache` to the `docker build` command.
   *
   * Default: - cache is used
   */
  public fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

  /**
   * Cache from options to pass to the `docker build` command.
   *
   * Default: - no cache from options are passed to the build command
   *
   * [Documentation](https://docs.docker.com/build/cache/backends/)
   */
  public fun cacheFrom(): List<ContainerImageAssetCacheOption> =
      unwrap(this).getCacheFrom()?.map(ContainerImageAssetCacheOption::wrap) ?: emptyList()

  /**
   * Cache to options to pass to the `docker build` command.
   *
   * Default: - no cache to options are passed to the build command
   *
   * [Documentation](https://docs.docker.com/build/cache/backends/)
   */
  public fun cacheTo(): ContainerImageAssetCacheOption? =
      unwrap(this).getCacheTo()?.let(ContainerImageAssetCacheOption::wrap)

  /**
   * Path to the Dockerfile (relative to the directory).
   *
   * Default: - no file is passed
   */
  public fun `file`(): String? = unwrap(this).getFile()

  /**
   * Logical identifier for the asset.
   */
  public fun id(): String

  /**
   * The docker image tag to use for tagging pushed images.
   *
   * This field is
   * required if `imageParameterName` is ommited (otherwise, the app won't be
   * able to find the image).
   *
   * Default: - this parameter is REQUIRED after 1.21.0
   */
  public fun imageTag(): String? = unwrap(this).getImageTag()

  /**
   * Networking mode for the RUN commands during build.
   *
   * Default: - no networking mode specified
   */
  public fun networkMode(): String? = unwrap(this).getNetworkMode()

  /**
   * Outputs to pass to the `docker build` command.
   *
   * Default: - no outputs are passed to the build command (default outputs are used)
   *
   * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
   */
  public fun outputs(): List<String> = unwrap(this).getOutputs() ?: emptyList()

  /**
   * Type of asset.
   */
  public fun packaging(): String

  /**
   * Path on disk to the asset.
   */
  public fun path(): String

  /**
   * Platform to build for.
   *
   * *Requires Docker Buildx*.
   *
   * Default: - current machine platform
   */
  public fun platform(): String? = unwrap(this).getPlatform()

  /**
   * ECR repository name, if omitted a default name based on the asset's ID is used instead.
   *
   * Specify this property if you need to statically address the
   * image, e.g. from a Kubernetes Pod. Note, this is only the repository name,
   * without the registry and the tag parts.
   *
   * Default: - this parameter is REQUIRED after 1.21.0
   */
  public fun repositoryName(): String? = unwrap(this).getRepositoryName()

  /**
   * The hash of the asset source.
   */
  public fun sourceHash(): String

  /**
   * Docker target to build to.
   *
   * Default: no build target
   */
  public fun target(): String? = unwrap(this).getTarget()

  /**
   * A builder for [ContainerImageAssetMetadataEntry]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param buildArgs Build args to pass to the `docker build` command.
     */
    public fun buildArgs(buildArgs: Map<String, String>)

    /**
     * @param buildSecrets Build secrets to pass to the `docker build` command.
     */
    public fun buildSecrets(buildSecrets: Map<String, String>)

    /**
     * @param buildSsh SSH agent socket or keys to pass to the `docker build` command.
     */
    public fun buildSsh(buildSsh: String)

    /**
     * @param cacheDisabled Disable the cache and pass `--no-cache` to the `docker build` command.
     */
    public fun cacheDisabled(cacheDisabled: Boolean)

    /**
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    public fun cacheFrom(cacheFrom: List<ContainerImageAssetCacheOption>)

    /**
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    public fun cacheFrom(vararg cacheFrom: ContainerImageAssetCacheOption)

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    public fun cacheTo(cacheTo: ContainerImageAssetCacheOption)

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ca603f80b9a3c8c941eb94486e4795162ec40c4d222abc3466382e2e8ad353c")
    public fun cacheTo(cacheTo: ContainerImageAssetCacheOption.Builder.() -> Unit)

    /**
     * @param file Path to the Dockerfile (relative to the directory).
     */
    public fun `file`(`file`: String)

    /**
     * @param id Logical identifier for the asset. 
     */
    public fun id(id: String)

    /**
     * @param imageTag The docker image tag to use for tagging pushed images.
     * This field is
     * required if `imageParameterName` is ommited (otherwise, the app won't be
     * able to find the image).
     */
    public fun imageTag(imageTag: String)

    /**
     * @param networkMode Networking mode for the RUN commands during build.
     */
    public fun networkMode(networkMode: String)

    /**
     * @param outputs Outputs to pass to the `docker build` command.
     */
    public fun outputs(outputs: List<String>)

    /**
     * @param outputs Outputs to pass to the `docker build` command.
     */
    public fun outputs(vararg outputs: String)

    /**
     * @param packaging Type of asset. 
     */
    public fun packaging(packaging: String)

    /**
     * @param path Path on disk to the asset. 
     */
    public fun path(path: String)

    /**
     * @param platform Platform to build for.
     * *Requires Docker Buildx*.
     */
    public fun platform(platform: String)

    /**
     * @param repositoryName ECR repository name, if omitted a default name based on the asset's ID
     * is used instead.
     * Specify this property if you need to statically address the
     * image, e.g. from a Kubernetes Pod. Note, this is only the repository name,
     * without the registry and the tag parts.
     */
    public fun repositoryName(repositoryName: String)

    /**
     * @param sourceHash The hash of the asset source. 
     */
    public fun sourceHash(sourceHash: String)

    /**
     * @param target Docker target to build to.
     */
    public fun target(target: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry.Builder =
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry.builder()

    /**
     * @param buildArgs Build args to pass to the `docker build` command.
     */
    override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
    }

    /**
     * @param buildSecrets Build secrets to pass to the `docker build` command.
     */
    override fun buildSecrets(buildSecrets: Map<String, String>) {
      cdkBuilder.buildSecrets(buildSecrets)
    }

    /**
     * @param buildSsh SSH agent socket or keys to pass to the `docker build` command.
     */
    override fun buildSsh(buildSsh: String) {
      cdkBuilder.buildSsh(buildSsh)
    }

    /**
     * @param cacheDisabled Disable the cache and pass `--no-cache` to the `docker build` command.
     */
    override fun cacheDisabled(cacheDisabled: Boolean) {
      cdkBuilder.cacheDisabled(cacheDisabled)
    }

    /**
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    override fun cacheFrom(cacheFrom: List<ContainerImageAssetCacheOption>) {
      cdkBuilder.cacheFrom(cacheFrom.map(ContainerImageAssetCacheOption::unwrap))
    }

    /**
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    override fun cacheFrom(vararg cacheFrom: ContainerImageAssetCacheOption): Unit =
        cacheFrom(cacheFrom.toList())

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    override fun cacheTo(cacheTo: ContainerImageAssetCacheOption) {
      cdkBuilder.cacheTo(cacheTo.let(ContainerImageAssetCacheOption::unwrap))
    }

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ca603f80b9a3c8c941eb94486e4795162ec40c4d222abc3466382e2e8ad353c")
    override fun cacheTo(cacheTo: ContainerImageAssetCacheOption.Builder.() -> Unit): Unit =
        cacheTo(ContainerImageAssetCacheOption(cacheTo))

    /**
     * @param file Path to the Dockerfile (relative to the directory).
     */
    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    /**
     * @param id Logical identifier for the asset. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param imageTag The docker image tag to use for tagging pushed images.
     * This field is
     * required if `imageParameterName` is ommited (otherwise, the app won't be
     * able to find the image).
     */
    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    /**
     * @param networkMode Networking mode for the RUN commands during build.
     */
    override fun networkMode(networkMode: String) {
      cdkBuilder.networkMode(networkMode)
    }

    /**
     * @param outputs Outputs to pass to the `docker build` command.
     */
    override fun outputs(outputs: List<String>) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * @param outputs Outputs to pass to the `docker build` command.
     */
    override fun outputs(vararg outputs: String): Unit = outputs(outputs.toList())

    /**
     * @param packaging Type of asset. 
     */
    override fun packaging(packaging: String) {
      cdkBuilder.packaging(packaging)
    }

    /**
     * @param path Path on disk to the asset. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param platform Platform to build for.
     * *Requires Docker Buildx*.
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * @param repositoryName ECR repository name, if omitted a default name based on the asset's ID
     * is used instead.
     * Specify this property if you need to statically address the
     * image, e.g. from a Kubernetes Pod. Note, this is only the repository name,
     * without the registry and the tag parts.
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param sourceHash The hash of the asset source. 
     */
    override fun sourceHash(sourceHash: String) {
      cdkBuilder.sourceHash(sourceHash)
    }

    /**
     * @param target Docker target to build to.
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry,
  ) : CdkObject(cdkObject), ContainerImageAssetMetadataEntry {
    /**
     * Build args to pass to the `docker build` command.
     *
     * Default: no build args are passed
     */
    override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    /**
     * Build secrets to pass to the `docker build` command.
     *
     * Default: no build secrets are passed
     */
    override fun buildSecrets(): Map<String, String> = unwrap(this).getBuildSecrets() ?: emptyMap()

    /**
     * SSH agent socket or keys to pass to the `docker build` command.
     *
     * Default: no ssh arg is passed
     */
    override fun buildSsh(): String? = unwrap(this).getBuildSsh()

    /**
     * Disable the cache and pass `--no-cache` to the `docker build` command.
     *
     * Default: - cache is used
     */
    override fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

    /**
     * Cache from options to pass to the `docker build` command.
     *
     * Default: - no cache from options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     */
    override fun cacheFrom(): List<ContainerImageAssetCacheOption> =
        unwrap(this).getCacheFrom()?.map(ContainerImageAssetCacheOption::wrap) ?: emptyList()

    /**
     * Cache to options to pass to the `docker build` command.
     *
     * Default: - no cache to options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     */
    override fun cacheTo(): ContainerImageAssetCacheOption? =
        unwrap(this).getCacheTo()?.let(ContainerImageAssetCacheOption::wrap)

    /**
     * Path to the Dockerfile (relative to the directory).
     *
     * Default: - no file is passed
     */
    override fun `file`(): String? = unwrap(this).getFile()

    /**
     * Logical identifier for the asset.
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * The docker image tag to use for tagging pushed images.
     *
     * This field is
     * required if `imageParameterName` is ommited (otherwise, the app won't be
     * able to find the image).
     *
     * Default: - this parameter is REQUIRED after 1.21.0
     */
    override fun imageTag(): String? = unwrap(this).getImageTag()

    /**
     * Networking mode for the RUN commands during build.
     *
     * Default: - no networking mode specified
     */
    override fun networkMode(): String? = unwrap(this).getNetworkMode()

    /**
     * Outputs to pass to the `docker build` command.
     *
     * Default: - no outputs are passed to the build command (default outputs are used)
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
     */
    override fun outputs(): List<String> = unwrap(this).getOutputs() ?: emptyList()

    /**
     * Type of asset.
     */
    override fun packaging(): String = unwrap(this).getPackaging()

    /**
     * Path on disk to the asset.
     */
    override fun path(): String = unwrap(this).getPath()

    /**
     * Platform to build for.
     *
     * *Requires Docker Buildx*.
     *
     * Default: - current machine platform
     */
    override fun platform(): String? = unwrap(this).getPlatform()

    /**
     * ECR repository name, if omitted a default name based on the asset's ID is used instead.
     *
     * Specify this property if you need to statically address the
     * image, e.g. from a Kubernetes Pod. Note, this is only the repository name,
     * without the registry and the tag parts.
     *
     * Default: - this parameter is REQUIRED after 1.21.0
     */
    override fun repositoryName(): String? = unwrap(this).getRepositoryName()

    /**
     * The hash of the asset source.
     */
    override fun sourceHash(): String = unwrap(this).getSourceHash()

    /**
     * Docker target to build to.
     *
     * Default: no build target
     */
    override fun target(): String? = unwrap(this).getTarget()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerImageAssetMetadataEntry {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry):
        ContainerImageAssetMetadataEntry = CdkObjectWrappers.wrap(cdkObject) as
        ContainerImageAssetMetadataEntry

    internal fun unwrap(wrapped: ContainerImageAssetMetadataEntry):
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry
  }
}
