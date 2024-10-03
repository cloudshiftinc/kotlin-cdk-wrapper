@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Docker run options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * DockerRunOptions dockerRunOptions = DockerRunOptions.builder()
 * .command(List.of("command"))
 * .entrypoint(List.of("entrypoint"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .network("network")
 * .platform("platform")
 * .securityOpt("securityOpt")
 * .user("user")
 * .volumes(List.of(DockerVolume.builder()
 * .containerPath("containerPath")
 * .hostPath("hostPath")
 * // the properties below are optional
 * .consistency(DockerVolumeConsistency.CONSISTENT)
 * .build()))
 * .volumesFrom(List.of("volumesFrom"))
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 */
public interface DockerRunOptions {
  /**
   * The command to run in the container.
   *
   * Default: - run the command defined in the image
   */
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * The entrypoint to run in the container.
   *
   * Default: - run the entrypoint defined in the image
   */
  public fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

  /**
   * The environment variables to pass to the container.
   *
   * Default: - no environment variables.
   */
  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  /**
   * Docker [Networking
   * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
   *
   * Default: - no networking options
   */
  public fun network(): String? = unwrap(this).getNetwork()

  /**
   * Set platform if server is multi-platform capable. *Requires Docker Engine API v1.38+*.
   *
   * Example value: `linux/amd64`
   *
   * Default: - no platform specified
   */
  public fun platform(): String? = unwrap(this).getPlatform()

  /**
   * [Security configuration](https://docs.docker.com/engine/reference/run/#security-configuration)
   * when running the docker container.
   *
   * Default: - no security options
   */
  public fun securityOpt(): String? = unwrap(this).getSecurityOpt()

  /**
   * The user to use when running the container.
   *
   * Default: - root or image default
   */
  public fun user(): String? = unwrap(this).getUser()

  /**
   * Docker volumes to mount.
   *
   * Default: - no volumes are mounted
   */
  public fun volumes(): List<DockerVolume> = unwrap(this).getVolumes()?.map(DockerVolume::wrap) ?:
      emptyList()

  /**
   * Where to mount the specified volumes from.
   *
   * Default: - no containers are specified to mount volumes from
   *
   * [Documentation](https://docs.docker.com/engine/reference/commandline/run/#mount-volumes-from-container---volumes-from)
   */
  public fun volumesFrom(): List<String> = unwrap(this).getVolumesFrom() ?: emptyList()

  /**
   * Working directory inside the container.
   *
   * Default: - image default
   */
  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  /**
   * A builder for [DockerRunOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param command The command to run in the container.
     */
    public fun command(command: List<String>)

    /**
     * @param command The command to run in the container.
     */
    public fun command(vararg command: String)

    /**
     * @param entrypoint The entrypoint to run in the container.
     */
    public fun entrypoint(entrypoint: List<String>)

    /**
     * @param entrypoint The entrypoint to run in the container.
     */
    public fun entrypoint(vararg entrypoint: String)

    /**
     * @param environment The environment variables to pass to the container.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param network Docker [Networking
     * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
     */
    public fun network(network: String)

    /**
     * @param platform Set platform if server is multi-platform capable. *Requires Docker Engine API
     * v1.38+*.
     * Example value: `linux/amd64`
     */
    public fun platform(platform: String)

    /**
     * @param securityOpt [Security
     * configuration](https://docs.docker.com/engine/reference/run/#security-configuration) when
     * running the docker container.
     */
    public fun securityOpt(securityOpt: String)

    /**
     * @param user The user to use when running the container.
     */
    public fun user(user: String)

    /**
     * @param volumes Docker volumes to mount.
     */
    public fun volumes(volumes: List<DockerVolume>)

    /**
     * @param volumes Docker volumes to mount.
     */
    public fun volumes(vararg volumes: DockerVolume)

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    public fun volumesFrom(volumesFrom: List<String>)

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    public fun volumesFrom(vararg volumesFrom: String)

    /**
     * @param workingDirectory Working directory inside the container.
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DockerRunOptions.Builder =
        software.amazon.awscdk.DockerRunOptions.builder()

    /**
     * @param command The command to run in the container.
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command The command to run in the container.
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param entrypoint The entrypoint to run in the container.
     */
    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    /**
     * @param entrypoint The entrypoint to run in the container.
     */
    override fun entrypoint(vararg entrypoint: String): Unit = entrypoint(entrypoint.toList())

    /**
     * @param environment The environment variables to pass to the container.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param network Docker [Networking
     * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
     */
    override fun network(network: String) {
      cdkBuilder.network(network)
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
     * @param securityOpt [Security
     * configuration](https://docs.docker.com/engine/reference/run/#security-configuration) when
     * running the docker container.
     */
    override fun securityOpt(securityOpt: String) {
      cdkBuilder.securityOpt(securityOpt)
    }

    /**
     * @param user The user to use when running the container.
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    /**
     * @param volumes Docker volumes to mount.
     */
    override fun volumes(volumes: List<DockerVolume>) {
      cdkBuilder.volumes(volumes.map(DockerVolume.Companion::unwrap))
    }

    /**
     * @param volumes Docker volumes to mount.
     */
    override fun volumes(vararg volumes: DockerVolume): Unit = volumes(volumes.toList())

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    override fun volumesFrom(volumesFrom: List<String>) {
      cdkBuilder.volumesFrom(volumesFrom)
    }

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    override fun volumesFrom(vararg volumesFrom: String): Unit = volumesFrom(volumesFrom.toList())

    /**
     * @param workingDirectory Working directory inside the container.
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.DockerRunOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.DockerRunOptions,
  ) : CdkObject(cdkObject),
      DockerRunOptions {
    /**
     * The command to run in the container.
     *
     * Default: - run the command defined in the image
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The entrypoint to run in the container.
     *
     * Default: - run the entrypoint defined in the image
     */
    override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    /**
     * The environment variables to pass to the container.
     *
     * Default: - no environment variables.
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * Docker [Networking
     * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
     *
     * Default: - no networking options
     */
    override fun network(): String? = unwrap(this).getNetwork()

    /**
     * Set platform if server is multi-platform capable. *Requires Docker Engine API v1.38+*.
     *
     * Example value: `linux/amd64`
     *
     * Default: - no platform specified
     */
    override fun platform(): String? = unwrap(this).getPlatform()

    /**
     * [Security
     * configuration](https://docs.docker.com/engine/reference/run/#security-configuration) when
     * running the docker container.
     *
     * Default: - no security options
     */
    override fun securityOpt(): String? = unwrap(this).getSecurityOpt()

    /**
     * The user to use when running the container.
     *
     * Default: - root or image default
     */
    override fun user(): String? = unwrap(this).getUser()

    /**
     * Docker volumes to mount.
     *
     * Default: - no volumes are mounted
     */
    override fun volumes(): List<DockerVolume> = unwrap(this).getVolumes()?.map(DockerVolume::wrap)
        ?: emptyList()

    /**
     * Where to mount the specified volumes from.
     *
     * Default: - no containers are specified to mount volumes from
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/run/#mount-volumes-from-container---volumes-from)
     */
    override fun volumesFrom(): List<String> = unwrap(this).getVolumesFrom() ?: emptyList()

    /**
     * Working directory inside the container.
     *
     * Default: - image default
     */
    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerRunOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerRunOptions): DockerRunOptions =
        CdkObjectWrappers.wrap(cdkObject) as? DockerRunOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerRunOptions): software.amazon.awscdk.DockerRunOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.DockerRunOptions
  }
}
