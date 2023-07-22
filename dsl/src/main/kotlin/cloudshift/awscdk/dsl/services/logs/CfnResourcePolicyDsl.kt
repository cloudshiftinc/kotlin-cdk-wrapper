@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnResourcePolicy
import software.constructs.Construct

/**
 * Creates or updates a resource policy that allows other AWS services to put log events to this
 * account.
 *
 * An account can have up to 10 resource policies per AWS Region.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
 * "MyCfnResourcePolicy")
 * .policyDocument("policyDocument")
 * .policyName("policyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourcePolicy.Builder = CfnResourcePolicy.Builder.create(scope, id)

  /**
   * The details of the policy.
   *
   * It must be formatted in JSON, and you must use backslashes to escape characters that need to be
   * escaped in JSON strings, such as double quote marks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html#cfn-logs-resourcepolicy-policydocument)
   * @param policyDocument The details of the policy. 
   */
  public fun policyDocument(policyDocument: String) {
    cdkBuilder.policyDocument(policyDocument)
  }

  /**
   * The name of the resource policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html#cfn-logs-resourcepolicy-policyname)
   * @param policyName The name of the resource policy. 
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun build(): CfnResourcePolicy = cdkBuilder.build()
}
