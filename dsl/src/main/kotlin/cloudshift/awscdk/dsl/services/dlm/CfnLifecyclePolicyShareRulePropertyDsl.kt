@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyShareRulePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.ShareRuleProperty.Builder =
      CfnLifecyclePolicy.ShareRuleProperty.builder()

  private val _targetAccounts: MutableList<String> = mutableListOf()

  public fun targetAccounts(vararg targetAccounts: String) {
    _targetAccounts.addAll(listOf(*targetAccounts))
  }

  public fun targetAccounts(targetAccounts: Collection<String>) {
    _targetAccounts.addAll(targetAccounts)
  }

  public fun unshareInterval(unshareInterval: Number) {
    cdkBuilder.unshareInterval(unshareInterval)
  }

  public fun unshareIntervalUnit(unshareIntervalUnit: String) {
    cdkBuilder.unshareIntervalUnit(unshareIntervalUnit)
  }

  public fun build(): CfnLifecyclePolicy.ShareRuleProperty {
    if(_targetAccounts.isNotEmpty()) cdkBuilder.targetAccounts(_targetAccounts)
    return cdkBuilder.build()
  }
}
