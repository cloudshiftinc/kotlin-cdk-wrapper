@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnProvisioningTemplate

@CdkDslMarker
public class CfnProvisioningTemplateProvisioningHookPropertyDsl {
  private val cdkBuilder: CfnProvisioningTemplate.ProvisioningHookProperty.Builder =
      CfnProvisioningTemplate.ProvisioningHookProperty.builder()

  public fun payloadVersion(payloadVersion: String) {
    cdkBuilder.payloadVersion(payloadVersion)
  }

  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CfnProvisioningTemplate.ProvisioningHookProperty = cdkBuilder.build()
}
