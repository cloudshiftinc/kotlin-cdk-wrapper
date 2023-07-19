@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions

@CdkDslMarker
public class ScheduledEc2TaskImageOptionsDsl {
  private val cdkBuilder: ScheduledEc2TaskImageOptions.Builder =
      ScheduledEc2TaskImageOptions.builder()

  private val _command: MutableList<String> = mutableListOf()

  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  public fun cpu(cpu: Number) {
    cdkBuilder.cpu(cpu)
  }

  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  public fun image(image: ContainerImage) {
    cdkBuilder.image(image)
  }

  public fun logDriver(logDriver: LogDriver) {
    cdkBuilder.logDriver(logDriver)
  }

  public fun memoryLimitMiB(memoryLimitMiB: Number) {
    cdkBuilder.memoryLimitMiB(memoryLimitMiB)
  }

  public fun memoryReservationMiB(memoryReservationMiB: Number) {
    cdkBuilder.memoryReservationMiB(memoryReservationMiB)
  }

  public fun secrets(secrets: Map<String, Secret>) {
    cdkBuilder.secrets(secrets)
  }

  public fun build(): ScheduledEc2TaskImageOptions {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    return cdkBuilder.build()
  }
}
