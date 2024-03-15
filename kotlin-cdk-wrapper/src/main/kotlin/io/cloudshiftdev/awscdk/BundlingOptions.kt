@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface BundlingOptions {
  public fun bundlingFileAccess(): BundlingFileAccess? =
      unwrap(this).getBundlingFileAccess()?.let(BundlingFileAccess::wrap)

  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun image(): DockerImage

  public fun local(): ILocalBundling? = unwrap(this).getLocal()?.let(ILocalBundling::wrap)

  public fun network(): String? = unwrap(this).getNetwork()

  public fun outputType(): BundlingOutput? = unwrap(this).getOutputType()?.let(BundlingOutput::wrap)

  public fun platform(): String? = unwrap(this).getPlatform()

  public fun securityOpt(): String? = unwrap(this).getSecurityOpt()

  public fun user(): String? = unwrap(this).getUser()

  public fun volumes(): List<DockerVolume> = unwrap(this).getVolumes()?.map(DockerVolume::wrap) ?:
      emptyList()

  public fun volumesFrom(): List<String> = unwrap(this).getVolumesFrom() ?: emptyList()

  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  @CdkDslMarker
  public interface Builder {
    public fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess)

    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun entrypoint(entrypoint: List<String>)

    public fun entrypoint(vararg entrypoint: String)

    public fun environment(environment: Map<String, String>)

    public fun image(image: DockerImage)

    public fun local(local: ILocalBundling)

    public fun network(network: String)

    public fun outputType(outputType: BundlingOutput)

    public fun platform(platform: String)

    public fun securityOpt(securityOpt: String)

    public fun user(user: String)

    public fun volumes(volumes: List<DockerVolume>)

    public fun volumes(vararg volumes: DockerVolume)

    public fun volumesFrom(volumesFrom: List<String>)

    public fun volumesFrom(vararg volumesFrom: String)

    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.BundlingOptions.Builder =
        software.amazon.awscdk.BundlingOptions.builder()

    override fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess) {
      cdkBuilder.bundlingFileAccess(bundlingFileAccess.let(BundlingFileAccess::unwrap))
    }

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    override fun entrypoint(vararg entrypoint: String): Unit = entrypoint(entrypoint.toList())

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    override fun image(image: DockerImage) {
      cdkBuilder.image(image.let(DockerImage::unwrap))
    }

    override fun local(local: ILocalBundling) {
      cdkBuilder.local(local.let(ILocalBundling::unwrap))
    }

    override fun network(network: String) {
      cdkBuilder.network(network)
    }

    override fun outputType(outputType: BundlingOutput) {
      cdkBuilder.outputType(outputType.let(BundlingOutput::unwrap))
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun securityOpt(securityOpt: String) {
      cdkBuilder.securityOpt(securityOpt)
    }

    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    override fun volumes(volumes: List<DockerVolume>) {
      cdkBuilder.volumes(volumes.map(DockerVolume::unwrap))
    }

    override fun volumes(vararg volumes: DockerVolume): Unit = volumes(volumes.toList())

    override fun volumesFrom(volumesFrom: List<String>) {
      cdkBuilder.volumesFrom(volumesFrom)
    }

    override fun volumesFrom(vararg volumesFrom: String): Unit = volumesFrom(volumesFrom.toList())

    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.BundlingOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.BundlingOptions,
  ) : CdkObject(cdkObject), BundlingOptions {
    override fun bundlingFileAccess(): BundlingFileAccess? =
        unwrap(this).getBundlingFileAccess()?.let(BundlingFileAccess::wrap)

    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun image(): DockerImage = unwrap(this).getImage().let(DockerImage::wrap)

    override fun local(): ILocalBundling? = unwrap(this).getLocal()?.let(ILocalBundling::wrap)

    override fun network(): String? = unwrap(this).getNetwork()

    override fun outputType(): BundlingOutput? =
        unwrap(this).getOutputType()?.let(BundlingOutput::wrap)

    override fun platform(): String? = unwrap(this).getPlatform()

    override fun securityOpt(): String? = unwrap(this).getSecurityOpt()

    override fun user(): String? = unwrap(this).getUser()

    override fun volumes(): List<DockerVolume> = unwrap(this).getVolumes()?.map(DockerVolume::wrap)
        ?: emptyList()

    override fun volumesFrom(): List<String> = unwrap(this).getVolumesFrom() ?: emptyList()

    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BundlingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.BundlingOptions): BundlingOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BundlingOptions): software.amazon.awscdk.BundlingOptions = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.BundlingOptions
  }
}
