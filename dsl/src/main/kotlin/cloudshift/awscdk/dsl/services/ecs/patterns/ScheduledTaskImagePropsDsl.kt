@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps

@CdkDslMarker
public class ScheduledTaskImagePropsDsl {
  private val cdkBuilder: ScheduledTaskImageProps.Builder = ScheduledTaskImageProps.builder()

  private val _command: MutableList<String> = mutableListOf()

  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  public fun command(command: Collection<String>) {
    _command.addAll(command)
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

  public fun secrets(secrets: Map<String, Secret>) {
    cdkBuilder.secrets(secrets)
  }

  public fun build(): ScheduledTaskImageProps {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    return cdkBuilder.build()
  }
}
