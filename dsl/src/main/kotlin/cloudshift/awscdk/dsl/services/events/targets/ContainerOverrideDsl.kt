@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.events.targets.ContainerOverride
import software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable

@CdkDslMarker
public class ContainerOverrideDsl {
  private val cdkBuilder: ContainerOverride.Builder = ContainerOverride.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _environment: MutableList<TaskEnvironmentVariable> = mutableListOf()

  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  public fun cpu(cpu: Number) {
    cdkBuilder.cpu(cpu)
  }

  public fun environment(environment: TaskEnvironmentVariableDsl.() -> Unit) {
    _environment.add(TaskEnvironmentVariableDsl().apply(environment).build())
  }

  public fun environment(environment: Collection<TaskEnvironmentVariable>) {
    _environment.addAll(environment)
  }

  public fun memoryLimit(memoryLimit: Number) {
    cdkBuilder.memoryLimit(memoryLimit)
  }

  public fun memoryReservation(memoryReservation: Number) {
    cdkBuilder.memoryReservation(memoryReservation)
  }

  public fun build(): ContainerOverride {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_environment.isNotEmpty()) cdkBuilder.environment(_environment)
    return cdkBuilder.build()
  }
}
