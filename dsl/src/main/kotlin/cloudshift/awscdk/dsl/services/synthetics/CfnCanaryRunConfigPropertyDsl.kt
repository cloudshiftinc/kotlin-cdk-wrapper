@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.synthetics.CfnCanary

@CdkDslMarker
public class CfnCanaryRunConfigPropertyDsl {
  private val cdkBuilder: CfnCanary.RunConfigProperty.Builder =
      CfnCanary.RunConfigProperty.builder()

  public fun activeTracing(activeTracing: Boolean) {
    cdkBuilder.activeTracing(activeTracing)
  }

  public fun activeTracing(activeTracing: IResolvable) {
    cdkBuilder.activeTracing(activeTracing)
  }

  public fun environmentVariables(environmentVariables: Map<String, String>) {
    cdkBuilder.environmentVariables(environmentVariables)
  }

  public fun environmentVariables(environmentVariables: IResolvable) {
    cdkBuilder.environmentVariables(environmentVariables)
  }

  public fun memoryInMb(memoryInMb: Number) {
    cdkBuilder.memoryInMb(memoryInMb)
  }

  public fun timeoutInSeconds(timeoutInSeconds: Number) {
    cdkBuilder.timeoutInSeconds(timeoutInSeconds)
  }

  public fun build(): CfnCanary.RunConfigProperty = cdkBuilder.build()
}
