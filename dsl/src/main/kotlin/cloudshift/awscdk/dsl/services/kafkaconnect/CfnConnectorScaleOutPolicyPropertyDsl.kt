@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorScaleOutPolicyPropertyDsl {
  private val cdkBuilder: CfnConnector.ScaleOutPolicyProperty.Builder =
      CfnConnector.ScaleOutPolicyProperty.builder()

  public fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number) {
    cdkBuilder.cpuUtilizationPercentage(cpuUtilizationPercentage)
  }

  public fun build(): CfnConnector.ScaleOutPolicyProperty = cdkBuilder.build()
}
