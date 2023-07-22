@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment

/**
 * `RulesConfigurationType` is a subproperty of the
 * [RoleMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
 * property that defines the rules to be used for mapping users to roles.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * RulesConfigurationTypeProperty rulesConfigurationTypeProperty =
 * RulesConfigurationTypeProperty.builder()
 * .rules(List.of(MappingRuleProperty.builder()
 * .claim("claim")
 * .matchType("matchType")
 * .roleArn("roleArn")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html)
 */
@CdkDslMarker
public class CfnIdentityPoolRoleAttachmentRulesConfigurationTypePropertyDsl {
  private val cdkBuilder: CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.Builder =
      CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  /**
   * @param rules The rules. 
   * You can specify up to 25 rules per identity provider.
   */
  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  /**
   * @param rules The rules. 
   * You can specify up to 25 rules per identity provider.
   */
  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  /**
   * @param rules The rules. 
   * You can specify up to 25 rules per identity provider.
   */
  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
