@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides

@CdkDslMarker
public class BatchContainerOverridesDsl {
  private val cdkBuilder: BatchContainerOverrides.Builder = BatchContainerOverrides.builder()

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

  public fun gpuCount(gpuCount: Number) {
    cdkBuilder.gpuCount(gpuCount)
  }

  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun memory(memory: Size) {
    cdkBuilder.memory(memory)
  }

  public fun vcpus(vcpus: Number) {
    cdkBuilder.vcpus(vcpus)
  }

  public fun build(): BatchContainerOverrides {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    return cdkBuilder.build()
  }
}
