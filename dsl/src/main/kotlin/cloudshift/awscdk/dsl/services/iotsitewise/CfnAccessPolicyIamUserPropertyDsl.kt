@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

@CdkDslMarker
public class CfnAccessPolicyIamUserPropertyDsl {
  private val cdkBuilder: CfnAccessPolicy.IamUserProperty.Builder =
      CfnAccessPolicy.IamUserProperty.builder()

  /**
   * @param arn The ARN of the IAM user. For more information, see [IAM
   * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html) in the *IAM
   * User Guide* .
   *
   * If you delete the IAM user, access policies that contain this identity include an empty `arn` .
   * You can delete the access policy for the IAM user that no longer exists.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnAccessPolicy.IamUserProperty = cdkBuilder.build()
}
