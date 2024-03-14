package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface DockerRunOptions {
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun network(): String? = unwrap(this).getNetwork()

  public fun platform(): String? = unwrap(this).getPlatform()

  public fun securityOpt(): String? = unwrap(this).getSecurityOpt()

  public fun user(): String? = unwrap(this).getUser()

  public fun volumes(): List<DockerVolume> = unwrap(this).getVolumes()?.map(DockerVolume::wrap) ?:
      emptyList()

  public fun volumesFrom(): List<String> = unwrap(this).getVolumesFrom() ?: emptyList()

  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  public interface Builder {
    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun entrypoint(entrypoint: List<String>)

    public fun entrypoint(vararg entrypoint: String)

    public fun environment(environment: Map<String, String>)

    public fun network(network: String)

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
    private val cdkBuilder: software.amazon.awscdk.DockerRunOptions.Builder =
        software.amazon.awscdk.DockerRunOptions.builder()

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

    override fun network(network: String) {
      cdkBuilder.network(network)
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

    public fun build(): software.amazon.awscdk.DockerRunOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.DockerRunOptions,
  ) : DockerRunOptions {
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun network(): String? = unwrap(this).getNetwork()

    override fun platform(): String? = unwrap(this).getPlatform()

    override fun securityOpt(): String? = unwrap(this).getSecurityOpt()

    override fun user(): String? = unwrap(this).getUser()

    override fun volumes(): List<DockerVolume> = unwrap(this).getVolumes()?.map(DockerVolume::wrap)
        ?: emptyList()

    override fun volumesFrom(): List<String> = unwrap(this).getVolumesFrom() ?: emptyList()

    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DockerRunOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerRunOptions): DockerRunOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerRunOptions): software.amazon.awscdk.DockerRunOptions =
        (wrapped as Wrapper).cdkObject
  }
}
