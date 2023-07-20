@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyFastRestoreRulePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.FastRestoreRuleProperty.Builder =
      CfnLifecyclePolicy.FastRestoreRuleProperty.builder()

  private val _availabilityZones: MutableList<String> = mutableListOf()

  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  public fun count(count: Number) {
    cdkBuilder.count(count)
  }

  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  public fun intervalUnit(intervalUnit: String) {
    cdkBuilder.intervalUnit(intervalUnit)
  }

  public fun build(): CfnLifecyclePolicy.FastRestoreRuleProperty {
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    return cdkBuilder.build()
  }
}
