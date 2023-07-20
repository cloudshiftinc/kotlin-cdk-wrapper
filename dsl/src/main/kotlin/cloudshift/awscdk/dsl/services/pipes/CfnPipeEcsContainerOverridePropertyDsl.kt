@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeEcsContainerOverridePropertyDsl {
  private val cdkBuilder: CfnPipe.EcsContainerOverrideProperty.Builder =
      CfnPipe.EcsContainerOverrideProperty.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _environment: MutableList<Any> = mutableListOf()

  private val _environmentFiles: MutableList<Any> = mutableListOf()

  private val _resourceRequirements: MutableList<Any> = mutableListOf()

  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  public fun cpu(cpu: Number) {
    cdkBuilder.cpu(cpu)
  }

  public fun environment(vararg environment: Any) {
    _environment.addAll(listOf(*environment))
  }

  public fun environment(environment: Collection<Any>) {
    _environment.addAll(environment)
  }

  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  public fun environmentFiles(vararg environmentFiles: Any) {
    _environmentFiles.addAll(listOf(*environmentFiles))
  }

  public fun environmentFiles(environmentFiles: Collection<Any>) {
    _environmentFiles.addAll(environmentFiles)
  }

  public fun environmentFiles(environmentFiles: IResolvable) {
    cdkBuilder.environmentFiles(environmentFiles)
  }

  public fun memory(memory: Number) {
    cdkBuilder.memory(memory)
  }

  public fun memoryReservation(memoryReservation: Number) {
    cdkBuilder.memoryReservation(memoryReservation)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun resourceRequirements(vararg resourceRequirements: Any) {
    _resourceRequirements.addAll(listOf(*resourceRequirements))
  }

  public fun resourceRequirements(resourceRequirements: Collection<Any>) {
    _resourceRequirements.addAll(resourceRequirements)
  }

  public fun resourceRequirements(resourceRequirements: IResolvable) {
    cdkBuilder.resourceRequirements(resourceRequirements)
  }

  public fun build(): CfnPipe.EcsContainerOverrideProperty {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_environment.isNotEmpty()) cdkBuilder.environment(_environment)
    if(_environmentFiles.isNotEmpty()) cdkBuilder.environmentFiles(_environmentFiles)
    if(_resourceRequirements.isNotEmpty()) cdkBuilder.resourceRequirements(_resourceRequirements)
    return cdkBuilder.build()
  }
}
