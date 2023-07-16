@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionContainerPropertiesPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.ContainerPropertiesProperty.Builder =
      CfnJobDefinition.ContainerPropertiesProperty.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _environment: MutableList<Any> = mutableListOf()

  private val _mountPoints: MutableList<Any> = mutableListOf()

  private val _resourceRequirements: MutableList<Any> = mutableListOf()

  private val _secrets: MutableList<Any> = mutableListOf()

  private val _ulimits: MutableList<Any> = mutableListOf()

  private val _volumes: MutableList<Any> = mutableListOf()

  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  public fun command(command: Collection<String>) {
    _command.addAll(command)
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

  public fun ephemeralStorage(ephemeralStorage: IResolvable) {
    cdkBuilder.ephemeralStorage(ephemeralStorage)
  }

  public fun ephemeralStorage(ephemeralStorage: CfnJobDefinition.EphemeralStorageProperty) {
    cdkBuilder.ephemeralStorage(ephemeralStorage)
  }

  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  public fun fargatePlatformConfiguration(fargatePlatformConfiguration: IResolvable) {
    cdkBuilder.fargatePlatformConfiguration(fargatePlatformConfiguration)
  }

  public
      fun fargatePlatformConfiguration(fargatePlatformConfiguration: CfnJobDefinition.FargatePlatformConfigurationProperty) {
    cdkBuilder.fargatePlatformConfiguration(fargatePlatformConfiguration)
  }

  public fun image(image: String) {
    cdkBuilder.image(image)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun jobRoleArn(jobRoleArn: String) {
    cdkBuilder.jobRoleArn(jobRoleArn)
  }

  public fun linuxParameters(linuxParameters: IResolvable) {
    cdkBuilder.linuxParameters(linuxParameters)
  }

  public fun linuxParameters(linuxParameters: CfnJobDefinition.LinuxParametersProperty) {
    cdkBuilder.linuxParameters(linuxParameters)
  }

  public fun logConfiguration(logConfiguration: IResolvable) {
    cdkBuilder.logConfiguration(logConfiguration)
  }

  public fun logConfiguration(logConfiguration: CfnJobDefinition.LogConfigurationProperty) {
    cdkBuilder.logConfiguration(logConfiguration)
  }

  public fun memory(memory: Number) {
    cdkBuilder.memory(memory)
  }

  public fun mountPoints(vararg mountPoints: Any) {
    _mountPoints.addAll(listOf(*mountPoints))
  }

  public fun mountPoints(mountPoints: Collection<Any>) {
    _mountPoints.addAll(mountPoints)
  }

  public fun mountPoints(mountPoints: IResolvable) {
    cdkBuilder.mountPoints(mountPoints)
  }

  public fun networkConfiguration(networkConfiguration: IResolvable) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  public
      fun networkConfiguration(networkConfiguration: CfnJobDefinition.NetworkConfigurationProperty) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  public fun privileged(privileged: Boolean) {
    cdkBuilder.privileged(privileged)
  }

  public fun privileged(privileged: IResolvable) {
    cdkBuilder.privileged(privileged)
  }

  public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
    cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
  }

  public fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable) {
    cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
  }

  public fun resourceRequirements(vararg resourceRequirements: Any) {
    _resourceRequirements.addAll(listOf(*resourceRequirements))
  }

  public fun resourceRequirements(resourceRequirements: Collection<Any>) {
    _resourceRequirements.addAll(resourceRequirements)
  }

  public fun resourceRequirements(resourceRequirements: IResolvable) {
    cdkBuilder.resourceRequirements(resourceRequirements)
  }

  public fun secrets(vararg secrets: Any) {
    _secrets.addAll(listOf(*secrets))
  }

  public fun secrets(secrets: Collection<Any>) {
    _secrets.addAll(secrets)
  }

  public fun secrets(secrets: IResolvable) {
    cdkBuilder.secrets(secrets)
  }

  public fun ulimits(vararg ulimits: Any) {
    _ulimits.addAll(listOf(*ulimits))
  }

  public fun ulimits(ulimits: Collection<Any>) {
    _ulimits.addAll(ulimits)
  }

  public fun ulimits(ulimits: IResolvable) {
    cdkBuilder.ulimits(ulimits)
  }

  public fun user(user: String) {
    cdkBuilder.user(user)
  }

  public fun vcpus(vcpus: Number) {
    cdkBuilder.vcpus(vcpus)
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

  public fun build(): CfnJobDefinition.ContainerPropertiesProperty {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_environment.isNotEmpty()) cdkBuilder.environment(_environment)
    if(_mountPoints.isNotEmpty()) cdkBuilder.mountPoints(_mountPoints)
    if(_resourceRequirements.isNotEmpty()) cdkBuilder.resourceRequirements(_resourceRequirements)
    if(_secrets.isNotEmpty()) cdkBuilder.secrets(_secrets)
    if(_ulimits.isNotEmpty()) cdkBuilder.ulimits(_ulimits)
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    return cdkBuilder.build()
  }
}
