@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeEcsTaskOverridePropertyDsl {
  private val cdkBuilder: CfnPipe.EcsTaskOverrideProperty.Builder =
      CfnPipe.EcsTaskOverrideProperty.builder()

  private val _containerOverrides: MutableList<Any> = mutableListOf()

  private val _inferenceAcceleratorOverrides: MutableList<Any> = mutableListOf()

  public fun containerOverrides(vararg containerOverrides: Any) {
    _containerOverrides.addAll(listOf(*containerOverrides))
  }

  public fun containerOverrides(containerOverrides: Collection<Any>) {
    _containerOverrides.addAll(containerOverrides)
  }

  public fun containerOverrides(containerOverrides: IResolvable) {
    cdkBuilder.containerOverrides(containerOverrides)
  }

  public fun cpu(cpu: String) {
    cdkBuilder.cpu(cpu)
  }

  public fun ephemeralStorage(ephemeralStorage: IResolvable) {
    cdkBuilder.ephemeralStorage(ephemeralStorage)
  }

  public fun ephemeralStorage(ephemeralStorage: CfnPipe.EcsEphemeralStorageProperty) {
    cdkBuilder.ephemeralStorage(ephemeralStorage)
  }

  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  public fun inferenceAcceleratorOverrides(vararg inferenceAcceleratorOverrides: Any) {
    _inferenceAcceleratorOverrides.addAll(listOf(*inferenceAcceleratorOverrides))
  }

  public fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: Collection<Any>) {
    _inferenceAcceleratorOverrides.addAll(inferenceAcceleratorOverrides)
  }

  public fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: IResolvable) {
    cdkBuilder.inferenceAcceleratorOverrides(inferenceAcceleratorOverrides)
  }

  public fun memory(memory: String) {
    cdkBuilder.memory(memory)
  }

  public fun taskRoleArn(taskRoleArn: String) {
    cdkBuilder.taskRoleArn(taskRoleArn)
  }

  public fun build(): CfnPipe.EcsTaskOverrideProperty {
    if(_containerOverrides.isNotEmpty()) cdkBuilder.containerOverrides(_containerOverrides)
    if(_inferenceAcceleratorOverrides.isNotEmpty())
        cdkBuilder.inferenceAcceleratorOverrides(_inferenceAcceleratorOverrides)
    return cdkBuilder.build()
  }
}
