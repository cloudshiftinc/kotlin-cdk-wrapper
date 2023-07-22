@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

/**
 * Contains information about an AWS Identity and Access Management role.
 *
 * For more information, see [IAM
 * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) in the *IAM User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * IamRoleProperty iamRoleProperty = IamRoleProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-iamrole.html)
 */
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
