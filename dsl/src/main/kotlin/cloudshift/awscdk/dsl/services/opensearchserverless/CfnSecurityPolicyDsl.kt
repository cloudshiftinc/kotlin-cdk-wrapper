@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy
import software.constructs.Construct

/**
 * Creates an encryption or network policy to be used by one or more OpenSearch Serverless
 * collections.
 *
 * Network policies specify access to a collection and its OpenSearch Dashboards endpoint from
 * public networks or specific VPC endpoints. For more information, see [Network access for Amazon
 * OpenSearch
 * Serverless](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html)
 * .
 *
 * Encryption policies specify a KMS encryption key to assign to particular collections. For more
 * information, see [Encryption at rest for Amazon OpenSearch
 * Serverless](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchserverless.*;
 * CfnSecurityPolicy cfnSecurityPolicy = CfnSecurityPolicy.Builder.create(this,
 * "MyCfnSecurityPolicy")
 * .name("name")
 * .policy("policy")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html)
 */
@CdkDslMarker
public class CfnSecurityPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecurityPolicy.Builder = CfnSecurityPolicy.Builder.create(scope, id)

  /**
   * The description of the security policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-description)
   * @param description The description of the security policy. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-name)
   * @param name The name of the policy. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The JSON policy document without any whitespaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-policy)
   * @param policy The JSON policy document without any whitespaces. 
   */
  public fun policy(policy: String) {
    cdkBuilder.policy(policy)
  }

  /**
   * The type of security policy.
   *
   * Can be either `encryption` or `network` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html#cfn-opensearchserverless-securitypolicy-type)
   * @param type The type of security policy. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSecurityPolicy = cdkBuilder.build()
}
