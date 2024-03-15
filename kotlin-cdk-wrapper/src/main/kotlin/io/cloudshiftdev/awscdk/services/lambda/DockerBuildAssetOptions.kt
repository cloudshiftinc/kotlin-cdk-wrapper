@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.DockerBuildOptions
import io.cloudshiftdev.awscdk.DockerCacheOption
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DockerBuildAssetOptions : DockerBuildOptions {
  public fun imagePath(): String? = unwrap(this).getImagePath()

  public fun outputPath(): String? = unwrap(this).getOutputPath()

  @CdkDslMarker
  public interface Builder {
    public fun buildArgs(buildArgs: Map<String, String>)

    public fun cacheDisabled(cacheDisabled: Boolean)

    public fun cacheFrom(cacheFrom: List<DockerCacheOption>)

    public fun cacheFrom(vararg cacheFrom: DockerCacheOption)

    public fun cacheTo(cacheTo: DockerCacheOption)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e19f4c0b178265ccb214f0117b0031a145a1b7499d6016b90dc823a863f6e00b")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    public fun `file`(`file`: String)

    public fun imagePath(imagePath: String)

    public fun outputPath(outputPath: String)

    public fun platform(platform: String)

    public fun targetStage(targetStage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.DockerBuildAssetOptions.Builder =
        software.amazon.awscdk.services.lambda.DockerBuildAssetOptions.builder()

    override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e19f4c0b178265ccb214f0117b0031a145a1b7499d6016b90dc823a863f6e00b")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    override fun imagePath(imagePath: String) {
      cdkBuilder.imagePath(imagePath)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun targetStage(targetStage: String) {
      cdkBuilder.targetStage(targetStage)
    }

    public fun build(): software.amazon.awscdk.services.lambda.DockerBuildAssetOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.DockerBuildAssetOptions,
  ) : CdkObject(cdkObject), DockerBuildAssetOptions {
    override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    override fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

    override fun cacheFrom(): List<DockerCacheOption> =
        unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

    override fun cacheTo(): DockerCacheOption? =
        unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

    override fun `file`(): String? = unwrap(this).getFile()

    override fun imagePath(): String? = unwrap(this).getImagePath()

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun platform(): String? = unwrap(this).getPlatform()

    override fun targetStage(): String? = unwrap(this).getTargetStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerBuildAssetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DockerBuildAssetOptions):
        DockerBuildAssetOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerBuildAssetOptions):
        software.amazon.awscdk.services.lambda.DockerBuildAssetOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.DockerBuildAssetOptions
  }
}
