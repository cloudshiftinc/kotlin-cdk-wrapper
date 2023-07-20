@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer

@CdkDslMarker
public class CfnContainerContainerPropertyDsl {
  private val cdkBuilder: CfnContainer.ContainerProperty.Builder =
      CfnContainer.ContainerProperty.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _environment: MutableList<Any> = mutableListOf()

  private val _ports: MutableList<Any> = mutableListOf()

  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
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

  public fun image(image: String) {
    cdkBuilder.image(image)
  }

  public fun ports(vararg ports: Any) {
    _ports.addAll(listOf(*ports))
  }

  public fun ports(ports: Collection<Any>) {
    _ports.addAll(ports)
  }

  public fun ports(ports: IResolvable) {
    cdkBuilder.ports(ports)
  }

  public fun build(): CfnContainer.ContainerProperty {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_environment.isNotEmpty()) cdkBuilder.environment(_environment)
    if(_ports.isNotEmpty()) cdkBuilder.ports(_ports)
    return cdkBuilder.build()
  }
}
