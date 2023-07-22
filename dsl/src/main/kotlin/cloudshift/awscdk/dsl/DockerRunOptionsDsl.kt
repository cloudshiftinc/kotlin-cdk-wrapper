@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.DockerRunOptions
import software.amazon.awscdk.DockerVolume

/**
 * Docker run options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
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
@CdkDslMarker
public class DockerRunOptionsDsl {
  private val cdkBuilder: DockerRunOptions.Builder = DockerRunOptions.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _entrypoint: MutableList<String> = mutableListOf()

  private val _volumes: MutableList<DockerVolume> = mutableListOf()

  private val _volumesFrom: MutableList<String> = mutableListOf()

  /**
   * @param command The command to run in the container.
   */
  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  /**
   * @param command The command to run in the container.
   */
  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  /**
   * @param entrypoint The entrypoint to run in the container.
   */
  public fun entrypoint(vararg entrypoint: String) {
    _entrypoint.addAll(listOf(*entrypoint))
  }

  /**
   * @param entrypoint The entrypoint to run in the container.
   */
  public fun entrypoint(entrypoint: Collection<String>) {
    _entrypoint.addAll(entrypoint)
  }

  /**
   * @param environment The environment variables to pass to the container.
   */
  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param network Docker [Networking
   * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
   */
  public fun network(network: String) {
    cdkBuilder.network(network)
  }

  /**
   * @param platform Set platform if server is multi-platform capable. *Requires Docker Engine API
   * v1.38+*.
   * Example value: `linux/amd64`
   */
  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  /**
   * @param securityOpt [Security
   * configuration](https://docs.docker.com/engine/reference/run/#security-configuration) when running
   * the docker container.
   */
  public fun securityOpt(securityOpt: String) {
    cdkBuilder.securityOpt(securityOpt)
  }

  /**
   * @param user The user to use when running the container.
   */
  public fun user(user: String) {
    cdkBuilder.user(user)
  }

  /**
   * @param volumes Docker volumes to mount.
   */
  public fun volumes(volumes: DockerVolumeDsl.() -> Unit) {
    _volumes.add(DockerVolumeDsl().apply(volumes).build())
  }

  /**
   * @param volumes Docker volumes to mount.
   */
  public fun volumes(volumes: Collection<DockerVolume>) {
    _volumes.addAll(volumes)
  }

  /**
   * @param volumesFrom Where to mount the specified volumes from.
   */
  public fun volumesFrom(vararg volumesFrom: String) {
    _volumesFrom.addAll(listOf(*volumesFrom))
  }

  /**
   * @param volumesFrom Where to mount the specified volumes from.
   */
  public fun volumesFrom(volumesFrom: Collection<String>) {
    _volumesFrom.addAll(volumesFrom)
  }

  /**
   * @param workingDirectory Working directory inside the container.
   */
  public fun workingDirectory(workingDirectory: String) {
    cdkBuilder.workingDirectory(workingDirectory)
  }

  public fun build(): DockerRunOptions {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_entrypoint.isNotEmpty()) cdkBuilder.entrypoint(_entrypoint)
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    if(_volumesFrom.isNotEmpty()) cdkBuilder.volumesFrom(_volumesFrom)
    return cdkBuilder.build()
  }
}
