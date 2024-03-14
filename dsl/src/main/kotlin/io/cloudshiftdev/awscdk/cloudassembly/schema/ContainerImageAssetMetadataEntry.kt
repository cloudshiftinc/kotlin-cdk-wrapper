package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface ContainerImageAssetMetadataEntry {
  public fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

  public fun buildSecrets(): Map<String, String> = unwrap(this).getBuildSecrets() ?: emptyMap()

  public fun buildSsh(): String? = unwrap(this).getBuildSsh()

  public fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

  public fun cacheFrom(): List<ContainerImageAssetCacheOption> =
      unwrap(this).getCacheFrom()?.map(ContainerImageAssetCacheOption::wrap) ?: emptyList()

  public fun cacheTo(): ContainerImageAssetCacheOption? =
      unwrap(this).getCacheTo()?.let(ContainerImageAssetCacheOption::wrap)

  public fun `file`(): String? = unwrap(this).getFile()

  public fun id(): String

  public fun imageTag(): String? = unwrap(this).getImageTag()

  public fun networkMode(): String? = unwrap(this).getNetworkMode()

  public fun outputs(): List<String> = unwrap(this).getOutputs() ?: emptyList()

  public fun packaging(): String

  public fun path(): String

  public fun platform(): String? = unwrap(this).getPlatform()

  public fun repositoryName(): String? = unwrap(this).getRepositoryName()

  public fun sourceHash(): String

  public fun target(): String? = unwrap(this).getTarget()

  public interface Builder {
    public fun buildArgs(buildArgs: Map<String, String>)

    public fun buildSecrets(buildSecrets: Map<String, String>)

    public fun buildSsh(buildSsh: String)

    public fun cacheDisabled(cacheDisabled: Boolean)

    public fun cacheFrom(cacheFrom: List<ContainerImageAssetCacheOption>)

    public fun cacheFrom(vararg cacheFrom: ContainerImageAssetCacheOption)

    public fun cacheTo(cacheTo: ContainerImageAssetCacheOption)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ca603f80b9a3c8c941eb94486e4795162ec40c4d222abc3466382e2e8ad353c")
    public fun cacheTo(cacheTo: ContainerImageAssetCacheOption.Builder.() -> Unit)

    public fun `file`(`file`: String)

    public fun id(id: String)

    public fun imageTag(imageTag: String)

    public fun networkMode(networkMode: String)

    public fun outputs(outputs: List<String>)

    public fun outputs(vararg outputs: String)

    public fun packaging(packaging: String)

    public fun path(path: String)

    public fun platform(platform: String)

    public fun repositoryName(repositoryName: String)

    public fun sourceHash(sourceHash: String)

    public fun target(target: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry.Builder =
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry.builder()

    override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
    }

    override fun buildSecrets(buildSecrets: Map<String, String>) {
      cdkBuilder.buildSecrets(buildSecrets)
    }

    override fun buildSsh(buildSsh: String) {
      cdkBuilder.buildSsh(buildSsh)
    }

    override fun cacheDisabled(cacheDisabled: Boolean) {
      cdkBuilder.cacheDisabled(cacheDisabled)
    }

    override fun cacheFrom(cacheFrom: List<ContainerImageAssetCacheOption>) {
      cdkBuilder.cacheFrom(cacheFrom.map(ContainerImageAssetCacheOption::unwrap))
    }

    override fun cacheFrom(vararg cacheFrom: ContainerImageAssetCacheOption): Unit =
        cacheFrom(cacheFrom.toList())

    override fun cacheTo(cacheTo: ContainerImageAssetCacheOption) {
      cdkBuilder.cacheTo(cacheTo.let(ContainerImageAssetCacheOption::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ca603f80b9a3c8c941eb94486e4795162ec40c4d222abc3466382e2e8ad353c")
    override fun cacheTo(cacheTo: ContainerImageAssetCacheOption.Builder.() -> Unit): Unit =
        cacheTo(ContainerImageAssetCacheOption(cacheTo))

    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    override fun networkMode(networkMode: String) {
      cdkBuilder.networkMode(networkMode)
    }

    override fun outputs(outputs: List<String>) {
      cdkBuilder.outputs(outputs)
    }

    override fun outputs(vararg outputs: String): Unit = outputs(outputs.toList())

    override fun packaging(packaging: String) {
      cdkBuilder.packaging(packaging)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun sourceHash(sourceHash: String) {
      cdkBuilder.sourceHash(sourceHash)
    }

    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry,
  ) : ContainerImageAssetMetadataEntry {
    override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    override fun buildSecrets(): Map<String, String> = unwrap(this).getBuildSecrets() ?: emptyMap()

    override fun buildSsh(): String? = unwrap(this).getBuildSsh()

    override fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

    override fun cacheFrom(): List<ContainerImageAssetCacheOption> =
        unwrap(this).getCacheFrom()?.map(ContainerImageAssetCacheOption::wrap) ?: emptyList()

    override fun cacheTo(): ContainerImageAssetCacheOption? =
        unwrap(this).getCacheTo()?.let(ContainerImageAssetCacheOption::wrap)

    override fun `file`(): String? = unwrap(this).getFile()

    override fun id(): String = unwrap(this).getId()

    override fun imageTag(): String? = unwrap(this).getImageTag()

    override fun networkMode(): String? = unwrap(this).getNetworkMode()

    override fun outputs(): List<String> = unwrap(this).getOutputs() ?: emptyList()

    override fun packaging(): String = unwrap(this).getPackaging()

    override fun path(): String = unwrap(this).getPath()

    override fun platform(): String? = unwrap(this).getPlatform()

    override fun repositoryName(): String? = unwrap(this).getRepositoryName()

    override fun sourceHash(): String = unwrap(this).getSourceHash()

    override fun target(): String? = unwrap(this).getTarget()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerImageAssetMetadataEntry {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry):
        ContainerImageAssetMetadataEntry = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerImageAssetMetadataEntry):
        software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry = (wrapped as
        Wrapper).cdkObject
  }
}
