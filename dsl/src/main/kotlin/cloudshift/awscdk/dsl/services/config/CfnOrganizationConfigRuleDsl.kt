@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.constructs.Construct

@CdkDslMarker
public class CfnOrganizationConfigRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnOrganizationConfigRule.Builder =
      CfnOrganizationConfigRule.Builder.create(scope, id)

  private val _excludedAccounts: MutableList<String> = mutableListOf()

  /**
   * A comma-separated list of accounts excluded from organization AWS Config rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts)
   * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
   * Config rule. 
   */
  public fun excludedAccounts(vararg excludedAccounts: String) {
    _excludedAccounts.addAll(listOf(*excludedAccounts))
  }

  /**
   * A comma-separated list of accounts excluded from organization AWS Config rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts)
   * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
   * Config rule. 
   */
  public fun excludedAccounts(excludedAccounts: Collection<String>) {
    _excludedAccounts.addAll(excludedAccounts)
  }

  /**
   * The name that you assign to organization AWS Config rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationconfigrulename)
   * @param organizationConfigRuleName The name that you assign to organization AWS Config rule. 
   */
  public fun organizationConfigRuleName(organizationConfigRuleName: String) {
    cdkBuilder.organizationConfigRuleName(organizationConfigRuleName)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
   * @param organizationCustomPolicyRuleMetadata 
   */
  public
      fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: IResolvable) {
    cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustompolicyrulemetadata)
   * @param organizationCustomPolicyRuleMetadata 
   */
  public
      fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty) {
    cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata)
  }

  /**
   * An `OrganizationCustomRuleMetadata` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
   * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object. 
   */
  public fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable) {
    cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata)
  }

  /**
   * An `OrganizationCustomRuleMetadata` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata)
   * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object. 
   */
  public
      fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty) {
    cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata)
  }

  /**
   * An `OrganizationManagedRuleMetadata` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
   * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object. 
   */
  public fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable) {
    cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata)
  }

  /**
   * An `OrganizationManagedRuleMetadata` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata)
   * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object. 
   */
  public
      fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty) {
    cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata)
  }

  public fun build(): CfnOrganizationConfigRule {
    if(_excludedAccounts.isNotEmpty()) cdkBuilder.excludedAccounts(_excludedAccounts)
    return cdkBuilder.build()
  }
}
