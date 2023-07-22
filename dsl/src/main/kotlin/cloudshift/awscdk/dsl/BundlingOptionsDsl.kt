@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.BundlingFileAccess
import software.amazon.awscdk.BundlingOptions
import software.amazon.awscdk.BundlingOutput
import software.amazon.awscdk.DockerImage
import software.amazon.awscdk.DockerVolume
import software.amazon.awscdk.ILocalBundling

/**
 * Bundling options.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.*;
 * Asset asset = Asset.Builder.create(this, "BundledAsset")
 * .path("/path/to/asset")
 * .bundling(BundlingOptions.builder()
 * .image(DockerImage.fromRegistry("alpine"))
 * .command(List.of("command-that-produces-an-archive.sh"))
 * .outputType(BundlingOutput.NOT_ARCHIVED)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class BundlingOptionsDsl {
  private val cdkBuilder: BundlingOptions.Builder = BundlingOptions.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _entrypoint: MutableList<String> = mutableListOf()

  private val _volumes: MutableList<DockerVolume> = mutableListOf()

  private val _volumesFrom: MutableList<String> = mutableListOf()

  /**
   * @param bundlingFileAccess The access mechanism used to make source files available to the
   * bundling container and to return the bundling output back to the host.
   */
  public fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess) {
    cdkBuilder.bundlingFileAccess(bundlingFileAccess)
  }

  /**
   * @param command The command to run in the Docker container.
   * Example value: `['npm', 'install']`
   */
  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  /**
   * @param command The command to run in the Docker container.
   * Example value: `['npm', 'install']`
   */
  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  /**
   * @param entrypoint The entrypoint to run in the Docker container.
   * Example value: `['/bin/sh', '-c']`
   */
  public fun entrypoint(vararg entrypoint: String) {
    _entrypoint.addAll(listOf(*entrypoint))
  }

  /**
   * @param entrypoint The entrypoint to run in the Docker container.
   * Example value: `['/bin/sh', '-c']`
   */
  public fun entrypoint(entrypoint: Collection<String>) {
    _entrypoint.addAll(entrypoint)
  }

  /**
   * @param environment The environment variables to pass to the Docker container.
   */
  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param image The Docker image where the command will run. 
   */
  public fun image(image: DockerImage) {
    cdkBuilder.image(image)
  }

  /**
   * @param local Local bundling provider.
   * The provider implements a method `tryBundle()` which should return `true`
   * if local bundling was performed. If `false` is returned, docker bundling
   * will be done.
   */
  public fun local(local: ILocalBundling) {
    cdkBuilder.local(local)
  }

  /**
   * @param network Docker [Networking
   * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
   */
  public fun network(network: String) {
    cdkBuilder.network(network)
  }

  /**
   * @param outputType The type of output that this bundling operation is producing.
   */
  public fun outputType(outputType: BundlingOutput) {
    cdkBuilder.outputType(outputType)
  }

  /**
   * @param platform Platform to build for. *Requires Docker Buildx*.
   * Specify this property to build images on a specific platform.
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
   * @param user The user to use when running the Docker container.
   * user | user:group | uid | uid:gid | user:gid | uid:group
   */
  public fun user(user: String) {
    cdkBuilder.user(user)
  }

  /**
   * @param volumes Additional Docker volumes to mount.
   */
  public fun volumes(volumes: DockerVolumeDsl.() -> Unit) {
    _volumes.add(DockerVolumeDsl().apply(volumes).build())
  }

  /**
   * @param volumes Additional Docker volumes to mount.
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
   * @param workingDirectory Working directory inside the Docker container.
   */
  public fun workingDirectory(workingDirectory: String) {
    cdkBuilder.workingDirectory(workingDirectory)
  }

  public fun build(): BundlingOptions {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_entrypoint.isNotEmpty()) cdkBuilder.entrypoint(_entrypoint)
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    if(_volumesFrom.isNotEmpty()) cdkBuilder.volumesFrom(_volumesFrom)
    return cdkBuilder.build()
  }
}
