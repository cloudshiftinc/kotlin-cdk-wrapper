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

  /**
   * The name of the AWS IoT policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname)
   * @param policyName The name of the AWS IoT policy. 
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  /**
   * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
   * operation) or an Amazon Cognito ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal)
   * @param principal The principal, which can be a certificate ARN (as returned from the
   * `CreateCertificate` operation) or an Amazon Cognito ID. 
   */
  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  public fun build(): CfnPolicyPrincipalAttachment = cdkBuilder.build()
}
