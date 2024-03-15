@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DockerImageSource {
  public fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

  public fun cacheFrom(): List<DockerCacheOption> =
      unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

  public fun cacheTo(): DockerCacheOption? = unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

  public fun directory(): String? = unwrap(this).getDirectory()

  public fun dockerBuildArgs(): Map<String, String> = unwrap(this).getDockerBuildArgs() ?:
      emptyMap()

  public fun dockerBuildSecrets(): Map<String, String> = unwrap(this).getDockerBuildSecrets() ?:
      emptyMap()

  public fun dockerBuildSsh(): String? = unwrap(this).getDockerBuildSsh()

  public fun dockerBuildTarget(): String? = unwrap(this).getDockerBuildTarget()

  public fun dockerFile(): String? = unwrap(this).getDockerFile()

  public fun dockerOutputs(): List<String> = unwrap(this).getDockerOutputs() ?: emptyList()

  public fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

  public fun networkMode(): String? = unwrap(this).getNetworkMode()

  public fun platform(): String? = unwrap(this).getPlatform()

  @CdkDslMarker
  public interface Builder {
    public fun cacheDisabled(cacheDisabled: Boolean)

    public fun cacheFrom(cacheFrom: List<DockerCacheOption>)

    public fun cacheFrom(vararg cacheFrom: DockerCacheOption)

    public fun cacheTo(cacheTo: DockerCacheOption)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6351ac2eb73a01241d0b2f13b4100f776f02dce966026e6ef65f34569c1dd197")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    public fun directory(directory: String)

    public fun dockerBuildArgs(dockerBuildArgs: Map<String, String>)

    public fun dockerBuildSecrets(dockerBuildSecrets: Map<String, String>)

    public fun dockerBuildSsh(dockerBuildSsh: String)

    public fun dockerBuildTarget(dockerBuildTarget: String)

    public fun dockerFile(dockerFile: String)

    public fun dockerOutputs(dockerOutputs: List<String>)

    public fun dockerOutputs(vararg dockerOutputs: String)

    public fun executable(executable: List<String>)

    public fun executable(vararg executable: String)

    public fun networkMode(networkMode: String)

    public fun platform(platform: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.DockerImageSource.Builder =
        software.amazon.awscdk.cloudassembly.schema.DockerImageSource.builder()

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
    @JvmName("6351ac2eb73a01241d0b2f13b4100f776f02dce966026e6ef65f34569c1dd197")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    override fun directory(directory: String) {
      cdkBuilder.directory(directory)
    }

    override fun dockerBuildArgs(dockerBuildArgs: Map<String, String>) {
      cdkBuilder.dockerBuildArgs(dockerBuildArgs)
    }

    override fun dockerBuildSecrets(dockerBuildSecrets: Map<String, String>) {
      cdkBuilder.dockerBuildSecrets(dockerBuildSecrets)
    }

    override fun dockerBuildSsh(dockerBuildSsh: String) {
      cdkBuilder.dockerBuildSsh(dockerBuildSsh)
    }

    override fun dockerBuildTarget(dockerBuildTarget: String) {
      cdkBuilder.dockerBuildTarget(dockerBuildTarget)
    }

    override fun dockerFile(dockerFile: String) {
      cdkBuilder.dockerFile(dockerFile)
    }

    override fun dockerOutputs(dockerOutputs: List<String>) {
      cdkBuilder.dockerOutputs(dockerOutputs)
    }

    override fun dockerOutputs(vararg dockerOutputs: String): Unit =
        dockerOutputs(dockerOutputs.toList())

    override fun executable(executable: List<String>) {
      cdkBuilder.executable(executable)
    }

    override fun executable(vararg executable: String): Unit = executable(executable.toList())

    override fun networkMode(networkMode: String) {
      cdkBuilder.networkMode(networkMode)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DockerImageSource =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.DockerImageSource,
  ) : CdkObject(cdkObject), DockerImageSource {
    override fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

    override fun cacheFrom(): List<DockerCacheOption> =
        unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

    override fun cacheTo(): DockerCacheOption? =
        unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

    override fun directory(): String? = unwrap(this).getDirectory()

    override fun dockerBuildArgs(): Map<String, String> = unwrap(this).getDockerBuildArgs() ?:
        emptyMap()

    override fun dockerBuildSecrets(): Map<String, String> = unwrap(this).getDockerBuildSecrets() ?:
        emptyMap()

    override fun dockerBuildSsh(): String? = unwrap(this).getDockerBuildSsh()

    override fun dockerBuildTarget(): String? = unwrap(this).getDockerBuildTarget()

    override fun dockerFile(): String? = unwrap(this).getDockerFile()

    override fun dockerOutputs(): List<String> = unwrap(this).getDockerOutputs() ?: emptyList()

    override fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

    override fun networkMode(): String? = unwrap(this).getNetworkMode()

    override fun platform(): String? = unwrap(this).getPlatform()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DockerImageSource):
        DockerImageSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageSource):
        software.amazon.awscdk.cloudassembly.schema.DockerImageSource = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.DockerImageSource
  }
}
