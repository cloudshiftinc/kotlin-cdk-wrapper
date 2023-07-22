@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emrserverless.CfnApplication

@CdkDslMarker
public class CfnApplicationWorkerConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.WorkerConfigurationProperty.Builder =
      CfnApplication.WorkerConfigurationProperty.builder()

  /**
   * @param cpu *Minimum* : 1. 
   * *Maximum* : 15
   *
   * *Pattern* : `^[1-9][0-9]*(\\s)?(vCPU|vcpu|VCPU)?$`
   */
  public fun cpu(cpu: String) {
    cdkBuilder.cpu(cpu)
  }

  /**
   * @param disk *Minimum* : 1.
   * *Maximum* : 15
   *
   * *Pattern* : `^[1-9][0-9]*(\\s)?(GB|gb|gB|Gb)$"`
   */
  public fun disk(disk: String) {
    cdkBuilder.disk(disk)
  }

  /**
   * @param memory *Minimum* : 1. 
   * *Maximum* : 15
   *
   * *Pattern* : `^[1-9][0-9]*(\\s)?(GB|gb|gB|Gb)?$`
   */
  public fun memory(memory: String) {
    cdkBuilder.memory(memory)
  }

  public fun build(): CfnApplication.WorkerConfigurationProperty = cdkBuilder.build()
}
