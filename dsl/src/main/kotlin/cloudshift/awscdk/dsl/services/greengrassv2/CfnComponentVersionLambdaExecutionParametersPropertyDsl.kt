@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

@CdkDslMarker
public class CfnComponentVersionLambdaExecutionParametersPropertyDsl {
  private val cdkBuilder: CfnComponentVersion.LambdaExecutionParametersProperty.Builder =
      CfnComponentVersion.LambdaExecutionParametersProperty.builder()

  private val _eventSources: MutableList<Any> = mutableListOf()

  private val _execArgs: MutableList<String> = mutableListOf()

  public fun environmentVariables(environmentVariables: Map<String, String>) {
    cdkBuilder.environmentVariables(environmentVariables)
  }

  public fun environmentVariables(environmentVariables: IResolvable) {
    cdkBuilder.environmentVariables(environmentVariables)
  }

  public fun eventSources(vararg eventSources: Any) {
    _eventSources.addAll(listOf(*eventSources))
  }

  public fun eventSources(eventSources: Collection<Any>) {
    _eventSources.addAll(eventSources)
  }

  public fun eventSources(eventSources: IResolvable) {
    cdkBuilder.eventSources(eventSources)
  }

  public fun execArgs(vararg execArgs: String) {
    _execArgs.addAll(listOf(*execArgs))
  }

  public fun execArgs(execArgs: Collection<String>) {
    _execArgs.addAll(execArgs)
  }

  public fun inputPayloadEncodingType(inputPayloadEncodingType: String) {
    cdkBuilder.inputPayloadEncodingType(inputPayloadEncodingType)
  }

  public fun linuxProcessParams(linuxProcessParams: IResolvable) {
    cdkBuilder.linuxProcessParams(linuxProcessParams)
  }

  public
      fun linuxProcessParams(linuxProcessParams: CfnComponentVersion.LambdaLinuxProcessParamsProperty) {
    cdkBuilder.linuxProcessParams(linuxProcessParams)
  }

  public fun maxIdleTimeInSeconds(maxIdleTimeInSeconds: Number) {
    cdkBuilder.maxIdleTimeInSeconds(maxIdleTimeInSeconds)
  }

  public fun maxInstancesCount(maxInstancesCount: Number) {
    cdkBuilder.maxInstancesCount(maxInstancesCount)
  }

  public fun maxQueueSize(maxQueueSize: Number) {
    cdkBuilder.maxQueueSize(maxQueueSize)
  }

  public fun pinned(pinned: Boolean) {
    cdkBuilder.pinned(pinned)
  }

  public fun pinned(pinned: IResolvable) {
    cdkBuilder.pinned(pinned)
  }

  public fun statusTimeoutInSeconds(statusTimeoutInSeconds: Number) {
    cdkBuilder.statusTimeoutInSeconds(statusTimeoutInSeconds)
  }

  public fun timeoutInSeconds(timeoutInSeconds: Number) {
    cdkBuilder.timeoutInSeconds(timeoutInSeconds)
  }

  public fun build(): CfnComponentVersion.LambdaExecutionParametersProperty {
    if(_eventSources.isNotEmpty()) cdkBuilder.eventSources(_eventSources)
    if(_execArgs.isNotEmpty()) cdkBuilder.execArgs(_execArgs)
    return cdkBuilder.build()
  }
}
