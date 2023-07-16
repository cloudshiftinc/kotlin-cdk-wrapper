@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps

@CdkDslMarker
public class CfnPolicyPrincipalAttachmentPropsDsl {
  private val cdkBuilder: CfnPolicyPrincipalAttachmentProps.Builder =
      CfnPolicyPrincipalAttachmentProps.builder()

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  public fun build(): CfnPolicyPrincipalAttachmentProps = cdkBuilder.build()
}
