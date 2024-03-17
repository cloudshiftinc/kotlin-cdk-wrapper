@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

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
 * Docker build options.
 *
 * Example:
 *
 * ```
 * Function.Builder.create(this, "Function")
 * .code(Code.fromAsset("/path/to/handler", AssetOptions.builder()
 * .bundling(BundlingOptions.builder()
 * .image(DockerImage.fromBuild("/path/to/dir/with/DockerFile", DockerBuildOptions.builder()
 * .buildArgs(Map.of(
 * "ARG1", "value1"))
 * .build()))
 * .command(List.of("my", "cool", "command"))
 * .build())
 * .build()))
 * .runtime(Runtime.PYTHON_3_9)
 * .handler("index.handler")
 * .build();
 * ```
 */
public interface DockerBuildOptions {
  /**
   * Build args.
   *
   * Default: - no build args
   */
  public fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

  /**
   * Disable the cache and pass `--no-cache` to the `docker build` command.
   *
   * Default: - cache is used
   */
  public fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

  /**
   * Cache from options to pass to the `docker build` command.
   *
   * Default: - no cache from args are passed
   */
  public fun cacheFrom(): List<DockerCacheOption> =
      unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

  /**
   * Cache to options to pass to the `docker build` command.
   *
   * Default: - no cache to args are passed
   */
  public fun cacheTo(): DockerCacheOption? = unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

  /**
   * Name of the Dockerfile, must relative to the docker build path.
   *
   * Default: `Dockerfile`
   */
  public fun `file`(): String? = unwrap(this).getFile()

  /**
   * Set platform if server is multi-platform capable. *Requires Docker Engine API v1.38+*.
   *
   * Example value: `linux/amd64`
   *
   * Default: - no platform specified
   */
  public fun platform(): String? = unwrap(this).getPlatform()

  /**
   * Set build target for multi-stage container builds. Any stage defined afterwards will be
   * ignored.
   *
   * Example value: `build-env`
   *
   * Default: - Build all stages defined in the Dockerfile
   */
  public fun targetStage(): String? = unwrap(this).getTargetStage()

  /**
   * A builder for [DockerBuildOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param buildArgs Build args.
     */
    public fun buildArgs(buildArgs: Map<String, String>)

    /**
     * @param cacheDisabled Disable the cache and pass `--no-cache` to the `docker build` command.
     */
    public fun cacheDisabled(cacheDisabled: Boolean)

    /**
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    public fun cacheFrom(cacheFrom: List<DockerCacheOption>)

    /**
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    public fun cacheFrom(vararg cacheFrom: DockerCacheOption)

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    public fun cacheTo(cacheTo: DockerCacheOption)

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0e894d0ab4286c09671433d4dc386c5887268852ccb2711b0a569e9989ce401")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    /**
     * @param file Name of the Dockerfile, must relative to the docker build path.
     */
    public fun `file`(`file`: String)

    /**
     * @param platform Set platform if server is multi-platform capable. *Requires Docker Engine API
     * v1.38+*.
     * Example value: `linux/amd64`
     */
    public fun platform(platform: String)

    /**
     * @param targetStage Set build target for multi-stage container builds. Any stage defined
     * afterwards will be ignored.
     * Example value: `build-env`
     */
    public fun targetStage(targetStage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DockerBuildOptions.Builder =
        software.amazon.awscdk.DockerBuildOptions.builder()

    /**
     * @param buildArgs Build args.
     */
    override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
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
    override fun cacheFrom(cacheFrom: List<DockerCacheOption>) {
      cdkBuilder.cacheFrom(cacheFrom.map(DockerCacheOption::unwrap))
    }

    /**
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    override fun cacheFrom(vararg cacheFrom: DockerCacheOption): Unit =
        cacheFrom(cacheFrom.toList())

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    override fun cacheTo(cacheTo: DockerCacheOption) {
      cdkBuilder.cacheTo(cacheTo.let(DockerCacheOption::unwrap))
    }

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0e894d0ab4286c09671433d4dc386c5887268852ccb2711b0a569e9989ce401")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    /**
     * @param file Name of the Dockerfile, must relative to the docker build path.
     */
    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    /**
     * @param platform Set platform if server is multi-platform capable. *Requires Docker Engine API
     * v1.38+*.
     * Example value: `linux/amd64`
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * @param targetStage Set build target for multi-stage container builds. Any stage defined
     * afterwards will be ignored.
     * Example value: `build-env`
     */
    override fun targetStage(targetStage: String) {
      cdkBuilder.targetStage(targetStage)
    }

    public fun build(): software.amazon.awscdk.DockerBuildOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.DockerBuildOptions,
  ) : CdkObject(cdkObject), DockerBuildOptions {
    /**
     * Build args.
     *
     * Default: - no build args
     */
    override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    /**
     * Disable the cache and pass `--no-cache` to the `docker build` command.
     *
     * Default: - cache is used
     */
    override fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

    /**
     * Cache from options to pass to the `docker build` command.
     *
     * Default: - no cache from args are passed
     */
    override fun cacheFrom(): List<DockerCacheOption> =
        unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

    /**
     * Cache to options to pass to the `docker build` command.
     *
     * Default: - no cache to args are passed
     */
    override fun cacheTo(): DockerCacheOption? =
        unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

    /**
     * Name of the Dockerfile, must relative to the docker build path.
     *
     * Default: `Dockerfile`
     */
    override fun `file`(): String? = unwrap(this).getFile()

    /**
     * Set platform if server is multi-platform capable. *Requires Docker Engine API v1.38+*.
     *
     * Example value: `linux/amd64`
     *
     * Default: - no platform specified
     */
    override fun platform(): String? = unwrap(this).getPlatform()

    /**
     * Set build target for multi-stage container builds. Any stage defined afterwards will be
     * ignored.
     *
     * Example value: `build-env`
     *
     * Default: - Build all stages defined in the Dockerfile
     */
    override fun targetStage(): String? = unwrap(this).getTargetStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerBuildOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerBuildOptions): DockerBuildOptions =
        CdkObjectWrappers.wrap(cdkObject) as? DockerBuildOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerBuildOptions): software.amazon.awscdk.DockerBuildOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.DockerBuildOptions
  }
}
