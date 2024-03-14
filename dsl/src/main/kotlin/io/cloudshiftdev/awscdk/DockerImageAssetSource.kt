package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DockerImageAssetSource {
  public fun assetName(): String? = unwrap(this).getAssetName()

  public fun directoryName(): String? = unwrap(this).getDirectoryName()

  public fun dockerBuildArgs(): Map<String, String> = unwrap(this).getDockerBuildArgs() ?:
      emptyMap()

  public fun dockerBuildSecrets(): Map<String, String> = unwrap(this).getDockerBuildSecrets() ?:
      emptyMap()

  public fun dockerBuildSsh(): String? = unwrap(this).getDockerBuildSsh()

  public fun dockerBuildTarget(): String? = unwrap(this).getDockerBuildTarget()

  public fun dockerCacheDisabled(): Boolean? = unwrap(this).getDockerCacheDisabled()

  public fun dockerCacheFrom(): List<DockerCacheOption> =
      unwrap(this).getDockerCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

  public fun dockerCacheTo(): DockerCacheOption? =
      unwrap(this).getDockerCacheTo()?.let(DockerCacheOption::wrap)

  public fun dockerFile(): String? = unwrap(this).getDockerFile()

  public fun dockerOutputs(): List<String> = unwrap(this).getDockerOutputs() ?: emptyList()

  public fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

  public fun networkMode(): String? = unwrap(this).getNetworkMode()

  public fun platform(): String? = unwrap(this).getPlatform()

  public fun sourceHash(): String

  public interface Builder {
    public fun assetName(assetName: String)

    public fun directoryName(directoryName: String)

    public fun dockerBuildArgs(dockerBuildArgs: Map<String, String>)

    public fun dockerBuildSecrets(dockerBuildSecrets: Map<String, String>)

    public fun dockerBuildSsh(dockerBuildSsh: String)

    public fun dockerBuildTarget(dockerBuildTarget: String)

    public fun dockerCacheDisabled(dockerCacheDisabled: Boolean)

    public fun dockerCacheFrom(dockerCacheFrom: List<DockerCacheOption>)

    public fun dockerCacheTo(dockerCacheTo: DockerCacheOption)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("100251e0b74a679199279257fb70f8e28f5fa8cd3e3691ebfda3c891efc2a6dc")
    public fun dockerCacheTo(dockerCacheTo: DockerCacheOption.Builder.() -> Unit)

    public fun dockerFile(dockerFile: String)

    public fun dockerOutputs(dockerOutputs: List<String>)

    public fun executable(executable: List<String>)

    public fun networkMode(networkMode: String)

    public fun platform(platform: String)

    public fun sourceHash(sourceHash: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DockerImageAssetSource.Builder =
        software.amazon.awscdk.DockerImageAssetSource.builder()

    override fun assetName(assetName: String) {
      cdkBuilder.assetName(assetName)
    }

    override fun directoryName(directoryName: String) {
      cdkBuilder.directoryName(directoryName)
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

    override fun dockerCacheDisabled(dockerCacheDisabled: Boolean) {
      cdkBuilder.dockerCacheDisabled(dockerCacheDisabled)
    }

    override fun dockerCacheFrom(dockerCacheFrom: List<DockerCacheOption>) {
      cdkBuilder.dockerCacheFrom(dockerCacheFrom.map(DockerCacheOption::unwrap))
    }

    override fun dockerCacheTo(dockerCacheTo: DockerCacheOption) {
      cdkBuilder.dockerCacheTo(dockerCacheTo.let(DockerCacheOption::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("100251e0b74a679199279257fb70f8e28f5fa8cd3e3691ebfda3c891efc2a6dc")
    override fun dockerCacheTo(dockerCacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        dockerCacheTo(DockerCacheOption(dockerCacheTo))

    override fun dockerFile(dockerFile: String) {
      cdkBuilder.dockerFile(dockerFile)
    }

    override fun dockerOutputs(dockerOutputs: List<String>) {
      cdkBuilder.dockerOutputs(dockerOutputs)
    }

    override fun executable(executable: List<String>) {
      cdkBuilder.executable(executable)
    }

    override fun networkMode(networkMode: String) {
      cdkBuilder.networkMode(networkMode)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun sourceHash(sourceHash: String) {
      cdkBuilder.sourceHash(sourceHash)
    }

    public fun build(): software.amazon.awscdk.DockerImageAssetSource = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.DockerImageAssetSource,
  ) : DockerImageAssetSource {
    override fun assetName(): String? = unwrap(this).getAssetName()

    override fun directoryName(): String? = unwrap(this).getDirectoryName()

    override fun dockerBuildArgs(): Map<String, String> = unwrap(this).getDockerBuildArgs() ?:
        emptyMap()

    override fun dockerBuildSecrets(): Map<String, String> = unwrap(this).getDockerBuildSecrets() ?:
        emptyMap()

    override fun dockerBuildSsh(): String? = unwrap(this).getDockerBuildSsh()

    override fun dockerBuildTarget(): String? = unwrap(this).getDockerBuildTarget()

    override fun dockerCacheDisabled(): Boolean? = unwrap(this).getDockerCacheDisabled()

    override fun dockerCacheFrom(): List<DockerCacheOption> =
        unwrap(this).getDockerCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

    override fun dockerCacheTo(): DockerCacheOption? =
        unwrap(this).getDockerCacheTo()?.let(DockerCacheOption::wrap)

    override fun dockerFile(): String? = unwrap(this).getDockerFile()

    override fun dockerOutputs(): List<String> = unwrap(this).getDockerOutputs() ?: emptyList()

    override fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

    override fun networkMode(): String? = unwrap(this).getNetworkMode()

    override fun platform(): String? = unwrap(this).getPlatform()

    override fun sourceHash(): String = unwrap(this).getSourceHash()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageAssetSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerImageAssetSource):
        DockerImageAssetSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageAssetSource):
        software.amazon.awscdk.DockerImageAssetSource = (wrapped as Wrapper).cdkObject
  }
}
