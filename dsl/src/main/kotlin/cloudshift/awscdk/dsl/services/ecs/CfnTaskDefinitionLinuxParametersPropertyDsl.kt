@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionLinuxParametersPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.LinuxParametersProperty.Builder =
      CfnTaskDefinition.LinuxParametersProperty.builder()

  private val _devices: MutableList<Any> = mutableListOf()

  private val _tmpfs: MutableList<Any> = mutableListOf()

  public fun capabilities(capabilities: IResolvable) {
    cdkBuilder.capabilities(capabilities)
  }

  public fun capabilities(capabilities: CfnTaskDefinition.KernelCapabilitiesProperty) {
    cdkBuilder.capabilities(capabilities)
  }

  public fun devices(vararg devices: Any) {
    _devices.addAll(listOf(*devices))
  }

  public fun devices(devices: Collection<Any>) {
    _devices.addAll(devices)
  }

  public fun devices(devices: IResolvable) {
    cdkBuilder.devices(devices)
  }

  public fun initProcessEnabled(initProcessEnabled: Boolean) {
    cdkBuilder.initProcessEnabled(initProcessEnabled)
  }

  public fun initProcessEnabled(initProcessEnabled: IResolvable) {
    cdkBuilder.initProcessEnabled(initProcessEnabled)
  }

  public fun maxSwap(maxSwap: Number) {
    cdkBuilder.maxSwap(maxSwap)
  }

  public fun sharedMemorySize(sharedMemorySize: Number) {
    cdkBuilder.sharedMemorySize(sharedMemorySize)
  }

  public fun swappiness(swappiness: Number) {
    cdkBuilder.swappiness(swappiness)
  }

  public fun tmpfs(vararg tmpfs: Any) {
    _tmpfs.addAll(listOf(*tmpfs))
  }

  public fun tmpfs(tmpfs: Collection<Any>) {
    _tmpfs.addAll(tmpfs)
  }

  public fun tmpfs(tmpfs: IResolvable) {
    cdkBuilder.tmpfs(tmpfs)
  }

  public fun build(): CfnTaskDefinition.LinuxParametersProperty {
    if(_devices.isNotEmpty()) cdkBuilder.devices(_devices)
    if(_tmpfs.isNotEmpty()) cdkBuilder.tmpfs(_tmpfs)
    return cdkBuilder.build()
  }
}
