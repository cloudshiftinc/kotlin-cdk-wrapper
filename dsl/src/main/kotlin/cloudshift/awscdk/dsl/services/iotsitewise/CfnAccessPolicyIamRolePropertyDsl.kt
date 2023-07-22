@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

@CdkDslMarker
public class CfnAccessPolicyIamRolePropertyDsl {
  private val cdkBuilder: CfnAccessPolicy.IamRoleProperty.Builder =
      CfnAccessPolicy.IamRoleProperty.builder()

  /**
   * @param arn The ARN of the IAM role.
   * For more information, see [IAM
   * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html) in the *IAM
   * User Guide* .
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnAccessPolicy.IamRoleProperty = cdkBuilder.build()
}
