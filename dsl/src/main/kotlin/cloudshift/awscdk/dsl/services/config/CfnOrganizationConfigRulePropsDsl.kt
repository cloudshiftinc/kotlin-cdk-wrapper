@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps

@CdkDslMarker
public class CfnOrganizationConfigRulePropsDsl {
  private val cdkBuilder: CfnOrganizationConfigRuleProps.Builder =
      CfnOrganizationConfigRuleProps.builder()

  private val _excludedAccounts: MutableList<String> = mutableListOf()

  /**
   * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
   * Config rule.
   */
  public fun excludedAccounts(vararg excludedAccounts: String) {
    _excludedAccounts.addAll(listOf(*excludedAccounts))
  }

  /**
   * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
   * Config rule.
   */
  public fun excludedAccounts(excludedAccounts: Collection<String>) {
    _excludedAccounts.addAll(excludedAccounts)
  }

  /**
   * @param organizationConfigRuleName The name that you assign to organization AWS Config rule. 
   */
  public fun organizationConfigRuleName(organizationConfigRuleName: String) {
    cdkBuilder.organizationConfigRuleName(organizationConfigRuleName)
  }

  /**
   * @param organizationCustomPolicyRuleMetadata the value to be set.
   */
  public
      fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: IResolvable) {
    cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata)
  }

  /**
   * @param organizationCustomPolicyRuleMetadata the value to be set.
   */
  public
      fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty) {
    cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata)
  }

  /**
   * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object.
   */
  public fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable) {
    cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata)
  }

  /**
   * @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object.
   */
  public
      fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty) {
    cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata)
  }

  /**
   * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object.
   */
  public fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable) {
    cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata)
  }

  /**
   * @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object.
   */
  public
      fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty) {
    cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata)
  }

  public fun build(): CfnOrganizationConfigRuleProps {
    if(_excludedAccounts.isNotEmpty()) cdkBuilder.excludedAccounts(_excludedAccounts)
    return cdkBuilder.build()
  }
}
