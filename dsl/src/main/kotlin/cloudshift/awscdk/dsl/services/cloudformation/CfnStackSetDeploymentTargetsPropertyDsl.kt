@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudformation.CfnStackSet

@CdkDslMarker
public class CfnStackSetDeploymentTargetsPropertyDsl {
  private val cdkBuilder: CfnStackSet.DeploymentTargetsProperty.Builder =
      CfnStackSet.DeploymentTargetsProperty.builder()

  private val _accounts: MutableList<String> = mutableListOf()

  private val _organizationalUnitIds: MutableList<String> = mutableListOf()

  public fun accountFilterType(accountFilterType: String) {
    cdkBuilder.accountFilterType(accountFilterType)
  }

  public fun accounts(vararg accounts: String) {
    _accounts.addAll(listOf(*accounts))
  }

  public fun accounts(accounts: Collection<String>) {
    _accounts.addAll(accounts)
  }

  public fun organizationalUnitIds(vararg organizationalUnitIds: String) {
    _organizationalUnitIds.addAll(listOf(*organizationalUnitIds))
  }

  public fun organizationalUnitIds(organizationalUnitIds: Collection<String>) {
    _organizationalUnitIds.addAll(organizationalUnitIds)
  }

  public fun build(): CfnStackSet.DeploymentTargetsProperty {
    if(_accounts.isNotEmpty()) cdkBuilder.accounts(_accounts)
    if(_organizationalUnitIds.isNotEmpty()) cdkBuilder.organizationalUnitIds(_organizationalUnitIds)
    return cdkBuilder.build()
  }
}
