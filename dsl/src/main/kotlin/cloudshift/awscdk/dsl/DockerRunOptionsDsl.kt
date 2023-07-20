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

@CdkDslMarker
public class DockerRunOptionsDsl {
  private val cdkBuilder: DockerRunOptions.Builder = DockerRunOptions.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _entrypoint: MutableList<String> = mutableListOf()

  private val _volumes: MutableList<DockerVolume> = mutableListOf()

  private val _volumesFrom: MutableList<String> = mutableListOf()

  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  public fun entrypoint(vararg entrypoint: String) {
    _entrypoint.addAll(listOf(*entrypoint))
  }

  public fun entrypoint(entrypoint: Collection<String>) {
    _entrypoint.addAll(entrypoint)
  }

  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  public fun network(network: String) {
    cdkBuilder.network(network)
  }

  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  public fun securityOpt(securityOpt: String) {
    cdkBuilder.securityOpt(securityOpt)
  }

  public fun user(user: String) {
    cdkBuilder.user(user)
  }

  public fun volumes(volumes: DockerVolumeDsl.() -> Unit) {
    _volumes.add(DockerVolumeDsl().apply(volumes).build())
  }

  public fun volumes(volumes: Collection<DockerVolume>) {
    _volumes.addAll(volumes)
  }

  public fun volumesFrom(vararg volumesFrom: String) {
    _volumesFrom.addAll(listOf(*volumesFrom))
  }

  public fun volumesFrom(volumesFrom: Collection<String>) {
    _volumesFrom.addAll(volumesFrom)
  }

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
