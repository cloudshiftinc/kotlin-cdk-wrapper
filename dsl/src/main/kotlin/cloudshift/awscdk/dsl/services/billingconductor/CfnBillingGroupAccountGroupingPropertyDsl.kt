@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.billingconductor.CfnBillingGroup

@CdkDslMarker
public class CfnBillingGroupAccountGroupingPropertyDsl {
  private val cdkBuilder: CfnBillingGroup.AccountGroupingProperty.Builder =
      CfnBillingGroup.AccountGroupingProperty.builder()

  private val _linkedAccountIds: MutableList<String> = mutableListOf()

  public fun linkedAccountIds(vararg linkedAccountIds: String) {
    _linkedAccountIds.addAll(listOf(*linkedAccountIds))
  }

  public fun linkedAccountIds(linkedAccountIds: Collection<String>) {
    _linkedAccountIds.addAll(linkedAccountIds)
  }

  public fun build(): CfnBillingGroup.AccountGroupingProperty {
    if(_linkedAccountIds.isNotEmpty()) cdkBuilder.linkedAccountIds(_linkedAccountIds)
    return cdkBuilder.build()
  }
}
