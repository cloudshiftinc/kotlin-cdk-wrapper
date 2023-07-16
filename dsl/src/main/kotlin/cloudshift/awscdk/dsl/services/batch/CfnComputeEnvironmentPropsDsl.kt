@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps

@CdkDslMarker
public class CfnComputeEnvironmentPropsDsl {
  private val cdkBuilder: CfnComputeEnvironmentProps.Builder = CfnComputeEnvironmentProps.builder()

  public fun computeEnvironmentName(computeEnvironmentName: String) {
    cdkBuilder.computeEnvironmentName(computeEnvironmentName)
  }

  public fun computeResources(computeResources: IResolvable) {
    cdkBuilder.computeResources(computeResources)
  }

  public fun computeResources(computeResources: CfnComputeEnvironment.ComputeResourcesProperty) {
    cdkBuilder.computeResources(computeResources)
  }

  public fun eksConfiguration(eksConfiguration: IResolvable) {
    cdkBuilder.eksConfiguration(eksConfiguration)
  }

  public fun eksConfiguration(eksConfiguration: CfnComputeEnvironment.EksConfigurationProperty) {
    cdkBuilder.eksConfiguration(eksConfiguration)
  }

  public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
    cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
  }

  public fun replaceComputeEnvironment(replaceComputeEnvironment: IResolvable) {
    cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
  }

  public fun serviceRole(serviceRole: String) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun unmanagedvCpus(unmanagedvCpus: Number) {
    cdkBuilder.unmanagedvCpus(unmanagedvCpus)
  }

  public fun updatePolicy(updatePolicy: IResolvable) {
    cdkBuilder.updatePolicy(updatePolicy)
  }

  public fun updatePolicy(updatePolicy: CfnComputeEnvironment.UpdatePolicyProperty) {
    cdkBuilder.updatePolicy(updatePolicy)
  }

  public fun build(): CfnComputeEnvironmentProps = cdkBuilder.build()
}
