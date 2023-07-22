@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps

/**
 * Properties for defining a `CfnSecurityPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchserverless.*;
 * CfnSecurityPolicyProps cfnSecurityPolicyProps = CfnSecurityPolicyProps.builder()
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
public class CfnSecurityPolicyPropsDsl {
  private val cdkBuilder: CfnSecurityPolicyProps.Builder = CfnSecurityPolicyProps.builder()

  /**
   * @param description The description of the security policy.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the policy. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param policy The JSON policy document without any whitespaces. 
   */
  public fun policy(policy: String) {
    cdkBuilder.policy(policy)
  }

  /**
   * @param type The type of security policy. 
   * Can be either `encryption` or `network` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSecurityPolicyProps = cdkBuilder.build()
}
