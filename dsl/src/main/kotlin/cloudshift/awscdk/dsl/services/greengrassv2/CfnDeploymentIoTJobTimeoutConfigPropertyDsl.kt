@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentIoTJobTimeoutConfigPropertyDsl {
  private val cdkBuilder: CfnDeployment.IoTJobTimeoutConfigProperty.Builder =
      CfnDeployment.IoTJobTimeoutConfigProperty.builder()

  public fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number) {
    cdkBuilder.inProgressTimeoutInMinutes(inProgressTimeoutInMinutes)
  }

  public fun build(): CfnDeployment.IoTJobTimeoutConfigProperty = cdkBuilder.build()
}
