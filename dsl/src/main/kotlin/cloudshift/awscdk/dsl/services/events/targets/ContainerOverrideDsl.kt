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

  /**
   * @param command Command to run inside the container.
   */
  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  /**
   * @param command Command to run inside the container.
   */
  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  /**
   * @param containerName Name of the container inside the task definition. 
   */
  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  /**
   * @param cpu The number of cpu units reserved for the container.
   */
  public fun cpu(cpu: Number) {
    cdkBuilder.cpu(cpu)
  }

  /**
   * @param environment Variables to set in the container's environment.
   */
  public fun environment(environment: TaskEnvironmentVariableDsl.() -> Unit) {
    _environment.add(TaskEnvironmentVariableDsl().apply(environment).build())
  }

  /**
   * @param environment Variables to set in the container's environment.
   */
  public fun environment(environment: Collection<TaskEnvironmentVariable>) {
    _environment.addAll(environment)
  }

  /**
   * @param memoryLimit Hard memory limit on the container.
   */
  public fun memoryLimit(memoryLimit: Number) {
    cdkBuilder.memoryLimit(memoryLimit)
  }

  /**
   * @param memoryReservation Soft memory limit on the container.
   */
  public fun memoryReservation(memoryReservation: Number) {
    cdkBuilder.memoryReservation(memoryReservation)
  }

  public fun build(): ContainerOverride {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_environment.isNotEmpty()) cdkBuilder.environment(_environment)
    return cdkBuilder.build()
  }
}
