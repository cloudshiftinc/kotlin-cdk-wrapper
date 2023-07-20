@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnPolicyPrincipalAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPolicyPrincipalAttachment.Builder =
      CfnPolicyPrincipalAttachment.Builder.create(scope, id)

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  public fun build(): CfnPolicyPrincipalAttachment = cdkBuilder.build()
}
