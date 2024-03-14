package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DockerBuildOptions {
  public fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

  public fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

  public fun cacheFrom(): List<DockerCacheOption> =
      unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

  public fun cacheTo(): DockerCacheOption? = unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

  public fun `file`(): String? = unwrap(this).getFile()

  public fun platform(): String? = unwrap(this).getPlatform()

  public fun targetStage(): String? = unwrap(this).getTargetStage()

  public interface Builder {
    public fun buildArgs(buildArgs: Map<String, String>)

    public fun cacheDisabled(cacheDisabled: Boolean)

    public fun cacheFrom(cacheFrom: List<DockerCacheOption>)

    public fun cacheFrom(vararg cacheFrom: DockerCacheOption)

    public fun cacheTo(cacheTo: DockerCacheOption)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0e894d0ab4286c09671433d4dc386c5887268852ccb2711b0a569e9989ce401")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    public fun `file`(`file`: String)

    public fun platform(platform: String)

    public fun targetStage(targetStage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DockerBuildOptions.Builder =
        software.amazon.awscdk.DockerBuildOptions.builder()

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0e894d0ab4286c09671433d4dc386c5887268852ccb2711b0a569e9989ce401")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun targetStage(targetStage: String) {
      cdkBuilder.targetStage(targetStage)
    }

    public fun build(): software.amazon.awscdk.DockerBuildOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.DockerBuildOptions,
  ) : DockerBuildOptions {
    override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    override fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

    override fun cacheFrom(): List<DockerCacheOption> =
        unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

    override fun cacheTo(): DockerCacheOption? =
        unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

    override fun `file`(): String? = unwrap(this).getFile()

    override fun platform(): String? = unwrap(this).getPlatform()

    override fun targetStage(): String? = unwrap(this).getTargetStage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DockerBuildOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerBuildOptions): DockerBuildOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerBuildOptions): software.amazon.awscdk.DockerBuildOptions =
        (wrapped as Wrapper).cdkObject
  }
}
