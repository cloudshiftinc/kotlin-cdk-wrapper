@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import software.constructs.Construct

@CdkDslMarker
public class CfnTaskDefinitionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTaskDefinition.Builder = CfnTaskDefinition.Builder.create(scope, id)

  private val _containerDefinitions: MutableList<Any> = mutableListOf()

  private val _inferenceAccelerators: MutableList<Any> = mutableListOf()

  private val _placementConstraints: MutableList<Any> = mutableListOf()

  private val _requiresCompatibilities: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _volumes: MutableList<Any> = mutableListOf()

  public fun containerDefinitions(vararg containerDefinitions: Any) {
    _containerDefinitions.addAll(listOf(*containerDefinitions))
  }

  public fun containerDefinitions(containerDefinitions: Collection<Any>) {
    _containerDefinitions.addAll(containerDefinitions)
  }

  public fun containerDefinitions(containerDefinitions: IResolvable) {
    cdkBuilder.containerDefinitions(containerDefinitions)
  }

  public fun cpu(cpu: String) {
    cdkBuilder.cpu(cpu)
  }

  public fun ephemeralStorage(ephemeralStorage: IResolvable) {
    cdkBuilder.ephemeralStorage(ephemeralStorage)
  }

  public fun ephemeralStorage(ephemeralStorage: CfnTaskDefinition.EphemeralStorageProperty) {
    cdkBuilder.ephemeralStorage(ephemeralStorage)
  }

  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  public fun inferenceAccelerators(vararg inferenceAccelerators: Any) {
    _inferenceAccelerators.addAll(listOf(*inferenceAccelerators))
  }

  public fun inferenceAccelerators(inferenceAccelerators: Collection<Any>) {
    _inferenceAccelerators.addAll(inferenceAccelerators)
  }

  public fun inferenceAccelerators(inferenceAccelerators: IResolvable) {
    cdkBuilder.inferenceAccelerators(inferenceAccelerators)
  }

  public fun ipcMode(ipcMode: String) {
    cdkBuilder.ipcMode(ipcMode)
  }

  public fun memory(memory: String) {
    cdkBuilder.memory(memory)
  }

  public fun networkMode(networkMode: String) {
    cdkBuilder.networkMode(networkMode)
  }

  public fun pidMode(pidMode: String) {
    cdkBuilder.pidMode(pidMode)
  }

  public fun placementConstraints(vararg placementConstraints: Any) {
    _placementConstraints.addAll(listOf(*placementConstraints))
  }

  public fun placementConstraints(placementConstraints: Collection<Any>) {
    _placementConstraints.addAll(placementConstraints)
  }

  public fun placementConstraints(placementConstraints: IResolvable) {
    cdkBuilder.placementConstraints(placementConstraints)
  }

  public fun proxyConfiguration(proxyConfiguration: IResolvable) {
    cdkBuilder.proxyConfiguration(proxyConfiguration)
  }

  public fun proxyConfiguration(proxyConfiguration: CfnTaskDefinition.ProxyConfigurationProperty) {
    cdkBuilder.proxyConfiguration(proxyConfiguration)
  }

  public fun requiresCompatibilities(vararg requiresCompatibilities: String) {
    _requiresCompatibilities.addAll(listOf(*requiresCompatibilities))
  }

  public fun requiresCompatibilities(requiresCompatibilities: Collection<String>) {
    _requiresCompatibilities.addAll(requiresCompatibilities)
  }

  public fun runtimePlatform(runtimePlatform: IResolvable) {
    cdkBuilder.runtimePlatform(runtimePlatform)
  }

  public fun runtimePlatform(runtimePlatform: CfnTaskDefinition.RuntimePlatformProperty) {
    cdkBuilder.runtimePlatform(runtimePlatform)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun taskRoleArn(taskRoleArn: String) {
    cdkBuilder.taskRoleArn(taskRoleArn)
  }

  public fun volumes(vararg volumes: Any) {
    _volumes.addAll(listOf(*volumes))
  }

  public fun volumes(volumes: Collection<Any>) {
    _volumes.addAll(volumes)
  }

  public fun volumes(volumes: IResolvable) {
    cdkBuilder.volumes(volumes)
  }

  public fun build(): CfnTaskDefinition {
    if(_containerDefinitions.isNotEmpty()) cdkBuilder.containerDefinitions(_containerDefinitions)
    if(_inferenceAccelerators.isNotEmpty()) cdkBuilder.inferenceAccelerators(_inferenceAccelerators)
    if(_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
    if(_requiresCompatibilities.isNotEmpty())
        cdkBuilder.requiresCompatibilities(_requiresCompatibilities)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    return cdkBuilder.build()
  }
}
