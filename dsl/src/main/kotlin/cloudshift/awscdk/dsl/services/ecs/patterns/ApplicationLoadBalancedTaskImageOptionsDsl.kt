@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class ApplicationLoadBalancedTaskImageOptionsDsl {
  private val cdkBuilder: ApplicationLoadBalancedTaskImageOptions.Builder =
      ApplicationLoadBalancedTaskImageOptions.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _entryPoint: MutableList<String> = mutableListOf()

  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  public fun containerPort(containerPort: Number) {
    cdkBuilder.containerPort(containerPort)
  }

  public fun dockerLabels(dockerLabels: Map<String, String>) {
    cdkBuilder.dockerLabels(dockerLabels)
  }

  public fun enableLogging(enableLogging: Boolean) {
    cdkBuilder.enableLogging(enableLogging)
  }

  public fun entryPoint(vararg entryPoint: String) {
    _entryPoint.addAll(listOf(*entryPoint))
  }

  public fun entryPoint(entryPoint: Collection<String>) {
    _entryPoint.addAll(entryPoint)
  }

  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  public fun executionRole(executionRole: IRole) {
    cdkBuilder.executionRole(executionRole)
  }

  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  public fun image(image: ContainerImage) {
    cdkBuilder.image(image)
  }

  public fun logDriver(logDriver: LogDriver) {
    cdkBuilder.logDriver(logDriver)
  }

  public fun secrets(secrets: Map<String, Secret>) {
    cdkBuilder.secrets(secrets)
  }

  public fun taskRole(taskRole: IRole) {
    cdkBuilder.taskRole(taskRole)
  }

  public fun build(): ApplicationLoadBalancedTaskImageOptions {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_entryPoint.isNotEmpty()) cdkBuilder.entryPoint(_entryPoint)
    return cdkBuilder.build()
  }
}
