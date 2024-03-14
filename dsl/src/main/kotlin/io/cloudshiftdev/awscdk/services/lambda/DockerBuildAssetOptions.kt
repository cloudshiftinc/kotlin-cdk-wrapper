package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.DockerBuildOptions
import io.cloudshiftdev.awscdk.DockerCacheOption
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DockerBuildAssetOptions : DockerBuildOptions {
  public fun imagePath(): String? = unwrap(this).getImagePath()

  public fun outputPath(): String? = unwrap(this).getOutputPath()

  public interface Builder {
    public fun buildArgs(buildArgs: Map<String, String>) {
    }

    public fun cacheDisabled(cacheDisabled: Boolean) {
    }

    public fun cacheFrom(cacheFrom: List<DockerCacheOption>) {
    }

    public fun cacheTo(cacheTo: DockerCacheOption) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e19f4c0b178265ccb214f0117b0031a145a1b7499d6016b90dc823a863f6e00b")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit) {
    }

    public fun `file`(`file`: String) {
    }

    public fun imagePath(imagePath: String) {
    }

    public fun outputPath(outputPath: String) {
    }

    public fun platform(platform: String) {
    }

    public fun targetStage(targetStage: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.DockerBuildAssetOptions.Builder =
        software.amazon.awscdk.services.lambda.DockerBuildAssetOptions.builder()

    public override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
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
    @JvmName("e19f4c0b178265ccb214f0117b0031a145a1b7499d6016b90dc823a863f6e00b")
    public override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    public override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    public override fun imagePath(imagePath: String) {
      cdkBuilder.imagePath(imagePath)
    }

    public override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    public override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    public override fun targetStage(targetStage: String) {
      cdkBuilder.targetStage(targetStage)
    }

    public fun build(): software.amazon.awscdk.services.lambda.DockerBuildAssetOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.DockerBuildAssetOptions,
  ) : DockerBuildAssetOptions {
    public override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    public override fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

    public override fun cacheFrom(): List<DockerCacheOption> =
        unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

    public override fun cacheTo(): DockerCacheOption? =
        unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

    public override fun `file`(): String? = unwrap(this).getFile()

    public override fun imagePath(): String? = unwrap(this).getImagePath()

    public override fun outputPath(): String? = unwrap(this).getOutputPath()

    public override fun platform(): String? = unwrap(this).getPlatform()

    public override fun targetStage(): String? = unwrap(this).getTargetStage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DockerBuildAssetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DockerBuildAssetOptions):
        DockerBuildAssetOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerBuildAssetOptions):
        software.amazon.awscdk.services.lambda.DockerBuildAssetOptions = (wrapped as
        Wrapper).cdkObject
  }
}
