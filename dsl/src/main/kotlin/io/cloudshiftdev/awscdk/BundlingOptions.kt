package io.cloudshiftdev.awscdk

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

  public interface Builder {
    public fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess) {
    }

    public fun command(command: List<String>) {
    }

    public fun entrypoint(entrypoint: List<String>) {
    }

    public fun environment(environment: Map<String, String>) {
    }

    public fun image(image: DockerImage) {
    }

    public fun local(local: ILocalBundling) {
    }

    public fun network(network: String) {
    }

    public fun outputType(outputType: BundlingOutput) {
    }

    public fun platform(platform: String) {
    }

    public fun securityOpt(securityOpt: String) {
    }

    public fun user(user: String) {
    }

    public fun volumes(volumes: List<DockerVolume>) {
    }

    public fun volumesFrom(volumesFrom: List<String>) {
    }

    public fun workingDirectory(workingDirectory: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.BundlingOptions.Builder =
        software.amazon.awscdk.BundlingOptions.builder()

    public override fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess) {
      cdkBuilder.bundlingFileAccess(bundlingFileAccess.let(BundlingFileAccess::unwrap))
    }

    public override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    public override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    public override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    public override fun image(image: DockerImage) {
      cdkBuilder.image(image.let(DockerImage::unwrap))
    }

    public override fun local(local: ILocalBundling) {
      cdkBuilder.local(local.let(ILocalBundling::unwrap))
    }

    public override fun network(network: String) {
      cdkBuilder.network(network)
    }

    public override fun outputType(outputType: BundlingOutput) {
      cdkBuilder.outputType(outputType.let(BundlingOutput::unwrap))
    }

    public override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    public override fun securityOpt(securityOpt: String) {
      cdkBuilder.securityOpt(securityOpt)
    }

    public override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public override fun volumes(volumes: List<DockerVolume>) {
      cdkBuilder.volumes(volumes.map(DockerVolume::unwrap))
    }

    public override fun volumesFrom(volumesFrom: List<String>) {
      cdkBuilder.volumesFrom(volumesFrom)
    }

    public override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.BundlingOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.BundlingOptions,
  ) : BundlingOptions {
    public override fun bundlingFileAccess(): BundlingFileAccess? =
        unwrap(this).getBundlingFileAccess()?.let(BundlingFileAccess::wrap)

    public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    public override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?:
        emptyMap()

    public override fun image(): DockerImage = unwrap(this).getImage().let(DockerImage::wrap)

    public override fun local(): ILocalBundling? =
        unwrap(this).getLocal()?.let(ILocalBundling::wrap)

    public override fun network(): String? = unwrap(this).getNetwork()

    public override fun outputType(): BundlingOutput? =
        unwrap(this).getOutputType()?.let(BundlingOutput::wrap)

    public override fun platform(): String? = unwrap(this).getPlatform()

    public override fun securityOpt(): String? = unwrap(this).getSecurityOpt()

    public override fun user(): String? = unwrap(this).getUser()

    public override fun volumes(): List<DockerVolume> =
        unwrap(this).getVolumes()?.map(DockerVolume::wrap) ?: emptyList()

    public override fun volumesFrom(): List<String> = unwrap(this).getVolumesFrom() ?: emptyList()

    public override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BundlingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.BundlingOptions): BundlingOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BundlingOptions): software.amazon.awscdk.BundlingOptions = (wrapped
        as Wrapper).cdkObject
  }
}
