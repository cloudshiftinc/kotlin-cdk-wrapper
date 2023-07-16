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

@CdkDslMarker
public class BundlingOptionsDsl {
  private val cdkBuilder: BundlingOptions.Builder = BundlingOptions.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _entrypoint: MutableList<String> = mutableListOf()

  private val _volumes: MutableList<DockerVolume> = mutableListOf()

  private val _volumesFrom: MutableList<String> = mutableListOf()

  public fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess) {
    cdkBuilder.bundlingFileAccess(bundlingFileAccess)
  }

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

  public fun image(image: DockerImage) {
    cdkBuilder.image(image)
  }

  public fun local(local: ILocalBundling) {
    cdkBuilder.local(local)
  }

  public fun network(network: String) {
    cdkBuilder.network(network)
  }

  public fun outputType(outputType: BundlingOutput) {
    cdkBuilder.outputType(outputType)
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

  public fun build(): BundlingOptions {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_entrypoint.isNotEmpty()) cdkBuilder.entrypoint(_entrypoint)
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    if(_volumesFrom.isNotEmpty()) cdkBuilder.volumesFrom(_volumesFrom)
    return cdkBuilder.build()
  }
}
