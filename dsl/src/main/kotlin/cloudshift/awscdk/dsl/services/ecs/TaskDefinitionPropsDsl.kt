@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.Compatibility
import software.amazon.awscdk.services.ecs.InferenceAccelerator
import software.amazon.awscdk.services.ecs.IpcMode
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.PidMode
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.ProxyConfiguration
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.TaskDefinitionProps
import software.amazon.awscdk.services.ecs.Volume
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class TaskDefinitionPropsDsl {
  private val cdkBuilder: TaskDefinitionProps.Builder = TaskDefinitionProps.builder()

  private val _inferenceAccelerators: MutableList<InferenceAccelerator> = mutableListOf()

  private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

  private val _volumes: MutableList<Volume> = mutableListOf()

  public fun compatibility(compatibility: Compatibility) {
    cdkBuilder.compatibility(compatibility)
  }

  public fun cpu(cpu: String) {
    cdkBuilder.cpu(cpu)
  }

  public fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
    cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
  }

  public fun executionRole(executionRole: IRole) {
    cdkBuilder.executionRole(executionRole)
  }

  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  public fun inferenceAccelerators(inferenceAccelerators: InferenceAcceleratorDsl.() -> Unit) {
    _inferenceAccelerators.add(InferenceAcceleratorDsl().apply(inferenceAccelerators).build())
  }

  public fun inferenceAccelerators(inferenceAccelerators: Collection<InferenceAccelerator>) {
    _inferenceAccelerators.addAll(inferenceAccelerators)
  }

  public fun ipcMode(ipcMode: IpcMode) {
    cdkBuilder.ipcMode(ipcMode)
  }

  public fun memoryMiB(memoryMiB: String) {
    cdkBuilder.memoryMiB(memoryMiB)
  }

  public fun networkMode(networkMode: NetworkMode) {
    cdkBuilder.networkMode(networkMode)
  }

  public fun pidMode(pidMode: PidMode) {
    cdkBuilder.pidMode(pidMode)
  }

  public fun placementConstraints(vararg placementConstraints: PlacementConstraint) {
    _placementConstraints.addAll(listOf(*placementConstraints))
  }

  public fun placementConstraints(placementConstraints: Collection<PlacementConstraint>) {
    _placementConstraints.addAll(placementConstraints)
  }

  public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
    cdkBuilder.proxyConfiguration(proxyConfiguration)
  }

  public fun runtimePlatform(block: RuntimePlatformDsl.() -> Unit = {}) {
    val builder = RuntimePlatformDsl()
    builder.apply(block)
    cdkBuilder.runtimePlatform(builder.build())
  }

  public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
    cdkBuilder.runtimePlatform(runtimePlatform)
  }

  public fun taskRole(taskRole: IRole) {
    cdkBuilder.taskRole(taskRole)
  }

  public fun volumes(volumes: VolumeDsl.() -> Unit) {
    _volumes.add(VolumeDsl().apply(volumes).build())
  }

  public fun volumes(volumes: Collection<Volume>) {
    _volumes.addAll(volumes)
  }

  public fun build(): TaskDefinitionProps {
    if(_inferenceAccelerators.isNotEmpty()) cdkBuilder.inferenceAccelerators(_inferenceAccelerators)
    if(_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    return cdkBuilder.build()
  }
}
