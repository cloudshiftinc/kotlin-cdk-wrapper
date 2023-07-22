@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnAccessPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccessPolicy.Builder = CfnAccessPolicy.Builder.create(scope, id)

  /**
   * The description of the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-description)
   * @param description The description of the policy. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-name)
   * @param name The name of the policy. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The JSON policy document without any whitespaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-policy)
   * @param policy The JSON policy document without any whitespaces. 
   */
  public fun policy(policy: String) {
    cdkBuilder.policy(policy)
  }

  /**
   * The type of access policy.
   *
   * Currently the only option is `data` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html#cfn-opensearchserverless-accesspolicy-type)
   * @param type The type of access policy. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAccessPolicy = cdkBuilder.build()
}
