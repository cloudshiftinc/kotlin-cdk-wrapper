@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentSystemResourceLimitsPropertyDsl {
  private val cdkBuilder: CfnDeployment.SystemResourceLimitsProperty.Builder =
      CfnDeployment.SystemResourceLimitsProperty.builder()

  public fun cpus(cpus: Number) {
    cdkBuilder.cpus(cpus)
  }

  public fun memory(memory: Number) {
    cdkBuilder.memory(memory)
  }

  public fun build(): CfnDeployment.SystemResourceLimitsProperty = cdkBuilder.build()
}
