@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyCreateRulePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.CreateRuleProperty.Builder =
      CfnLifecyclePolicy.CreateRuleProperty.builder()

  private val _times: MutableList<String> = mutableListOf()

  public fun cronExpression(cronExpression: String) {
    cdkBuilder.cronExpression(cronExpression)
  }

  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  public fun intervalUnit(intervalUnit: String) {
    cdkBuilder.intervalUnit(intervalUnit)
  }

  public fun location(location: String) {
    cdkBuilder.location(location)
  }

  public fun times(vararg times: String) {
    _times.addAll(listOf(*times))
  }

  public fun times(times: Collection<String>) {
    _times.addAll(times)
  }

  public fun build(): CfnLifecyclePolicy.CreateRuleProperty {
    if(_times.isNotEmpty()) cdkBuilder.times(_times)
    return cdkBuilder.build()
  }
}
