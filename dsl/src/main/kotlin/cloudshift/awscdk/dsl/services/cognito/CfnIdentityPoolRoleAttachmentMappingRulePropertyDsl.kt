@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment

/**
 * Defines how to map a claim to a role ARN.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * MappingRuleProperty mappingRuleProperty = MappingRuleProperty.builder()
 * .claim("claim")
 * .matchType("matchType")
 * .roleArn("roleArn")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html)
 */
@CdkDslMarker
public class CfnIdentityPoolRoleAttachmentMappingRulePropertyDsl {
  private val cdkBuilder: CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder =
      CfnIdentityPoolRoleAttachment.MappingRuleProperty.builder()

  /**
   * @param claim The claim name that must be present in the token. 
   * For example: "isAdmin" or "paid".
   */
  public fun claim(claim: String) {
    cdkBuilder.claim(claim)
  }

  /**
   * @param matchType The match condition that specifies how closely the claim value in the IdP
   * token must match `Value` . 
   * Valid values are: `Equals` , `Contains` , `StartsWith` , and `NotEqual` .
   */
  public fun matchType(matchType: String) {
    cdkBuilder.matchType(matchType)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the role. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param value A brief string that the claim must match. 
   * For example, "paid" or "yes".
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnIdentityPoolRoleAttachment.MappingRuleProperty = cdkBuilder.build()
}
