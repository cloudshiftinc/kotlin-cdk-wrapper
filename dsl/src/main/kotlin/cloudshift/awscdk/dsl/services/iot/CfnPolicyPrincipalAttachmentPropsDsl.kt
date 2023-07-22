@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps

@CdkDslMarker
public class CfnPolicyPrincipalAttachmentPropsDsl {
  private val cdkBuilder: CfnPolicyPrincipalAttachmentProps.Builder =
      CfnPolicyPrincipalAttachmentProps.builder()

  /**
   * @param policyName The name of the AWS IoT policy. 
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  /**
   * @param principal The principal, which can be a certificate ARN (as returned from the
   * `CreateCertificate` operation) or an Amazon Cognito ID. 
   */
  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  public fun build(): CfnPolicyPrincipalAttachmentProps = cdkBuilder.build()
}
