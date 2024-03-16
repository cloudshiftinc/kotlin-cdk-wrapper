@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.DockerBuildOptions
import io.cloudshiftdev.awscdk.DockerCacheOption
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
 * Options when creating an asset from a Docker build.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * DockerBuildAssetOptions dockerBuildAssetOptions = DockerBuildAssetOptions.builder()
 * .buildArgs(Map.of(
 * "buildArgsKey", "buildArgs"))
 * .cacheDisabled(false)
 * .cacheFrom(List.of(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build()))
 * .cacheTo(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build())
 * .file("file")
 * .imagePath("imagePath")
 * .outputPath("outputPath")
 * .platform("platform")
 * .targetStage("targetStage")
 * .build();
 * ```
 */
public interface DockerBuildAssetOptions : DockerBuildOptions {
  /**
   * The path in the Docker image where the asset is located after the build operation.
   *
   * Default: /asset
   */
  public fun imagePath(): String? = unwrap(this).getImagePath()

  /**
   * The path on the local filesystem where the asset will be copied using `docker cp`.
   *
   * Default: - a unique temporary directory in the system temp directory
   */
  public fun outputPath(): String? = unwrap(this).getOutputPath()

  /**
   * A builder for [DockerBuildAssetOptions]
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
    @JvmName("e19f4c0b178265ccb214f0117b0031a145a1b7499d6016b90dc823a863f6e00b")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    /**
     * @param file Name of the Dockerfile, must relative to the docker build path.
     */
    public fun `file`(`file`: String)

    /**
     * @param imagePath The path in the Docker image where the asset is located after the build
     * operation.
     */
    public fun imagePath(imagePath: String)

    /**
     * @param outputPath The path on the local filesystem where the asset will be copied using
     * `docker cp`.
     */
    public fun outputPath(outputPath: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.lambda.DockerBuildAssetOptions.Builder =
        software.amazon.awscdk.services.lambda.DockerBuildAssetOptions.builder()

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
    @JvmName("e19f4c0b178265ccb214f0117b0031a145a1b7499d6016b90dc823a863f6e00b")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    /**
     * @param file Name of the Dockerfile, must relative to the docker build path.
     */
    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    /**
     * @param imagePath The path in the Docker image where the asset is located after the build
     * operation.
     */
    override fun imagePath(imagePath: String) {
      cdkBuilder.imagePath(imagePath)
    }

    /**
     * @param outputPath The path on the local filesystem where the asset will be copied using
     * `docker cp`.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
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

    public fun build(): software.amazon.awscdk.services.lambda.DockerBuildAssetOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.DockerBuildAssetOptions,
  ) : CdkObject(cdkObject), DockerBuildAssetOptions {
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
     * The path in the Docker image where the asset is located after the build operation.
     *
     * Default: /asset
     */
    override fun imagePath(): String? = unwrap(this).getImagePath()

    /**
     * The path on the local filesystem where the asset will be copied using `docker cp`.
     *
     * Default: - a unique temporary directory in the system temp directory
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerBuildAssetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DockerBuildAssetOptions):
        DockerBuildAssetOptions = CdkObjectWrappers.wrap(cdkObject) as DockerBuildAssetOptions

    internal fun unwrap(wrapped: DockerBuildAssetOptions):
        software.amazon.awscdk.services.lambda.DockerBuildAssetOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.DockerBuildAssetOptions
  }
}
