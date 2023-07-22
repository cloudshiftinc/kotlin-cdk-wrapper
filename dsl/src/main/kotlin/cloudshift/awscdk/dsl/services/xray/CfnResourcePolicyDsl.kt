@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnResourcePolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnResourcePolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourcePolicy.Builder = CfnResourcePolicy.Builder.create(scope, id)

  /**
   * A flag to indicate whether to bypass the resource-based policy lockout safety check.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-bypasspolicylockoutcheck)
   * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based policy
   * lockout safety check. 
   */
  public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean) {
    cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
  }

  /**
   * A flag to indicate whether to bypass the resource-based policy lockout safety check.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-bypasspolicylockoutcheck)
   * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based policy
   * lockout safety check. 
   */
  public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable) {
    cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
  }

  /**
   * The resource-based policy document, which can be up to 5kb in size.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policydocument)
   * @param policyDocument The resource-based policy document, which can be up to 5kb in size. 
   */
  public fun policyDocument(policyDocument: String) {
    cdkBuilder.policyDocument(policyDocument)
  }

  /**
   * The name of the resource-based policy.
   *
   * Must be unique within a specific AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policyname)
   * @param policyName The name of the resource-based policy. 
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun build(): CfnResourcePolicy = cdkBuilder.build()
}
