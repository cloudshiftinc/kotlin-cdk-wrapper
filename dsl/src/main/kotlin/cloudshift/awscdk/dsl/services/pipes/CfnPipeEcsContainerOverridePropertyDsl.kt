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

  /**
   * @param command The command to send to the container that overrides the default command from the
   * Docker image or the task definition.
   * You must also specify a container name.
   */
  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  /**
   * @param command The command to send to the container that overrides the default command from the
   * Docker image or the task definition.
   * You must also specify a container name.
   */
  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  /**
   * @param cpu The number of `cpu` units reserved for the container, instead of the default value
   * from the task definition.
   * You must also specify a container name.
   */
  public fun cpu(cpu: Number) {
    cdkBuilder.cpu(cpu)
  }

  /**
   * @param environment The environment variables to send to the container.
   * You can add new environment variables, which are added to the container at launch, or you can
   * override the existing environment variables from the Docker image or the task definition. You must
   * also specify a container name.
   */
  public fun environment(vararg environment: Any) {
    _environment.addAll(listOf(*environment))
  }

  /**
   * @param environment The environment variables to send to the container.
   * You can add new environment variables, which are added to the container at launch, or you can
   * override the existing environment variables from the Docker image or the task definition. You must
   * also specify a container name.
   */
  public fun environment(environment: Collection<Any>) {
    _environment.addAll(environment)
  }

  /**
   * @param environment The environment variables to send to the container.
   * You can add new environment variables, which are added to the container at launch, or you can
   * override the existing environment variables from the Docker image or the task definition. You must
   * also specify a container name.
   */
  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param environmentFiles A list of files containing the environment variables to pass to a
   * container, instead of the value from the container definition.
   */
  public fun environmentFiles(vararg environmentFiles: Any) {
    _environmentFiles.addAll(listOf(*environmentFiles))
  }

  /**
   * @param environmentFiles A list of files containing the environment variables to pass to a
   * container, instead of the value from the container definition.
   */
  public fun environmentFiles(environmentFiles: Collection<Any>) {
    _environmentFiles.addAll(environmentFiles)
  }

  /**
   * @param environmentFiles A list of files containing the environment variables to pass to a
   * container, instead of the value from the container definition.
   */
  public fun environmentFiles(environmentFiles: IResolvable) {
    cdkBuilder.environmentFiles(environmentFiles)
  }

  /**
   * @param memory The hard limit (in MiB) of memory to present to the container, instead of the
   * default value from the task definition.
   * If your container attempts to exceed the memory specified here, the container is killed. You
   * must also specify a container name.
   */
  public fun memory(memory: Number) {
    cdkBuilder.memory(memory)
  }

  /**
   * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container,
   * instead of the default value from the task definition.
   * You must also specify a container name.
   */
  public fun memoryReservation(memoryReservation: Number) {
    cdkBuilder.memoryReservation(memoryReservation)
  }

  /**
   * @param name The name of the container that receives the override.
   * This parameter is required if any override is specified.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param resourceRequirements The type and amount of a resource to assign to a container, instead
   * of the default value from the task definition.
   * The only supported resource is a GPU.
   */
  public fun resourceRequirements(vararg resourceRequirements: Any) {
    _resourceRequirements.addAll(listOf(*resourceRequirements))
  }

  /**
   * @param resourceRequirements The type and amount of a resource to assign to a container, instead
   * of the default value from the task definition.
   * The only supported resource is a GPU.
   */
  public fun resourceRequirements(resourceRequirements: Collection<Any>) {
    _resourceRequirements.addAll(resourceRequirements)
  }

  /**
   * @param resourceRequirements The type and amount of a resource to assign to a container, instead
   * of the default value from the task definition.
   * The only supported resource is a GPU.
   */
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
