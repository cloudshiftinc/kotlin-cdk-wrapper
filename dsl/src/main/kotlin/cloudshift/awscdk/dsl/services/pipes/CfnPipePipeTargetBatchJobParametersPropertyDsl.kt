@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeTargetBatchJobParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeTargetBatchJobParametersProperty.Builder =
      CfnPipe.PipeTargetBatchJobParametersProperty.builder()

  private val _dependsOn: MutableList<Any> = mutableListOf()

  public fun arrayProperties(arrayProperties: IResolvable) {
    cdkBuilder.arrayProperties(arrayProperties)
  }

  public fun arrayProperties(arrayProperties: CfnPipe.BatchArrayPropertiesProperty) {
    cdkBuilder.arrayProperties(arrayProperties)
  }

  public fun containerOverrides(containerOverrides: IResolvable) {
    cdkBuilder.containerOverrides(containerOverrides)
  }

  public fun containerOverrides(containerOverrides: CfnPipe.BatchContainerOverridesProperty) {
    cdkBuilder.containerOverrides(containerOverrides)
  }

  public fun dependsOn(vararg dependsOn: Any) {
    _dependsOn.addAll(listOf(*dependsOn))
  }

  public fun dependsOn(dependsOn: Collection<Any>) {
    _dependsOn.addAll(dependsOn)
  }

  public fun dependsOn(dependsOn: IResolvable) {
    cdkBuilder.dependsOn(dependsOn)
  }

  public fun jobDefinition(jobDefinition: String) {
    cdkBuilder.jobDefinition(jobDefinition)
  }

  public fun jobName(jobName: String) {
    cdkBuilder.jobName(jobName)
  }

  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  public fun retryStrategy(retryStrategy: IResolvable) {
    cdkBuilder.retryStrategy(retryStrategy)
  }

  public fun retryStrategy(retryStrategy: CfnPipe.BatchRetryStrategyProperty) {
    cdkBuilder.retryStrategy(retryStrategy)
  }

  public fun build(): CfnPipe.PipeTargetBatchJobParametersProperty {
    if(_dependsOn.isNotEmpty()) cdkBuilder.dependsOn(_dependsOn)
    return cdkBuilder.build()
  }
}
