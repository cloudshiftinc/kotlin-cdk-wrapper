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

  /**
   * @param availabilityZones The Availability Zones in which to enable fast snapshot restore.
   */
  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  /**
   * @param availabilityZones The Availability Zones in which to enable fast snapshot restore.
   */
  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  /**
   * @param count The number of snapshots to be enabled with fast snapshot restore.
   */
  public fun count(count: Number) {
    cdkBuilder.count(count)
  }

  /**
   * @param interval The amount of time to enable fast snapshot restore.
   * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
   */
  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param intervalUnit The unit of time for enabling fast snapshot restore.
   */
  public fun intervalUnit(intervalUnit: String) {
    cdkBuilder.intervalUnit(intervalUnit)
  }

  public fun build(): CfnLifecyclePolicy.FastRestoreRuleProperty {
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    return cdkBuilder.build()
  }
}
